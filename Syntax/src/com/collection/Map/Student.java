package com.collection.Map;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private String name;
    private int stuId;

    public Student() {
    }

    public Student(String name, int stuId) {
        this.name = name;
        this.stuId = stuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return stuId == student.stuId && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, stuId);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", stuId=" + stuId +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        int n1 = this.stuId-o.getStuId();
        return n1;
    }
}
