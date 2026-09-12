package File.view;

import File.controller.NoteController;
import File.model.NoteModel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class NoteView extends JFrame {

    public NoteModel noteModel;
    public JTextArea textArea;
    public JLabel lblStatus;
    public JButton btnOpen, btnSave;

    public NoteView() {

        this.noteModel = new NoteModel();

        setTitle("Notepad");
        setSize(950, 650);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        NoteController noteController = new NoteController(this);

        // ===== Text Area =====
        textArea = new JTextArea();
        textArea.setFont(new Font("Arial", Font.PLAIN, 18));

        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        // ===== Panel Bottom =====
        JPanel bottomPanel = new JPanel(new BorderLayout());

        // Label bên trái
        lblStatus = new JLabel("Chưa mở file");
        lblStatus.setFont(new Font("Arial", Font.PLAIN, 16));
        bottomPanel.add(lblStatus, BorderLayout.WEST);

        // Panel chứa nút
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        btnOpen = new JButton("Open");
        btnOpen.setFont(new Font("Arial", Font.PLAIN, 16));
        btnOpen.addActionListener(noteController);

        btnSave = new JButton("Save");
        btnSave.setFont(new Font("Arial", Font.PLAIN, 16));
        btnSave.addActionListener(noteController);

        buttonPanel.add(btnOpen);
        buttonPanel.add(btnSave);

        bottomPanel.add(buttonPanel, BorderLayout.EAST);

        add(bottomPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new NoteView();
    }
}
