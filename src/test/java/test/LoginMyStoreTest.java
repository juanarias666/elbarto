package test;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import common.BaseTest;
import common.DataPropertiesManagement;
import constantes.ConstantesPruebas;

public class LoginMyStoreTest extends BaseTest{
	
	By lnkSignIn = By.cssSelector("a.login"); 
	By txtEmail = By.id("email");
	By txtPassword = By.id("passwd");
	By btnLogin = By.id("SubmitLogin");
	By lnkUsuario = By.cssSelector("a[title='View my customer account']");
	
	@Test
	public void hacerLogin () throws IOException, InterruptedException {
		
		driver.get(ConstantesPruebas.RUTA_MY_STORE);
		
		DataPropertiesManagement dataPropertiesManagement = new DataPropertiesManagement();
		Properties properties = dataPropertiesManagement.getProperties();
		
		driver.findElement(lnkSignIn).click();
		WebDriverWait wait = new WebDriverWait(driver, 15);		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(txtEmail));
		
				
		driver.findElement(txtEmail).sendKeys(properties.getProperty("user"));;
		driver.findElement(txtPassword).sendKeys(properties.getProperty("password"));
		driver.findElement(btnLogin).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(lnkUsuario));
		Assert.assertEquals(driver.findElement(lnkUsuario).getText(), "Cristian Mira");
		
		Thread.sleep(5000);
		
	}

}
