package week1.Day2.HW;

public class Browser {
	
	// launchBrowser with given name
	public void launchBrowser(String browserName)

	{
		System.out.println("browserName is:" + browserName);
	}
	
	// loadUrl and return value 
	public String loadUrl()
	
	{
		return ("Url loaded successfully");
	}
	
	// Create object for both of the methods
	public static void main(String[] args)
	{
		Browser brows = new Browser();
		brows.launchBrowser("Firefox");
		String Url = brows.loadUrl();
		System.out.println(Url);		
	}
	
}
