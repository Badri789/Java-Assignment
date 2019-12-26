package com.company;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ScriptException {
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        Scanner prompt = new Scanner(System.in);
        String expr;
        expr = prompt.nextLine();
        System.out.println(engine.eval(expr));
    }
}
