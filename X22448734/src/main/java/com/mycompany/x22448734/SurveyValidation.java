package com.mycompany.x22448734;

public class SurveyValidation { 
    
    private double monthlyElectricityBill;
    // Add other survey variables here
    
    // Constructor
    public SurveyValidation() {
        // Initialize variables if necessary
    }
    
    // Getters and Setters
    // The location variable and its getter and setter methods have been removed
    
    public double getMonthlyElectricityBill() {
        return monthlyElectricityBill;
    }
    
    public void setMonthlyElectricityBill(double monthlyElectricityBill) {
        this.monthlyElectricityBill = monthlyElectricityBill;
    }
    
    // Add getters and setters for other survey variables
    
    // Validation Methods
    public boolean validateElectricityBill() {
        // Check if the monthly electricity bill is a positive number
        return this.monthlyElectricityBill > 0;
    }
    
    // Add more validation methods for other fields
    
    // Method to validate all fields and return a message
    public String validateAll() {
        StringBuilder validationMessage = new StringBuilder();
        
        if (!validateElectricityBill()) {
            validationMessage.append("Electricity bill input is invalid.\n");
        }
        
        if (validationMessage.length() == 0) {
            // If all validations pass
            validationMessage.append("All fields were inputted correctly.");
        }
        
        return validationMessage.toString();
    }
}
