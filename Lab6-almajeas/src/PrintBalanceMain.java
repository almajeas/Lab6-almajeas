import java.util.Date;
import java.util.Scanner;

public class PrintBalanceMain {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out
				.print("please choose locale :\n0- exit\n1- US en\n2- FR fr\n3- DE de\n enter # :");
		int locale = input.nextInt();
		while (locale != 0) {

			PrintBalance PB;
			switch (locale) {
			case 0:
				break;
			case 1:
				PB = new PrintBalance("en", "US", new Date());
				PB.printAll();
				break;
			case 2:
				PB = new PrintBalance("fr", "FR", new Date());
				PB.printAll();
				break;
			case 3:
				PB = new PrintBalance("de", "DE", new Date());
				PB.printAll();
				break;
			default:
				System.out.println("wrong selection.");

			}
			System.out
					.print("please choose locale :\n0- exit\n1- US en\n2- FR fr\n3- DE de\n enter # :");
			locale = input.nextInt();

		}

	}
}
