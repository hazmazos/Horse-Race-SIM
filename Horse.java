
/**
 * Write a description of class Horse here.
 * 
 * @author (your name) 
 * @version (a version number a date)
 */
public class Horse
{
    private String horseName;
    private char horseSymbol;
    private int distanceTravelled;
    private boolean fallen;
    private double confidenceRating;
    
      
    //Constructor of class Horse
    /**
     * Constructor for objects of class Horse
     */
    public Horse(char horseSymbol, String horseName, double horseConfidence)
    {
        this.horseSymbol = horseSymbol;
        this.horseName = horseName;
        this.confidenceRating = horseConfidence;

    }
    
    
    
    //Other methods of class Horse
    public void fall()
    {
        if(this.fallen==false)
        {
            this.fallen = true;
        }
        else{
            System.out.println(this.horseName +" has already fallen");
        }
        
    }
    
    public double getConfidence()
    {
        return this.confidenceRating;
        
    }
    
    public int getDistanceTravelled()
    {
        return  this.distanceTravelled;
    }
    
    public String getName()
    {
        return this.horseName;
    }
    
    public char getSymbol()
    {
        return this.horseSymbol;
    }
    
    public void goBackToStart()
    {
        this.distanceTravelled=0;
    }
    
    public boolean hasFallen()
    {
        return this.fallen;
    }

    public void moveForward()
    {
        this.distanceTravelled = this.distanceTravelled +1;
    }

    public void setConfidence(double newConfidence)
    {
        if(newConfidence<=0 &newConfidence<=1)
        {
            this.confidenceRating=newConfidence;
        }
        else{
            System.out.println("Please enter a number between 0 and 1");
        }
    }
    
    public void setSymbol(char newSymbol)
    {
        if(newSymbol==' ')
        {
            System.out.println("Please enter a valid character");
        }
        else{
            this.horseSymbol=newSymbol;
        }
    }
    
}
