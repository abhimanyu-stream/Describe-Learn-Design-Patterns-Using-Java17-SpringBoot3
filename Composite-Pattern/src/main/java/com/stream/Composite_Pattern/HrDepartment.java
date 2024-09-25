package com.stream.Composite_Pattern;

public class HrDepartment implements Department {

    private Integer id;
    private String name;

    public HrDepartment(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }
}