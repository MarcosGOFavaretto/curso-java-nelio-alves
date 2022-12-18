package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Worker worker = new Worker();
		HourContract hourContract;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		// Department
		System.out.print("Enter department's name: ");
		worker.setDepartment(new Department(sc.nextLine()));

		// Worker
		System.out.println("... WORKER DATA ...");
		System.out.print("Name: ");
		worker.setName(sc.nextLine());
		System.out.print("Level: ");
		worker.setLevel(WorkerLevel.valueOf(sc.nextLine()));
		System.out.print("Base salary: ");
		worker.setBaseSalary(sc.nextDouble());

		System.out.print("How many contracts to this worker? ");
		int contractsQuantity = sc.nextInt();

		// Contracts
		for (int i = 1; i <= contractsQuantity; i++) {
			hourContract = new HourContract();
			System.out.println("Enter contract #" + i + " data:");
			System.out.print("Date (DD/MM/YYYY): ");
			sc.nextLine();
			hourContract.setDate(sdf.parse(sc.nextLine()));
			System.out.print("Velue per hour: ");
			hourContract.setValuePerHour(sc.nextDouble());
			System.out.print("Duration (hours): ");
			hourContract.setHours(sc.nextInt());

			worker.addContract(hourContract);
		}

		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		sc.nextLine();
		String incomeDate = sc.nextLine();
		int month = Integer.valueOf(incomeDate.split("/")[0]);
		int year = Integer.valueOf(incomeDate.split("/")[1]);

		// Result
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + incomeDate + ": " + worker.income(month, year)); // FIXME

		sc.close();
	}

}
