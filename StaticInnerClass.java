public class StaticInnerClass {
   static String str = "hi all";
   static class Inner {
      // private int a = 10;
      public void demoMethod() {
         System.out.println("Hi");
         System.out.println("Can access properties of outer class as : "+ str);
      }
   }
   public static void main(String[] args) {
      Inner inObj = new Inner();
      inObj.demoMethod();
      System.out.println(inObj.a);
   }
}

