package hello;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.codjust.demo.BaseCase;
import com.codjust.demo.common.Hello;

import org.junit.Assert;


public class Testhello extends BaseCase{

	@Autowired
	private Hello hello;
	
	@Test
	public void test_01() throws Exception {
		hello.say();

		hello.setText("nihao");
		Assert.assertEquals(hello.getText(), "nihao");
	}
}
