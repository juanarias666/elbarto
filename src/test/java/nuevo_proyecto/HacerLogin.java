package nuevo_proyecto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class HacerLogin {
	
	public WebDriver driver;
	
	//Objetos del login
	By lnkLogin = By.linkText("Sign in");
	By txtUser = By.id("email");
	By txtPassword = By.id("passwd");
	By btnSignIn = By.id("SubmitLogin");
	
	
	public void abrirNavegador() {
		
		//Se define la propiedad del sistema con el driver
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		ChromeOptions chromeOptions = new ChromeOptions();
		//Preferencias del navegador
		chromeOptions.addArguments("start-maximized");
		
		//Incia el navegador Chrome
		driver = new ChromeDriver(chromeOptions);
		
		//Incia el navegador Firefox
		//driver = new FirefoxDriver();
		
		//Incia el navegador Internet Explorer
		//driver = new InternetExplorerDriver();
	}
	
	
	public void hacerLogin(WebDriver driver) {
		
		//Abrir la pagina web
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(lnkLogin).click();
		driver.findElement(txtUser).clear();
		driver.findElement(txtUser).sendKeys("juanfdo667@gmail.com");
		driver.findElement(txtPassword).clear();
		driver.findElement(txtPassword).sendKeys("123456");
		driver.findElement(btnSignIn).click();
		//driver.quit();
		
		System.out.println("Ya me voy");
	}
	
	
	public WebDriver getWebDriver() {
		
		return driver;
	}
	
	
	public static void main(String[] args) {
		
		HacerLogin pagina = new HacerLogin();
		pagina.abrirNavegador();
		pagina.hacerLogin(pagina.getWebDriver());
		
	}

}
