package com.company;

public class Main {

    public static void main(String[] args) {
        Player player = new Player();
        player.setAge(22);
        player.setForce(50);
        player.setGender("male");
        printInfo(player);



        Basketballplayer basketballplayer = new Basketballplayer();
        basketballplayer.setAge(55);
        basketballplayer.setForce(20);
        basketballplayer.setGender("famile");
        printInfo(basketballplayer);




        Sportsman [] players = {new Player(), new Basketballplayer()};
        for (int i = 0; i <players.length ; i++) {
            players[i].doExercises();
            players[i].strikeForce();
            players[i].sayYourname();

        }
    }
    public static void printInfo(Sportsman a){
        System.out.println(a.getAge()+ " лет "+a.getForce()+" ньютона "+a.getGender());

    }

}

