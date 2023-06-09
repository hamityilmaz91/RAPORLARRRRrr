package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPages {



    public AmazonPages(){

        PageFactory.initElements(Driver.getDriver(), this);

    }






    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")

   public WebElement arama_kutusu;






}
