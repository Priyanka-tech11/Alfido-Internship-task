import java.io.*;
import java.util.*;

class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by Zero!");
            return 0;
        }
        return a / b;
    }
}

class FileManager {
    private final String filename = "history.txt";

    public void saveHistory(String record) {
        try (FileWriter fw = new FileWriter(filename, true)) {
            fw.write(record + "\n");
        } catch (IOException e) {
            System.out.println("Error writing to file");
        }

    }
    public void showHistory(){
     try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("\n  Calculation History:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("No history found.");
        }
    }
}
class CalculatorApp{
    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);
        Calculator calc=new Calculator();
        FileManager fm=new FileManager();

        while(true)
        {
            System.out.println("\n=== Java Calculator ===");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. View History");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int ch=sc.nextInt();
            if(ch==6) break;
            if(ch==5){
                fm.showHistory();
                continue;
            }
             System.out.print("Enter first number: ");
            double a = sc.nextDouble();
            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            double result = 0;
            String operation = "";
             switch (ch) {
                case 1 -> { result = calc.add(a, b); operation = "Addition"; }
                case 2 -> { result = calc.subtract(a, b); operation = "Subtraction"; }
                case 3 -> { result = calc.multiply(a, b); operation = "Multiplication"; }
                case 4 -> { result = calc.divide(a, b); operation = "Division"; }
                default -> System.out.println("Invalid choice!");
            }
            
            System.out.println("Result: " + result);
            String record = operation + " of " + a + " and " + b + " = " + result;
            fm.saveHistory(record);
        }

        System.out.println("\nThank you for using the calculator!");
        sc.close();
        }
    }
