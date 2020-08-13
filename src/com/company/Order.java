package com.company;

public class Order {
    private int cost;

    private String order;
    private String location;

    private Restaurant restaurant;


//    CONSTRUCTOR METHOD GETS CALLED AS SOON AS THE Order OBJECT IS INSTANTIATED...SO WE USE IT TO SET OUR INSTANCE VARIABLES
    public Order(String order, String location, Restaurant restaurant, int cost) {
        this.order = order;
        this.location = location;
        this.restaurant = restaurant;
        this.cost = cost;
    }

//  WE USE SETTERS TO SET OR UPDATE INSTANCE VARIABLES
    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }


//    WE USE GETTERS TO READ THE VALUES OF VARIABLES
    public int getCost() {
        return cost;
    }

    public String getLocation() {
        return location;
    }

    public String getOrder() {
        return order;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    @Override
    public String toString() {
        return "Order{" +
                "order='" + order + '\'' +
                ", location='" + location + '\'' +
                ", restaurant='" + restaurant + '\'' +
                ", cost=" + cost +
                '}';
    }

}
