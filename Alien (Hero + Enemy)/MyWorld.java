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
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Hero hero = new Hero();
        addObject(hero,100,100);

        hero.setLocation(78,194);

        Enemy enemy = new Enemy();
        addObject(enemy,550,196);
        Enemy enemy2 = new Enemy();
        addObject(enemy2,545,115);
        Enemy enemy3 = new Enemy();
        addObject(enemy3,464,296);
        enemy.setLocation(544,203);
        enemy.setLocation(614,206);
        enemy.setLocation(623,280);
        enemy2.setLocation(594,-7);
        enemy3.setLocation(476,377);
        enemy2.setLocation(595,180);
        enemy.setLocation(559,86);
        enemy2.setLocation(572,233);
        Enemy enemy4 = new Enemy(4);
        addObject(enemy4,561,166);
        Enemy enemy5 = new Enemy(1);
        addObject(enemy5,420,120);
        removeObject(enemy);
        removeObject(enemy5);
    }
}
