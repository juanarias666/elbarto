package nuevo_proyecto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertasEjemplo {
	
	
	WebDriver driver;
	
	//Elemtos de la pagina http://sahitest.com/demo/index.htm
	By lnkAlertTest = By.linkText("Alert Test");
	By btnClickForAlert = By.name("b1");
	By lnkConfirmPage = By.linkText("Confirm Page");
	By lnkPromptPage = By.linkText("Prompt Page");
	
	
	public void aceptarAleta() throws InterruptedException {
		
		HacerLogin abrirVentana = new HacerLogin();		
		abrirVentana.abrirNavegador();
		driver = abrirVentana.getWebDriver();
		driver.get(nuevaVentana.URL);
		driver.findElement(lnkAlertTest).click();
		driver.findElement(btnClickForAlert).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();		
		driver.quit();
	}
	
	
	public void getAceptarAleta() throws InterruptedException {
			
		HacerLogin abrirVentana = new HacerLogin();		
		abrirVentana.abrirNavegador();
		driver = abrirVentana.getWebDriver();
		driver.get(nuevaVentana.URL);
		driver.findElement(lnkAlertTest).click();
		driver.findElement(btnClickForAlert).click();
		Thread.sleep(3000);
		String alertTextContent = driver.switchTo().alert().getText();
		System.out.println("Este es el texto de la alerta: " +alertTextContent);
		driver.switchTo().alert().accept();		
		driver.quit();
	}
	
	/**
	 * @author juana:
	 * Metodo que da click en la opcion cancelar de una alerta
	 * @throws InterruptedException
	 */
	
	public void cancelarAleta() throws InterruptedException {
		
		HacerLogin abrirVentana = new HacerLogin();		
		abrirVentana.abrirNavegador();
		driver = abrirVentana.getWebDriver();
		driver.get(nuevaVentana.URL);
		driver.findElement(lnkConfirmPage).click();
		driver.findElement(btnClickForAlert).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();		
		driver.quit();
	}
	
	
	public void enviarTextoAlerta() throws InterruptedException {
			
		HacerLogin abrirVentana = new HacerLogin();		
		abrirVentana.abrirNavegador();
		driver = abrirVentana.getWebDriver();
		driver.get(nuevaVentana.URL);
		driver.findElement(lnkPromptPage).click();
		driver.findElement(btnClickForAlert).click();
		Thread.sleep(3000);
		
		driver.switchTo().alert().sendKeys("Hoy fue la clase");
		driver.switchTo().alert().accept();
				
		//driver.quit();
	}
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		AlertasEjemplo alertaEjemplo = new AlertasEjemplo();
		//alertaEjemplo.getAceptarAleta();
		//alertaEjemplo.cancelarAleta();
		alertaEjemplo.enviarTextoAlerta();
	}

}
