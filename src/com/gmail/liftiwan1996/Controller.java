package com.gmail.liftiwan1996;

import java.util.Scanner;

public class Controller {

  private Model model = new Model();
  private View view = new View();

  public Controller(Model model, View view) {
    this.model = model;
    this.view = view;
  }

  public void proccesUser() {
    Scanner sc = new Scanner(System.in);
    model.setText_Hello(input_Hello(sc));
    model.setText_Java(input_Java(sc));
    view.printMessage(model.addInputText(model.getText_Hello(), model.getText_Java()));
  }

  public String input_Hello(Scanner sc) {
    view.printMessage(View.getMessage_Input1());
    String text = "";
    while (!((text = sc.nextLine()).equals("Hello"))) {
      view.printMessage(View.getMessage_Wrong_In());
      view.printMessage(View.getMessage_Input1());
    }
    return text;
  }

  public String input_Java(Scanner sc) {
    view.printMessage(View.getMessage_Input2());
    String text = "";
    while (!((text = sc.nextLine()).equals("Java"))) {
      view.printMessage(View.getMessage_Wrong_In());
      view.printMessage(View.getMessage_Input2());
    }
    return text;
  }
}
