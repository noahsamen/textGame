//Attack.java
//G. Li
//5/4/23
//Damages to the enemies

package game.RPG;

import java.util.Random;

public class Attack {
    //basic declaration of attacks
    private int hit1;
    private int hit2;
    private int hit3;

    private double totalDamage1;
    private double totalDamage2;
    private double totalDamage3;
    private double critDamage1;
    private double critDamage2;
    private double critDamage3;

    Random random = new Random();

    //overloaded attack values
    public Attack(int hit1, int  hit2, int hit3, double totalDamage1,
                  double totalDamage2, double totalDamage3){

        //basic hit points
        hit1 = 10 ;
        hit2 = 11;
        hit3 = 12;

        this.hit1 = hit1;
        this.hit2 = hit2;
        this.hit3 = hit3;
        this.totalDamage1 = totalDamage1;
        this.totalDamage2 = totalDamage2;
        this.totalDamage3 = totalDamage3;
        this.critDamage1 = critDamage1;
        this.critDamage2 = critDamage2;
        this.critDamage3 = critDamage3;
    }

    //accessing the attacks
    public int getHit1() {
        return hit1;
    }

    public int getHit2() {
        return hit2;
    }

    public int getHit3() {
        return hit3;
    }

    //crit damages using randoms object
    public double getCritDamage1(int hit1){
        //simple crit damages
        critDamage1 = hit1 + random.nextInt(hit1);

        return critDamage1;
    }

    public double getCritDamage2(int hit2){

        critDamage2 = hit2 + random.nextInt(hit2);

        return critDamage2;
    }

    public double getCritDamage3(int hit1){

        critDamage3 = hit3 + random.nextInt(hit3);

        return critDamage3;
    }

    //max damages
    public double getTotalDamage1(double critDamage1, int hit1) {

        if((critDamage1 < 500) || (critDamage1 > 400 )){
            //MAXIMUM DAMAGE
            totalDamage1 = critDamage1 + hit1;
        }else {
            //accumulator for the total damage
            totalDamage1 = totalDamage1 + critDamage1;
        }

        return totalDamage1;
    }

    public double getTotalDamage2(double critDamage2, int hit2) {

        if((critDamage2 < 500) || (critDamage2 > 400)){
            //MAXIMUM DAMAGE
            totalDamage2 = critDamage2 + hit2;
        }else {
            //accumulator for the total damage
            totalDamage2 = totalDamage2 + critDamage2;
        }

        return totalDamage2;
    }

    public double getTotalDamage3(double critDamage3, int hit3) {

        if((critDamage3 < 500) || (critDamage3 > 400)){
            //MAXIMUM DAMAGE
            totalDamage3 = critDamage3 + hit3;
        }else {
            //accumulator for the total damage
            totalDamage3 = totalDamage3 + critDamage3;
        }

        return totalDamage3;
    }

}
