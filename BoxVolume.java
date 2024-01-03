public class BoxVolume{
    double length;
    double width;
    double height;
    BoxVolume(){
        length=width=height= -1;

    }
    BoxVolume(double l){
         length=width=height= l;

    }
    BoxVolume(double l, double w, double h)
    {
        length=l;
        width=w;
        height=h;
    }
    BoxVolume(double l, double w){
        this(l, w,0);
    }
    double volume(){
        return length*width*height;
    }
    public static void main(String[]args){
        BoxVolume box1=new BoxVolume();
          BoxVolume box2=new BoxVolume(4);
          BoxVolume box4=new BoxVolume(2,1);

            BoxVolume box3=new BoxVolume(2,1,3);
             System.out.println(box1.volume());
              System.out.println(box2.volume());
               System.out.println(box3.volume());
               System.out.println(box4.volume());


    }
}