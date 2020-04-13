package controller;

import java.util.Scanner;

public class Menu {
    boolean exit = false;

    //https://www.youtube.com/watch?v=25kUc_ammbw

    public static void main(String[] args) {

        Product product = new Product("Apple", 15.00);
        Product product2 = new Product("Apple", 15.00);
        Product product3 = new Product("Apple", 15.00, "Description");
        Product product4 = new Product("Apple", 15.00, 15.00, "Description");

        System.out.println(product);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println(product4);

    }
/*
    public void runMenu(){
        mainHeader();
        while(!exit){
            printMenu();
            int choice = getInput();
        }
    }

    private void mainHeader(){
        System.out.println("+---------------------------------------+");
        System.out.println("! Welcome to menu! ");
        System.out.println("! Menu application !");
        System.out.println("+---------------------------------------+");
    }

    private void printMenu(){
        System.out.println("Please make a selection");
        System.out.println("1) Tell me a color");
        System.out.println("2) Tell me a shape");
        System.out.println("0) Exit");
    }

    private int getInput(){
        Scanner kb = new Scanner(System.in);
        int choice = -1;
        while(choice < 0 || choice > 2){
            try{
                System.out.print("\nEnter your choice: ");
                choice = Integer.parseInt(kb.nextLine());
                performAction(choice);
            }
            catch(NumberFormatException e){
                System.out.println("Please try again");
            }
        }
        return choice;
    }

    private void performAction(int choice){
        switch(choice){
            case 0:
                exit = true;
                System.out.println("Thank you!");
                break;
            case 1:
                pickColor();
                break;
            case 2:
                pickShape();
                break;
            case 3:
                System.out.println("Unknown");
        }
    }

    private void pickColor(){
        int num = (int)(Math.random() * 4);
        switch (num){
            case 0:
                System.out.println("Green");
                break;
            case 1:
                System.out.println("Red");
                break;
            case 2:
                System.out.println("Blue");
                break;
            case 3:
                System.out.println("White");
                break;
            default:
                System.out.println("Black");
                break;
        }
    }

    private void pickShape(){
        int num = (int)(Math.random() * 4);
        switch (num){
            case 0:
                System.out.println("Square");
                break;
            case 1:
                System.out.println("Circle");
                break;
            case 2:
                System.out.println("Triangle");
                break;
            case 3:
                System.out.println("Hexagon");
                break;
            default:
                System.out.println("Pyramid");
                break;
        }
    }*/

}
