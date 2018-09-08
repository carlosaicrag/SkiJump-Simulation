/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carlosgarciajr
 */
import java.util.Comparator;

public class SortDescendingOrder implements Comparator<SkiJumper>{
    public int compare(SkiJumper skiJumper1,SkiJumper skiJumper2){
        return skiJumper2.getTotalScore()- skiJumper1.getTotalScore();
    }
}
