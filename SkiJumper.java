/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carlosgarciajr
 */
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class SkiJumper implements Comparable<SkiJumper>{
    private HashMap<String,Integer> jumperToScore; 
    private ArrayList<Integer> lengthsOfJumps;
    private String jumperName; 
    private int totalScore;
    private Tournament tournament; 
    
    public SkiJumper(String name){
        this.jumperToScore = new HashMap<String,Integer>(); 
        this.lengthsOfJumps = new ArrayList<Integer>();
        this.jumperName = name;
        this.totalScore = 0;
        this.tournament = new Tournament();
    }
    
    public String getName(){
        return this.jumperName;
    }
    
    public int lengthJumped(){
        Random randomJump = new Random();
        int jump = randomJump.nextInt(60)+ 60;
        return jump;
    }
    
    public void addLength(int lengthJumped){
        this.lengthsOfJumps.add(lengthJumped);
    }
    
    public List<Integer> scoreOfJudges(){
        return this.tournament.judgeScores();
    }
    
    public void setTotalScore(List<Integer> scoreOfJudges){
        if(this.lengthsOfJumps.isEmpty()){
            
        }
        this.totalScore += (this.lengthsOfJumps.get(this.lengthsOfJumps.size()-1) + scoreOfJudges.get(1) + scoreOfJudges.get(2) + scoreOfJudges.get(3));
    }
    
    public int sumOfLengths(){
        int sumOfLengths = 0;
        
        for(int lengthOfJump : this.lengthsOfJumps){
            sumOfLengths += lengthOfJump;
        }
        return sumOfLengths;
    }
    
    public String printLengths(){
        String lengthss = "";
        
        for(Integer lengths : this.lengthsOfJumps){
            if(this.lengthsOfJumps.indexOf(lengths) == (this.lengthsOfJumps.size() -1)){
                lengthss += lengths;
            }else{
            lengthss += lengths + " m, ";
            }
        }
        return lengthss;
    }
    
    public int getTotalScore(){
        return this.totalScore;
    }
    
    @Override
    public String toString(){
        return this.jumperName + " (" + this.totalScore + " points)";
    }
    
    @Override
    public int compareTo(SkiJumper skijumper){
        return this.totalScore - skijumper.totalScore;
    }
}
