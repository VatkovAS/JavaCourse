package ru.turing.courses.lesson3;


import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Registry<Student> studentRegistry = new Registry<>();

        Student anton = new Student("Anton", 20);
        Student sofia = new Student("Sofia", 22);
        Student nikolai = new Student("Nikolai", 88);

        studentRegistry.add(anton.GetName(), anton);
        studentRegistry.add(sofia.GetName(), sofia);
        studentRegistry.add(nikolai.GetName(), nikolai);

        Student student1 = studentRegistry.getByKey(anton.GetName());

        System.out.println("Student 1: " + student1);


        Student removedStudent = studentRegistry.removeByKey(sofia.GetName());
        System.out.println("Removed Student: " + removedStudent);

        //Удаляем студентов по значению (может быть несколько студентов с одинаковым возрастом)
        List<String> removedKeys = studentRegistry.removeByValue(new Student("", 22));
        System.out.println("Removed Students with age 22, Keys: " + removedKeys);

        //Получаем всех студентов с именем "Anton"
        List<Student> studentsWithNameAnton = studentRegistry.getByName("Anton");
        System.out.println("Students with name Anton: " + studentsWithNameAnton);

        //Проверяем наличие ключа
        System.out.println("Contains key '': " + studentRegistry.containsKey("Anton"));

        //Проверяем наличие значения
        System.out.println("Contains value with age 20: " + studentRegistry.containsValue(new Student("", 20)));

        //Очищаем реестр
        studentRegistry.clear();

        //Печатаем размер реестра после очистки
        System.out.println("Registry Size after clear: " + studentRegistry.size());
    }
}

class Student {
    private final String name;
    private final int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String GetName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}