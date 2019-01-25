import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readingProperty {

	public static void main(String[] args) throws IOException {

		//Create an instance of class
		Properties prop=new Properties();
		
		//Provide the path of the file to constructor of the class
		FileInputStream ip=new FileInputStream("/Users/edilmasimov/Desktop/SELENIUM/TESTING-MAVEN/Properties1/src/employee.properties");
		
		prop.load(ip);
		
		//retrive those properties
		String name= prop.getProperty("name");
		System.out.println(name);
		
		System.out.println(prop.getProperty("age"));

	}

}
