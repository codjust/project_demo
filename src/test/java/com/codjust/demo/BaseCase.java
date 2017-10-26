package com.codjust.demo;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.*;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class BaseCase {
	protected Logger logger = LoggerFactory.getLogger("TestCase");
}
