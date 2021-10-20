/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daviddrown
 */
public class Game {
   private String teamOne;
   private String teamTwo;
   private int teamOneScore;
   private int teamTwoScore;
   private int teamOneWin; 
   private int teamOneLoss; 
   private int teamTwoWin;
   private int teamTwoLoss;
   
   public Game(String teamOne, String teamTwo, int teamOneScore, int teamTwoScore){
       this.teamOne = teamOne;
       this.teamTwo = teamTwo;
       this.teamOneScore = teamOneScore;
       this.teamTwoScore = teamTwoScore;
   }
   
   public String returnTeamOne(){
    return teamOne; 
   } 
   
   public String returnTeamTwo(){
       return teamTwo;
   }
   
   public void score(){  
       if (teamOneScore > teamTwoScore){
           teamOneWin++; 
           teamTwoLoss++;
       }
       
       if(teamTwoScore > teamOneScore){
           teamTwoWin++;
           teamOneLoss++;  
       }
   }
   
   public int teamOneWins(){
       return teamOneWin;  
   }
   
   public int teamOneLosses(){
       return teamOneLoss; 
   }
   
   public int teamTwoWins(){
       return teamTwoWin;
   }
   
   public int teamTwoLosses(){
       return teamTwoLoss; 
   }
   
}
    

