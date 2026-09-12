
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class hinh extends JPanel {
    public hinh(){
        this.setBackground(Color.WHITE);
    }
    @Override
    protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.BLACK);
    g.drawLine(30, 50,56, 57);

    g.setColor(Color.RED);
    g.drawOval(70,50,20,40); // hình ovan

    g.setColor(Color.GREEN);
    g.drawRect(50,80,40,30); // hình chữ nhật

    g.setColor(Color.DARK_GRAY);
    g.fillRect(40, 90, 100, 70);
    
    g.setColor(Color.GRAY);
    g.drawString("Tan loi ", 100, 200);

}
}