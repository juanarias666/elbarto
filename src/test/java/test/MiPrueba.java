package test;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import common.BaseTest;


public class MiPrueba extends BaseTest{
	
	
	By lnkTestCorrecto = By.linkText("Link Test");
	By lnkTestIncorrecto = By.linkText("Link Tes");
	
	//@Test(dataProvider = "getDatosPrueba", dataProviderClass = ReadExcelData.class)
	
	
	public void ingresarSahi() {
		
		try {
			
			driver.get("http://sahitest.com/demo/");
			driver.findElement(lnkTestIncorrecto).click();
			
			//throw new NoSuchElementException("No existe la aplicación");
			
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			System.out.println("Ingresé al catch de la excepción la aplicación NoSuchFieldException");
		
		} catch (Exception e) {
				
			System.out.println("Ingresé al catch de la excepción Exception");
		}
	}
	
	
	/**
	 * 
	 * @throws NoSuchElementException
	 * @throws InterruptedException
	 */
	@Test
	public void ingresarSahiThrow() throws NoSuchElementException, InterruptedException {
		
		try {
			
			driver.get("http://sahitest.com/demo/");
			driver.findElement(lnkTestCorrecto).click();
			
			//throw new NoSuchElementException("No existe la aplicación");
			
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			System.out.println("Ingresé al catch de la excepción la aplicación NoSuchFieldException");
			//driver.findElement(lnkTestIncorrecto).click();
			Thread.sleep(3000);
			
			throw new NoSuchElementException("No estaba disponible el elemento lnkTestCorrecto");
			
		} catch (Exception e) {
			
			System.out.println("Ingresé al catch de la excepción Exception");
		}
	}
	
	
	@DataProvider(name = "getD")
	public Object[][] getDatosDataProvider() {

		return new Object[][] { { "p1", "p2", "p3" }, { "p12", "p22", "p32" }, { "p12", "p22", "p32" } };

	}
	
//	public static void main(String[] args) throws NoSuchElementException, InterruptedException {
//		// TODO Auto-generated method stub
//		
//		MiPrueba prueba = new MiPrueba();
//		prueba.abrirNavegador();
//		//prueba.ingresarSahi();
//		prueba.ingresarSahiThrow();
//		prueba.cerrarNavegador();
//	}

}
