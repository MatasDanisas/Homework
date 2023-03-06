
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String type = null;

		System.out.println("Product type?: ");
		System.out.println("Commodity/Alcohol/Wine/Drug");
		type = scanner.nextLine();

		if (!type.equals("Commodity") && !type.equals("Alcohol") && !type.equals("Wine") && !type.equals("Drug")) {
			System.out.println("Invalid input!");
		} 
		
		if (type.equals("Commodity")) {
			System.out.println("Name? ");
			String name = scanner.nextLine();

			System.out.println("Price? ");
			double price = scanner.nextDouble();

			Item cmdt = new Commodity(name, price);
			System.out.println(cmdt);
		}

		if (type.equals("Alcohol")) {
			System.out.println("Name? ");
			String name = scanner.nextLine();

			System.out.println("Price? ");
			double price = scanner.nextDouble();

			System.out.println("Alcohol content? ");
			double content = scanner.nextDouble();

			System.out.println("Volume? ");
			double volume = scanner.nextDouble();

			Item alc = new Alcohol(name, price, content, volume);
			System.out.println(alc);
		}

		if (type.equals("Wine")) {
			System.out.println("Name? ");
			String name = scanner.nextLine();

			System.out.println("Price? ");
			double price = scanner.nextDouble();

			System.out.println("Alcohol content? ");
			double content = scanner.nextDouble();

			System.out.println("Volume? ");
			double volume = scanner.nextDouble();

			Item wine = new Wine(name, price, content, volume);
			System.out.println(wine);
		}

		if (type.equals("Drug")) {
			System.out.println("Name? ");
			String name = scanner.nextLine();

			System.out.println("Price? ");
			double price = scanner.nextDouble();

			Item drug = new Drug(name, price);
			System.out.println(drug);
		}
		scanner.close();
	}
}
