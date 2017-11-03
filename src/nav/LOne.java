package nav;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LOne {

	public static void main(String[] args)throws Exception {
	
		WebDriver d1= new FirefoxDriver();
		d1.manage().window().maximize();
		d1.navigate().to("www.linkedin.com");
		Thread.sleep(3000);
		
		d1.findElement(By.id("login-email")).sendKeys("anmoltirkey028@gmail.com");
		d1.findElement(By.id("login-password")).sendKeys("HillSong");
		d1.findElement(By.id("login-submit")).click();
		d1.findElement(By.id("mynetwork-tab-icon")).click();
		Thread.sleep(5000);
		 JavascriptExecutor js1 = (JavascriptExecutor) d1;
		    js1.executeScript("window.scrollBy(0,2000)", "");
		    Thread.sleep(8000);
		 JavascriptExecutor js2 = (JavascriptExecutor) d1;
		 js2.executeScript("window.scrollBy(0,10000)", "");
		    Thread.sleep(8000);
		    JavascriptExecutor js3 = (JavascriptExecutor) d1;
		    js3.executeScript("window.scrollBy(0,19000)", "");
		    Thread.sleep(8000);
		    JavascriptExecutor js4 = (JavascriptExecutor) d1;
		    js4.executeScript("window.scrollBy(0,28000)", "");
		    Thread.sleep(8000);

		    JavascriptExecutor js5 = (JavascriptExecutor) d1;
		    js5.executeScript("window.scrollBy(0,37000)", "");
		    Thread.sleep(8000);
		    JavascriptExecutor js6 = (JavascriptExecutor) d1;
		    js6.executeScript("window.scrollBy(0,40000)", "");
		    Thread.sleep(4000);
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[39]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[40]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[41]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[42]/div[2]/button")).click();
		    
		    JavascriptExecutor js61 = (JavascriptExecutor) d1;
		    js61.executeScript("window.scrollBy(0,45500)", "");
		    Thread.sleep(8000);
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[43]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[44]/div[2]/button")).click();
		    JavascriptExecutor js40 = (JavascriptExecutor) d1;
		    js40.executeScript("window.scrollBy(0,46000)", "");
		    Thread.sleep(8000);
		    
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[45]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[46]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[47]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[48]/div[2]/button")).click();
		    JavascriptExecutor js41 = (JavascriptExecutor) d1;
		    js41.executeScript("window.scrollBy(0,48500)", "");
		    Thread.sleep(4000);
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[49]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[50]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[51]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[52]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[53]/div[2]/button")).click();
		    Thread.sleep(8000);
		   
		    JavascriptExecutor js7 = (JavascriptExecutor) d1;
		    js7.executeScript("window.scrollBy(0,51000)", "");
		    Thread.sleep(14000);
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[54]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[55]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[56]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[57]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[58]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[59]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[60]/div[2]/button")).click();
		    Thread.sleep(5000);
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[61]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[62]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[63]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[64]/div[2]/button")).click();
		 
		    
		    JavascriptExecutor js8 = (JavascriptExecutor) d1;
		    js8.executeScript("window.scrollBy(0,53500)", "");
		    Thread.sleep(10000);
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[65]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[66]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[67]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[68]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[69]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[70]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[72]/div[2]/button")).click();
		    Thread.sleep(5000);
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[73]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[74]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[75]/div[2]/button")).click();
		  
		    
		    JavascriptExecutor js9 = (JavascriptExecutor) d1;
		    js9.executeScript("window.scrollBy(0,56000)", "");
		    Thread.sleep(10000);
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[76]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[77]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[78]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[79]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[80]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[81]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[82]/div[2]/button")).click();
		    Thread.sleep(5000);
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[83]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[84]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[85]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[86]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[87]/div[2]/button")).click();
		  
		    
		    JavascriptExecutor js10 = (JavascriptExecutor) d1;
		    js10.executeScript("window.scrollBy(0,58500)", "");
		    Thread.sleep(12000);
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[88]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[89]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[90]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[91]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[92]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[93]/div[2]/button")).click();
		    JavascriptExecutor js81 = (JavascriptExecutor) d1;
		    js81.executeScript("window.scrollBy(0,62500)", "");
		    Thread.sleep(8000);
		
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[95]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[96]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[97]/div[2]/button")).click();
		    Thread.sleep(5000);
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[98]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[99]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[100]/div[2]/button")).click();
		 
		    
		    JavascriptExecutor js11 = (JavascriptExecutor) d1;
		    js11.executeScript("window.scrollBy(0,65000)", "");
		    Thread.sleep(12000);
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[101]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[102]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[103]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[104]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[105]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[106]/div[2]/button")).click();
		    Thread.sleep(5000);
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[107]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[108]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[109]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[110]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[111]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[112]/div[2]/button")).click();
		
		    JavascriptExecutor js12 = (JavascriptExecutor) d1;
		    js12.executeScript("window.scrollBy(0,67500)", "");
		    Thread.sleep(10000);
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[113]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[114]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[115]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[116]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[117]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[118]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[119]/div[2]/button")).click();
		    Thread.sleep(5000);
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[120]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[121]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[122]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[123]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[124]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[125]/div[2]/button")).click();
		 
		    JavascriptExecutor js13 = (JavascriptExecutor) d1;
		    js13.executeScript("window.scrollBy(0,70000)", "");
		    Thread.sleep(10000);
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[126]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[127]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[128]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[129]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[130]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[131]/div[2]/button")).click();
		    Thread.sleep(5000);
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[132]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[133]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[134]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[135]/div[2]/button")).click();
		 
		    
		    JavascriptExecutor js14 = (JavascriptExecutor) d1;
		    js14.executeScript("window.scrollBy(0,72500)", "");
		    Thread.sleep(10000);
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[136]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[137]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[138]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[139]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[140]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[141]/div[2]/button")).click();
		    Thread.sleep(5000);
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[142]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[143]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[144]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[145]/div[2]/button")).click();
		
		    
		    JavascriptExecutor js15 = (JavascriptExecutor) d1;
		    js15.executeScript("window.scrollBy(0,75000)", "");
		    Thread.sleep(10000);
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[146]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[147]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[148]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[149]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[150]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[151]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[152]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[153]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[154]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[155]/div[2]/button")).click();
		    
		    JavascriptExecutor js16 = (JavascriptExecutor) d1;
		    js16.executeScript("window.scrollBy(0,77500)", "");
		    Thread.sleep(10000);
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[156]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[157]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[158]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[159]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[160]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[161]/div[2]/button")).click();
		    Thread.sleep(5000);
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[162]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[163]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[164]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[165]/div[2]/button")).click();
		 
		    
		    
		    JavascriptExecutor js17 = (JavascriptExecutor) d1;
		    js17.executeScript("window.scrollBy(0,80000)", "");
		    Thread.sleep(12000);
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[166]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[167]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[168]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[169]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[170]/div[2]/button")).click();
		    Thread.sleep(5000);
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[171]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[172]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[173]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[174]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[175]/div[2]/button")).click();
		    
		    JavascriptExecutor js18 = (JavascriptExecutor) d1;
		    js18.executeScript("window.scrollBy(0,83000)", "");
		    Thread.sleep(4000);
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[177]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[178]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[179]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[180]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[170]/div[2]/button")).click();
		    Thread.sleep(5000);
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[181]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[182]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[183]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[184]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[185]/div[2]/button")).click();
		    
		    JavascriptExecutor js19 = (JavascriptExecutor) d1;
		    js19.executeScript("window.scrollBy(0,86000)", "");
		    Thread.sleep(4000);
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[186]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[187]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[188]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[189]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[190]/div[2]/button")).click();
		    Thread.sleep(5000);
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[191]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[192]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[193]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[194]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[195]/div[2]/button")).click();
		    
		    JavascriptExecutor js20 = (JavascriptExecutor) d1;
		    js20.executeScript("window.scrollBy(0,89000)", "");
		    Thread.sleep(4000);
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[196]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[197]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[198]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[199]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[200]/div[2]/button")).click();
		    Thread.sleep(5000);
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[201]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[202]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[203]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[204]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[205]/div[2]/button")).click();
		    
		    JavascriptExecutor js21 = (JavascriptExecutor) d1;
		    js21.executeScript("window.scrollBy(0,92000)", "");
		    Thread.sleep(4000);
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[206]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[207]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[208]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[209]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[210]/div[2]/button")).click();
		    Thread.sleep(5000);
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[211]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[212]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[213]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[214]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[215]/div[2]/button")).click();

		    JavascriptExecutor js22 = (JavascriptExecutor) d1;
		    js22.executeScript("window.scrollBy(0,95000)", "");
		    Thread.sleep(4000);
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[216]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[217]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[218]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[219]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[220]/div[2]/button")).click();
		    Thread.sleep(5000);
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[221]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[222]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[223]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[224]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[225]/div[2]/button")).click();
		    
		    JavascriptExecutor js23 = (JavascriptExecutor) d1;
		    js23.executeScript("window.scrollBy(0,98000)", "");
		    Thread.sleep(4000);
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[226]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[227]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[228]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[229]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[230]/div[2]/button")).click();
		    Thread.sleep(5000);
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[231]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[232]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[233]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[234]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[235]/div[2]/button")).click();
		    
		    JavascriptExecutor js24 = (JavascriptExecutor) d1;
		    js24.executeScript("window.scrollBy(0,101000)", "");
		    Thread.sleep(4000);
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[236]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[237]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[238]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[239]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[240]/div[2]/button")).click();
		    Thread.sleep(5000);
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[241]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[242]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[243]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[244]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[245]/div[2]/button")).click();
		    
		    JavascriptExecutor js25 = (JavascriptExecutor) d1;
		    js25.executeScript("window.scrollBy(0,104000)", "");
		    Thread.sleep(4000);
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[246]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[247]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[248]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[249]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[250]/div[2]/button")).click();
		    Thread.sleep(5000);
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[251]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[252]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[253]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[254]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[255]/div[2]/button")).click();
		    
		    JavascriptExecutor js26 = (JavascriptExecutor) d1;
		    js26.executeScript("window.scrollBy(0,100800)", "");
		    Thread.sleep(4000);
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[256]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[257]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[258]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[259]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[260]/div[2]/button")).click();
		    Thread.sleep(5000);
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[261]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[262]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[263]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[264]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[265]/div[2]/button")).click();
		    
		    JavascriptExecutor js27 = (JavascriptExecutor) d1;
		    js27.executeScript("window.scrollBy(0,110000)", "");
		    Thread.sleep(4000);
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[266]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[267]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[268]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[269]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[270]/div[2]/button")).click();
		    Thread.sleep(5000);
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[271]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[272]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[273]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[274]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[275]/div[2]/button")).click();
		    
		    JavascriptExecutor js28 = (JavascriptExecutor) d1;
		    js28.executeScript("window.scrollBy(0,115000)", "");
		    Thread.sleep(4000);
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[276]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[277]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[278]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[279]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[280]/div[2]/button")).click();
		    Thread.sleep(5000);
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[281]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[282]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[283]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[284]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[285]/div[2]/button")).click();
		    
		    JavascriptExecutor js29 = (JavascriptExecutor) d1;
		    js29.executeScript("window.scrollBy(0,118000)", "");
		    Thread.sleep(4000);
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[286]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[287]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[288]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[289]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[290]/div[2]/button")).click();
		    Thread.sleep(5000);
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[291]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[292]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[293]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[294]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[295]/div[2]/button")).click();
		    
		    JavascriptExecutor js30 = (JavascriptExecutor) d1;
		    js30.executeScript("window.scrollBy(0,121000)", "");
		    Thread.sleep(4000);
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[296]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[297]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[298]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[299]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[300]/div[2]/button")).click();
		    Thread.sleep(5000);
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[301]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[302]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[303]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[304]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[305]/div[2]/button")).click();
		    
		    JavascriptExecutor js31 = (JavascriptExecutor) d1;
		    js31.executeScript("window.scrollBy(0,124000)", "");
		    Thread.sleep(4000);
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[306]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[307]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[308]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[309]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[310]/div[2]/button")).click();
		    Thread.sleep(5000);
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[311]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[312]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[313]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[314]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[315]/div[2]/button")).click();
		    
		    JavascriptExecutor js32 = (JavascriptExecutor) d1;
		    js32.executeScript("window.scrollBy(0,127000)", "");
		    Thread.sleep(4000);
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[316]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[317]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[318]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[319]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[320]/div[2]/button")).click();
		    Thread.sleep(5000);
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[321]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[322]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[323]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[324]/div[2]/button")).click();
		    d1.findElement(By.xpath("html/body/div[5]/div[4]/div[3]/div[2]/div/div[2]/div/section[2]/ul/li[325]/div[2]/button")).click();
		    
		    




}
}