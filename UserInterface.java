/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carlosgarciajr
 */
import java.util.Scanner;
import java.util.*;
        
public class UserInterface {
    private Scanner reader;
    private Tournament tournament;
    
    public UserInterface(Scanner reader){
        this.reader = reader;
        this.tournament = new Tournament();
    }
    
    public void start(){
        System.out.println("Kumpula ski jumping week");
        System.out.println("");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        System.out.print("  Participant name: ");
        String command = this.reader.nextLine();
        
        while(!command.equals("")){
            createSkier(command); 
            System.out.print("  Participant name: ");
            command = this.reader.nextLine();
        }
        System.out.println("");
        System.out.println("The tournament begins!");
        System.out.println("");
        
        rounds();
    }
    
    public void rounds(){
        int i = 1;
        System.out.print("Write \"jump\" to jump; otherwise you quit: ");
        String command = this.reader.nextLine();
        System.out.println("");
        
        while(command.equals("jump")){
            System.out.println("Round " + i);
            System.out.println("");
            System.out.println("Jumping order:");
            tournament.printSkiers();
        
            System.out.println("");
            
            System.out.println("Results of round " + i );
        
        for(SkiJumper jumper : tournament.getList()){
            int lengthJumped = jumper.lengthJumped();
            List<Integer> scoreOfJudges = jumper.scoreOfJudges();
            
            System.out.println("  " + jumper.getName());
            System.out.println("    length: " + lengthJumped);
            System.out.println("    judge votes: " + scoreOfJudges);
            jumper.addLength(lengthJumped);
            jumper.setTotalScore(scoreOfJudges);
        }
        i++;
        System.out.println("");
        System.out.print("Write \"jump\" to jump; otherwise you quit: ");
        command = this.reader.nextLine();
        System.out.println("");
    }
        System.out.println("Thanks!");
        System.out.println("");
        tournamentResults();
    }
    
    public void tournamentResults(){
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        this.tournament.tournamentResults();
        
    }
    
    public void createSkier(String jumperName){
        SkiJumper newSkier = new SkiJumper(jumperName);
        addSkier(newSkier);
    }
    
    public void addSkier(SkiJumper jumper){
        this.tournament.add(jumper);
    }
    
    
}
