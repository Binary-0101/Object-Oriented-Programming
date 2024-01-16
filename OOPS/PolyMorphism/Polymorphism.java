class Watch{
    int hour ;
    int min;
    int sec;
    String name;
    String material;

    Watch(){
        hour = 0;
        min = 0;
        sec = 0;
        name = "NoName";
        material = "Noname";
    }
    Watch(int hour,int min,int sec,String name,String material){
        this.hour = hour;
        this.min = min;
        this.sec = sec;
        this.name = name;
        this.material = material;
    }
    void display(){
        System.out.println(name+":"+material+":"+hour+":"+min+":"+sec);
    }
}
class DigitalWatch extends Watch{
    DigitalWatch(){
        name = "Digital Watch";
        material = "Stell";
    }
     DigitalWatch(int hour,int min,int sec,String name,String material){
        this.hour = hour;
        this.min = min;
        this.sec = sec;
        this.name = name;
        this.material = material;
    }
    //display method is also in the parent class 
    void display(){
        System.out.println(name+"-"+material+"-"+hour+"-"+min+"-"+sec);
    }
}
public class Polymorphism{
    public static void main(String[] args) {
        Watch w = new Watch(0,0,0,"ABC","Leather");
        DigitalWatch g = new DigitalWatch(10,20,30,"digital","gold");

        w.display();
        g.display();

        w = g; // referece of the parent class points to the objects of the child class it is called UpCasting

        w.display();
    }
}