//EnemyBoss.java
//G. Li
//5/4/23
//Design bosses for the text game

package game.RPG;

import java.util.Random;

public class EnemyBosses {
    //name of the enemies
    private String firstBoss = "Rookie General";
    private String secondBoss = "Sergeant General";

    //setting bosses health
    private double boss1Health;
    private double boss2Health;
    public int baseHealth = 500;
    public int baseHealth2 = 600;

    Random randomHP = new Random();

    private Attack attack;

    //overload the enemies
    public  EnemyBosses(String firstBoss, String secondBoss, double boss1Health,
                        double boss2Health){

        //random generate healths
        boss1Health = boss1Health + randomHP.nextDouble(baseHealth);
        boss2Health = boss2Health + randomHP.nextDouble(baseHealth2);

        this.boss1Health = boss1Health;
        this.boss2Health = boss2Health;
        this.firstBoss = firstBoss;
        this.secondBoss = secondBoss;
    }

    //first boss
    public String getFirstBoss() {
        return firstBoss;
    }

    //second boss
    public String getSecondBoss(){
        return  secondBoss;
    }

}
