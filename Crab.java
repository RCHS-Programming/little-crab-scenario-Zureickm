import greenfoot.*;  // 
/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    public void act()
    {
      cisatedge ( );
      lookforworm( );
      randomturn ( );
       move (1);
    }
    
    public void move( )
    {
        move(5);
    }
    /*
     *Check if we are on a worm and if so then eat it
     */
    public void lookforworm( )
   { 
       if ( isTouching (Worm.class) ) 
      {                  
          removeTouching (Worm.class);        
     }   
    }
    
    
    /*
     * Make the crab turn randomly left or right between 0-45*
     */
    public void randomturn ( )
    {
       if(Greenfoot.getRandomNumber(100)< 10)
    
      {
        turn(Greenfoot.getRandomNumber(91)- 45);
    
      }
    }
    /*
     * If the crab is at edge turn
     */
    public void cisatedge ( )
    {
         if(isAtEdge())
      {
        turn(7); 
      }
    }
}


