package MENU.controller;

import MENU.view.MenuView;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MenuMouse implements MouseListener {

    private MenuView MENUVIEW;

    public MenuMouse(MenuView menuView) {
        this.MENUVIEW = menuView;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.isPopupTrigger()) {
            MENUVIEW.jPopupMenu.show(
                    e.getComponent(),
                    e.getX(),
                    e.getY());
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.isPopupTrigger()) {
            MENUVIEW.jPopupMenu.show(
                    e.getComponent(),
                    e.getX(),
                    e.getY());
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}