package Sprint5;

import java.util.Locale;

class StringManipulation1 {
    public static void main(String[]args){

        String nameArrary[]={"einston","deepak","atul","sangti"};

        for (int i=0;i<nameArrary.length;i++)
        {
            System.out.println(nameArrary[i].substring(0,1).toUpperCase() + nameArrary[i].substring(1));
        }
    }

}
