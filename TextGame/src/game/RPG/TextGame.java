//TextGame.Java
//G. Li
//5/4/23
//Simple text RPG game

package game.RPG;

import java.io.StringBufferInputStream;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.IllegalFormatException;
import java.lang.String;

public class TextGame implements SelectionMenu {
    //simple prompt texts
    private static final String winGame = "Winner";
    private static final String loseGame = "Lose";
    private static final String Introduction = "Welcome to World of Text!";
    private static final String promptMovement = "Choose a direction";
    private static final String promptAttack = "Choose your attack";

    //global value for the array choices
    public static final int PLAYERSOPTIONMOVEMENT = 4;

    //global value to choice for the attack
    public static final int PLAYERSOPTIONATTACKS = 8;

    //player health
    private double playerHealth = 100;


    //calling the object
    private Attack attack;
    private EnemyBosses bosses;
    private Movement movement;
    private PreferredMovement preferredMovement;


    //accessing the classes
    public Attack getAttack(){
        return attack;
    }

    public EnemyBosses getBosses(){
        return bosses;
    }

    public PreferredMovement getPreferredMovement(){
        return preferredMovement;
    }

    //movement of your choice
    public void selectionMovement(TextGame textGame){

            PreferredMovement playersMove = textGame.getPreferredMovement();

            //exact movements
            String exactMovementChoice = "";

            EnemyBosses enemyBosses = getBosses();

            //list of movements
            Movement MovementChoiceNONE = Movement.NONE;
            Movement MovementChoiceUP = Movement.UP;
            Movement MovementChoiceDOWN = Movement.DOWN;
            Movement MovementChoiceLEFT = Movement.LEFT;
            Movement MovementChoiceRIGHT = Movement.RIGHT;

            //deciding movement
            switch (exactMovementChoice){
                case "UP": String exactMovementChoice1 = exactMovementChoice;

                case "DOWN": String exactMovementChoice2 = exactMovementChoice;

                case "RIGHT": String exactMovementChoice3 = exactMovementChoice;

                case "LEFT": String exactMovementChoice4 = exactMovementChoice;

                case "UP" + "UP": String exactMovementChoice5 = exactMovementChoice;
                    break;

                case "RIGHT" + "RIGHT": String exactMovementChoice6 = exactMovementChoice;
                    break;

                case "LEFT" + "LEFT": String exactMovementChoice7 = exactMovementChoice;
                    break;

                case "DOWN" + "DOWN": String exactMovementChoice8 = exactMovementChoice;
                    break;
            }

            //start of the game
            while(playersMove.equals(MovementChoiceNONE)){

                //one movement
                if (playersMove.equals(MovementChoiceUP));

                    System.out.println('\t' + '\t' + "You Decided To Move Up By One Space." + '\n');


                if (playersMove.equals(MovementChoiceLEFT));
                    System.out.println('\t' + '\t' + "You Decided To Move Left By One Space." + '\n');


                if (playersMove.equals(MovementChoiceDOWN));
                    System.out.println('\t' + '\t' + "You Decided To Move Down By One Space." + '\n');


                if (playersMove.equals(MovementChoiceRIGHT));
                    System.out.println('\t' + '\t' + "You Decided To Move Right By One Space." + '\n');



                    //if the player's choice to continue same route
                    if (playersMove.equals(MovementChoiceUP) && playersMove.equals(MovementChoiceUP));
                        System.out.println('\t' + '\t' + "Oh No! You have encounter an " + enemyBosses.getFirstBoss()
                                + '\n');


                    if (playersMove.equals(MovementChoiceLEFT) && playersMove.equals(MovementChoiceLEFT));
                        System.out.println('\t' + '\t' + "You have two route which you choose " +
                                MovementChoiceLEFT.compareTo(Movement.LEFT) + "or" +
                                MovementChoiceRIGHT.compareTo(Movement.RIGHT) + '\n');

                    if (playersMove.equals(MovementChoiceRIGHT) && playersMove.equals(MovementChoiceRIGHT));
                        System.out.println('\t' + '\t' + "Oh No! You have encounter an " + enemyBosses.getSecondBoss()
                                + '\n');

                    if (playersMove.equals(MovementChoiceDOWN) && playersMove.equals(MovementChoiceDOWN));
                        System.out.println('\t' + '\t' + "Sorry you reached dead end" + '\n');

            }




    }

    //attack selection
    public void selectionAttack(Attack attack) {
            //getting attacks
            Attack playersAttack = getAttack();

            //total choices of the attacks
            int attackChoice = 8;

            //deciding attacks factors
            switch (attackChoice){
                case 1: getAttack().getHit1();

                case 2: getAttack().getHit2();

                case 3: getAttack().getCritDamage1(attack.getHit1());

                case 4: getAttack().getCritDamage2(attack.getHit2());

                case 5: getAttack().getHit3();

                case 6: getAttack().getTotalDamage1(attack.getCritDamage1(attack.getHit1()),attack.getHit1());

                case 7: getAttack().getTotalDamage2(attack.getCritDamage1(attack.getHit2()),attack.getHit2());

                case 8: getAttack().getTotalDamage3(attack.getCritDamage1(attack.getHit3()),attack.getHit3());
            }
    }

    //main method
    public static void main(String[] args) {

        Scanner selectMove = new Scanner(System.in);
        //enter a movement
        System.out.println(promptMovement);

        TextGame tGame = new TextGame();

        System.out.println("\t" + "\t" + "\t" + Introduction);
        tGame.selectionMovement(tGame);

        //declaring the movement array
        int[] movementChoices;

        movementChoices = new int[PLAYERSOPTIONMOVEMENT];

        //declaring the attack array
        int[] attackChoices;

        attackChoices = new int[PLAYERSOPTIONATTACKS];

        


    }

}
