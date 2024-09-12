package com.math.entities;

public class Operation {
  private int operand1;
  private int operand2;
  private String type;
  private int result;

  public int getOperand1() {
    return operand1;
  }

  public void setOperand1(int operand1) {
    this.operand1 = operand1;
  }

  public int getOperand2() {
    return operand2;
  }

  public void setOperand2(int operand2) {
    this.operand2 = operand2;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  public Operation(int operand1, int operand2, String type, int result) {
    this.operand1 = operand1;
    this.operand2 = operand2;
    this.type = type;
    this.result = result;
  }
}
