/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LaptopIS;

/**
 *
 * @author Sanjaya Kumar Gurung, Pranjal Piya, Parash Raj Bhat, Sakar Pant
 */

public class Device {
    String Model_Number;
    String Laptop_Name;
    String Company;
    String Laptop_Type;
    String Laptop_Series;
    String Processor;
    String Price_range;
    int Price;
    
    
    public Device(){
    
    };
    
    public Device(String Model_Number, String Laptop_Name, String Company, String Laptop_Type, String Laptop_Series, String Processor, String Price_range, int Price) {
        this.Model_Number=Model_Number;
        this.Laptop_Name=Laptop_Name;
        this.Company=Company;
        this.Laptop_Type=Laptop_Type;
        this.Laptop_Series=Laptop_Series;
        this.Processor=Processor;
        this.Price_range=Price_range;
        this.Price=Price;
    }
    //Using Getter Method.
    public String getModel_Number() {
        return Model_Number;
    }

    public String getLaptop_Name() {
        return Laptop_Name;
    }

    public String getCompany() {
        return Company;
    }

    public String getLaptop_Type() {
        return Laptop_Type;
    }

    public String getLaptop_Series() {
        return Laptop_Series;
    }

    public String getProcessor() {
        return Processor;
    }

    public String getPrice_range() {
        return Price_range;
    }
     public int getPrice() {
        return Price;
    }
    //Using Setter Method.
    public void setModel_Number(String Model_Number) {
        this.Model_Number = Model_Number;
    }

    public void setLaptop_Name(String Laptop_Name) {
        this.Laptop_Name = Laptop_Name;
    }

    public void setCompany (String Company) {
        this.Company= Company;
    }

    public void setLaptop_Type(String Laptop_Type) {
        this.Laptop_Type= Laptop_Type;
    }

    public void setLaptop_Series(String Laptop_Series) {
        this.Laptop_Series = Laptop_Series;
    }

    public void setProcessor(String Processor) {
        this.Processor = Processor;
    }

    public void setPrice_range(String Price_range) {
        this.Price_range= Price_range;
    }
    public void setPrice(int Price) {
        this.Price= Price;
    }
    
    


}
