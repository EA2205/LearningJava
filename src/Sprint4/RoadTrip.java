package Sprint4;

public class RoadTrip {

    public static void main(String[] args) {
    RoadTrip roadTripObj= new RoadTrip();
    long result = roadTripObj.fibonacci(10L);

    }

    public long fibonacci(long number)

    {
        if (number < 0)
        {
            return -1;
        }

        if(number<=0|| number<=1)
        {
            return number;
        }
        else{
            return fibonacci(number-1)+fibonacci(number-2);

        }

    }
}
