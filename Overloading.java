public class Overloading{
 static int sum(int x, int y){
    return x+y;
}
static int sum(int x, int y, int z){
    return x+y+z;
}
static double sum(double x, double y){
    return x+y;
}
public static void main(String[]args){
    System.out.println(sum(20.5,30.3));
    System.out.println(sum(20,30,40));
}
}
