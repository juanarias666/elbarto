package test;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import common.BaseTest;
import nuevo_proyecto.nuevaVentana;

public class EjercicioMiPrueba extends BaseTest{
	
	public static final String URL = "http://sahitest.com/demo/";
	
	By lnkFrameTest = By.linkText("Frames Test");
	By lnkConfirmPage = By.linkText("Confirm Page");
	
	public void Ejercicio() throws InterruptedException, MalformedURLException {	
			
		try {
			
			driver.get(nuevaVentana.URL);
			driver.findElement(lnkFrameTest).click();
			Thread.sleep(5000);
			
						
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			
			//Forma de acceder al frame
			//driver.switchTo().frame("top");
			//Otra forma de acceder al frame
			driver.switchTo().frame(1);
			driver.findElement(lnkConfirmPage).click();
			Thread.sleep(5000);
			
			//throw new NoSuchElementException("No existe la aplicación");
			
			//System.out.println("Ingresé al catch de la excepción la aplicación NoSuchFieldException");
			//driver.findElement(lnkTestIncorrecto).click();
			Thread.sleep(3000);
			
			throw new NoSuchElementException("No estaba disponible el elemento lnkConfirmPage");
			
		} catch (Exception e) {
			
			System.out.println("Ingresé al catch de la excepción Exception");
		}
	}	
	
	
//	public static void main(String[] args) throws NoSuchElementException, InterruptedException, MalformedURLException {
//		// TODO Auto-generated method stub
//		
//		EjercicioMiPrueba prueba = new EjercicioMiPrueba();
//		prueba.abrirNavegador();
//		prueba.Ejercicio();
//		prueba.cerrarNavegador();
//
//	}

}
