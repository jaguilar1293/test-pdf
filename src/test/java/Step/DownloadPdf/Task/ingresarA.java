package Step.DownloadPdf.Task;

import Step.DownloadPdf.PageObjects.AprenderEsFacilPO;
import org.junit.After;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.logging.Logger;

public class ingresarA {

    Logger logger = Logger.getLogger("Scroll la pagina");
    WebDriver driver;

    public ingresarA(WebDriver driver){
        this.driver = driver;
    }

    @After
    public void BajarPagina()throws Throwable{
        JavascriptExecutor jse = (JavascriptExecutor) this.driver;
        jse.executeScript("window.scrollBy(0,1500);");

    }

    @After
    public void AprenderEsFacil()throws Throwable{
        AprenderEsFacilPO.urlAprenderEsFacil(this.driver);
    }

}
