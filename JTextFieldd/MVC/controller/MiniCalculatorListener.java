package JTextFieldd.MVC.controller;

import JTextFieldd.MVC.view.MiniCalculatorView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiniCalculatorListener implements ActionListener {

    private MiniCalculatorView miniCalculatorView;

    public MiniCalculatorListener(MiniCalculatorView miniCalculatorView) {
        this.miniCalculatorView = miniCalculatorView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
		String button =e.getActionCommand();
		if (button.equals("+")) {
			this.miniCalculatorView.cong();
			
		}else if (button.equals("-")) {
			this.miniCalculatorView.tru();
		}else if (button.equals("*")){
			this.miniCalculatorView.nhan();
		}else if (button.equals("/")) {
			this.miniCalculatorView.chia();
		}else if (button.equals("%")){
			this.miniCalculatorView.chialaydu();
		}else if (button.equals("^")){
			this.miniCalculatorView.canbac2();
		}

    }
}