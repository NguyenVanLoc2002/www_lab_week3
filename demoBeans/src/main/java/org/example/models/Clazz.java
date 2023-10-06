package org.example.models;

public class Clazz {
    private String classId;
    private String className;

    public Clazz(String classId, String className) {
        this.classId = classId;
        this.className = className;
    }

    public Clazz() {
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Class{" +
                "classId='" + classId + '\'' +
                ", className='" + className + '\'' +
                '}';
    }
}
