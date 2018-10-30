package nuevo_proyecto;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class EjercicioOtraVentana {

	WebDriver driver;
	
	By lnkWindowOpenTest = By.linkText("Window Open Test");
	By lnkConfirmPage = By.linkText("Confirm Page");
	By txtText = By.linkText("t1");
	By btnClickForConfirm = By.name("b1");
	By lnkAlertTest = By.linkText("Alert Test");
	
	@Test
	public void otroFrame() throws InterruptedException {
	
	HacerLogin abrirVentana = new HacerLogin();		
	abrirVentana.abrirNavegador();
	driver = abrirVentana.getWebDriver();
	driver.get(nuevaVentana.URL);
	
	//Se identifica la primera ventana
	String windowParent = driver.getWindowHandle();	
	System.out.println("Esta es la ventana inicial: " +windowParent);		
	driver.findElement(lnkWindowOpenTest).click();
	
	//Se obtiene todas la ventanas
	Set<String> allWindows = driver.getWindowHandles();
	
	//Se Identifica la segunda ventana
	String segundaVentana = (String) allWindows.toArray()[1];		
	System.out.println("Esta es la segunda ventana: "+segundaVentana);		
	
	//Ir a la segunda ventana
	driver.switchTo().window(segundaVentana);
	Thread.sleep(3000);
	//Forma de acceder al frame
	//driver.switchTo().frame("top");
	//Otra forma de acceder al frame
	driver.switchTo().frame(0);
	Thread.sleep(3000);
	driver.findElement(lnkConfirmPage).click();
	driver.findElement(btnClickForConfirm).click();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	
//	String cajaTexto;
//	cajaTexto = driver.findElement(txtText).getText();
//	System.out.println("El texto del campo es: "+cajaTexto);
	
	//Se cierra la segunda ventana
	driver.close();
	
	//Volver a la primera ventana
	driver.switchTo().window(windowParent);
	
	//Se ingresa al link Alert Test
	driver.findElement(lnkAlertTest).click();
	driver.findElement(btnClickForConfirm).click();
	String ContenidoTexto = driver.switchTo().alert().getText();
	System.out.println("Este es el texto de la alerta: " +ContenidoTexto);
	
	driver.quit();
	
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		EjercicioOtraVentana alertaEjemplo = new EjercicioOtraVentana();
		
		alertaEjemplo.otroFrame();

	}

}
