package week3.Day2.HW;

public class Browser {

	String browserName;
	String browserVersion;
	
	public void openURL()
	{
		System.out.println("Opening the URL");
	}
	public void closeBrowser()
	{
		System.out.println("Close the Browser");
	}
	public void navigateBack()
	{
		System.out.println("Going Back");
	}
	
   public static void main(String[] args) 
   {
	
	Browser b= new Browser();
	b.openURL();
	b.closeBrowser();
	b.navigateBack();
	
	Chrome c = new Chrome();
	c.openIncognito();
	c.clearCache();
	
	Edge e = new Edge();
	e.clearCookies();
	e.takeSnap();
	
	Safari s = new Safari();
	s.fullScreenMode();
	s.readerMode();
}
}
