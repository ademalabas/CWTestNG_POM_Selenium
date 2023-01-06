package clarusway.tests.Day_02;

import clarusway.pages.SauceDemoLoginPage;
import clarusway.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C04_PageClassFindAll {



    @Test
    public void test(){

        Driver.getDriver().get("https://www.saucedemo.com/");

        SauceDemoLoginPage lp = new SauceDemoLoginPage();

        Assert.assertEquals(3, lp.inputElements.size());

        Driver.closeDriver();
    }



}
