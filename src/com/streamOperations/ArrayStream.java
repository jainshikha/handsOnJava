package com.streamOperations;


import java.util.*;
import java.util.stream.Collectors;

public class ArrayStream {
    public static void main(String[] args) {

        //emplyoo list name age
        //filter age >30
        ArrayList<Employee> employeesObje = new ArrayList<>();
        Employee e = new Employee(1, "emp1", 31, 1000);
        Employee e1 = new Employee(2, "emp2", 21, 1000);
        Employee e2 = new Employee(3, "emp3", 41, 1000);
        Employee e3 = new Employee(4, "emp4", 51, 1000);
        Employee e4 = new Employee(5, "emp5", 30, 1000);
        Employee e5 = new Employee(2, "emp2", 20, 10000);
        employeesObje.add(e);
        employeesObje.add(e1);
        employeesObje.add(e2);
        employeesObje.add(e3);
        employeesObje.add(e4);
        employeesObje.add(e5);

        employeesObje.stream().filter(emp -> emp.getAge() > 30).forEach(System.out::println);

        employeesObje.stream().sorted(Comparator.comparingInt(Employee::getAge)).forEach(System.out::println);

        System.out.println("distinct emp are: ");
        employeesObje.stream().distinct().forEach(System.out::println);

        //[ [2, 3, 5], [7, 11, 13], [17, 19, 23] ]
        List<Integer> listOfList = Arrays.asList(2, 3, 5);
        List<Integer> listOfList2 = Arrays.asList(7, 11, 13);
        List<List<Integer>> allList = Arrays.asList(listOfList, listOfList2);
        allList.stream().flatMap(l -> l.stream()).forEach(System.out::println);

        String name = "sachin sachin rahul surabh";
        List<String> names = new ArrayList<>(Arrays.asList(name.split(" ")));
        Map<Object, Long> nameStartsWith = new LinkedHashMap<>();

        nameStartsWith = names.stream()
                .collect(Collectors.groupingBy(k -> k, Collectors.counting()));
        System.out.println("names: " + nameStartsWith);
        //output names: {surabh=1, rahul=1, sachin=2}  duplicate and count
    }
}
