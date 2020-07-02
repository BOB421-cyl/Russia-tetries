package JFrame;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cells.combination;

public class Panel1Test {

	private static Panel panel = new Panel();
	
	@Before
	public void setUp() throws Exception {
		panel.initmap();
		panel.Creatnewteris();
	}

	@Test
	public void testCheckline() {
		for(int i=1;i<10;i++)
		{
			panel.pane[4][i] = 2;
		}
		panel.Checkline();
		assertEquals(panel.score,100);
	}

	@Test
	public void testMoveup() {
		//保存最初俄罗斯方块各小方块坐标
		combination temp = new combination(panel.com);
		panel.Moveup();
		temp.Turn();
		for(int i=0;i<4;i++)
		{
			assertEquals(temp.cells[i].getX(),panel.com.cells[i].getX());
			assertEquals(temp.cells[i].getY(),panel.com.cells[i].getY());
		}

	}

	@Test
	public void testMovedown() {
		combination temp = new combination(panel.com);
		panel.Movedown();
		temp.moveDown();
		for(int i=0;i<4;i++)
		{
			assertEquals(temp.cells[i].getX(),panel.com.cells[i].getX());
			assertEquals(temp.cells[i].getY(),panel.com.cells[i].getY());
		}

	}

}
