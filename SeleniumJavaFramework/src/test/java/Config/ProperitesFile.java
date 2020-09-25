package Config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import Test.TestNG_Demo;

public class ProperitesFile {
	
	static Properties prop = new Properties();
	static String projectPath = System.getProperty("user.dir");
	
	public static void main(String[] args) {
		
		getProperties();
		setProperties();
		getProperties();
		
	}

	public static void getProperties(){
		try {
		
		
		System.out.println(projectPath);
		InputStream input = new FileInputStream(projectPath+"/src/test/java/Config/config.properties");
		prop.load(input);
		String browser = prop.getProperty("browser");
		System.out.println(browser);
		TestNG_Demo.browserName=browser;
		
		
		}catch(Exception exp) {
		System.out.println(exp.getMessage());
		System.out.println(exp.getCause());
		System.out.println(exp.getStackTrace());
	}
		
	}
	
	public static void setProperties() {
		try {
		OutputStream output = new FileOutputStream(projectPath+"/src/test/java/Config/config.properties");
		prop.setProperty("result", "pass");
		prop.store(output, null);
		
	}catch(Exception exp) {
		System.out.println(exp.getMessage());
		System.out.println(exp.getCause());
		System.out.println(exp.getStackTrace());
	}
}
}