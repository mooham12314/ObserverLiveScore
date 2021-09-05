package observerlivescore;

import java.util.Scanner;


public class ObserverScoreMain {

    
    public static void main(String[] args) {
        Headquarter obj = new Headquarter();
        Score obj1 = new Score();
        Shoutcaster obj2 = new Shoutcaster();
        Scanner input = new Scanner(System.in);
        obj.register(obj1);
        obj.register(obj2);
        System.out.print("Enter Score : ");
        String currentScore = input.nextLine();
        while(!currentScore.equals(""))
        {
                obj.setsomeData(currentScore);
                System.out.print("Enter Score : ");
                currentScore = input.nextLine();
        }
        input.close();
}
}