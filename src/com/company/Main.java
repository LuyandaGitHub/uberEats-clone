package com.company;

public class Main {

    public static void main(String[] args) {
         String restaurantsFilepath = "C:\\Users\\UWC Samsung 18\\Desktop\\Zaio\\Java\\Webinar Sessions\\UberEatsClone\\bin\\resturants.csv";
         String ordersFilepath = "C:\\Users\\UWC Samsung 18\\Desktop\\Zaio\\Java\\Webinar Sessions\\UberEatsClone\\bin\\orders.csv";

        Database db = new Database();
        db.getAllRestaurants(restaurantsFilepath);
        Restaurant[] restaurants = db.getRestaurantsByLocation("Rondebosch");
//
        for (int i = 0; i < restaurants.length; i++) {
            System.out.println(restaurants[i]);
        }

//        System.out.println("Welcome to Uber Eats - Signature Dish Edition \n");
//        System.out.println("Select a location to load a restaurant from. Options are Rondebosch, Seapoint, Kenilworth or all.");
//
////        TAKE THE USER INPUT
//        System.out.println("Loading restaurants in your area...\n");
//
////        LOAD LIST OF RESTAURANTS
////        KFC
////        BURGER KING
////        MCDONALDS
//
//        System.out.println("Select a restaurant number (eg. '1' for KFC....\n");
////        TAKE THE USER INPUT
//
//        System.out.println("Loading dishes from your selected restaurant...\n");
////        PRINT ALL THE DISHES UNTIL USER TYPES 'C' FOR CHECKOUT
////        1. SIGNATURE DISH WORTH R400
////        2. SIGNATURE DISH WORTH R400
////        3. SIGNATURE DISH WORTH R400
//
//        System.out.println("Your cart is currently empty \n");
//        System.out.println("Type 'a dish number' to add, and dish number is index + 1 from the array list that is being printed out ");
//
////        EVERYTIME WE ADD A NEW ITEM TO THE CART...SHOW THE CART
////        1. Zinger burger and chips
////        2. Spicy Grand Mac
//
//        System.out.println("Press 'd index' to delete items from cart...\n");
////        EVERYTIME WE DELETE AN ITEM TO THE CART...SHOW THE CART
//
//        System.out.println("Please confirm your order by typing 'y' for yes");
////        WHEN 'Y' IS PRESSED, ORDERS GET ADDED TO CSV FILE
//
////        PRINT ITEMS FROM CART
////        1. Zinger burger and chips
////        2. Spicy Grand Mac
//
//        System.out.println("Cost of order: R" + "");
//
//        System.out.println("com.company.UberEatsResturantApp.Order has been placed! Thank you for your time. Restaurant will process your order soon.\n");

    }
}
