// #33 ジェネリクス

// class MyInterger{
//   public void getThree(int x){
//     System.out.println(x);
//     System.out.println(x);
//     System.out.println(x);
//   }
// }

class MyData<T>{
  public void getThree(T x){
    System.out.println(x);
    System.out.println(x);
    System.out.println(x);
  }
}

public class MyApp {
  public static void main(String[] args){
    // MyInterger mi = new MyInterger();
    // mi.getThree(55);
    MyData<Integer> i = new MyData<>();
    i.getThree(32);
    MyData<String> s = new MyData<>();
    s.getThree("hello");
  }
}

// // #32 ラッパークラスを使ってみよう
// //int ・・・基本データ型
// //Integert　・・・基本データ型に対するラッパークラス（参照型）
// public class MyApp {
//   public static void main(String[] args){
//     Integer i = new Integer(32);
//     //  32という基本データ型をラッパークラスにするには、
//     //  ラッパークラス型でiを宣言し、Integerクラスのインスタンスを作りという基本データ型を渡す
//     int n = i.intValue();
//     //ラッパークラスの値を基本データ型として取り出すには、intで受けたいので、int nとしつつ、
//     //iのintValue()とする。
//     System.out.println();
// }

// #31 例外処理を扱ってみよう
// class MyException extends Exception {
//   public MyException(String s){
//     super(s);
//   }
// }

// public class MyApp {
//   public static void div(int a,int b){
//     try{
//       if(b < 0){
//         throw new MyException("not minus!");
//       }
//       System.out.println(a/b);
//     } catch(ArithmeticException e){
//       System.err.println(e.getMessage());
//     } catch(MyException e){
//       System.err.println(e.getMessage());
//     } finally {
//       System.err.println("-- end --");
//     }
//   }

//   public static void main(String[] args) {
//     div(3, 0);
//     div(5, -2);
//   }
// }

// #30 列挙型を作ってみよう
// enum Result{
//   SUCCESS,
//   ERROR,
// }

// public class MyApp {
//   public static void main(String[] args) {
//     Result res;

//     res = Result.ERROR;
//     switch(res){
//       case SUCCESS:
//         System.out.println("OK!");
//         System.out.println(res.ordinal());
//         break;
//       case ERROR:
//         System.out.println("NG!");
//         System.out.println(res.ordinal());
//         break;
//     }
//   }
// }

// #29 インターフェースを作ってみよう

// interface Printable{
//   //定数
//   double VERSION = 1.2;
//   //抽象メソッド
//   void print();
//   //defaultメソッド
//   public default void getInfo(){
//     System.out.println("I/F ver. " + Printable.VERSION);
//   }
//   //staticメソッド
// }

// class User implements Printable {
//   @Override
//   public void print(){
//     System.out.println("Now printing user profile...");
//   }
// }

// public class MyApp {
//   public static void main(String[] args) {
//     User tom = new User();
//     tom.print();
//     tom.getInfo();
//   }
// }

// #28 抽象クラスを使ってみよう

// abstract class User {
//   public abstract void sayHi();
// }

// class JapaneseUser extends User {
//   @Override
//   public void sayHi(){
//     System.out.println("こんにちは！");
//   }
// }

// class AmericanUser extends User {
//   @Override
//   public void sayHi(){
//     System.out.println("Hi！");
//   }
// }

// public class MyApp {

//   public static void main(String[] args) {
//     AmericanUser tom = new AmericanUser();
//     JapaneseUser aki = new JapaneseUser();
//     tom.sayHi();
//     aki.sayHi();
//   }
// }

//#27 final修飾子を使ってみよう
//final: 変更ができない
// final class User {
//   protected String name;
//   private static final double VERSION = 1.1;

//   public User(String name) {
//     this.name = name;
//     User.VERSION = 1.2;
//   }

//   public final void sayHi() {
//     System.out.println("hi! " + this.name);
//   }
// }

// class AdminUser extends User {

//   public AdminUser(String name) {
//     super(name);
//   }

//   @Override
//   public void sayHi() {
//     System.out.println("[admin] hi! " + this.name);
//   }

// }

// public class MyApp {

//   public static void main(String[] args) {
//     User tom = new User("tom");
//   }

// }

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
