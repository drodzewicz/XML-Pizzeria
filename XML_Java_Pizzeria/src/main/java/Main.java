import org.dom4j.DocumentException;

import java.io.IOException;
import java.util.Scanner;


public class Main {



    public static void main(String[] args) throws DocumentException, IOException {
        PizzaCRUD pc = new PizzaCRUD();

        Scanner bufor = new Scanner(System.in);
        Scanner bufor2 = new Scanner(System.in);
        boolean loop = true;


        while(loop){

            System.out.println("<=========================>");
            System.out.println("1. View");
            System.out.println("2. Add");
            System.out.println("3. Delete");
            System.out.println("4. Update");
            System.out.println("5. Sort");
            System.out.println("6. Exit");

            int choice = bufor.nextInt();
            String strChoice;

            switch(choice){
                case 1:{
                    System.out.println("<=========================>");
                    System.out.println("1. Pizzas");
                    System.out.println("2. Beverages");
                    System.out.println("3. Job Positions");
                    System.out.println("4. Employees");

                    choice = bufor.nextInt();
                    switch(choice){
                        case 1: pc.printPizzas(null);
                            break;
                        case 2: pc.printBeverages(null);
                            break;
                        case 3: pc.printJobPos(null);
                            break;
                        case 4: pc.printEmployee(null);
                            break;
                        default:
                            break;
                    }
                }
                break;
                case 2:{
                    System.out.println("<=========================>");
                    System.out.println("1. Pizza");
                    System.out.println("2. Beverage");
                    System.out.println("3. Job Position");
                    System.out.println("4. Employee");

                    choice = bufor.nextInt();
                    switch(choice){
                        case 1:{
                            pc.createPizza();
                        }
                        break;
                        case 2:{
                            pc.createBeverage();
                        }
                        break;
                        case 3:{
                            pc.createJobPos();
                        }
                        break;
                        case 4:{
                            pc.createEmployee();
                        }
                        break;
                    }
                }
                break;
                case 3:{
                    System.out.println("<=========================>");
                    System.out.println("1. Pizzas");
                    System.out.println("2. Beverages");
                    System.out.println("3. Job Positions");
                    System.out.println("4. Employees");

                    choice = bufor.nextInt();
                    switch(choice){
                        case 1: {
                            System.out.print("ID: ");
                            strChoice = bufor2.nextLine();
                            pc.delete("pizzeria/pizzas/pizza[@pizzaID='"+strChoice+"']");
                        }
                            break;
                        case 2: {
                            System.out.print("ID: ");
                            strChoice = bufor2.nextLine();
                            pc.delete("pizzeria/beverages/beverage[@beverageID='"+strChoice+"']");
                        }
                            break;
                        case 3: {
                            System.out.print("ID: ");
                            strChoice = bufor2.nextLine();
                            pc.delete("pizzeria/job_positions/job_position[@positionID='"+strChoice+"']");
                        }
                            break;
                        case 4: {
                            System.out.print("ID: ");
                            strChoice = bufor2.nextLine();
                            pc.delete("pizzeria/employees/employee[@employeeID='"+strChoice+"']");
                        }
                            break;
                    }
                }
                break;
                case 4:{
                    System.out.println("<=========================>");
                    System.out.println("1. Pizzas");
                    System.out.println("2. Beverages");
                    System.out.println("3. Job Positions");
                    System.out.println("4. Employees");

                    choice = bufor.nextInt();
                    switch(choice){
                        case 1:{
                            System.out.print("ID: ");
                            strChoice = bufor2.nextLine();
                            pc.updatePizza(strChoice);
                        }
                            break;
                        case 2: {
                            System.out.print("ID: ");
                            strChoice = bufor2.nextLine();
                            pc.updateBeverage(strChoice);
                        }
                            break;
                        case 3: {
                            System.out.print("ID: ");
                            strChoice = bufor2.nextLine();
                            pc.updateJobPos(strChoice);
                        }
                        break;
                        case 4: {
                            System.out.print("ID: ");
                            strChoice = bufor2.nextLine();
                            pc.updateEmployee(strChoice);
                        }
                            break;
                        default:
                            break;
                    }
                }
                break;
                case 5:{
                    System.out.println("<=========================>");
                    System.out.println("1. Pizza");
                    System.out.println("2. Beverage");
                    System.out.println("3. Job Position");
                    System.out.println("4. Employee");

                    choice = bufor.nextInt();
                    switch(choice){
                        case 1:{
                            pc.sort("pizzeria/pizzas/pizza","pizza");
                        }
                        break;
                        case 2:{
                            pc.sort("pizzeria/beverages","beverage");
                        }
                        break;
                        case 3:{
                            pc.sort("pizzeria/job_positions/job_position","jobpos");
                        }
                        break;
                        case 4:{
                            pc.sort("pizzeria/employees/employee","employee");
                        }
                        break;
                    }
                }
                break;
                default:
                {
                    System.out.println("END");
                    loop = false;
                }
                break;
            }
        }
    }

}
