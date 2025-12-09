package week1.Day2.HW;

public class EdgeBrowser {

	public static void main(String[] args)
	{

		Browser brows = new Browser();
		brows.launchBrowser("Edge");
		String Url = brows.loadUrl();
		System.out.println(Url);
	}

}
