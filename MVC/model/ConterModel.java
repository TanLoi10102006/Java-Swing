package MVC.model;
public class ConterModel{
    private int value;
    
    public ConterModel(int value){
        this.value=0;
    }
    public ConterModel(){
        this.value=0;
    }
    public int getValue(){
        return value;
    }
    public void setValue(){
        this.value=value;
    }
    public void increment() {
        this.value++;
    }

    public void decrement() {
        this.value--;
    }
    
}