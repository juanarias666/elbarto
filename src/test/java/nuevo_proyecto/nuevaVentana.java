package nuevo_proyecto;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class nuevaVentana {
	
	private WebDriver driver;
	
	public static final String URL = "http://sahitest.com/demo/";
	
	By lnkWindowTest = By.linkText("Window Open Test");
	By lnkText = By.linkText("Link Test");
	
	public void irNuevaVentana() throws InterruptedException {
		
		HacerLogin abrirVentana = new HacerLogin();
		
		abrirVentana.abrirNavegador();
		driver = abrirVentana.getWebDriver();
		driver.get(URL);
		
		//Se identifica la primera ventana
		String windowParent = driver.getWindowHandle();	
		System.out.println("Esta es la ventana inicial: " +windowParent);		
		driver.findElement(lnkWindowTest).click();
		
		//Se obtiene todas la ventanas
		Set<String> allWindows = driver.getWindowHandles();
		
		//Se Identifica la segunda ventana
		String segundaVentana = (String) allWindows.toArray()[1];		
		System.out.println("Esta es la segunda ventana: "+segundaVentana);		
		
		//Ir a la segunda ventana
		driver.switchTo().window(segundaVentana);
		
		//Se cierra la segunda ventana
		driver.close();
		
		//Volver a la primera ventana
		driver.switchTo().window(windowParent);
		
		//String paginaInicial = "";		
		//driver.getCurrentUrl(paginaInicial);
		driver.findElement(lnkText).click();
		
		Thread.sleep(5000);
		driver.quit();
		
	}
	
	
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		nuevaVentana nuevaVentana = new nuevaVentana();
		nuevaVentana.irNuevaVentana();
	}

}
