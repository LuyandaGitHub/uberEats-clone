package com.company;

public class Restaurant {
    private String name;
    private String location;
    private String signatureDish1;
    private String signatureDish2;
    private String signatureDish3;

    private int cost1;
    private int cost2;
    private int cost3;

//    CONSTRUCTOR METHOD GETS CALLED AS SOON AS THE Restaurant OBJECT IS INSTANTIATED...SO WE USE IT TO SET OUR INSTANCE VARIABLES
    public Restaurant(String name, String signatureDish1, String signatureDish2, String signatureDish3, int cost1, int cost2, int cost3, String location) {
        this.name = name;
        this.signatureDish1 = signatureDish1;
        this.signatureDish2 = signatureDish2;
        this.signatureDish3 = signatureDish3;
        this.cost1 = cost1;
        this.cost2 = cost2;
        this.cost3 = cost2;
        this.location = location;
    }

//  WE USE SETTERS TO SET OR UPDATE INSTANCE VARIABLES
    public void setCost1(int cost1) {
        this.cost1 = cost1;
    }

    public void setCost2(int cost2) {
        this.cost2 = cost2;
    }

    public void setCost3(int cost3) {
        this.cost3 = cost3;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSignatureDish1(String signatureDish1) {
        this.signatureDish1 = signatureDish1;
    }

    public void setSignatureDish2(String signatureDish2) {
        this.signatureDish2 = signatureDish2;
    }

    public void setSignatureDish3(String signatureDish3) {
        this.signatureDish3 = signatureDish3;
    }

    public void setLocation(String location) {
        this.location = location;
    }


//    WE USE GETTERS TO READ THE VALUES OF VARIABLES

    public int getCost1() {
        return cost1;
    }

    public int getCost2() {
        return cost2;
    }

    public int getCost3() {
        return cost3;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getSignatureDish1() {
        return signatureDish1;
    }

    public String getSignatureDish2() {
        return signatureDish2;
    }

    public String getSignatureDish3() {
        return signatureDish3;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", signatureDish1='" + signatureDish1 + '\'' +
                ", signatureDish2='" + signatureDish2 + '\'' +
                ", signatureDish3='" + signatureDish3 + '\'' +
                ", cost1=" + cost1 +
                ", cost2=" + cost2 +
                ", cost3=" + cost3 +
                '}';
    }
}

