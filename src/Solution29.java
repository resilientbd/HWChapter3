import java.util.Scanner;

public class Solution29 {
    private static int LARGE_BAG_SIZE = 20;
    private static int MEDIUM_BAG_SIZE = 10;
    private static int SMALL_BAG_SIZE = 5;
    private static float COST_PER_LARGE_BAG = 1.80f;
    private static float COST_PER_MEDIUM_BAG = 1f;
    private static float COST_PER_SMALL_BAG = 0.60f;
    private static float COST_PER_UNIT = 5.50f;

    private static float costTotal;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of bags?\t");
        int bagSize = sc.nextInt();
        Solution29 solution29 = new Solution29();
        costTotal = solution29.calculateBasePrice(bagSize);
        System.out.println("Number of Bags Ordered:\t"+bagSize+"\t-\t$"+String.format("%.2f",costTotal));
        System.out.println("Box Used:");
        solution29.findBagSize(bagSize);
        System.out.println("\nYour total cost is:\t$"+String.format("%.2f",costTotal));

    }

    private float calculateBasePrice(int bagSize)
    {
        return bagSize*COST_PER_UNIT;
    }
    private void findBagSize(int bagSize) {
        if (bagSize >= LARGE_BAG_SIZE) {
            int result = bagSize / LARGE_BAG_SIZE;

            float cost = result * COST_PER_LARGE_BAG;
            costTotal = costTotal+cost;
            System.out.println("\t\t\t" + result + " LARGE\t-\t$" + String.format("%.2f", cost));
            int left = (int) (bagSize % LARGE_BAG_SIZE);
            if (left > 0) {
                findBagSize(left);
            } else {
                return;
            }

        } else if (bagSize >= MEDIUM_BAG_SIZE) {
            int result = bagSize / MEDIUM_BAG_SIZE;

            float cost = result * COST_PER_MEDIUM_BAG;
            costTotal = costTotal+cost;
            System.out.println("\t\t\t" + result + " MEDIUM\t-\t$" + String.format("%.2f", cost));
            int left = (int) (bagSize % MEDIUM_BAG_SIZE);
            if (left > 0) {
                findBagSize(left);
            } else {
                return;
            }

        } else {
            if (bagSize >= SMALL_BAG_SIZE) {
                int result = bagSize / SMALL_BAG_SIZE;
                int left = (int) (bagSize % SMALL_BAG_SIZE);
                if (left > 0) {
                    result = result + 1;
                }
                float cost = result * COST_PER_SMALL_BAG;
                costTotal = costTotal+cost;
                System.out.println("\t\t\t" + result + " SMALL \t-\t$" + String.format("%.2f", cost));
            } else if (bagSize > 0) {
                float cost = 1 * COST_PER_SMALL_BAG;
                costTotal = costTotal+cost;
                System.out.println("\t\t\t" + 1 + " SMALL \t-\t$" + String.format("%.2f", cost));
            }

        }
    }
}
