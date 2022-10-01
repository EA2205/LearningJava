package Course3Sprint1;

import java.util.Scanner;

public class FurnitureItem {

    String colourOfFurniture[] = {"Red", "Blue", "Green"};
    String gradeOfFurniture[] = {"Premium", "Prestige", "Luxury"};
    String typeOfIndoorFurniture[] = {"cupboard", "stool"};
    String typeOfOutdoorFurniture[] = {"Table", "Chair"};

    int tablePrice = 1500;
    int chairPrice = 1350;
    int cupboardPrice = 3900;
    int stoolPrice = 500;
    double discountedPrice = 0.0;


    public double getDetailsAndProcess(int chairPrice, int tablePrice, int cupboardPrice, int stoolPrice) {

        char eligbibleForDiscount = 'N';
        System.out.println("*** Welcome to MyStore - Furniture Section  *** ");
        System.out.println("Here are the list of furnitures instock : 1.Cupboard, 2.Stool, 3.Table, 4.Chair");
        System.out.println("Please enter the furniture of your choice : ");
        Scanner scannerObj = new Scanner(System.in);
        String userEnteredFurn = scannerObj.next();

        for (int i = 0; i < typeOfOutdoorFurniture.length; i++) {
          //if (userEnteredFurn == typeOfOutdoorFurniture[i])
            if (userEnteredFurn.equals(typeOfOutdoorFurniture[i]))
            {
                System.out.println("Inside if loop");
                eligbibleForDiscount = 'Y';
            }
        }

        switch (userEnteredFurn) {
            case "Chair":
                if (eligbibleForDiscount == 'Y') {
                    discountedPrice = chairPrice - (chairPrice * .05);
                    System.out.println("Discounted price : " + discountedPrice);
                }
                break;
            case "Table":
                if (eligbibleForDiscount == 'Y') {
                    discountedPrice = tablePrice - (tablePrice * .05);
                    System.out.println("Discounted price : " + discountedPrice);
                }
                break;
            case "Cupboard":
                if (eligbibleForDiscount == 'Y') {
                    discountedPrice = cupboardPrice - (cupboardPrice * .05);
                    System.out.println("Discounted price : " + discountedPrice);
                }
                else
                {
                    discountedPrice = cupboardPrice;
                    System.out.println("Actual price of the Cupboard is : " + discountedPrice);
                }
                break;
            case "Stool":
                if (eligbibleForDiscount == 'Y') {
                    discountedPrice = stoolPrice - (stoolPrice * .05);
                    System.out.println("Discounted price : " + discountedPrice);

                }
                else
                {
                    discountedPrice = stoolPrice;
                    System.out.println("Actual price of the Stool is : " + discountedPrice);
                }
            default:
                //System.out.println("Invalid choice");
        }
        return discountedPrice;
    }

}


