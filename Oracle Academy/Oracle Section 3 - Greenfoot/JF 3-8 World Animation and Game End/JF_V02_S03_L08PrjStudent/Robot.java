import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Actor
{
    /**
     * Act - do whatever the Robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        robotMovement();
        detectWallCollision();
        detectBlockCollision();
        detectHome();
        eatPizza();
    }
    
    public void robotMovement()
    {
        if(Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(), getY()-2);
            animate();
        }    
        if(Greenfoot.isKeyDown("s"))
        {    
            setLocation(getX(), getY()+2);
            animate();
        }
        if(Greenfoot.isKeyDown("a"))
        {
            setLocation(getX()-2, getY());
            animate();
        }    
        if(Greenfoot.isKeyDown("d"))
        {
            setLocation(getX()+2, getY());
            animate();    
        }   
    }
    
    public void detectWallCollision()
    {
        if(isTouching(Wall.class))
        {
            Greenfoot.playSound("hurt.wav");
            setLocation(48,50);
        }
    }
    
    public void detectBlockCollision()
    {
        if(isTouching(Block.class))
        {
            Greenfoot.playSound("hurt.wav");
            setLocation(48,50);
        }
    }
    
    public void detectHome()
    {
        if(isTouching(Home.class))
        {
            Greenfoot.playSound("yipee.wav");
            setLocation(48,50);
        }
    }
    
    public void eatPizza()
    {
        if(isTouching(Pizza.class))
        {
            Greenfoot.playSound("eat.wav");
            removeTouching(Pizza.class);
            
        }
    }
    
    private GreenfootImage robotimage1 = new GreenfootImage("man01.png");
    private GreenfootImage robotimage2 = new GreenfootImage("man02.png");
    public void animate()
    {
        if(getImage().equals(robotimage1))
        {
            setImage(robotimage2);
        }else
        {
            setImage(robotimage1);
        }
        
    }
}
