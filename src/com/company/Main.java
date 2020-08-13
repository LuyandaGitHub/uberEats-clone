package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean readyToSaveOrder = false;

        Restaurant restaurantClass = new Restaurant();
        Scanner scanner = new Scanner(System.in);
        Database db = new Database();

        Restaurant[] allRestaurants = db.getAllRestaurants();

//        for (int i = 0; i < restaurants.length; i++) {
//            System.out.println(restaurants[i]);
//        }

        System.out.println("Welcome to Uber Eats - Signature Dish Edition \n");
        System.out.println("Select a location to load a restaurant from. Options are Rondebosch, Seapoint, Kenilworth or all.");

//        TAKE THE USER INPUT
        String location = scanner.nextLine();
        System.out.println("Loading restaurants in your area...\n");

        Restaurant[] restaurantsAtLocation = db.getRestaurantsByLocation(location);

//        LOAD LIST OF RESTAURANTS
        for (int i = 0; i < restaurantsAtLocation.length; i++) {
            System.out.println(i + 1 + ". " + restaurantsAtLocation[i].getName());
        }

        System.out.println("Select a restaurant number (eg. '1' for KFC....)\n");

//        TAKE THE USER INPUT
        int restaurantNumber = scanner.nextInt();

        System.out.println("Loading dishes from your selected restaurant...\n");
        Restaurant chosenRestaurant = restaurantsAtLocation[restaurantNumber - 1];

//        PRINT ALL THE DISHES UNTIL USER TYPES 'C' FOR CHECKOUT
        System.out.println("1. " + chosenRestaurant.getSignatureDish1() + " worth " + chosenRestaurant.getCost1());
        System.out.println("2. " + chosenRestaurant.getSignatureDish2() + " worth " + chosenRestaurant.getCost2());
        System.out.println("3. " + chosenRestaurant.getSignatureDish3() + " worth " + chosenRestaurant.getCost3() + "\n");

        System.out.println("Your cart is currently empty.");

        ArrayList<Order> orders = new ArrayList<Order>();

        while(readyToSaveOrder == false) {
            System.out.println("Type 'a dish number' to add, and dish number is index + 1 from the array list that is being printed out ");
            int dishNumber = scanner.nextInt();
            int dishCost = 0;
            String dish = "";

//        SAVE THE ORDER
            if(dishNumber == 1) {
                dish = chosenRestaurant.getSignatureDish1();
                dishCost = chosenRestaurant.getCost1();
            }

            if(dishNumber == 2) {
                dish = chosenRestaurant.getSignatureDish2();
                dishCost = chosenRestaurant.getCost2();
            }

            if(dishNumber == 3) {
                dish = chosenRestaurant.getSignatureDish3();
                dishCost = chosenRestaurant.getCost3();
            }

//            ON EACH ITERATION, ADD EACH order TO THE orders ARRAYLIST
            Order order = new Order(dish, chosenRestaurant.getLocation(), chosenRestaurant, dishCost);
            orders.add(order);

//            ON EACH ITERATION, SHOW THE CART
            int i = 1;
            Iterator iterator = orders.iterator();
            while(iterator.hasNext()) {
                Order currentOrder = (Order) iterator.next();
                System.out.println(i + ". " + currentOrder.getOrder());
                i++;
            }

//        WHEN 'Y' IS PRESSED, ORDERS GET ADDED TO CSV FILE
            System.out.println("Please confirm your order by typing 'y' for yes");
            String userInput = scanner.nextLine();

            if(userInput.equals(String.valueOf('y'))) {
                readyToSaveOrder = true;
            }
        }

//         PLACE THE ORDER AND WRITE TO CSV FILE
        restaurantClass.placeOrder(orders);
    }
}
