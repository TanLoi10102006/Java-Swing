package mouse.MVC.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import mouse.MVC.controller.chuotController;
import mouse.MVC.model.chuotModel;

public class  chuotView extends JFrame{
    private chuotModel chuotmodel;
    private JPanel jPanel_mouse;
    private JPanel jPanel_info;
    private JLabel jLabel_possion;
    private JLabel jLabel_x;
    private JLabel jLabel_y;
    private JLabel jLabel_count;
    private JLabel jLabel_value;
    private JLabel jLabel_empty_1;
    private JLabel jLabel_check_in;
    private JLabel jLabel_check_in_value;
    private JLabel  jLabel_empty_2;

    public chuotView(){
        this.chuotmodel=new chuotModel();
        this.init();
    }
    public void init(){
        this.setTitle("MOUSE");
        this.setSize(300,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        Font f = new Font("Arial",Font.BOLD,30);
        
        jPanel_mouse= new JPanel();
        jPanel_mouse.setBackground(Color.BLUE);
        chuotController chuotcontroller =new chuotController(this);
        jPanel_mouse.addMouseListener(chuotcontroller);
        jPanel_mouse.addMouseMotionListener(chuotcontroller);

        jPanel_info= new JPanel();
        jPanel_info.setLayout(new GridLayout(3,3));
        jLabel_possion = new JLabel("Possion");
        jLabel_x= new JLabel("x=");
        jLabel_y=new JLabel("y=");
        jLabel_count= new JLabel("Number of clicks");
        jLabel_value = new JLabel("n");
        jLabel_empty_1=new JLabel();
        jLabel_check_in= new JLabel("Mouse is in component");
        jLabel_check_in_value=new JLabel("no");
        jLabel_empty_2= new JLabel();

        jPanel_info.add(jLabel_possion);
        jPanel_info.add(jLabel_x);
        jPanel_info.add(jLabel_y);
        jPanel_info.add(jLabel_count);
        jPanel_info.add(jLabel_value);
        jPanel_info.add(jLabel_empty_1);
        jPanel_info.add(jLabel_check_in);
        jPanel_info.add(jLabel_check_in_value);
        jPanel_info.add(jLabel_empty_2);

        jLabel_possion.setFont(f);
        jLabel_x.setFont(f);
        jLabel_y.setFont(f);
        jLabel_count.setFont(f);
        jLabel_value.setFont(f);
        jLabel_empty_1.setFont(f);
        jLabel_check_in.setFont(f);
        jLabel_check_in_value.setFont(f);
        jLabel_empty_2.setFont(f);
        this.setLayout(new BorderLayout());
        this.add(jPanel_mouse,BorderLayout.CENTER);
        this.add(jPanel_info,BorderLayout.SOUTH);

        this.setVisible(true);
    }
    public void click (){
        this.chuotmodel.click();
        this.jLabel_value.setText(this.chuotmodel.getCount()+"");
    }
    public void enter(){
        this.chuotmodel.enter();
        this.jLabel_check_in_value.setText(this.chuotmodel.getCheckIn());
    }
    public void exit(){
        this.chuotmodel.exit();
        this.jLabel_check_in_value.setText(this.chuotmodel.getCheckIn());

    }
    public void update(int x,int y){
        this.chuotmodel.setX(x);
        this.chuotmodel.setY(y);
        this.jLabel_x.setText(this.chuotmodel.getX()+"");
        this.jLabel_y.setText(this.chuotmodel.getY()+"");

    }
    public static void main(String[] args) {
        new chuotView();
    }

}