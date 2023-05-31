package practice;

import org.testng.annotations.Test;

public class ParameterMaven {

	@Test
	public void demoTest() {
		String url = System.getProperty("url");
		String browser = System.getProperty("browser");
		System.out.println("URL : "+url);
		System.out.println("Browser : "+ browser);
	}

}
