package com.stream.Composite_Pattern;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartment implements  Department{

    private String name;
    private Integer id;
    private List<Department> listDepartmentList = new ArrayList<>();

    public HeadDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.listDepartmentList = new ArrayList<>();
    }

    public void printDepartmentName() {
        listDepartmentList.forEach(Department::printDepartmentName);
    }

    public void addDepartment(Department department) {
        listDepartmentList.add(department);
    }

    public void removeDepartment(Department department) {
        listDepartmentList.remove(department);
    }
}
