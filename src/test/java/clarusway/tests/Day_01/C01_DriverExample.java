package clarusway.tests.Day_01;

import clarusway.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C01_DriverExample {

//    Go to URL: https://opensource-demo.orangehrmlive.com/
//    Verify title contains OrangeHRM.
//    Use Driver Class


    @Test
    public void test(){

        Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/");

        String title = Driver.getDriver().getTitle();

        Assert.assertTrue(title.contains("OrangeHRM"));

        Driver.closeDriver();



    }


    @Test
    public void test02(){

        WebDriver driver = Driver.getDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");

        String title = driver.getTitle();

        Assert.assertTrue(title.contains("OrangeHRM"));

        Driver.closeDriver();

    }



}
