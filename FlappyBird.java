import greenfoot.*;

public class FlappyBird extends Actor
{
    private int velocity = 0;
    private int gravity = 1;
    
    public FlappyBird()
    {
        GreenfootImage image = getImage();
        image.scale(50, 50);
    }

    public void act() 
    {
        if (Greenfoot.isKeyDown("space"))
        {
            velocity = -10;
        }
        velocity += gravity;
        setLocation(getX(), getY() + velocity);

        if (getY() >= getWorld().getHeight() - 1)
        {
            Greenfoot.stop();
        }
        
    }
}
