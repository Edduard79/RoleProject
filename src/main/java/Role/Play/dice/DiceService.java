package Role.Play.dice;

import org.springframework.beans.factory.annotation.Autowired;


import java.util.Random;

public class DiceService {
    @Autowired
    private DiceRepo diceRepo;

    public int rollDice(Dice dice){
        Random rand = new Random();
        int result = 0;
        switch (dice.getName()) {
            case "d2":
                result = rand.nextInt(2) + 1;
                break;
            case "d3":
                result = rand.nextInt(3) + 1;
                break;
            case "d4":
                result = rand.nextInt(4) + 1;
                break;
            case "d6":
                result = rand.nextInt(6) + 1;
                break;
            case "d8":
                result = rand.nextInt(8) + 1;
                break;
            case "d10":
                result = rand.nextInt(10) + 1;
                break;
            case "d12":
                result = rand.nextInt(12) + 1;
                break;
            case "d20":
                result = rand.nextInt(20) + 1;
                break;
            case "d100":
                result = rand.nextInt(100) + 1;
                break;
            default:
                System.out.println("Dice type not allowed!");
        }

        System.out.println("Il dado: " + dice.getName() + "ha fatto: " + result);
        return result;
    }


}
