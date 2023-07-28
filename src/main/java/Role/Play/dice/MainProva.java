package Role.Play.dice;


import java.util.Scanner;

public class MainProva {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean isFinished = false;

        do {
            System.out.println("Inserire il tipo di dado(exmp: 'd20')\n");

            String type = scanner.nextLine();
            if (type.equals("111")) {
                isFinished = true;
                continue;
            }

            String val = type.trim().replace("d", "");


            int faces = Integer.parseInt(val);

            Dice dice = new Dice(type, faces);

            DiceService diceService = new DiceService();
            int result = diceService.rollDice(dice);

        } while (!isFinished);




    }
}
