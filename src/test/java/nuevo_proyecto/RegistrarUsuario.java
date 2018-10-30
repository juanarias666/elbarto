package nuevo_proyecto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RegistrarUsuario {
	
	public WebDriver driver;
	
	//Objetos del login
	By lnkLogin = By.linkText("Sign in");
	By txtEmail1 = By.id("email_create");	
	By btnCreateAccount = By.id("SubmitCreate");
	By rButton1 = By.id("id_gender1");
	By rButton2 = By.id("id_gender2");
	
	//Informacion personal
	By txtFName = By.id("customer_firstname");
	By txtLName = By.id("customer_lastname");
	By txtEmail2 = By.id("email");
	By txtPassword = By.id("passwd");	
	By sDays = By.id("days");
	By sMonths = By.id("months");
	By sYears = By.id("years");
	
	//Su direccion
	By txtFiName = By.id("firstname");
	By txtLaName = By.id("lastname");
	By txtAddress = By.id("address1");
	By txtCity = By.id("city");
	By sState = By.id("id_state");
	By txtPostalCode = By.id("postcode");
	By sCountry = By.id("id_country");
	By txtPhoneMobile = By.id("phone_mobile");
	By btnRegister = By.id("submitAccount");
	
	
	
	
	
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
	
	public void registroUsuario() {
			
		//Abrir la pagina web
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(lnkLogin).click();
		driver.findElement(txtEmail1).sendKeys("correoprueba4@gmail.com");
		driver.findElement(btnCreateAccount).click();
		
		
//		driver.findElement(txtUser).clear();
//		driver.findElement(txtUser).sendKeys("juanfdo667@gmail.com");
//		driver.findElement(txtPassword).clear();
//		driver.findElement(txtPassword).sendKeys("123456");
//		driver.findElement(btnSignIn).click();
//		driver.quit();
		
		System.out.println("Correcto");
	}
	
	
	public static void main(String[] args) {
		
		RegistrarUsuario pagina = new RegistrarUsuario();
		pagina.abrirNavegador();
		pagina.registroUsuario();
		
	}

}
