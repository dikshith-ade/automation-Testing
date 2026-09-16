package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {

	Properties pro;

	public ConfigDataProvider() {
		File src = new File("./Configuration/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);

			pro = new Properties();
			pro.load(fis);
			fis.close();

		} catch (Exception e) {
			System.out.println("Unable to load config.properties: " + e.getMessage());
		}
	}

	public String getBrowser() {
		if (pro == null) return "Chrome";
		return pro.getProperty("Browser", "Chrome");
	}

	public String getAppURl() {
		if (pro == null) return "https://www.login.hiox.com/login?referrer=easycalculation.com";
		return pro.getProperty("AppURL", "https://www.login.hiox.com/login?referrer=easycalculation.com");
	}
}