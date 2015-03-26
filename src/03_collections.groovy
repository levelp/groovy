/**
 * Массивы, коллекции, списки
 */

b = [2, 10, 5, "String"]
for (int i = 0; i < b.size(); i++) {
    println "b[i] = ${b[i]}"
}
// java.util.ArrayList
println(b.getClass().getCanonicalName())

b.add("Элемент в конец")
b += "Ещё один элемент"
println(b)

// Сортируем массив чисел
s = [1, 2, 10, 5, 7]
s.sort()
println(s)
// [1, 2, 5, 7, 10]
if (2 in s) {
    println("2 есть в " + s)
}

// Использование map (ассоциативных массивов)
dict = ["Hi": "Привет", "Yes": "Да", 3: 100]
println(dict["Hi"])
println(dict.getClass().getCanonicalName())


