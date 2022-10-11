import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class laser extends Actor
{
    /**
     * Act - do whatever the laser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(8);
        
        laserCollision(); 
         
    }
    
    public void laserCollision()
    {
        if(isTouching(Enemy.class))
        {
            getWorld().addObject(new boom(), getX(), getY());
            
            removeTouching(Enemy.class);
            getWorld().removeObject(this);
        }
        else if(isAtEdge())
            getWorld(). removeObject(this);   
    }
    
}
