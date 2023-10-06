class StaticPoly{
    int sum(int x,int y){
        int s=x+y;
        System.out.println("Sum of two number"+s);
    }
    void sum(int x,int z){
        int s=x+y+z;
        System.out.println("Sum of three number"+s);
    }
}
public class hand2 {
    public static void main(String[] args){
        Staticpoly object=new Staticpoly();
        object.sum(20,10);
        object.sum(20,10,30);
    }
    
}
