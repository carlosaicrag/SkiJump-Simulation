/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carlosgarciajr
 */
import java.util.*;

public class Tournament {
    private List<SkiJumper> listOfSkiJumpers;
    
    public Tournament(){
        this.listOfSkiJumpers = new ArrayList<SkiJumper>();
    }
   
    
    public void printSkiers(){
        int i = 1;
        
        Collections.sort(this.listOfSkiJumpers);
        for(SkiJumper skiers : this.listOfSkiJumpers){
            System.out.println("    " + i + ". " + skiers);
            i++;
        }
    }
    
    public void tournamentResults(){
        int i = 1;
        
        Collections.sort(this.listOfSkiJumpers,new SortDescendingOrder());
        for(SkiJumper jumper : this.listOfSkiJumpers){
            System.out.println(i + "           " + jumper);
            System.out.println("            " + "jump lengths: " + jumper.printLengths() + " m");
            i++;
        }
    }
    
    public List<SkiJumper> getList(){
        return this.listOfSkiJumpers;
    }
    
    public void add(SkiJumper jumper){
        if(listOfSkiJumpers.contains(jumper)){
            
        }else{
            this.listOfSkiJumpers.add(jumper);
        }
    }
    
    public List<Integer> judgeScores(){
        int i = 0; 
        List<Integer> scoreOfJudges = new ArrayList<Integer>();
        while(i<5){
            int randomScore;
            Random score = new Random();
            randomScore = score.nextInt(10) + 10;
            scoreOfJudges.add(randomScore);
            i++;
        }
        Collections.sort(scoreOfJudges);
        return scoreOfJudges;
    }
    
}
