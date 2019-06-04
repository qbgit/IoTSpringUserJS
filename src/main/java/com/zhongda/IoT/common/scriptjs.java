package com.zhongda.IoT.common;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * 
 * Java调用并执行js文件
 * 
 * @author qianbo
 */

public class scriptjs {

  public String userjs(String filename) throws ScriptException, NoSuchMethodException, IOException {
    ScriptEngineManager manager = new ScriptEngineManager();
    ScriptEngine engine = manager.getEngineByName("javascript");

    FileReader reader = new FileReader(filename); // 执行指定脚本
    engine.eval(reader);
 
    String ret ="";
    if (engine instanceof Invocable) {
      Invocable invoke = (Invocable) engine;  

      ret = (String) invoke.invokeFunction("getprotocol");
      
      //System.out.println("s = " + s);
    }

    reader.close();
    return ret;
  }
}