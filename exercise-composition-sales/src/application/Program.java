package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {
	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Client client = new Client();
		Order order = new Order();

		System.out.println("... CLIENT DATA ...");
		System.out.print("Name: ");
		client.setName(sc.next());
		System.out.print("Email: ");
		client.setEmail(sc.next());
		System.out.print("Birth Date (DD/MM/YYYY): ");
		client.setBirthDate(sdf.parse(sc.next()));

		System.out.println();
		System.out.println("... ORDER DATA ...");
		System.out.print("Status: ");
		order.setStatus(OrderStatus.valueOf(sc.next()));
		order.setMoment(new Date());
		order.setClient(client);

		System.out.println();
		System.out.print("How many items to this order? ");
		int itemsQuantity = sc.nextInt();

		for (int i = 1; i <= itemsQuantity; i++) {

			System.out.println("... #" + i + " ITEM DATA ...");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();

			Product product = new Product(productName, productPrice);

			System.out.print("Quantity: ");
			int quantity = sc.nextInt();

			OrderItem orderItem = new OrderItem(quantity, productPrice, product);

			order.addItem(orderItem);
		}

		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);

		sc.close();
	}
}
