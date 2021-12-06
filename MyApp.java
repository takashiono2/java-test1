//#27 final修飾子を使ってみよう
//final: 変更ができない
final class User {
  protected String name;
  private static final double VERSION = 1.1;

  public User(String name) {
    this.name = name;
    User.VERSION = 1.2;
  }

  public final void sayHi() {
    System.out.println("hi! " + this.name);
  }
}

class AdminUser extends User {

  public AdminUser(String name) {
    super(name);
  }

  @Override
  public void sayHi() {
    System.out.println("[admin] hi! " + this.name);
  }

}

public class MyApp {

  public static void main(String[] args) {
    User tom = new User("tom");
  }

}

// #26 イニシャライズを使ってみよう
// class User{
//   private String name;
//   private static int count;

//   static {
//     User.count = 0;
//     System.out.println("Static initializer");
//   }

//   {
//     System.out.println("Instance initializer");
//   }

//   public User(String name){
//     this.name = name;
//     User.count++;
//     System.out.println("コンストラクタ");
//   }

//   public static void getInfo(){
//     System.out.println("# of instances: " + User.count);
//   }
// }

// public class MyApp{
//   public static void main(String[] args) {
//     User.getInfo();
//     User tom = new User("tom");
//     User.getInfo();
//     User bob = new User("bob");
//     User.getInfo();
//   }
// }

//#25 static修飾子を使ってみよう
// class User{
//   private String name;
//   private static int count = 0;

//   public User(String name){
//     this.name = name;
//     User.count++;
//   }

//   public static void getInfo(){
//     System.out.println("# of instances: " + User.count);
//   }
// }

// public class MyApp{
//   public static void main(String[] args) {
//     User.getInfo();
//     User tom = new User("tom");
//     User.getInfo();
//     User bob = new User("bob");
//     User.getInfo();
//   }
// }

//#22 パッケージを使ってみよう
//#23 パッケージをコンパイルしてみよう
//#24 getter setterを使ってみよう
// class User{
//   private String name;
//   private int score;


//   //コンストラクタ
//   public User(String name, int score){
//     this.name = name;
//     this.score = score;
//   }

//   public int getScore(){
//     return this.score;
//   }

//   public void setScore(int score){
//     if(score>0){
//       this.score = score;
//     }
//   }


//   void sayHi(){
//     System.out.println("Hi! " + this.name);
//   }
// }

// public class MyApp{
//   public static void main(String[] args) {
//     User tom = new User("tom",65);//コンストラクタは特殊なメソッド、クラスがインスタンスに化ける時に呼ばれる
//     tom.setScore(85);
//     tom.setScore(-22);
//     System.out.println(tom.getScore());
//   }
// }

//#20 クラスを継承してみよう
// class User{
//   String name;

//   //コンストラクタ
//   User(String name){
//     this.name = name;
//   }
//   //コンストラクタはメソッドなのでオーバーロードできる
//   User(){
//     // this.name = "Me!";
//     this("Me!");//コンストラクタの書き換え
//   }

//   void sayHi(){
//     System.out.println("Hi! " + this.name);
//   }
// }

// class AdminUser extends User{
//   AdminUser(String name){
//     super(name);
//   }
// //オーバーライド
//   void sayHello(){
//     System.out.println("hello! " + this.name);
//   }

//   void sayHi(){
//     System.out.println("[admin]hi! " + this.name);
//   }
// }

// public class MyApp{
//   public static void main(String[] args) {
//     User tom = new User("tom");//コンストラクタは特殊なメソッド、クラスがインスタンスに化ける時に呼ばれる
//     System.out.println(tom.name);
//     tom.sayHi();

//     AdminUser bob = new AdminUser("bob");
//     System.out.println(bob.name);
//     bob.sayHi();
//     bob.sayHello();
//   }
// }

//#19 コンストラクタを使ってみよう
// class User{
//   String name;

//   //コンストラクタ
//   User(String name){
//     this.name = name;
//   }
//   //コンストラクタはメソッドなのでオーバーロードできる
//   User(){
//     // this.name = "Me!";
//     this("Me!");//コンストラクタの書き換え
//   }

//   void sayHi(){
//     System.out.println("Hi! " + this.name);
//   }
// }

// public class MyApp{
//   public static void main(String[] args) {
//     User tom;
//     // tom = new User("Tom");//コンストラクタは特殊なメソッド、クラスがインスタンスに化ける時に呼ばれる
//     tom = new User();//コンストラクタは特殊なメソッド、クラスがインスタンスに化ける時に呼ばれる
//     System.out.println(tom.name);
//     tom.sayHi();
//   }
// }

//#18クラスを使ってみよう
// class User{
//   String name = "Me!";
//   void sayHi(){
//     System.out.println("Hi!");
//   }
// }

// public class MyApp{
//   public static void main(String[] args) {
//     User tom;
//     tom = new User();//Userクラスのインスタンス、インスタンス化して領域を確保できる
//     System.out.println(tom.name);
//     tom.sayHi();
//   }
