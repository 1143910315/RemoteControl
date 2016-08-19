package 被控端;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import 公用包.Jianting;
import 公用包.Tongzhi;

public class MainClass extends JFrame implements Tongzhi {
	
	private static final long	serialVersionUID	= 3622852656492653512L;
	JLabel						aJLabel;
	JTextField					aJTextField;
	JButton						aJButton;
	
	public static void main(String[] args) throws IOException {
		MainClass jFrame = new MainClass();
		jFrame.Initialize();
	}

	private void Initialize() throws IOException {
		setSize(400, 60);
		setLocationRelativeTo(null);
		setTitle("远程控制--被控端  by 吞噬¢  QQ1143910315");
		aJLabel = new JLabel("IP地址：");
		aJTextField = new JTextField("127.0.0.1");
		aJButton = new JButton("连接");
		add(aJButton);
		add(aJLabel);
		add(aJTextField);
		setUI1();
		setVisible(true);
		new Jianting(this);
	}

	private void setUI1() {
		GridBagConstraints aGridBagConstraints = new GridBagConstraints();
		aGridBagConstraints.anchor = GridBagConstraints.BASELINE_LEADING;
		GridBagLayout aGridBagLayout = new GridBagLayout();
		aGridBagLayout.setConstraints(aJButton, aGridBagConstraints);
		aGridBagLayout.setConstraints(aJLabel, aGridBagConstraints);
		aGridBagConstraints.weightx = 1;
		aGridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
		aGridBagLayout.setConstraints(aJTextField, aGridBagConstraints);
		setLayout(aGridBagLayout);
	}

	@Override
	public boolean shoudao(int zhuangtai) {
		return false;
	}
	
	@Override
	public boolean shuju(byte[] b) {
		return false;
	}
}
