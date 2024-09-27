package com.example.project;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();
        double totaltip= cost*(percent/100.0);
        double billWithTip=totaltip+cost;
        double perPersonNoTip = cost/people;
        double tipPerPerson=totaltip/people;
        double totalCostPerPerson=billWithTip/people;
                       
        result.append("-------------------------------\n");
        result.append("Total bill before tip: $").append(String.format("%.2f", cost)).append("\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: ").append(percent + "%").append("\n");
        result.append("Total tip: $").append(String.format("%.2f", totaltip)).append("\n");
        result.append("Total Bill with tip: $").append(String.format("%.2f", billWithTip)).append("\n");
        result.append("Per person cost before tip: $").append(String.format("%.2f", perPersonNoTip)).append("\n");
        result.append("Tip per person: $").append(String.format("%.2f", tipPerPerson)).append("\n");
        result.append("Total cost per person: $").append(String.format("%.2f", totalCostPerPerson)).append("\n");
        result.append("-------------------------------\n");


        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 4; 
        int percent = 15;
        double cost = 57.67;              
        System.out.println(calculateTip(people,percent,cost));
    }
}
        
