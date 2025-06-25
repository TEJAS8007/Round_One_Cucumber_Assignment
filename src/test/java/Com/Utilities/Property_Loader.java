package Com.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.github.javafaker.Faker;

public class Property_Loader {

	static Properties pro;
	
	public static Properties init_Prop() {
		
		try {
			FileInputStream file=new FileInputStream("src/test/resources/TestData/Data.properties");
			pro=new Properties();
			pro.load(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return pro;
	}
	
	
}
