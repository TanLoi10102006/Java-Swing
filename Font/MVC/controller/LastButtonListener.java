package Font.MVC.controller;

import Font.MVC.view.LastButtonView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LastButtonListener implements ActionListener{
    private LastButtonView lastButtonView;
    public LastButtonListener(LastButtonView lastButtonView){
        this.lastButtonView=lastButtonView;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        String nguoisukien = e.getActionCommand();
        if ("1".equals(nguoisukien)) {
            this.lastButtonView.changeTo_1();
            
        }else if ("2".equals(nguoisukien)) {
            this.lastButtonView.changeTo_2();
            
        }else if("3".equals(nguoisukien)){
            this.lastButtonView.changeTo_3();
        }else if ("4".equals(nguoisukien)) {
            this.lastButtonView.changeTo_4();
            
        }

    }


}