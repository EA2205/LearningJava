package Sprint5;



public class FindVowelsInName {
    public static void main(String[] args) {

        String name[]={"Sachin", "Sehwag","Lara" , "Warne", "Ambrose" };
        int vowelCount=0;
        for (int i=0; i<name.length;i++){
            vowelCount=0;
            for (int j=0;j<name[i].length();j++){
                if ((name[i].charAt(j) == 'a') || (name[i].charAt(j) == 'A'))
                    vowelCount++;
            }
            System.out.println("The count of Vowels in " +name[i] +vowelCount);
        }

    }
}
