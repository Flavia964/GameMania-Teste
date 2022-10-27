package encontroII.teste.gameMania;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EncontroIITeste {
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
		driver.findElement(By.xpath("//*[@id=\"navbar-items\"]/ul[2]/li[1]/a")).click();
		
		//Criar os elements
		
		WebElement inputEmail = driver.findElement(By.id("input-login"));
		WebElement inputSenha = driver.findElement(By.id("input-senha"));
		WebElement inputSubmit = driver.findElement(By.xpath("//*[@id=\"input-login\"]"));
		String[] listaEmails = {"Flavia.correia@email.com", "email sem formato", "Maria@email.com"};
		String[] listaSenhas = {"123456", "4897623f", "0"};
		
		for (int tentativas = 0; tentativas < listaSenhas.length; tentativas ++) {
			try {
				//Limpando os campos
				inputEmail.clear();
				inputSenha.clear();
				
				//Preencher os campos
				inputEmail.sendKeys(listaEmails[tentativas]);
				inputSenha.sendKeys(listaSenhas[tentativas]);
				inputSubmit.click();
				
				Thread.sleep(3000);//3 seconds
			}catch (InterruptedException error) {
				error.printStackTrace();
				
			}
		}
	}
	@After
	public void FinalizarTeste () {
		try {
			Thread.sleep(2000);
		}catch(Exception error) {
			error.printStackTrace();
		}
	}
}
