package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    

    /**
     * The entry point of application.
     *Testing the application.
     * @param args the input arguments
     */
    public static void main(String[] args) {

        //lista sporturilor practicate de user1
        List<Sport> sportlist = new ArrayList<>();
        Basketball basketBall1= new Basketball();
        Fotball footBall = new Fotball();
        Hindernisslauf run = new Hindernisslauf();
        Hochsprung highJump = new Hochsprung();
        Basketball basketBall2 = new Basketball();

        //adaugam sporturile in prima lista
        sportlist.add(basketBall2);
        sportlist.add(basketBall1);
        sportlist.add(highJump);
        sportlist.add(run);
        sportlist.add(footBall);

        //lista sporturilor practicate de user2
        List<Sport> sportlist2 = new ArrayList<>();
        Basketball basketball = new Basketball();
        Fotball football1 = new Fotball();
        Fotball football2 = new Fotball();
        Hindernisslauf running = new Hindernisslauf();
        Hochsprung highJump2 = new Hochsprung();

        //adaugam sporturile in a doua lista
        sportlist2.add(basketball);
        sportlist2.add(football1);
        sportlist2.add(highJump2);
        sportlist2.add(running);
        sportlist2.add(football2);

        //lista sporturilor practicate de user3
        List<Sport> sportlist3 = new ArrayList<>();
        Basketball basketball3 = new Basketball();
        Fotball football3 = new Fotball();
        Hindernisslauf running3 = new Hindernisslauf();
        Hochsprung highJump3 = new Hochsprung();
        Hindernisslauf running4 = new Hindernisslauf();


        //adaugam sporturile in a treia lista
        sportlist3.add(basketball3);
        sportlist3.add(football3);
        sportlist3.add(highJump3);
        sportlist3.add(running3);
        sportlist3.add(running4);

        //cream 3 useri pentru un junit complex
        Benutzer user1 = new Benutzer("Popescu", "Andrei", sportlist);
        Benutzer user2 = new Benutzer("Ionescu", "Ion", sportlist2);
        Benutzer user3 = new Benutzer("Dulea", "Andreea", sportlist3);

        System.out.println("Timpul total de practicare: " + user1.calculateTime());
        System.out.println("Timpul de practicare al sportului preferat: "+ user1.calculateTime(basketBall1));
        System.out.println("Timpul mediu de practicare este: "+ user1.calculateMediumTime()+ "\n");

        System.out.println("Timpul total de practicare: " + user2.calculateTime());
        System.out.println("Timpul de practicare al sportului preferat: "+ user2.calculateTime(footBall));
        System.out.println("Timpul mediu de practicare este: "+ user2.calculateMediumTime()+ "\n");

        System.out.println("Timpul total de practicare: "+ user3.calculateTime(running3));
        System.out.println("Timpul de practicare al sportului preferat: "+ user2.calculateTime(running4));
        System.out.println("Timpul mediu de practicare este: "+ user3.calculateMediumTime()+ "\n");
    }
}
