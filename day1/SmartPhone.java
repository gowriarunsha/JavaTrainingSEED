package day1;

public class SmartPhone {
    String name;
    String os;
    int ram;
    int storage;
    int cam;
    double screen;

    public SmartPhone(String name,String os, int x, int y, double z)
    {
        this.name=name;
        this.os=os;
        this.ram=x;
        this.storage=y;
        this.screen=z;
    }

    public boolean equals(Object s)
    {
        SmartPhone o= (SmartPhone)s;
        if(this.hashCode()==o.hashCode())   //addresses equal, refers to same object
        {
            return true;
        }
        if(o == null || this.getClass() != o.getClass())
        {
            return false;
        }
        if(this.name.equals(o.name) && this.os.equals(o.os) && this.ram==o.ram && this.storage==o.storage && this.screen==o.screen)
        {
            return true;
        }
        return false;
    }
    public int hashCode()
    {
        return this.name.hashCode();
    }
}
