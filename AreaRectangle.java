class rectangle{
    int length;
    int width;
    void set(int x, int y){
        length=x;
        width=y;

    }
    int area(){
        return length*width;
    }
}

public class AreaRectangle{
    public static void main(String[]args){
        rectangle r1=new rectangle();
        r1.set(4,5);
        int a = r1.area();
        System.out.println(a);

}
}
