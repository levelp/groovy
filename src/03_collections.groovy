/**
 * �������, ���������, ������
 */

b = [2, 10, 5, "String"]
for (int i = 0; i < b.size(); i++) {
    println "b[i] = ${b[i]}"
}
// java.util.ArrayList
println(b.getClass().getCanonicalName())

b.add("������� � �����")
b += "��� ���� �������"
println(b)

// ��������� ������ �����
s = [1, 2, 10, 5, 7]
s.sort()
println(s)
// [1, 2, 5, 7, 10]
if (2 in s) {
    println("2 ���� � " + s)
}

// ������������� map (������������� ��������)
dict = ["Hi": "������", "Yes": "��", 3: 100]
println(dict["Hi"])
println(dict.getClass().getCanonicalName())


