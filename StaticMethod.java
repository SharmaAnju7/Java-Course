public class StaticMethod{
    static void display(int a[]){
        //Using For loop
        for(int i=0;i<a.length;i++)
        System.out.println(a[i]);

        //Using for each loop
        for(int j:a){
            System.out.println(j);
        }

    }
    public static void main(String[]args){
        int a[]={2,3,4,5};
         StaticMethod b=new StaticMethod();

        
        //int b[]=new int[10];
       display(a);

    }
}