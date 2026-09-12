package MENU.controller;

import MENU.view.MenuView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuCheck implements ActionListener{
    private MenuView menuview;

    public MenuCheck(MenuView menuview){
        this.menuview=menuview;

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (menuview.getjCheckBoxMenuItem().isSelected()) {
        this.menuview.enToolbar();
    } else {
        this.menuview.disToolbar();
    }

     
    }
}