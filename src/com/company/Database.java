package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Database {
    private String restaurantsFilepath = "C:\\Users\\UWC Samsung 18\\Desktop\\Zaio\\Java\\Webinar Sessions\\UberEatsClone\\bin\\resturants.csv";
    private String ordersFilepath = "C:\\Users\\UWC Samsung 18\\Desktop\\Zaio\\Java\\Webinar Sessions\\UberEatsClone\\bin\\orders.csv";

    private Order[] orders;

    private Restaurant[] restaurants;


    private int numberOfRondeboschResurants;
    private int numberOfSeapointResurants;
    private int numberOfKennilworthResurants;

    public int countLinesInFile(String filepath) {
        int amountOfLines = 0;

//        CREATE A BufferedReader THAT WE WILL USE TO READ THE cvc FILE
//        WE WRAP THIS IN A try...catch BLOCK TO HANDLE ERRORS
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filepath));
            String fileLine = null;

//            ON EACH ITERATION, THIS CHECKS TO SEE IF NEXT LINE EXISTS
            while ((fileLine = bufferedReader.readLine()) != null) {
                amountOfLines++;
            }

            bufferedReader.close();
        }
//        CATCH THE ERROR IF THE FILE DOESN'T EXIST
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        AT THE END, i WILL CONTAIN THE AMOUNT OF LINES IN THE FILE
        return amountOfLines;
    }

    public Restaurant[] getAllRestaurants(String filepath) {
        try {
//        CREATE A BufferedReader THAT WE WILL USE TO READ THE cvc FILE
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filepath));

            String fileLine = null;
            int i = 0;

            this.restaurants = new Restaurant[countLinesInFile(filepath) - 1];

            while ((fileLine = bufferedReader.readLine()) != null) {
//                SINCE THE FIRST LINE IS THE HEADING..WE HAVE TO SKIP IT

                if (i > 0) {
//                    SPLIT THE data AT THE "," SO THAT WE HAVE ACCESS TO EACH "CELL"
                    String[] data = fileLine.split(",");

//                    CREATE A NEW INSTANCE OF THE Restaurant CLASS WITH THE INFORMATION FROM THE data ON EACH ITERATION
                    Restaurant restaurant = new Restaurant(data[0].trim(), data[1].trim(), data[3].trim(), data[5].trim(), Integer.parseInt(data[2].trim()), Integer.parseInt(data[4].trim()), Integer.parseInt(data[6].trim()), data[7].trim());

//                    ADD EACH restaurant TO THE restaurants ARRAY
                    restaurants[i - 1] = restaurant;

//                    HERE, WE SEPARATE THE RESTAURANTS BY LOCATION
                    if(data[7].trim().toLowerCase().equals("rondebosch")) {
                        this.numberOfRondeboschResurants++;
                    }
                    if(data[7].trim().toLowerCase().equals("seapoint")) {
                        this.numberOfSeapointResurants++;
                    }
                    if(data[7].trim().toLowerCase().equals("kennilworth")) {
                        this.numberOfKennilworthResurants++;
                    }
                }
                    i++;
                }

            } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        return restaurants;
    }

    public Restaurant[] getRestaurantsByLocation(String location) {
        Restaurant[] rondeboschRestaurants = new Restaurant[numberOfRondeboschResurants];;
        Restaurant[] seapointRestaurants  = new Restaurant[numberOfSeapointResurants];;
        Restaurant[] kennilworthRestaurants = new Restaurant[numberOfKennilworthResurants];;

        int kennilworthCounter = 0;
        int seapointCounter = 0;
        int rondebschCounter = 0;

        for (int i = 0; i < this.restaurants.length; i++) {

//            PUT EACH DRIVER IN THE APPROPRIATE CATEGORY
            if(this.restaurants[i].getLocation().toLowerCase() == "rondebosch") {
                rondeboschRestaurants[rondebschCounter] = restaurants[i];
                rondebschCounter++;
            } else if (this.restaurants[i].getLocation().toLowerCase() == "kennilworth") {
                kennilworthRestaurants[kennilworthCounter] = restaurants[i];
                kennilworthCounter++;
            } else if (this.restaurants[i].getLocation().toLowerCase() == "seapoint") {
                seapointRestaurants[seapointCounter] = restaurants[i];
                seapointCounter++;
            }
        }

        if(location.toLowerCase().equals("rondebosch")) { return rondeboschRestaurants; }

        if(location.toLowerCase().equals("seapoint")) { return seapointRestaurants; }

        return kennilworthRestaurants;
    }




    public Restaurant[] getRestaurants() {
        return restaurants;
    }

    public Order[] getOrders() {
        return orders;
    }
}
