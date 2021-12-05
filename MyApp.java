//#20 クラスを継承してみよう
class User{
  String name;

  //コンストラクタ
  User(String name){
    this.name = name;
  }
  //コンストラクタはメソッドなのでオーバーロードできる
  User(){
    // this.name = "Me!";
    this("Me!");//コンストラクタの書き換え
  }

  void sayHi(){
    System.out.println("Hi! " + this.name);
  }
}

class AdminUser extends User{
  AdminUser(String name){
    super(name);
  }
//オーバーライド
  void sayHello(){
    System.out.println("hello! " + this.name);
  }

  void sayHi(){
    System.out.println("[admin]hi! " + this.name);
  }
}

public class MyApp{
  public static void main(String[] args) {
    User tom = new User("tom");//コンストラクタは特殊なメソッド、クラスがインスタンスに化ける時に呼ばれる
    System.out.println(tom.name);
    tom.sayHi();

    AdminUser bob = new AdminUser("bob");
    System.out.println(bob.name);
    bob.sayHi();
    bob.sayHello();
  }
}

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
