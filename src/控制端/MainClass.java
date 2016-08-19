package 控制端;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.ScrollPane;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import 公用包.Tongzhi;

public class MainClass extends JFrame implements Tongzhi {

	private static final long	serialVersionUID	= -2499232216521027524L;
	JLabel						aJLabel;
	JTextField					aJTextField;
	JButton						aJButton;
	JLabel						bJLabel;
	ScrollPane					aScrollPane;

	public static void main(String[] args) {
		MainClass jFrame = new MainClass();
		jFrame.Initialize();
	}

	private void Initialize() {
		Double aDouble = Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 1.5;
		Double bDouble = Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 1.5;
		setSize(aDouble.intValue(), bDouble.intValue());
		setLocationRelativeTo(null);
		setTitle("远程控制--控制端  by 吞噬¢  QQ1143910315");
		aJLabel = new JLabel("IP地址：");
		aJTextField = new JTextField("127.0.0.1");
		aJButton = new JButton("连接");
		bJLabel = new JLabel();
		bJLabel.setIcon(new ImageIcon("E:\\QQ图片20160812121902.jpg"));
		aScrollPane = new ScrollPane(ScrollPane.SCROLLBARS_AS_NEEDED);
		aScrollPane.add(bJLabel);
		add(aJButton);
		add(aJLabel);
		add(aJTextField);
		add(aScrollPane);
		setUI1();
		aJButton.addMouseListener(new Kongzhi(aJButton, aJTextField));
		setVisible(true);
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
		aGridBagConstraints.gridy = 1;
		aGridBagConstraints.gridwidth = 3;
		aGridBagConstraints.weighty = 1;
		aGridBagConstraints.fill = GridBagConstraints.BOTH;
		aGridBagLayout.setConstraints(aScrollPane, aGridBagConstraints);
		setLayout(aGridBagLayout);
	}

	// private void setUI2() {
	// GridBagConstraints aGridBagConstraints = new GridBagConstraints();
	// aGridBagConstraints.anchor = GridBagConstraints.BASELINE_LEADING;
	// aGridBagConstraints.fill = GridBagConstraints.BOTH;
	// aGridBagConstraints.weightx = 1;
	// aGridBagConstraints.weighty = 1;
	// GridBagLayout aGridBagLayout = new GridBagLayout();
	// aGridBagLayout.setConstraints(aScrollPane, aGridBagConstraints);
	// setLayout(aGridBagLayout);
	// }
	@Override
	public boolean shoudao(int zhuangtai) {
		return false;
	}
	
	@Override
	public boolean shuju(byte[] b) {
		return false;
	}
}
