package com.logicbig.example;

import java.util.Hashtable;

public enum createTree {
    instance;
    private final String ROLES[] =
            {"Los Angeles", "Santa Barbara", "San Deigo", "San Francisco", "Oakland"};
    private Hashtable<Object, Object> modules = new Hashtable<>();

    createTree() {
        addModule("Drifting", "Professional Drifers");
        addModule("Skateboarding", "Professional Skateboaders", "California");
        addModule("Surfing", "Professional Surfers", "California");
    }

    private void addModule(String module, String... projects) {
        for (String project : projects) {
            modules.put(module, getProject(module, project));
        }
    }

    private Object getProject(String module, String project) {
        Hashtable<Object, Object> projectMap = new Hashtable<>();
        projectMap.put(project, getEmployeesForProject(module, project));
        return projectMap;
    }

    private Object getEmployeesForProject(String module, String project) {
        //random example employees, in real app we will get it from backend
        String[] employees = new String[ROLES.length];
        for (int i = 0; i < ROLES.length; i++) {
            employees[i] = RandomUtil.getFullName() + " [" + ROLES[i] + "]";
        }
        return employees;
    }

    public Hashtable<?, ?> getProjectHierarchy() {
        return modules;
    }
}