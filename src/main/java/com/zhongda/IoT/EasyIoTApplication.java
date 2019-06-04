package com.zhongda.IoT;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.io.IOException;

import javax.script.ScriptException;

import com.zhongda.IoT.common.scriptjs;

//import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.JSON;
@SpringBootApplication
@EnableJpaAuditing
public class EasyIoTApplication {

	public static void main(String[] args) throws NoSuchMethodException, ScriptException, IOException {
		scriptjs js = new scriptjs();
		String s = js.userjs("e:/test.js");
		//System.out.println("this is " + s);
		//JSON.parseObject(jsonString, User.class);
		JSONObject jsonObject = JSON.parseObject(s);
		String url =  jsonObject.getString("url");
		String push = jsonObject.getString("push");
		String port = jsonObject.getString("port");
		System.out.println("url:"+ url);
		System.out.println("push:"+ push);
		System.out.println("port:"+ port);

		//protocol_define pd=(protocol_define)JSONObject.toBean(jsonObject, prorocol_define.class);
		SpringApplication.run(EasyIoTApplication.class, args);
	}
}
