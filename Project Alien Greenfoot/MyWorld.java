import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
     
    private void prepare()
    {
        Hero hero = new Hero();
        addObject(hero,100,100);

        hero.setLocation(78,194);
    }
    
    public void act()
    {
        spawnEnemy();
        spawnEnemy2();
    }
    
    private int timerEnemy = 0;
    private void spawnEnemy()
    {
        if (timerEnemy==180) //jika timer = 3 detik
        {
            //int speed = Greenfoot.getRandomNumber(4) + 1;
            addObject(new Enemy(Greenfoot.getRandomNumber(4) + 1),599,Greenfoot.getRandomNumber(400));
            timerEnemy = 0;
        }else
        {
            timerEnemy++;
        }
    }
    
    private int timerEnemy2 = 0;
    private void spawnEnemy2()
    {
        if (timerEnemy2==180) //jika timer = 3 detik
        {
            //int speed = Greenfoot.getRandomNumber(4) + 1;
            addObject(new Enemy2(Greenfoot.getRandomNumber(4) + 1),599,Greenfoot.getRandomNumber(400));
            timerEnemy2 = 0;
        }else
        {
            timerEnemy2++;
        }
    }
    
}
