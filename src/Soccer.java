/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JairoMan
 */
public class Soccer extends Team {

    //variables of the class
    private String Region;
    private int GB;

    public Soccer() {
    }

    public Soccer(String Name) {
        super(Name);
    }

    public Soccer(String Name, int Wins, int Losses) {
        super(Name, Wins, Losses);
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String Region) {
        this.Region = Region;
    }

    public int getGB() {
        return GB;
    }

    public void setGB(int GB) {
        this.GB = GB;
    }

    
    public int calcGB (int iWins, int iWins2)
            
    {
        int GB;
        
             GB = iWins - iWins2;
        
        this.GB = GB;
        
        return
                this.GB;
    }
    
}
