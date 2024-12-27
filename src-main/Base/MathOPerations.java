package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MathOPerations 
{

@Test(expectedExceptions =  NullPointerException.class)
public void abc() {
	System.out.println("this is from beforeTest");
	String str=null;
	System.out.println(str.toLowerCase());
}

@Test(enabled = false)
public void postConditino() {
	System.out.println("this is from afterTest");
//	Assert.assertTrue(false);
}

@Test
public void xyz() {
	System.out.println("this is xyz");
}




}
