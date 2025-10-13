package org.example;


import org.example.entity.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        LinkedList<Employee> employees = new LinkedList<>();

        employees.add(new Employee(1, "John", "Doe"));
        employees.add(new Employee(1, "Dogancan", "Doe"));
        employees.add(new Employee(2, "Jane", "Smith"));
        employees.add(new Employee(3, "Mike", "Brown"));
        employees.add(new Employee(3, "John", "Doe"));

    }

    public static List<Employee> findDuplicates(List<Employee> employees){
        Set<Employee> tempList = new HashSet<>();
        List<Employee> duplicateEmployees = new ArrayList<>();
        for(Employee e:employees){
            if(!tempList.add(e)){
                duplicateEmployees.add(e);
            }
        }
        System.out.println(duplicateEmployees.toString());
        return duplicateEmployees;
    }

    public static Map<Integer,Employee> findUniques(List<Employee> employees){
        Map<Integer, Employee> uniqueMap = new HashMap<>();
        for(Employee e:employees){
            if(e!=null){
                uniqueMap.put(e.getId(),e);
            }
        }
        System.out.println(uniqueMap);
        return uniqueMap;
    }

    public static List<Employee> removeDuplicates(List<Employee> employees){
        Set<Employee> templist = new HashSet<>();
        Set<Employee> duplicatesEmployees = new HashSet<>();
        for(Employee e: employees){
            if(!templist.add(e)){
                duplicatesEmployees.add(e);
            }
        }
        templist.removeAll(duplicatesEmployees);
        List<Employee> resultList = new ArrayList<>(templist);
        System.out.println(resultList.toString());
        return resultList;
    }

}