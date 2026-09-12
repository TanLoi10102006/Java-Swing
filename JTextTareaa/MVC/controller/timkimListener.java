
package  JTextTareaa.MVC.controller;

import JTextTareaa.MVC.view.TimKiemView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class timkimListener implements ActionListener {
    private TimKiemView timkiemview;
    public timkimListener(TimKiemView timkiemview){
        this.timkiemview = timkiemview;
    }

	@Override
	public void actionPerformed(ActionEvent e) {
        this.timkiemview.timkiem();
		
	}

}