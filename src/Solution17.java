import java.util.Scanner;

public class Solution17 {

    private static final int EARTH_DAYS = 365;
    private static final int MARCURY_DAYS = 88;
    private static final int VENUS_DAYS = 225;
    private static final int JUPITER_DAYS = 4380;
    private static final int SATURN_DAYS = 4380;
       //  d = Mercury 88 || Venus 225 || Jupiter 4,380 || Saturn 10,767
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your age in earth:\t");
        int age = sc.nextInt();
        Solution17 solution17 = new Solution17();
        System.out.println("Age in Mercury:\t"+solution17.calculateAge(age,MARCURY_DAYS));
        System.out.println("Age in Venus:\t"+solution17.calculateAge(age,VENUS_DAYS));
        System.out.println("Age in Jupiter:\t"+solution17.calculateAge(age,JUPITER_DAYS));
        System.out.println("Age in Saturn:\t"+solution17.calculateAge(age,SATURN_DAYS));
    }

    private int calculateAge(int ageInEarth,int daysOfPlanet)
    {
        return (ageInEarth*EARTH_DAYS)/daysOfPlanet;
    }

}
