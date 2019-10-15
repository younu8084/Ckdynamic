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
		switch(opt)
		{
		case "Dollar" :
			res=71*num;
			break;
		case "Euro" :
			res=78*num;
			break;
		case "Yen" :
			res=184*num;
			break;
		}
		
	}
	public int getRes() {
		return res;
	}
		
		
}
