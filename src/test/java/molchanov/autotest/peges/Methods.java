package molchanov.autotest.peges;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Methods extends PageElements {

    public WebDriver driver;
    PageElements pageElements = new PageElements(driver);

    public Methods(WebDriver driver) {
        super(driver);
    }

    public void validationTwoElements (String first, String second) throws InterruptedException{
        try{
            Assert.assertEquals(first,second);
            System.out.println("Succses!!! "  + "Res: " + first +";" + " Ex.Res.:" + second + ";");
        }catch ( Exception e){
            System.out.println("Failed!!! " + "Res: " + first +";" + " Ex.Res.:" + second + ";" );
        }
    }
    }





