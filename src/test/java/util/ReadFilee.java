package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class ReadFilee {

	public static String getLocatorValue(WebDriver driver,String locatorName, String fileName) {
		StringBuilder contents = new StringBuilder();
		String file = "src/test/java/pageRepo";
		File filePath = new File(file + File.separator + fileName);
		//System.out.println(filePath);

		try {
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			String s;

			while ((s = br.readLine()) != null) {
				contents.append(s);
				contents.append("->");
			}

		} catch (IOException e) {
			System.out.println("Cannot read the text file");
		}
		return contents.toString();
	}
	
    public static WebElement getElement(WebDriver driver, String locator, String fileName) {
		
		String data = ReadFilee.getLocatorValue(driver,locator, fileName);
		String[] dataArray = data.split("->");
		String locatorValue="";
		String locatorType="";
		for (int i = 0; i < dataArray.length; i++) {
			if (dataArray[i].split(":")[0].equalsIgnoreCase(locator)) {
				locatorType=dataArray[i].split(":")[1].trim();
				locatorValue=dataArray[i].split(":")[2].trim();
				//System.out.println(dataArray[i].split(":")[1]);
				
			}
		}
		if(locatorType.equals("css")) {
			return driver.findElement(By.cssSelector(locatorValue));
		}
		else if(locatorType.equals("xpath")) {
			return driver.findElement(By.xpath(locatorValue));
		}
	    else if(locatorType.equals("id")) {
		    return driver.findElement(By.id(locatorValue));
	    }
	    else {
		    return driver.findElement(By.className(locatorValue));
	    }
	}
    
 public static WebElement getElement(WebDriver driver, String locator, String fileName,String replacement) {
		
		String data = ReadFilee.getLocatorValue(driver,locator, fileName);
		String[] dataArray = data.split("->");
		String locatorValue="";
		String locatorType="";
		for (int i = 0; i < dataArray.length; i++) {
			if (dataArray[i].split(":")[0].equalsIgnoreCase(locator)) {
				locatorType=dataArray[i].split(":")[1];
				locatorValue=dataArray[i].split(":")[2];
				System.out.println(locatorValue.indexOf('$')+"  :index of $");
				System.out.println(locatorValue.indexOf('}'));
				String str=locatorValue.substring(locatorValue.indexOf('$'), locatorValue.indexOf('}')+1);
				System.out.println(str+"+==================");
				locatorValue=locatorValue.replace(str, replacement).trim();
				System.out.println(locatorValue+" :locatror value");
				}
		}
       
		if(locatorType.equals("css")) {
			return driver .findElement(By.cssSelector(locatorValue));
		}
		else if(locatorType.equals("xpath")) {
			return driver.findElement(By.xpath(locatorValue));
		}
	    else if(locatorType.equals("id")) {
		    return driver.findElement(By.id(locatorValue));
	    }
	    else {
		    return driver.findElement(By.className(locatorValue));
	    }
		
	}
   public static void main(String[] args) {
	
}
	
}
