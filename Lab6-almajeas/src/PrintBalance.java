import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;


public class PrintBalance {


	
	Locale currentLocale;
	ResourceBundle messages;
	Date date;
	public PrintBalance(String language, String country, Date date){
		currentLocale = new Locale(language, country);
		messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
		this.date = date;
//		printAll();
	}
	
	public  String getTranslation(String text){
		return messages.getString(text);
	}
	
	public String getMoney(double money){
		return NumberFormat.getCurrencyInstance(currentLocale).format(money);
	}
	
	public String getDate(Date date){
		return DateFormat.getDateTimeInstance().format(date);
	}
	
	
	
	public void printAll(){
		Scanner scanInput = new Scanner(System.in);
		// Greeting
		System.out.println(getTranslation("greetings"));
		// Get User's Name
		System.out.println(getTranslation("enterName"));
		String name = scanInput.nextLine();
		System.out.println(getTranslation("pleased") + name);
		// print today's date, balance and bid goodbye
		System.out.println(getTranslation("asOf") + getDate(date));
		double money = 876543.21;
		System.out.println("You owe the school "+ getMoney(money));
		System.out.println(getTranslation("farewell"));
	}
	
	
	

}
