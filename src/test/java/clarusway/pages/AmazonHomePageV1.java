package clarusway.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePageV1 {

    private WebDriver ldriver;
    public AmazonHomePageV1(WebDriver ldriver){
        this.ldriver = ldriver;
        PageFactory.initElements(ldriver,this);
    }








}
