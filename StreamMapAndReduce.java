import java.lang.reflect.Member;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMapAndReduce {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("홍", 10, Student.Sex.MALE),
                new Student("김", 20, Student.Sex.FEMALE),
                new Student("이", 30, Student.Sex.FEMALE));

        double avg = studentList.stream().mapToInt(Student::getScore).average().orElse(0.0);
        System.out.println("avg = " + avg);

        Stream<Student> totalStream = studentList.stream();
        Function<Student, Student.Sex> classfier = Student::getSex;
        Collector<Student, ?, Map<Student.Sex, List<Student>>> collector = Collectors.groupingBy(classfier);
        Map<Student.Sex, List<Student>> mapBySex = totalStream.collect(collector);

        List<String> list = Arrays.asList(
                "this is a java book",
                "lambda exp",
                "java8 supports"
        );

        list.stream().filter(s -> s.toLowerCase().contains("java"))
                .forEach(a -> System.out.println(a));


        double average = studentList.stream().mapToInt(s -> s.getScore()).average().orElse(0.0);
        List<Members> members = Arrays.asList(
                new Members("홍길동", "개발자"),
                new Members("김나리", "디자이너"),
                new Members("김나리", "디자이너")
        );

        Map<String, List<String>> listg = members.stream()
                .collect(Collectors.groupingBy(
                        Members::getJob,
                        Collectors.mapping(Members::getName, Collectors.toList())));

        System.out.println(listg);


        List<Person> personList = Arrays.asList(
                new Person("유리", 20, "010-2341-2341"),
                new Person("짱구", 23, "010-1234-1234"),
                new Person("철수", 31, "010-3412-3412"),
                new Person("맹구", 32, null)
        );

        Map<String, Person> personMap = personList.stream().collect(
                Collectors.toMap(Person::getName, Function.identity())
        );

        Map<Integer, String> personIntMap = personList.stream().collect(
                Collectors.toMap(Person::getAge, Person::getName)
        );

        Map<String, Person> personTwentyFiveUp = personList.stream()
                .filter(p -> p.getAge() > 24)
                .collect(Collectors.toMap(
                        Person::getName, Function.identity()
        ));

//        Map<Integer, List<Person>> personLists = personList.stream();

    }
}

class Person {


    private String name;
    private int age;
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Person(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    // getter, setter 생략
}

class Members{
    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    private String name;
    private String job;

    public Members(String name, String job) {
        this.name = name;
        this.job = job;
    }
}


class Student{

    private String name;
    public enum Sex{
        FEMALE, MALE
    }

    private int score;
    public Sex sex;

    public Sex getSex(){
        return sex;
    }

    public String getName(){
        return this.name;
    }

    public int getScore(){
        return this.score;
    }

    public Student(String name, int score, Sex sex) {
        this.name = name;
        this.score = score;
        this.sex = sex;
    }
}

interface B{
    void dd();
    void asg();
}

class SS implements B {


    @Override
    public void dd() {

    }

    @Override
    public void asg() {

    }
}








