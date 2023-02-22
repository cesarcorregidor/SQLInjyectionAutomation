package webgoat.puerto.iplocal.models;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataInjection {
    Faker faker = new Faker(new Locale("es-ES"));

    private String user, password;

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
    public DataInjection (){
        this.user = (faker.pokemon().name()+faker.internet().password()).toLowerCase();
        //this.user = (faker.pokemon().name()).toLowerCase();
        this.password = (faker.internet().password()).substring(0,7);
    }
}
