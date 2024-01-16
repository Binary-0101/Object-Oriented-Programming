package Class;

class Cricket{
    String p_Name;
    int p_No;
    String p_roll;

   // Default Constructor
    Cricket(){
        p_Name = "";
        p_No = 0;
        p_roll = "";
    }

    //Parametrized Constructor
    Cricket(String p_Name,int p_No,String p_roll){
        this.p_Name = p_Name;
        this.p_No = p_No;
        this.p_roll = p_roll;
    }

    Cricket(String name,String roll){
        p_Name = name;
        p_roll = roll;
    }

    //copy Constructor
    Cricket(Cricket cricket2){
         p_Name = cricket2.p_Name;
         p_No = cricket2.p_No;  
    }
    
    void display(){
        System.out.println(p_Name+" "+p_No+" "+p_roll);
    }
}
class FootBall{
    String f_Name;
    int f_No;
    String f_roll;

    FootBall(String f_name,int f_No,String f_roll){
        this.f_Name = f_name;
        this.f_No = f_No;
        this.f_roll = f_roll;
    }

    void display(){
        System.out.println(f_Name+" "+f_No+" "+f_roll);
    }
}
public class classObject {
    public static void main(String[] args) {
        Cricket cricket1 =  new Cricket();
        Cricket cricket2 =  new Cricket("Virat",18,"BatsMan");
        Cricket cricket3 =  new Cricket("AB","BatsMan");

        FootBall fb = new FootBall("Ronaldo", 7, "Offense");

        Cricket cricket4 = new Cricket(cricket2);

        cricket1.display();;
        cricket2.display();;
        cricket3.display();
        cricket4.display();

        fb.display();
    }
}