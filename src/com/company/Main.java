package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss= new Boss();
        Weapon weapon= new Weapon();
        weapon.setWeaponName("оружие");
        weapon.setWeaponType("пистолет");
        boss.setHealth(400);
        boss.setDamage(50);
        boss.setWeapon(weapon);
        System.out.println( "Boss health: "+boss.getHealth()+" "+ "Boss damage: " + boss.getDamage()+ " "+
                "Weapon name: " +boss.getWeapon().getWeaponName() +" "+
                "Weapon type: "+ boss.getWeapon().getWeaponType());


    }
}
