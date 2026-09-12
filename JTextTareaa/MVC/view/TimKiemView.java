package JTextTareaa.MVC.view;
import JTextTareaa.MVC.controller.timkimListener;
import JTextTareaa.MVC.model.timKiemThongKe;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TimKiemView extends JFrame {
    private timKiemThongKe timkiemthongke;
    private JTextArea jTextArea_vanban;
    private JTextField jTextField_tukhoa;
    private JLabel jLabel_ketqua;

    public TimKiemView() {
        this.timkiemthongke = new timKiemThongKe();
        this.init();
        this.setVisible(true);
    }

    public void init() {
        this.setTitle("Tìm kiếm thống kê");
        this.setSize(600, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        timkimListener timListener= new timkimListener(this);

        Font f = new Font("Arial", Font.BOLD, 20);
        

        JLabel jLabel_tenVanBan = new JLabel("Văn bản");
        jLabel_tenVanBan.setFont(f);
        jTextArea_vanban = new JTextArea(10, 40);
        jTextArea_vanban.setFont(f);
        JScrollPane jScrollPane = new JScrollPane(
        jTextArea_vanban,
        JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,   // thanh cuộn dọc
        JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS  // thanh cuộn ngang
);

    //    jScrollPane.setViewportView(jTextArea_vanban);


        JLabel jLabel_tukhoa = new JLabel("Từ khóa");
        jLabel_tukhoa.setFont(f);
        jTextField_tukhoa = new JTextField();

        JButton jButton_Thongke =new JButton("Thong ke");
        jButton_Thongke.setFont(f);
        jButton_Thongke.addActionListener(timListener);
        jButton_Thongke.setBackground(Color.RED);

        jLabel_ketqua=new JLabel();
        jLabel_ketqua.setFont(f);
        jLabel_ketqua.setOpaque(true);
        jLabel_ketqua.setBackground(Color.YELLOW);


        // Tạo panel với BorderLayout
        JPanel jPanel_center = new JPanel(new BorderLayout(10,10));

        // Thêm các thành phần vào từng vùng
        jPanel_center.add(jLabel_tenVanBan, BorderLayout.NORTH);
        jPanel_center.add(jScrollPane, BorderLayout.CENTER);

        JPanel jPanel_south = new JPanel(new BorderLayout(10,10));
        jPanel_south.add(jLabel_tukhoa, BorderLayout.WEST);
        jPanel_south.add(jTextField_tukhoa, BorderLayout.CENTER);

        jPanel_center.add(jPanel_south, BorderLayout.SOUTH);

        JPanel jPanel_phanduoi=new JPanel(new BorderLayout(10,10));
        jPanel_phanduoi.add(jButton_Thongke,BorderLayout.WEST);
        jPanel_phanduoi.add(jLabel_ketqua,BorderLayout.CENTER);



        
        
        this.add(jPanel_center,BorderLayout.CENTER);
        this.add(jPanel_phanduoi,BorderLayout.SOUTH);

    }
    public void timkiem(){
        this.timkiemthongke.setvanBan(jTextArea_vanban.getText());
        this.timkiemthongke.setTuKhoa(jTextField_tukhoa.getText());
        this.timkiemthongke.timkiem();
        this.jLabel_ketqua.setText(this.timkiemthongke.getKetqua());
    }

    public static void main(String[] args) {
        new TimKiemView();
    }
}
