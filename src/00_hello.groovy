println("Hello world!")

// ���������� a � b ������ ����
a = 1; b = 3
c = a + b
println "c = $c"

// ������ a - ������
a = "String"
c = a + b
println "c = $c" // String3

def myVar // ���������� ����������
myVar = 10  // �����
println "myVar = $myVar"
myVar = "������" // ������
println "myVar = $myVar"

// ������������� ����� for
for (i = 0; i < 10; i++) {
    println "i = $i"
}

println("������������ N � �������� ����")
long N = 100
while (N > 0) {
    print((N % 2).toString())
    N /= 2
}
println()

// ��� do{} while()

// ����� ������������ ��� Java-������
// �� �������� �������
int parsedValue = Integer.parseInt("1011", 2)
println "parsedValue = $parsedValue"

// ���������� ����� �� ���������� ������
import package1.MyClass

MyClass myClass = new MyClass()
myClass.i = 2
myClass.s = "String"
myClass.show()