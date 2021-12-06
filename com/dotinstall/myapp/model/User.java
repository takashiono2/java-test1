package com.dotinstall.myapp.model;

public class User{
  protected String name;

  //コンストラクタ
  public User(String name){
    this.name = name;
  }

  public void sayHi(){
    System.out.println("Hi! " + this.name);
  }
}