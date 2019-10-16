package dynamic_new;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import codejava.webapp.Bean;

class YenTest {

	@Test
	void test() {
		Bean bt2=new Bean("Yen",2);
		bt2.curr();
		int res2=bt2.getRes();
		assertEquals(368,res2);
	}

}
