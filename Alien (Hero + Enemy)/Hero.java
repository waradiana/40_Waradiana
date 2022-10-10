import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
       moveHero(); 
    }
    
    public void moveHero()
    {
        if(Greenfoot.isKeyDown("w"))
            setLocation(getX(), getY()-2);
            
        if(Greenfoot.isKeyDown("s"))
            setLocation(getX(), getY()+2);
        
        if(Greenfoot.isKeyDown("a"))
            setLocation(getX()-2, getY());
            
        if(Greenfoot.isKeyDown("d"))
            setLocation(getX()+2, getY());
            
        if(Greenfoot.isKeyDown("space"))
            move(2);
    }
}
