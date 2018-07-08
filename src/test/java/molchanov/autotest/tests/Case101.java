package molchanov.autotest.tests;

import molchanov.autotest.peges.Methods;
import org.testng.annotations.Test;

public class Case101 extends  AllTestPreparation{

    @Test

    public void basicFunctionalityWebFormRegistrationEmailExсeption() throws InterruptedException{

        Methods webPage = new Methods(driver);
        webPage.inputEmail("test1@gmail");
        String errorMassage = webPage.getEmailError();
        webPage.validationTwoElements(errorMassage,"Укажите действительный адрес эл. почты");

    }
}
