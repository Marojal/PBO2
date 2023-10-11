import greenfoot.*;

public class Rocket extends Obstacle
{
    private static final int LEFT_EDGE = 2;

    public void act()
    {
        moveRocket();
    }

    private void moveRocket()
    {
        setLocation(getX() - 3, getY()); 
        if (getX() < LEFT_EDGE)
        {
            getWorld().removeObject(this);
        }
    }
}
