
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        System.out.println("File: ");
        String file = scan.nextLine();
        
        ArrayList<Game> records = someMethod(file); 
        
       
        if(!records.isEmpty()){
       
       
        System.out.println("Team: ");
        String team = scan.nextLine();
        
        
        int gamesPlayed = 0;
        int wins = 0;
        int losses = 0; 
        
        for(Game games : records){
            if(games.returnTeamOne().equals(team) || games.returnTeamTwo().equals(team)){
                gamesPlayed++; 
                games.score(); 
            
                if(games.returnTeamOne().equals(team)){
                    if(games.teamOneWins() == 1){
                       wins++;
                    }
                    if(games.teamOneLosses() == 1){
                        losses++;
                    }
                }
            
                if(games.returnTeamTwo().equals(team)){
                    if(games.teamTwoWins() == 1){
                        wins++;
                    }
                    if(games.teamTwoLosses()==1){
                        losses++; 
                    }
                }
            }
        }   
        
        System.out.println("Games: " + gamesPlayed);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        
        }   
        
    }  
    

        public static ArrayList<Game> someMethod(String file){
            ArrayList<Game> games = new ArrayList<>(); 
            
        try (Scanner readFile = new Scanner(Paths.get(file))){
            while(readFile.hasNextLine()){
                String row = readFile.nextLine(); 
                
                String [] pieces = row.split(",");
                
                String teamOne = pieces[0];
                String teamTwo = pieces[1];
                int teamOneScore = Integer.valueOf(pieces[2]);
                int teamTwoScore = Integer.valueOf(pieces[3]);
                
                games.add(new Game(teamOne, teamTwo, teamOneScore, teamTwoScore));
                
            }
            
        } catch (Exception e){
            System.out.println("The file " + file + " was not found"); 
        }
       
        return games; 
    }
}
