package Color.MVC.controller;

import Color.MVC.view.MyColorView;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyColorListener implements ActionListener{
    private MyColorView myColorView;
    public MyColorListener(MyColorView myColorView){
        this.myColorView=myColorView;
    }
     @Override
    public void actionPerformed(ActionEvent e){
        String chuyenMau =e.getActionCommand();
        if (chuyenMau.equals("RED")) {
            this.myColorView.ChangeTexColor(Color.RED);     
        }else if(chuyenMau.equals("YELLOW")){
            this.myColorView.ChangeTexColor(Color.YELLOW);;
        }else if (chuyenMau.equals("GREEN")) {
            this.myColorView.ChangeTexColor(Color.GREEN);  
        }else if (chuyenMau.equals("RED background")) {
            this.myColorView.ChangeBackground(Color.RED);   
        }else if (chuyenMau.equals("YELLOW background")){
            this.myColorView.ChangeBackground(Color.YELLOW);
        }else if (chuyenMau.equals("GREEN background")) {
            this.myColorView.ChangeBackground(Color.GREEN);
        }

    }

}