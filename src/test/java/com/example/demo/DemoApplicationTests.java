package com.example.demo;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() throws JSONException {
		System.out.println("!");
		
		JSONArray test = new JSONArray();
		JSONArray test1 = new JSONArray();
		JSONArray test2 = new JSONArray();
		
		
		JSONObject test1_1 = new JSONObject();
		test1_1.put("abc","b");
		System.out.println("test1_1 "+test1_1);
		test1.put(test1_1);
		System.out.println("test1 "+test1);
		
		JSONObject test2_2 = new JSONObject();
		test2_2.put("abcd","bd");
		System.out.println("test2_2 "+test2_2);
		test2.put(test2_2);
		System.out.println("test2 "+test2);
		
		test.put(test1);
		test.put(test2);
		
		System.out.println("test" + test);
		
	}

}

