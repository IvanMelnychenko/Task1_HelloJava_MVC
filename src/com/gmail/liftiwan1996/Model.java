package com.gmail.liftiwan1996;

public class Model {

  private String text_Hello;
  private String text_Java;


  public String addInputText(String text1, String text2) {
    String text_Res = text1 + " " + text2 + " " + "!!!";
    return text_Res;
  }


  public String getText_Hello() {
    return text_Hello;
  }

  public void setText_Hello(String text_Hello) {
    this.text_Hello = text_Hello;
  }

  public String getText_Java() {
    return text_Java;
  }

  public void setText_Java(String text_Java) {
    this.text_Java = text_Java;
  }
}
