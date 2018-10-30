package nuevo_proyecto;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FrameEjemplo {
	
	private WebDriver driver;
	
	By lnkFrame = By.linkText("Frames Test");
	By lnkBreakFrame = By.linkText("Break Frames");
	
	public void irFrame() throws InterruptedException, MalformedURLException {	
		
		HacerLogin abrirVentana = new HacerLogin();
		
		abrirVentana.abrirNavegador();
		driver = abrirVentana.getWebDriver();
		driver.get(nuevaVentana.URL);
		driver.findElement(lnkFrame).click();
		Thread.sleep(5000);
		//Forma de acceder al frame
		//driver.switchTo().frame("top");
		//Otra forma de acceder al frame
		driver.switchTo().frame(1);
		driver.findElement(lnkBreakFrame).click();
		Thread.sleep(5000);
		
		driver.quit();
		
	}
	
	
	public static void main(String[] args) throws InterruptedException, MalformedURLException{
		// TODO Auto-generated method stub
		
		FrameEjemplo irFrame = new FrameEjemplo();
		irFrame.irFrame();
	}

}
