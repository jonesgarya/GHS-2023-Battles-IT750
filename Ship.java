public class Ship
{
    int row;
    int col;
    int length;
    int direction;
    
    public static final int UNSET = -1;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    
    public Ship(int length)
    {
        this.length = length;
        this.direction = UNSET;
        this.row = UNSET;
        this.col = UNSET;
    }
    
    public boolean isLocationSet()
    {
        return this.row != UNSET && this.col != UNSET;
    }
    
    public boolean isDirectionSet()
    {
        return this.direction != UNSET;
    }
    
    public void setLocation(int row, int col)
    {
        this.row = row;
        this.col = col;
    }
    
    public void setDirection(int direction)
    {
        this.direction = direction;
    }
    
    public int getRow()
    {
        return this.row;
    }
    
    public int getCol()
    {
        return this.col;
    }
    
    public int getLength()
    {
        return this.length;
    }
    
    public String getDirection()
    {
        return this.directionToString();
    }
    
    private String directionToString()
    {
        if(direction == UNSET)
        {
            return "UNSET";
        }
        else if(direction == HORIZONTAL)
        {
            return "HORIZONTAL";
        }
        else
        {
            return "VERTICAL";
        }
    }
    
    public String toString()
    {
        return "This ship is located in row " + this.row + " and column " + this.col + " and has length " + this.length + " and Direction " + directionToString() + ".";
    }
}
