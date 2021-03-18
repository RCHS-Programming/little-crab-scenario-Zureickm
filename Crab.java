import greenfoot.*;  // 
/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    public void act()
    {
       turnleft ( );
       turnright ( );
       lookforworm( );
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
          Greenfoot.playSound ("slurp.wav");
     }   
    }
   public void turnright()
   { 
       if (Greenfoot.isKeyDown ("right"))
       {
           turn (4);
        }
   }
   public void turnleft()
   { 
       if (Greenfoot.isKeyDown ("left"))
       {
           turn (-4);
        }
    }
    
  }


