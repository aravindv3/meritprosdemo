package testpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDemo {

	public static void main(String[] args) {

		// webdriver initialisation
		WebDriver driver;

		// 1) Open the browser - Specify browser type and browser setup
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\OneDrive\\MeritPros Aravind Balaji\\eclipseworkspace\\GitAndGitHubDemoProject\\browser\\chromedriver.exe");
		driver = new ChromeDriver();

		// 2) Go to MyAccount page
		driver.get("http://test1.meritpros.com/my-account/");

		// 3) Enter username
		driver.findElement(By.id("username")).sendKeys("testuser1");

		// 4) Enter password
		driver.findElement(By.id("password")).sendKeys("testpwd1");

		// 5) Click login button
		driver.findElement(By.id("login")).click();

		// 6) Verify successful login - By looking at username in welcome message
		boolean textavailable = driver.findElement(By.id("user_info")).getText().contains("testuser1");
		if (textavailable) {
			System.out.println("PASSED - the Login is successful");
		} else {
			System.out.println("FAILED - the login was not successful");
		}

		// 7) Close the browser
		driver.quit();

	}

}
