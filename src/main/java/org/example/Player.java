package org.example;


public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon){
        this.healthPercentage = Math.min(Math.max(healthPercentage, 0) ,100);
        this.weapon = weapon;
        this.name = name;
    }
    public int healthRemaining(){
        return healthPercentage;
    }
    public void loseHealth(int damage){
        this.healthPercentage -= damage;
        if(this.healthPercentage <= 0){
            this.healthPercentage = 0;
            System.out.println(this.name + " player has been knocked out of game");
        }
    }
    public void restoreHealth(int healthPotion){
        this.healthPercentage += healthPotion;
        if(this.healthPercentage > 100) this.healthPercentage = 100;
    }
}
