package org.example;


import org.example.entity.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        LinkedList<Employee> employeeList = new LinkedList<>();

        employeeList.add(new Employee(1, "John", "Doe"));
        employeeList.add(new Employee(1, "Dogancan", "Doe"));
        employeeList.add(new Employee(2, "Jane", "Smith"));
        employeeList.add(new Employee(3, "Mike", "Brown"));
        employeeList.add(new Employee(3, "John", "Doe"));
        findDublicates(employeeList);
    }

    public static List<Employee> findDublicates(List<Employee> employeeList){
        Set<Employee> tempList = new HashSet<>();
        List<Employee> duplicateEmployees = new ArrayList<>();
        for(Employee e:employeeList){
            if(!tempList.add(e)){
                duplicateEmployees.add(e);
            }
        }
        System.out.println(duplicateEmployees.toString());
        return duplicateEmployees;
    }

    public static Map<Integer,Employee> findUniques(List<Employee> employeeList){
        Map<Integer, Employee> uniqueMap = new HashMap<>();
        for(Employee e:employeeList){
            if(e!=null){
                uniqueMap.put(e.getId(),e);
            }
        }
        System.out.println(uniqueMap);
        return uniqueMap;
    }

    public static List<Employee> removeDuplicates(List<Employee> employeeList){
        Set<Employee> templist = new HashSet<>();
        Set<Employee> duplicatesEmployees = new HashSet<>();
        for(Employee e: employeeList){
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