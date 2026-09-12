package mouse.MVC.controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import mouse.MVC.view.chuotView;

public class chuotController implements MouseListener,MouseMotionListener {
    private chuotView chuotview;

    public chuotController(chuotView chuotview){
        this.chuotview = chuotview;

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        this.chuotview.click();
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.chuotview.enter();
        int x =e.getX();
        int y =e.getY();
        this.chuotview.update(x,y);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.chuotview.exit();
    }
    @Override
    public void mouseDragged(MouseEvent e) {
    // xử lý khi kéo chuột
}

   @Override
   public void mouseMoved(MouseEvent e) {
    // xử lý khi di chuyển chuột
    int x = e.getX();
    int y = e.getY();
    this.chuotview.update(x, y);
}

}