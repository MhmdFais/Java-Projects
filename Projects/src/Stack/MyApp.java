package Stack;

import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the stack");
        int size = in.nextInt();
        MyStack stack = new MyStack(size);
        userChoice(stack);
    }

    public static void userChoice(MyStack stack){
        Scanner in = new Scanner(System.in);
        int choice;
        do {
            System.out.println();
            System.out.println("============================================");
            System.out.println("Choose your operation");
            System.out.println("1. Input a number to array");
            System.out.println("2. Delete the last number entered number");
            System.out.println("3. Print the last entered number");
            System.out.println("4. Delete and print the last entered number");
            System.out.println("5. Check whether the stack is empty");
            System.out.println("6. Display the stack");
            System.out.println("7. Exit");
            System.out.println("===========================================");
            System.out.println("Enter your choice");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the number to push");
                    int number = in.nextInt();
                    stack.push(number);
                    break;
                case 2:
                    System.out.println("Deleted number is " + stack.pop());
                    break;
                case 3:
                    System.out.println("Latest number is " + stack.top());
                    break;
                case 4:
                    System.out.println("Latest and the deleted number is " + stack.topAndPop());
                    break;
                case 5:
                    if (stack.isEmpty())
                        System.out.println("Stack is empty");
                    else
                        System.out.println("Stack is not empty");
                    break;
                case 6:
                    System.out.println();
                    System.out.print("Stack is: ");
                    stack.printStack();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 7);
    }
}
