import java.util.Scanner;

public class Solution7 {
    //12 inch - 1 feet
    //1 inc - 2.54 cm
    private final float unitCm = 2.54f;
    private final float unitInch = 12.00f;
    public static void main(String[] args)
    {
        Solution7 solution7 = new Solution7();
        System.out.println("Input cm:\t");
        Scanner sc = new Scanner(System.in);
        float inputCm = sc.nextFloat();
        System.out.println("Inch: "+ solution7.getCmToInch(inputCm));
        System.out.println("Feet: "+ solution7.convertCmToFeet(inputCm));
    }
    private float getCmToInch(float cm)
    {
        return cm/unitCm;
    }
    private float convertCmToFeet(float cm)
    {
        return getCmToInch(cm)/unitInch;
    }
}