import java.util.Scanner;

public class Solution8 {
    //Fahrenheit  1.8  Celsius  32
    //1 inc - 2.54 cm
    private final float unitCm = 2.54f;
    private final float unitInch = 12.00f;
    public static void main(String[] args)
    {
        Solution8 solution8 = new Solution8();
        System.out.println("Input celcius:\t");
        Scanner sc = new Scanner(System.in);
        float inputCelcius = sc.nextFloat();
        System.out.println("Fahrenheit "+ solution8.celciusToFahrenheit(inputCelcius));

    }
    private float celciusToFahrenheit(float celcius)
    {
        return (1.8f*celcius)+12;
    }

}