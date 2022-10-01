package com.Rocket;

public class PizzaOrder {

    public static void main(String[] args) {

        String customerName="Gary";
        String customerEmail="gary@123.com";
        int phoneNo=412312345;
        String address="20,Marble Drive, Eville";
        byte noOfPizzasOrdered=5;
        float pizzaPrice=12.5f;
        char pizzaSize='M';
        byte noOfGarlicBreadOrdered=3;
        float garlicBreadPrice = 5.99f;
        byte noOfBreveragesOrdered=3;
        float breveragePrice=1.99f;
        boolean isValueGreaterThanHundred;

        float totalPriceOfPizzaOrdered=pizzaPrice*noOfPizzasOrdered;
        float totalPriceOfGarlicBreadOrdered=garlicBreadPrice*noOfGarlicBreadOrdered;
        float totalPriceOfBeveragesOrdered=breveragePrice*noOfBreveragesOrdered;

        System.out.println("----------------------------------------------------------");
        System.out.println("\t\t\t\t\t"+"Customer details");
        System.out.println("----------------------------------------------------------");
        System.out.println("Customer Name"+"\t\t\t"+customerName);
        System.out.println("Customer Phone Number"+"\t"+phoneNo);
        System.out.println("Customer email"+"\t\t\t"+customerEmail);
        System.out.println("Customer address"+"\t\t"+address);
        System.out.println("----------------------------------------------------------");
        System.out.println("\t\t\t\t\t"+"Order Summary");
        System.out.println("----------------------------------------------------------");
        System.out.println("Sr.No"+"\t"+"Item Name"+"\t"+"Item Qty"+"\t"+"Price/Unit"+"\t"+"$Total price");
        System.out.println("----------------------------------------------------------");
        System.out.println("1"+"\t\t"+"Pizza"+"\t\t\t"+noOfPizzasOrdered+"\t\t\t"+pizzaPrice+"\t\t"+totalPriceOfPizzaOrdered);
        System.out.println("2"+"\t\t"+"Garlic Bread"+"\t"+noOfGarlicBreadOrdered+"\t\t\t"+garlicBreadPrice+"\t\t"+totalPriceOfGarlicBreadOrdered);
        System.out.println("3"+"\t\t"+"Beverages"+"\t\t"+noOfBreveragesOrdered+"\t\t\t"+breveragePrice+"\t\t"+totalPriceOfBeveragesOrdered);
        System.out.println("----------------------------------------------------------");

        float totalOfAllTheItems;
        float discountedAmount;
        totalOfAllTheItems = totalPriceOfPizzaOrdered+totalPriceOfGarlicBreadOrdered+totalPriceOfBeveragesOrdered;
        discountedAmount= totalOfAllTheItems*0.9f;
        System.out.println("Total bill amount is : " +totalOfAllTheItems);
        System.out.println("Discount Offered is  : 10%" );
        System.out.println("Amount to be paid is : " +discountedAmount );

        isValueGreaterThanHundred = totalOfAllTheItems >= 100;
        if (isValueGreaterThanHundred)
        {
            System.out.println("Thank you !!!");
        }
        else
        {
            System.out.println("Thank you very much. Please visit again.");
        }

    }
}
