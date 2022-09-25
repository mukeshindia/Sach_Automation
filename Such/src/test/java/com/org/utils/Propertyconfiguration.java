package com.org.utils;

import static com.org.base.Base.driver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;

public class Propertyconfiguration {
	
	public static long Page_Load_TimeOut=20;
	public static long Implicit_Wait=10;
	

    static String filePath="C:\\Users\\kumar.mukesh\\eclipse-workspace\\Such\\Config\\config.properties";
    static File file=new File(filePath);
	static FileInputStream fis=null;
	public static Properties props=new Properties();
	
	static {

		try {
			 fis=new FileInputStream(file);
			 props.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
        public static void screenShot() throws IOException {
		
		TakesScreenshot tss=(TakesScreenshot)driver;
		File scrFile=tss.getScreenshotAs(OutputType.FILE);
	    String imagePath="C:\\Users\\kumar.mukesh\\eclipse-workspace\\Such\\Report\\FaildScreenshot\\faild.png";
		File targetfile=new File(imagePath);
		Files.copy(scrFile, targetfile);
		
	
	
}

}
