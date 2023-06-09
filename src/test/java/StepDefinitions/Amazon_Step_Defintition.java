package StepDefinitions;

import Pages.AmazonPages;
import Utilities.Config_reader;
import Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

public class Amazon_Step_Defintition {

        AmazonPages amazon_pages= new AmazonPages();

    @Given("kullanici amazon sayfasina gider")
    public void kullaniciAmazonSayfasinaGider() {

        Driver.getDriver().get(Config_reader.getProperty("amazon_url"));
    }


    @And("kullanici arama kutusuna iphone yazar")
    public void kullaniciAramaKutusunaIphoneYazar() {

        amazon_pages.arama_kutusu.sendKeys("sonunda");


    }


    @And("kullanici arama kutusuna {string} yazar")
    public void kullaniciAramaKutusunaYazar(String bisey) {


        amazon_pages.arama_kutusu.sendKeys(bisey);
    }
}
