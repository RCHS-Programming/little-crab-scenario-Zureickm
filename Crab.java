import greenfoot.*;  // 
/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    private int wormc;

 
    public Crab()
    {
  
      image1 = new GreenfootImage ("crab.png");
      image2 = new GreenfootImage ("crab2.png");
      setImage(image1);
      wormc = 0;
     ;
     
    }
    
    public void act()
    {
       
       Image( );
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
          wormc = wormc + 1;
          
          getWorld().showText("Score: " + wormc, 50, 500);
          if (wormc == 10)
          { 
            Greenfoot.playSound ("fanfare.wav");
            Greenfoot.stop();
           }
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
   public void Image( )
   {
      if(getImage()==image1)
       { 
           setImage(image2);
           
       }
       else
       {
           setImage(image1);
       }
   }
    
  }


