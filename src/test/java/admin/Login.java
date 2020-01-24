package admin;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.Test;

public class Login {
	
	@Test
	 public void test() throws IOException{
		
		DesktopOptions options = new DesktopOptions();
		options.setApplicationPath("C:\\smartclient-2.0\\smartclient\\KYCClient.exe");
		try {
			WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), options);
			//driver.findElement(By.className("SunAwtFrame")).sendKeys("test");
			driver.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	 }
}
