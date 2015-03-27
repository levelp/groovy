package embedded

/**
 * Запуск одного Groovy скрипта (ReloadingTest.groovy) из другого Groovy скрипта
 */

def binding = new Binding()
def engine = new GroovyScriptEngine("")

while (true) {
    def greeter = engine.run('ReloadingTest.groovy', binding)
    println greeter.sayHello()
    Thread.sleep(1000)
}
