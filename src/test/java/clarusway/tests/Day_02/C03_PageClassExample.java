package clarusway.tests.Day_02;

import clarusway.pages.HtmlGoodiesHomePage;
import clarusway.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class C03_PageClassExample {


    @Test
    public void test(){

        Driver.getDriver().get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        HtmlGoodiesHomePage hp = new HtmlGoodiesHomePage();

        Actions actions = new Actions(Driver.getDriver());

        actions
                .dragAndDrop(hp.Copenhag, hp.denmark)
                .dragAndDrop(hp.Seoul, hp.sKorea)
                .dragAndDrop(hp.Washington,hp.us)
                .dragAndDrop(hp.Rome, hp.italy)
                .dragAndDrop(hp.Madrid, hp.spain)
                .dragAndDrop(hp.Oslo,hp.norway)
                .dragAndDrop(hp.Stockholm,hp.sweden)
                .perform();


    }



}
