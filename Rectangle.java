public class Rectangle
{
    int length;
    int width;
    public Rectangle(int length,int width)
    {
        this.length=length;
        this.width=width;
    }
    public int perimeter(int length,int width)
    {
        return 2*(length+width);
    }
    public int area(int length,int width)
    {
        return length*width;
    }
}
