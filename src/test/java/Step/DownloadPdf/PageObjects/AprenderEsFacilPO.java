package Step.DownloadPdf.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AprenderEsFacilPO {

    private static WebElement element = null;
    private static String elemento = null;

    public static WebElement urlAprenderEsFacil(WebDriver driver){
        element = driver.findElement(By.xpath("//*[contains(text(),'Aprender es Fácil']"));
        return element;
    }
}
