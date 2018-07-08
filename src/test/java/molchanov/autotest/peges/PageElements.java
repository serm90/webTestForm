package molchanov.autotest.peges;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageElements {

    public WebDriver driver;

    public PageElements (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy (name = "emailAddress")
    public WebElement emailCell;

    @FindBy (xpath = "//*[@id='i2']")
    public WebElement emailError;

    public  void inputEmail(String email){
        emailCell.sendKeys(email);
    }

    public String getEmailError(){
        String errorEmail = emailError.getText();
        return errorEmail;
    }

}
