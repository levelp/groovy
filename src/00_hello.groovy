println("Hello world!")

def name = 'World'; println "Hello $name!"

for (i = 2; i < 10; ++i)
    println("i = " + i)

i = "String"
i = i.replaceAll("Str", "TTT")
println(i)

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

// Создание и вызов своих функций

// Вычисление n-ого числа Фибоначчи
def fib(long n) {
    n < 2 ? 1 : fib(n - 1) + fib(n - 2)
}

// Вычисление факториала
def fact(long N) {
    N <= 1 ? N : N * fact(N - 1)
}

def v = fact(3)
println "fact(3) = $v"

// Используем класс из вложенного пакета
import package1.MyClass

MyClass myClass = new MyClass()
myClass.i = 2
myClass.s = "String"
myClass.show()