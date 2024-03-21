package org.example;

public enum Weapon {
    SWORD(12, 0.75), BOW(9, 1), SAUSAGE(1, 2);
    private final int damage;
    private final double attackSpeed;

    private Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }
    public int getDamage() {
        return damage;
    }
    public double getAttackSpeed() {
        return attackSpeed;
    }
}
