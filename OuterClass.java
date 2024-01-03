public class OuterClass{
    int x=10;
    class inner{
        int y=30;

    }

    public static void main(String[]args){
        OuterClass o=new OuterClass();
         OuterClass.inner i=o.new inner();
         System.out.println(o.x+i.y);

        
    }
}