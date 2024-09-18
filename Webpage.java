package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Navigate to browser
      WebDriver driver=new ChromeDriver();
        //Maximizing the browser
      driver.manage().window().maximize();
        //navigate to url
      driver.get("https://www.saucedemo.com/");
        //To enter username
      driver.findElement(By.id("user-name")).sendKeys("problem_user");
         //To type password
      driver.findElement(By.id("password")).sendKeys("secret_sauce");
          //To click login
      driver.findElement(By.id("login-button")).click();
          //click the link sauce Labs Backpack
      WebElement product=driver.findElement(By.linkText("Sauce Labs Backpack"));
      System.out.println(product);
      product.click();
         Thread.sleep(2000);
         //Navigating back 
          driver.navigate().back();
      
      WebElement product1=driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt"));
      System.out.println(product1);
      product1.click();
         
      Thread.sleep(2000);
      //Navigating back 
         driver.navigate().back();
         
         WebElement product2=driver.findElement(By.linkText("Sauce Labs Onesie"));
         System.out.println(product2);
         product2.click();
            
         Thread.sleep(2000);
         //Navigating back 
            driver.navigate().back();  
            
            WebElement product3=driver.findElement(By.linkText("Sauce Labs Bike Light"));
            System.out.println(product3);
            product3.click();
               
            Thread.sleep(2000);
            //Navigating back 
               driver.navigate().back();     
               WebElement product4=driver.findElement(By.linkText("Sauce Labs Fleece Jacket"));
               System.out.println(product4);
               product4.click();
                  
               Thread.sleep(2000);
               //Navigating back 
                  driver.navigate().back();    
                  
                  WebElement product5=driver.findElement(By.linkText("Test.allTheThings() T-Shirt (Red)"));
                  System.out.println(product5);
                  product5.click();
                     
                  Thread.sleep(2000);
                  //Navigating back 
                     driver.navigate().back();   
                      //selecting add to cart in Sauce labs backpack
                     WebElement Addtocart=driver.findElement(By.name("add-to-cart-sauce-labs-backpack"));
                     System.out.println(Addtocart);
                     Addtocart.click(); 
                     Thread.sleep(2000);
                       //checking add to cart(sauce labs backspace is added)
                     driver.findElement(By.id("shopping_cart_container")).click();
                     Thread.sleep(2000);
                         //Removing sauce labs backspace from cart
                     WebElement Remove=driver.findElement(By.name("remove-sauce-labs-backpack"));
                     System.out.println(Remove);
                     Remove.click();  
                     Thread.sleep(2000);
                       driver.navigate().back();
                       
                       WebElement Addtocart1=driver.findElement(By.name("add-to-cart-sauce-labs-onesie"));
                       System.out.println(Addtocart1);
                       Addtocart1.click();   
                       
                       driver.findElement(By.id("shopping_cart_container")).click();
                       Thread.sleep(2000);
                           
                       WebElement Remove1=driver.findElement(By.name("remove-sauce-labs-onesie"));
                       System.out.println(Remove1);
                       Remove1.click(); 
                       Thread.sleep(2000);
                       
                       WebElement Continue=driver.findElement(By.id("continue-shopping"));
                       System.out.println(Continue);
                       Continue.click(); 
                       
                       WebElement Addtocart2=driver.findElement(By.name("add-to-cart-sauce-labs-bike-light"));
                       System.out.println(Addtocart2);
                       Addtocart2.click(); 
                       Thread.sleep(2000);
                       
                       WebElement Addtocart3=driver.findElement(By.name("add-to-cart-sauce-labs-onesie"));
                       System.out.println(Addtocart3);
                       Addtocart3.click(); 
                       Thread.sleep(2000);
                       
                       driver.findElement(By.id("shopping_cart_container")).click();
                       Thread.sleep(2000);
                       
                       WebElement Remove2=driver.findElement(By.name("remove-sauce-labs-bike-light"));
                       System.out.println(Remove2);
                       Remove2.click(); 
                       Thread.sleep(2000);
                       
                       driver.findElement(By.id("checkout")).click();
                       
                       driver.findElement(By.id("last-name")).sendKeys("Bhu");
                       driver.findElement(By.id("first-name")).sendKeys("sk");
                       driver.findElement(By.id("postal-code")).sendKeys("32323");
                       
                       driver.findElement(By.id("continue")).click();
                       
	}

}
