
public class Test009 {
	
	/*sample coding */
	
	//WebDriverWait wait = new WebDriverWait(WebDriverRefrence,TimeOut);
	WebDriverWait wait = new WebDriverWait (driver, 20);
	wait.until(ExpectedConditions.VisibilityofElementLocated(By.xpath(""//button[@value='Save Changes']"")));
	

}
