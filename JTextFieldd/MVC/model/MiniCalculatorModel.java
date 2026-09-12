package JTextFieldd.MVC.model;
public class  MiniCalculatorModel{
    private double firsValue;
    private double secondValue;
    private double answer;

    public MiniCalculatorModel(){

    }
    public double getfirsValue(){
        return  firsValue;
    }
    public double getsecondValue(){
        return secondValue;
    }
    public double getanswer(){
        return answer;
    }
    public void setfirsValue(double firsValue){
        this.firsValue=firsValue;
    }
    public void setsecondValue(double secondValue){
        this.secondValue=secondValue;
    }
    public void setanswer(double answer){
        this.answer=answer;
    }
    public void sum (){
        answer=firsValue+secondValue;
    }
    public void tru(){
        answer=firsValue-secondValue;
    }
    public void nhan (){
        answer=firsValue*secondValue;
    }
     public void chia() {
    if (secondValue != 0) {
        answer = firsValue / secondValue;
    } else {
        throw new ArithmeticException("Cannot divide by zero");
    }
} 
    public void canbac2(){
        answer=Math.pow(firsValue, secondValue);
    }
    public void chialaydu(){
        answer=firsValue%secondValue;
    }
} 

