import greenfoot.*;

public class Ant extends Obstacle
{
    private static final int LEFT_EDGE = 2;

    public void act()
    {
        moveAnt();
    }

    private void moveAnt()
    {
        setLocation(getX() - 2, getY()); 
        if (getX() < LEFT_EDGE)
        {
            getWorld().removeObject(this);
        }
    }
}
