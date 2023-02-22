package webgoat.puerto.iplocal.utils;

public class ImplicitWait {

    public void ImplicitWait(int seconds){

        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
