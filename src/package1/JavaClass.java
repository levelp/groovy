package package1;

/**
 * Java-класс для вызова из Groovy
 */
public class JavaClass {
    public int intValue;
    public String stringValue;

    public void show() {
        System.out.println("JavaClass.show");
        System.out.println("intValue = " + intValue);
        System.out.println("stringValue = " + stringValue);
    }
}
