package cells;

public class cell 
{
  private int ver;
	private int hor;
	//ÿһ�������λ��
	public cell (int ver, int hor)
	{
		this.ver = ver;
		this.hor = hor;
	}
	public cell(cell x)
	{
		this.ver = x.getX();
		this.hor = x.getY();
	}
	
	//��ȡx����
	public int getX()
	{
		return ver;
	}
	//��ȡy����
	public int getY()
	{
		return hor;
	}
	//����λ�øı�
	//����
	public void left()
	{
		hor--;
	}
	//����
	public void right()
	{
		hor++;
	}
	//����
	public void down()
	{
		ver++;
	}
	public void up(int x)
	{
		ver=ver-x;
	}
	
}