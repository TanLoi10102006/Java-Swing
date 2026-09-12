package File.controller;

import File.view.NoteView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class NoteController implements ActionListener {
    public NoteView noteView;

    public NoteController(NoteView noteView) {
        this.noteView = noteView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // handle action event
        JFileChooser fc = new JFileChooser();
        Object command = e.getSource();

        if (command == noteView.btnSave) {
            int result = fc.showOpenDialog(this.noteView);
            if (result == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                this.noteView.lblStatus.setText(file.getAbsolutePath());
                String fileName = file.getName();
                if (fileName.endsWith(".txt")) {
                    try {
                        BufferedReader br = new BufferedReader(new FileReader(file));
                        String line;
                        StringBuilder data = new StringBuilder();
                        while ((line = br.readLine()) != null) {
                            data.append(line);
                            data.append("\n");
                        }
                        br.close();
                        noteView.textArea.setText(data.toString());
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }

                } else {
                    JOptionPane.showMessageDialog(noteView, "Chi duoc mo file .txt", "Loi",
                            JOptionPane.ERROR_MESSAGE);
                }

            }

        }
        if (command == noteView.btnSave) {
            int result = fc.showOpenDialog(this.noteView);
            if (result == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                String fileName = file.getName();
                if (!fileName.endsWith(".txt")) {
                    file = new File(file.getAbsolutePath() + ".txt");

                }
                try {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(file));
                    bw.write(noteView.textArea.getText());
                    bw.close();
                    noteView.lblStatus.setText(file.getAbsolutePath());
                    JOptionPane.showMessageDialog(noteView, "luu file thanh cong");

                } catch (Exception ex) {
                    ex.printStackTrace();
                }

            }

        }
    }
}
