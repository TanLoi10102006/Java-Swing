package MENU.controller;

import MENU.view.MenuView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuController implements ActionListener {
    private MenuView menuview;
    public MenuController(MenuView menuview){
        this.menuview=menuview;
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		String button= e.getActionCommand();
        if (button.equals("Open")) {
            this.menuview.setTextJLabel("Ban da click open");
        }else if (button.equals("Exit")) {
            this.menuview.setTextJLabel("ban da click exit");
            System.exit(0); // thoat chuong trinh 
        }else if(button.equals("Welcome")){
            this.menuview.setTextJLabel("ban da click welcome");
        }else if (button.equals("New")) {
            this.menuview.setTextJLabel("ban da click New");
        }else if(button.equals("Undo")){
            this.menuview.setTextJLabel("ban da click"+button);
        }else if(button.equals("Redo")){
            this.menuview.setTextJLabel("ban da click"+button);
        }else if (button.equals("Coppy")) {
            this.menuview.setTextJLabel("ban da click"+button);  
        }else if (button.equals("Cut")){
            this.menuview.setTextJLabel("ban da click"+button);
        }else if (button.equals("Paste")){
         this.menuview.setTextJLabel("ban da click"+button);
        }

	}

}