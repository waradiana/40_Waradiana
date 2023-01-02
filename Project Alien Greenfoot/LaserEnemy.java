import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LaserEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LaserEnemy extends Actor
{
    /**
     * Act - do whatever the LaserEnemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(-80);
        laserCollision();
    }
    
    public void laserCollision(){
        if(isTouching(Hero.class)){
            getWorld().addObject(new Boom(), getX(), getY());
            Greenfoot.playSound("explosion.mp3");
            removeTouching(Hero.class);
            getWorld().addObject(new Hero(), 70, 200);
        }else{
            getWorld().removeObject(this);
        }
    }
}
