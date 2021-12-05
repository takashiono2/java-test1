//session 16
public class MyApp{
  // public static void main(String[] args) {
  public static String sayHi(String name) {
    // System.out.println("Hi!" + name);
    return "Hi! " + name;
  }

  public static void main(String[] args){
    String msg = sayHi("Steve");
    System.out.println(msg);
  }
}