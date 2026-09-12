package MVC.tester;

import MVC.model.ConterModel;
import MVC.view.CounterView;

public class test {
    public static void main(String[] args) {
        ConterModel ct= new ConterModel();
        
        System.out.println(ct.getValue());
         

        System.out.println(ct.getValue());
        CounterView cv =new CounterView();
        
    }
}