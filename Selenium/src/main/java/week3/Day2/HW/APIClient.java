package week3.Day2.HW;

public class APIClient {

	public void  sendRequest(String endpoint)
	{
		System.out.println("Sending Request to End Point" + endpoint);
	}
  
	public void  sendRequest(String endpoint,String requestBody, boolean requestStatus)
	{
		System.out.println("Sending Request to End Point" + endpoint);
		System.out.println("Request Body: "  +requestBody);
		
	if(requestStatus)
	{
		System.out.println("Request Status: Sucessful");
	}
	else
	{
		System.out.println("Request Status: Failed");
		
	}
	}
	// Main method to demonstrate method overloading
	public static void main(String[] args)
	{
		//create an object of the APIClient class
		APIClient apiclient = new APIClient();
		
		// Call first overloaded method
		apiclient.sendRequest("/getUsers");
		System.out.println("-------------");
		
		// Call second overloaded method
		apiclient.sendRequest("/CreateUser",  "Name: 'Swatha', age:30" , true);
	}
}








