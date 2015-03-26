package embedded
/**
 * Этот класс будем вызывать
 */

class Greeter {
    String sayHello() {
        def greet = "Hello, world!"
        greet
    }
}

println "Script"

new Greeter()