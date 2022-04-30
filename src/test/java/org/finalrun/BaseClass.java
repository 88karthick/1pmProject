package org.finalrun;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static void chromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void closeBrowser() {
		driver.close();
	}

	public static void maxWindow() {
		driver.manage().window().maximize();
	}

	public static void launchUrl(String url) {
		driver.get(url);
	}

	public static void clickButton(WebElement element) {
		element.click();
	}

	public static void fillTextBox(WebElement element1, String value) {
		element1.sendKeys(value);
	}

	public static String pageTitle() {

		String title = driver.getTitle();
		// System.out.println(title);
		return title;
	}

	public static String pageCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		// System.out.println(currentUrl);
		return currentUrl;

	}

	public static void takeSnap(String screenshot) throws IOException {

		TakesScreenshot tk = (TakesScreenshot) driver;
		File fi = tk.getScreenshotAs(OutputType.FILE);
		File f = new File("C:\\Users\\sachi\\eclipse-workspace\\Maven\\Screenshot\\screenshot.png");
		// File f1 = new
		// File("C:\\Users\\sachi\\eclipse-workspace\\Maven\\Screenshot\\"+screenshot+".png");
		FileUtils.copyFile(fi, f);

	}

	/**
	 * @return
	 * @throws IOException
	 */
	public static String readFromExcel(String sheetName, int rowNo, int cellNo) throws IOException {
		File f = new File("C:\\Users\\sachi\\eclipse-workspace\\Maven\\ExternalStorage\\frames.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fi);
		Sheet sh = book.getSheet(sheetName);
		Row r = sh.getRow(rowNo);
		Cell c = r.getCell(cellNo);
		int type = c.getCellType();
		String name;
		if (type == 1) {
			name = c.getStringCellValue();
		}

		else if (DateUtil.isCellDateFormatted(c)) {
			Date da = c.getDateCellValue();
			SimpleDateFormat s = new SimpleDateFormat("MM-dd-yyyy");
			name = s.format(da);

		}

		else {

			double d = c.getNumericCellValue();
			long lo = (long) d;
			name = String.valueOf(lo);
		}
		return name;
	}

	public static void getDateAndTime() {

		Date d = new Date();
		System.out.println(d);
	}
	
	public static void applyImplicitlyWait() {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
