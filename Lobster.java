import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @Matthew
 * @3/16/21
 */
public class Lobster extends Actor
{
    public void act()
    {
      lisatedge ( );
      lookforcrab( );
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
    public void lookforcrab( )
   { 
       if ( isTouching (Crab.class) ) 
      {                  
          removeTouching (Crab.class);        
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
    public void lisatedge ( )
    {
         if(isAtEdge())
      {
        turn(7); 
      }
    }
}
