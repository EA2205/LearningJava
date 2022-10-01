package com.Rocket;

public class AddEvens {

     public static void main(String[] args) {
         // Initialize the object of AddEven class
         AddEvens addEven = new AddEvens();
         int output = addEven.addEvens(8);
         System.out.println(output);
     }
            public int addEvens (int num)

            {
                if (num<=1)
                {
                    return 0;
                }

                if (num%2==0)
                {
                    return num+addEvens(num-1);
                }

                else

                {
                    return addEvens(num-1);
                }
            }


    }

