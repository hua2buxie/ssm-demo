package com.levi.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.levi.model.Person;

@RestController
public class LocalhostAccessController {

	@RequestMapping("/helloWorld")
	public JSONObject helloWorld(){
		System.out.println("进入了helloWorld");
		Map map=new HashMap<String, Object>();
		map.put("name", "张三");
		map.put("age", 22);
		JSONObject jsonObject=new JSONObject(map);
		return jsonObject;
	}
	@RequestMapping("/")
	public ModelAndView index(){
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("args", "后台的数据，时间为:"+System.currentTimeMillis());
		System.out.println("进入了index");
		modelAndView.setViewName("/index");
		return modelAndView;
	}
	@RequestMapping("/add")
	public String add(Person person){
		JSONObject jsonObject=new JSONObject();
		System.out.println("获取的数据:"+person);
		jsonObject.put("code", "ok");
		return "ok!";
	}
}
