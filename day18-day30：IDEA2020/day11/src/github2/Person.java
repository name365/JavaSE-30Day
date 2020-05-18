package github2;

/**
 * @author subei
 * @create 2020-05-18 10:27
 */
@MyAnnotation(value="java")
public class Person extends Creature<String> implements Comparable<String>,MyInterface{

    private String name;
    int age;
    public int id;

    public Person() {
    }

    @MyAnnotation(value="C++")
    Person(String name){
        this.name = name;
    }

    private Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    @MyAnnotation
    private String show(String nation){
        System.out.println("我来自" + nation + "星系");
        return nation;
    }

    @Override
    public void info() {
        System.out.println("火星喷子");
    }

    public String display(String interests,int age) throws Exception{
        return interests + age;
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
