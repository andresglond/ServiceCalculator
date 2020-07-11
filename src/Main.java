import model.Calculator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double oper1 = 0.0;
        double oper2 = 0.0;
        int response= 0;
        String operation = "";
        Scanner sc;
        Scanner sc1;
        Scanner sc2;
        System.out.println("Welcome to the Service calculator");
        System.out.println("select the operation to perform");


        do{

            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Divided by (/)");
            System.out.println("5. Raised to nth power (x^Y)");
            System.out.println("6. Root (Y√x)");
            System.out.println("7. Module (%)");
            System.out.println("0. Exit");
            System.out.println();

            sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            if (response == 4 ){


                System.out.println("Enter the first value: ");
                sc1 = new Scanner(System.in);
                oper1 = Double.valueOf(sc1.nextLine());
                System.out.println("Enter the second value: ");
                sc2 = new Scanner(System.in);

                if (sc2.nextLine() != "0"){
                    oper2 = Double.valueOf(sc2.nextLine());
                }else {
                    System.out.println("enter a non-zero value");
                }
            } else {

                System.out.println("Enter the first value: ");
                sc1 = new Scanner(System.in);
                oper1 = Double.valueOf(sc1.nextLine());
                System.out.println("Enter the second value: ");
                sc2 = new Scanner(System.in);
            }


            switch(response) {
                case 1: operation = "sumar";
                break;
                case 2: operation = "restar";
                break;
                case 3: operation = "multiplicar";
                    break;
                case 4: operation = "dividir";
                    break;
                case 5: operation = "potenciar";
                    break;
                case 6: operation = "raiz";
                    break;
                case 7: operation = "modulo";
                    break;
                default: System.out.println("Please, enter a valid option");
                    break;
            }

            Calculator calculator1 = new Calculator(oper1, oper2, operation);
            calculator1.operationValidate();
            String mensaje = calculator1.toString();
            System.out.println(mensaje);
        }while(response!=0);


    }
}
