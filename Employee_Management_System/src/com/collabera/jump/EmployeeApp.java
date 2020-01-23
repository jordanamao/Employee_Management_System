package com.collabera.jump;

import java.util.Collections;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class EmployeeApp {


	public static void main(String[] args) {

		Map< Integer, Employee > listOfEmployees = new TreeMap<>();


		while(true) {

			try {

				System.out.println("\n1.ADD \n2.REMOVE\n3.MODIFY\n4.PRINT\n5.EXIT");

				Scanner scanner = new Scanner(System.in);
				int option = scanner.nextInt();

				if ( option == 1 )
				{


					Employee employee = new Employee();
					System.out.println("Enter ID: ");

					int id = scanner.nextInt();

					if (listOfEmployees.containsKey(id) == false)
					{

						employee.setId(id);

						System.out.println("Enter Last Name:");

						String lastname = scanner.next();

						employee.setLastName(lastname); 

						System.out.println("Enter First Name:");

						String firstname = scanner.next();

						employee.setFirstName(firstname);

						System.out.println("Enter a department:\n1.ACCOUNTING\n2.HR\n3.DEVELOPMENT\n4.SALES\n");

						int dept = scanner.nextInt();

						Department d = null;

						if ( dept == 1) {

							employee.setDepartment(d.ACCOUNTING);
						}

						if (dept == 2) {

							employee.setDepartment(d.HR);
						}

						if (dept == 3) {

							employee.setDepartment(d.DEVELOPMENT);
						}

						if (dept == 4) {

							employee.setDepartment(d.SALES);
						}

						listOfEmployees.put(employee.getId(),employee);

						System.out.println("Employee Added: " + employee.toString()); 

					}

					else { System.out.println("ID alreayd exists. Please try again. ");}



				}

				if (option == 2)
				{
					System.out.println("Enter an ID to remove");

					int idnumber = scanner.nextInt();


					if ( listOfEmployees.containsKey(idnumber) ==true)
					{

						//store the soon to be deleted employee
						Employee removedEmployee =  listOfEmployees.get(idnumber);

						//remove it
						listOfEmployees.remove(idnumber);


						System.out.println("Employee Removed: " + removedEmployee.toString()); 

					}

					else {System.out.println("Employee not found, please try again");}

				}


				if (option == 3)
				{

					System.out.println("Enter ID to modify: ");

					int idnumber = scanner.nextInt();

					if ( listOfEmployees.containsKey(idnumber) == true)

					{

						System.out.println(idnumber+" Found");
						System.out.println("Enter a department:\n1.ACCOUNTING\n2.HR\n3.DEVELOPMENT\n4.SALES\n");

						int dept = scanner.nextInt();

						Department d = null;

						if ( dept == 1) {

							listOfEmployees.get(idnumber).setDepartment(d.ACCOUNTING);
						}

						if (dept == 2) {

							listOfEmployees.get(idnumber).setDepartment(d.HR);
						}

						if (dept == 3) {

							listOfEmployees.get(idnumber).setDepartment(d.DEVELOPMENT);
						}

						if (dept == 4) {

							listOfEmployees.get(idnumber).setDepartment(d.SALES);
						}


						System.out.println("Department changed: " + listOfEmployees.get(idnumber).toString()) ;

					}

					else {System.out.println("Employee not found, please try again");}
				}


				if (option == 4)

				{	
					System.out.println("Employee list:");
					System.out.println("---------------------------");

					// iterate through listofEmployees to print
					for(Map.Entry<Integer, Employee> entry: listOfEmployees.entrySet()) {
						Employee person = entry.getValue();
						System.out.println("Employee Added: " + person.toString()); 
					}
				}

				if (option == 5)

				{
					System.out.println("Thank you for using employee management system.");
					break;
				}
				
				
			}catch(InputMismatchException e) {
				
				System.out.println("Invalid input, types mismatch. Please enter integer");
				
				
			}catch(Exception e)
			
			{
				System.out.println("Invalid input, exception thrown");
				
			}

		}
	}

}


