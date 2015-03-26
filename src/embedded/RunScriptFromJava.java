package embedded;

import groovy.lang.Binding;
import groovy.util.GroovyScriptEngine;

/**
 * Запуск Groovy из Java
 */
public class RunScriptFromJava {

    public static void main(String[] args) throws Exception {
        Binding binding = new Binding();
        GroovyScriptEngine engine = new GroovyScriptEngine("src/embedded");

        while (true) {
            Object greeter = engine.run("ReloadingTest.groovy", binding);
            System.out.println(greeter.getClass().getMethod("sayHello").invoke(greeter));
            // System.out.println(greeter.sayHello());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
