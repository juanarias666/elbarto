package nuevo_proyecto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ComprarProducto {
	
	
	public WebDriver driver;
	
	//Objetos del login
	By lnkDreses = By.linkText("Dresses");
	By lnkCasualDresses = By.linkText("Casual Dresses");
	
	public void comprarProducto() {
		
		HacerLogin hacerLogin = new HacerLogin();
		hacerLogin.abrirNavegador();
		
		driver = hacerLogin.getWebDriver();

		hacerLogin.hacerLogin(driver);
	}
	
	
	public void seleccionarCamisa() {
		
		driver.findElement(lnkDreses).click();
		driver.findElement(lnkCasualDresses).click();
//		driver.findElement(txtUser).sendKeys("juanfdo667@gmail.com");
//		driver.findElement(txtPassword).clear();
//		driver.findElement(txtPassword).sendKeys("123456");
//		driver.findElement(btnSignIn).click();
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
			
		ComprarProducto pagina = new ComprarProducto();
		pagina.comprarProducto();
		Thread.sleep(5000);
		pagina.driver.close();
			
	}

}
