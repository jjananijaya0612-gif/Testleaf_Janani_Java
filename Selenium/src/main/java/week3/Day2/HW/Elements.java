package week3.Day2.HW;

public class Elements {

	public static void main(String[] args) {
      
		//Button object
		Button button = new Button();
		button.submit();
		button.click();
		
		//TextField object
		TextField tf = new TextField();
		tf.getText();
		tf.setText("Inheritance Program");
		System.out.println(tf.getText());
		
		//CheckBoxButton object 
		CheckBoxButton check = new CheckBoxButton();
		check.clickCheckButton();
		check.submit();
		check.click();
		
		//RadioButton object
		RadioButton radio = new RadioButton();
		radio.selectRadioButton();
		radio.click();
		radio.submit();

	}

}
