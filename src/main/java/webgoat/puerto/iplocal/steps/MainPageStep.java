package webgoat.puerto.iplocal.steps;

import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;
import webgoat.puerto.iplocal.pageObjects.MainPageObject;

public class MainPageStep {
    MainPageObject mainPage = new MainPageObject();
    @Step
    public void OpenBrowser(){ mainPage.open();}
    @Step
    public void ValidateWebGoatTag(){
        Assert.assertThat(mainPage.getDriver().findElement(mainPage.getLblWebGoat())
                .isDisplayed(), Matchers.is(true));
    }
    @Step
    public void GoToSQLInjenctionAdvanced(){
        mainPage.getDriver().findElement(mainPage.getDdlInjection()).click();
        mainPage.getDriver().findElement(mainPage.getLbtnSQLInjectionAdvanced()).click();
    }
}
