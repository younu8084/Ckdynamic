package dynamic_new;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import codejava.webapp.Bean;



class CurrTest {

	@Test
	void test() {
		Bean bt=new Bean("Dollar",2);
		bt.curr();
		int res=bt.getRes();
		assertEquals(142,res);
		Bean bt1=new Bean("Euro",2);
		bt1.curr();
		int res1=bt1.getRes();
		assertEquals(156,res1);
		Bean bt2=new Bean("Yen",2);
		bt2.curr();
		int res2=bt2.getRes();
		assertEquals(368,res2);
	}

}
