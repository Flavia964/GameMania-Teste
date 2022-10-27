package gamemania;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndexTest {
	ChromeDriver driver;// Driver do Google Chrome

	// Pré teste
	@Before
	public void PreTeste() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();// Abrir o navegador
		driver.manage().window().maximize();
		
	}
	
	@Test
public void testeNavegador() {
		driver.get("https://flavia964.github.io/senai-projeto-gameMania/");
		driver.findElement(By.id("txtBusca")).sendKeys("Jogos");
		driver.findElement(By.id("Busca1_txtFiltro")).sendKeys(Keys.ENTER);
	}
}
