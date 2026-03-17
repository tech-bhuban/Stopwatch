


import java.util.Scanner;

public class Stopwatch {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        
        System.out.println("STOPWATCH");
        System.out.println("Press Enter to start...");
        input.nextLine();
        
        long startTime = System.currentTimeMillis();
        
        System.out.println("Stopwatch running...");
        System.out.println("Press Enter to stop");
        input.nextLine();
        
        long endTime = System.currentTimeMillis();
        
        long elapsedSeconds = (endTime - startTime) / 1000;
        long minutes = elapsedSeconds / 60;
        long seconds = elapsedSeconds % 60;
        
        System.out.println("\nTime elapsed: " + minutes + " minutes " + seconds + " seconds");
        
        // Show as stopwatch display
        System.out.printf("\n\n");
        System.out.printf("│ %02d:%02d │\n", minutes, seconds);
        System.out.printf("\n");
        
        input.close();
    }
}
