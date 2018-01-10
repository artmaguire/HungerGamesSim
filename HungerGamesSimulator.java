package com.artmaguire;

import java.util.ArrayList;

public class HungerGamesSimulator {
    static ArrayList<District> districts = new ArrayList<>();


    public static void main(String[] args) {
        District d1 = new District("District", 1);
        District d2 = new District("District", 2);
        District d3 = new District("District", 3);
        District d4 = new District("District", 4);
        District d5 = new District("District", 5);
        District d6 = new District("District", 6);
        District d7 = new District("District", 7);
        District d8 = new District("District", 8);
        District d9 = new District("District", 9);
        District d10 = new District("District", 10);
        District d11 = new District("District", 11);
        District d12 = new District("District", 12);
        districts.add(d1);
        districts.add(d2);
        districts.add(d3);
        districts.add(d4);
        districts.add(d5);
        districts.add(d6);
        districts.add(d7);
        districts.add(d8);
        districts.add(d9);
        districts.add(d10);
        districts.add(d11);
        districts.add(d12);

        d1.setFemale(new Person("Mary", "N", 60, d1));
        d1.setMale(new Person("Patrick", "N", 64, d1));
        d2.setFemale(new Person("Aoife", "N", 24, d2));
        d2.setMale(new Person("Andrew", "N", 16, d2));
        d3.setFemale(new Person("Geraldine", "B", 54, d3));
        d3.setMale(new Person("Michael", "B", 52, d3));
        d4.setFemale(new Person("Rita", "B", 28, d4));
        d4.setMale(new Person("Seamus", "B", 32, d4));
        d5.setFemale(new Person("Noreen", "D", 50, d5));
        d5.setMale(new Person("Martin", "D", 53, d5));
        d6.setFemale(new Person("Rue", "D", 26, d6));
        d6.setMale(new Person("Conor", "D", 25, d6));
        d7.setFemale(new Person("Nora", "L", 45, d7));
        d7.setMale(new Person("John", "L", 47, d7));
        d8.setFemale(new Person("Lisa", "K", 19, d8));
        d8.setMale(new Person("Danny", "K", 52, d8));
        d9.setFemale(new Person("Josie", "M", 50, d9));
        d9.setMale(new Person("Michael", "M", 69, d9));
        d10.setFemale(new Person("Sinead", "M", 19, d10));
        d10.setMale(new Person("James", "M", 29, d10));
        d11.setFemale(new Person("Ruth", "F", 14, d11));
        d11.setMale(new Person("Eoin", "M", 24, d11));
        d12.setFemale(new Person("Emma", "F", 11, d12));
        d12.setMale(new Person("Art", "M", 17, d12));

        BeginFight fight = new BeginFight();

        for(District d : districts){
            fight.addAlive(d.getFemale());
            fight.addAlive(d.getMale());
        }

        fight.start();
    }
}    