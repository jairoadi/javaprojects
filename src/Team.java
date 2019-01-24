
import java.text.DecimalFormat;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JairoMan Description: Team class, that has the team attributes
 */
public class Team {

    //variables of the class Team
    protected String Name;
    protected int Wins;
    protected int Losses;
    protected double WinLossPct;
    DecimalFormat df = new DecimalFormat("0.000");

    //empty constructor
    public Team() {
    }

    //creating a constructor that receives only Team Names
    public Team(String Name) {
        this.Name = Name;
    }

    //creating a constructor that receives name, wins, losses
    public Team(String Name, int Wins, int Losses) {
        this.Name = Name;
        this.Wins = Wins;
        this.Losses = Losses;
    }

    // lines 35 to 75 contain getters and setters
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getWins() {
        return Wins;
    }

    public void setWins(int Wins) {
        this.Wins = Wins;
    }

    public int getLosses() {
        return Losses;
    }

    public void setLosses(int Losses) {
        this.Losses = Losses;
    }

    public double getWinLossPct() {
        return WinLossPct;
    }

    public void setWinLossPct(double WinLossPct) {
        this.WinLossPct = WinLossPct;
    }

    public DecimalFormat getDf() {
        return df;
    }

    public void setDf(DecimalFormat df) {
        this.df = df;
    }

    //this method will calculate the wins/loss pct and return it as 0.000 format
    public void CalcWinsLossPct() {
        double tempWinLossesPct;
        tempWinLossesPct = (double) this.Wins / (this.Wins + this.Losses);

        this.WinLossPct = Double.parseDouble((df.format(tempWinLossesPct)));
    }
    
    
    public static Comparator <Soccer> alSort = new Comparator <Soccer> (){
        
        @Override
        public int compare (Soccer s1, Soccer s2){
            int team1 = s1.getWins();
            int team2 = s2.getWins();
            
            return
                    team2-team1;
        }
        
    };
}
