import java.util.Scanner;
public class Setup {
    public void buyResources(int currentBudget) {
        Scanner scan = new Scanner(System.in);
        int budget = currentBudget;
        System.out.print("How many cups would you like to buy today? ($0.80 per): ");
        int numCups = scan.nextInt();
        budget -= 0.8 * numCups;
        System.out.print("How many lemons would you like to buy today? ($1.20 per): ");
        int numLemons = scan.nextInt();
        budget -= 1.2 * numLemons;
        System.out.print("How many sugar packets would you like to buy today? ($1.75 per): ");
        int numSugar = scan.nextInt();
        budget -= 1.75 * numSugar;
        System.out.print("How many ice cubes would you like to buy today? ($0.20 per): ");
        int numIceCubes = scan.nextInt();
        budget -= 0.2 * numIceCubes;

        
    }
}
