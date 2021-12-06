package com.dotinstall.myapp;
import com.dotinstall.myapp.model.User;
import com.dotinstall.myapp.model.AdminUser;

public class MyApp{
  public static void main(String[] args){
    User tom = new User("tom");//コンストラクタは特殊なメソッド、クラスがインスタンスに化ける時に呼ばれる
    // System.out.println(tom.name);
    tom.sayHi();

    AdminUser bob = new AdminUser("bob");
    // System.out.println(bob.name);
    bob.sayHi();
    bob.sayHello();
  }
}