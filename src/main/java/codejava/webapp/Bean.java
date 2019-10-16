package codejava.webapp;

public class Bean {
	private String opt;
	private int num;
	private int res=0;
	public Bean() {
		super();
	}
	public Bean(String opt, int num) {
		super();
		this.opt = opt;
		this.num = num;
	}
	public void curr()
	{
		
		if(opt.equalsIgnoreCase("Dollar"))
		{
			res=71*num;
		}else if(opt.equalsIgnoreCase("Euro"))
		{
			res=78*num;
			
		}else if(opt.equalsIgnoreCase("Yen"))
		{
			res=184*num;
		}
		
	}
	public int getRes() {
		return res;
	}
		
		
}
