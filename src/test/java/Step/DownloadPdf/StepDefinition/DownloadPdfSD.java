package Step.DownloadPdf.StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DownloadPdfSD {

    private WebDriver webDriver;
    private String baseUrl = "https://www.banistmo.com/wps/portal/banistmo/personas/";

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
    }

    @Given("Ingresar la seccion de aprender es facil")
    public void EnteringTheLearnSectionIsEasy()throws Throwable{
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webDriver.get(baseUrl);

    }

    @When("Descargar el pdf de Fatca y CRS")
    public void DownloadThePdfOfFatcaAndCRS(){

    }

    @Then("Validar que el archivo descargado sea el de la pagina")
    public void ValidateThatTheDownloadedFileIsTheOneFromThePage(){

    }

    @After
    public void end() {
        if (webDriver != null) {
            webDriver.quit();
        }
    }

}
