import java.util.Scanner;

public class Solution24 {
    private static float COST_PER_UNIT = 5.99f;
    private static float TAX_PERCENTAGE = 0.0725f;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many bags are sold today ? \t");
        int numberOfBags = sc.nextInt();
        System.out.println("Weight (pound) per coffe bag ? \t");
        int unitWeight = sc.nextInt();
        float totalPrice = unitWeight*numberOfBags*COST_PER_UNIT;
        float totalPriceWithTax = totalPrice+(totalPrice*TAX_PERCENTAGE);

        System.out.println("Number of bags sold:\t"+numberOfBags);
        System.out.println("Weight per bag:\t"+unitWeight+" lb");
        System.out.println("Price per pound:\t$"+COST_PER_UNIT);
        System.out.println("Sales tax:\t"+TAX_PERCENTAGE+"%");
        System.out.println("\n\nTotal price:\t"+String.format("%.3f",totalPriceWithTax));
    }
}
