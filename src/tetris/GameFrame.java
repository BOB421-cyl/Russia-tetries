
package tetris;



import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JFrame;
import JFrame.Panel;


public class GameFrame extends JFrame implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Panel newp = new Panel();
	public GameFrame() throws InterruptedException
	{
		setTitle("����˹����");
		//2:����Ϊ�ɼ�
		setVisible(true);
		//3:���ô��ڵĳߴ�
		setSize(400, 400);
		//4:���ô��ھ���
	
		setLocationRelativeTo(null);
		//5:���ô��ڹر�,��������ֹ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(newp);
		addKeyListener(newp);
		newp.Gameon();

	}

	

	public static void main(String[] args) throws InterruptedException
	{
		new GameFrame();
	}

	//@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
