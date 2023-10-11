import greenfoot.*;

public class Obstacle extends Actor
{
    private boolean isalive = true;
    
    public void act()
    {
        move();
    }

    private void move()
    {
        setLocation(getX() - 2, getY()); 
        
        if (getX() < 0)
        {
            getWorld().removeObject(this);
        }
    }
    
    public boolean isTouchObstacle(){
        for(Obstacle Obstacle  : getWorld().getObjects(Obstacle.class)){
            if(Math.abs(Obstacle.getX() - getX()) < 60 ){
                if (Math.abs(Obstacle.getY() + 30 - getY()) > 37){
                    isalive = false;
                }
            }
        }
        return !isalive;
    }
}
