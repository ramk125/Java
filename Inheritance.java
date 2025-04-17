class Room
{
    int length;
    int breadth;
    Room(int x, int y)
    {
        length=x;
        breadth=y;
    }
    int area()
    {
        return (length* breadth);
    }
}

class BedRoom extends Room
{
    int HEIGHT;
    BedRoom(int x,int y, int z)
    {
        super (x, y);
        HEIGHT=z;
    }
    int volume()
    {
        return (length*breadth*HEIGHT);
    }
}

public class Inheritance {
    public static void main(String[] args) {

        BedRoom room1= new BedRoom(12,34,23);
        int area1=room1.area();
        int volume1=room1.volume();
        System.out.println("Area1 = "+ area1);
        System.out.println("Volumw = "+volume1);
        
    }
}
