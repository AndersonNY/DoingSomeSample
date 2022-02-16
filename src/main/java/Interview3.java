//public class Interview3 {
//
//
//    public boolean verifyElementClickable(WebElement element){
//        try {
//            new WebDriverWait(driver,wait.until(ExpectedConditions.elementToBeClickable(element));
//            return true;
//        } catch(TimeoutException e) {
//            return false;
//        }
//
//
//
//        public static ExpectedCondition<WebElement> elementToBeClickable(final WebElement element)
//        { 		return new ExpectedCondition() { 			public WebElement apply(WebDriver driver)
//        { 				WebElement visibleElement = (WebElement) ExpectedConditions.visibilityOf(element).apply(driver);
//            try { 					return visibleElement != null && visibleElement.isEnabled() ? visibleElement : null;
//            } catch (StaleElementReferenceException arg3) { 					return null; 				}
//
//
//
//
//
//            public boolean verifyElementClickable(WebElement element){
//
//            Try{
//
//            WebDriverWait wait = new WebDriverWait(driver, 10)
//
//            return wait.until(ExpectedConditions.elementToBeClickable(element)}
//
//            Catch
//                    (TimeoutException e) {
//                return false;
//            }
