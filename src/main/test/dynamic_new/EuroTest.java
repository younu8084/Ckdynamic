package dynamic_new;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import codejava.webapp.Bean;

class EuroTest {

	@Test
	void test() {
		Bean bt1=new Bean("Euro",2);
		bt1.curr();
		int res1=bt1.getRes();
		assertEquals(156,res1);
	}

}
