println("Hello world!")

// Переменные a и b целого типа
a = 1; b = 3
c = a + b
println "c = $c"

// Теперь a - строка
a = "String"
c = a + b
println "c = $c" // String3

def myVar // Объявление переменной
myVar = 10  // Целое
println "myVar = $myVar"
myVar = "Строка" // Строка
println "myVar = $myVar"

// Использование цикла for
for (i = 0; i < 10; i++) {
    println "i = $i"
}

println("Представляем N в двоичном виде")
long N = 100
while (N > 0) {
    print((N % 2).toString())
    N /= 2
}
println()

// Нет do{} while()

// Можем использовать все Java-классы
// Из двоичной системы
int parsedValue = Integer.parseInt("1011", 2)
println "parsedValue = $parsedValue"

// Используем класс из вложенного пакета
import package1.MyClass

MyClass myClass = new MyClass()
myClass.i = 2
myClass.s = "String"
myClass.show()