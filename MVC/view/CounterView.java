package MVC.view;

import MVC.controller.CounterListener;
import MVC.model.ConterModel;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CounterView extends JFrame{
    private ConterModel conterModel;
    private JButton jButton_up;
    private JButton jButton_down;
    private JLabel label;

    public CounterView(){
        this.conterModel= new ConterModel();
        this.inif();
        this.setVisible(true);
    }
    public void inif(){
        this.setTitle("Counter");
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
        ActionListener ac = new CounterListener(this, this.conterModel);

        jButton_up = new JButton("UP");
        jButton_up.addActionListener(ac);
        jButton_down = new JButton("Down");
        jButton_down.addActionListener(ac);
        label = new JLabel(String.valueOf(this.conterModel.getValue()), JLabel.CENTER);
        JPanel jPanel =new JPanel();
        jPanel.setLayout(new BorderLayout());
        jPanel.add(jButton_up,BorderLayout.WEST);
        jPanel.add(label,BorderLayout.CENTER);
        jPanel.add(jButton_down,BorderLayout.EAST);

        this.setLayout(new BorderLayout());
        this.add(jPanel,BorderLayout.CENTER);
        
    }
    public void increment() {
    this.conterModel.increment();
    this.label.setText(String.valueOf(this.conterModel.getValue()));
}

    public void decrement() {
    this.conterModel.decrement();
    this.label.setText(String.valueOf(this.conterModel.getValue()));
}

}