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
		
		
	}

}
