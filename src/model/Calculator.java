package model;

public class Calculator {
    private double number1;
    private double number2;
    private String operation;
    private double result;
   // metodo constructor
    public Calculator(double num1, double num2, String operation) {
        this.number1 = num1;
        this.number2 = num2;
        this.operation = operation;
    }

    public double getNumber1() {
        return number1;
    }
    public void setNumber1 (double num1) {
        this.number1 = num1;
    }

    public double getNumber2() {
        return number2;
    }
    public void setNumber2 (double num2) {
        this.number2 = num2;
    }
    public String getOperation() {
        return operation;
    }
    public void setOperation (String operation) {
        this.operation = operation;
    }

    public void operationValidate() {
        result = 0.0;
        switch(operation) {
            case "sumar": result = addition();
                break;
            case "restar": result = subtraction();
                break;
            case "multiplicar": result = multiplication();
                break;
            case "dividir": result = dividedBy();
                break;
            case "potenciar": result = nthPower();
                break;
            case "raiz": result = root();
                break;
            case "modulo": result = module();
                break;
            default: System.out.println("It is not a valid operation");
                break;
        }
    }

    public double addition() {
        return  number1 + number2;
    }

    public double subtraction() {
        return  number1 - number2;
    }
    public double multiplication() {
        return  number1 * number2;
    }
    public double dividedBy() {
        return  number1 / number2;
    }
    public double nthPower() {
        double resultado = 1;
        if (number2 == 0){
            return resultado;
        }else {

            for (int i = 1; i<=number2; i++) {
                resultado = resultado * number1;
            }
            return  resultado;
        }

    }
    public double root() {
        double x = 1.0;
        for(int k = 1; k < 10; k++){
            x = (x + number1/x) / number2;
        }
        return  x;
    }
    public double module() {
        return  number1 % number2;
    }


    @Override
    public String toString() {

        if(operation != "raiz" || operation != "modulo" ){
            return "El resultado de " + operation + " "+ number1 + " y " + number2 + " es : " + result;
        }else {
            return "El resultado de sacar " + operation + " entre " + number1 + " y " + number2 + " es : " + result;
        }


    }
}
