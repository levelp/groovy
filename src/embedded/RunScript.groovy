package embedded

/**
 * Запуск другого скрипта
 */

def binding = new Binding()
def engine = new GroovyScriptEngine("")

while (true) {
    def greeter = engine.run('ReloadingTest.groovy', binding)
    println greeter.sayHello()
    Thread.sleep(1000)
}