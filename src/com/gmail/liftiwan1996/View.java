package com.gmail.liftiwan1996;

public class View {

  private static final String message_Input1 = "Please input word Hello ";
  private static final String message_Input2 = "Please input word Java ";
  private static final String message_Wrong_In = "Please input correct word!!! ";

  public static String getMessage_Input1() {
    return message_Input1;
  }

  public static String getMessage_Input2() {
    return message_Input2;
  }

  public static String getMessage_Wrong_In() {
    return message_Wrong_In;
  }

  public void printMessage(String message) {
    System.out.println(message);
  }
}
