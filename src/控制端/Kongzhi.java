package 控制端;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class Kongzhi implements MouseListener {
	private JButton		aJButton;
	private JTextField	aJTextField;
	private String		IP;
	
	public Kongzhi(JButton aJButton, JTextField aJTextField) {
		this.aJButton = aJButton;
		this.aJTextField = aJTextField;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (aJButton.getText() == "连接") {
			IP = aJTextField.getText();
			aJButton.setText("停止");
		} else {

		}
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
	}
	
}
