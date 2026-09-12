package MVC.controller; // ✅ Đã sửa từ "controler" thành "controller"
import MVC.model.ConterModel;
import MVC.view.CounterView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterListener implements ActionListener {
    private CounterView view;
    private ConterModel model;

    public CounterListener(CounterView view, ConterModel model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src =e.getActionCommand(); // getActionCommand: lấy tên ra 
       

       if (src.equals("UP")) {
       this.view.increment();
     }  else if (src.equals("Down")) {
        this.view.decrement();
     }


         
    }
}