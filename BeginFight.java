package com.artmaguire;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class BeginFight {
    private static String weapons [] = {"Axe", "Blow Gun", "Bow and Arrow", "Crossbow", "Dagger", "Ezio Hidden Assassin Blade", "Knife", "Mace", "Machete", "Rocks", "Sickle", "Scythe", "Spear",
            "Sword", "Throwing axe", "Throwing knives", "Trident", "Whip"};

    private ArrayList<Person> alive = new ArrayList<>();
    private ArrayList<Person> dead = new ArrayList<>();

    public BeginFight() {
    }

    public void addAlive(Person p) {
        this.alive.add(p);
    }



    public void start() {
        System.out.println("\n\n---------------------------------");
        System.out.println("Announcer: 'Welcome To Today's Match!'");
        Date date = new java.util.Date();
        System.out.println(date);
        System.out.println("\n");
        for(Person p : alive){
            p.setWeapon(weapons[randPos(weapons.length)]);
            System.out.println(p.getName() + " got: " + p.getWeapon());
        }
        System.out.println("---------------------------------");
        while (alive.size() > 1){
            int p1Pos = randPos(alive.size()); //Choose Random person p1
            int p2Pos;
            do {
                p2Pos = randPos(alive.size()); //Choose Random person p2
            } while(p1Pos == p2Pos); //if p1 is the same as p2, choose different p2
            Person p1 = alive.get(p1Pos);
            Person p2 = alive.get(p2Pos);
            if(Math.random() < 0.5){ //p1 Wins
                processKill(p1, p2, p2Pos);
            } else {
                processKill(p2, p1, p1Pos);
            }
            System.out.println();
        }
        System.out.println("\n==========================");
        System.out.println(alive.get(0).getName() + " from District " + alive.get(0).getDistrict().getNumber() + " Wins!!!");
        System.out.println("==========================");

        dead.add(alive.get(0));
        Collections.sort(dead);

        System.out.println("\nThe Top 3 Killers Were:");
        for(int i = 0; i < 3; i++) {
            System.out.println(dead.get(i).getName() + " With: " + dead.get(i).getKills());
        }
    }

    private void processKill(Person killer, Person killed, int killedPos) {
        killer.addKill();
        System.out.println(killer.getName() + " kills " + killed.getName() + " with " + killer.getWeapon());
        System.out.print(killer.getFirstName() + " Now Has " + killer.getKills());
        if(killer.getKills() == 1) System.out.println(" Kill!");
        else System.out.println(" Kills!");
        alive.remove(killedPos);
        dead.add(killed);
    }

    /*private String randomPerson(){
        double n = Math.random() * weapons.length;
        int r = (int)Math.floor(n);
        return weapons[r];
    }*/

    private int randPos(int size){
        double n = Math.random() * size;
        int r = (int)Math.floor(n);
        return r;
    }
}

