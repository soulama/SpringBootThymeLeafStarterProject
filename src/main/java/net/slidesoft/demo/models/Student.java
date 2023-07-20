package net.slidesoft.demo.models;
import java.util.Objects;

public class Student {

    public Student() {
    }

    public Student(String studentId, String name, String tel, String email) {
        this.studentId = studentId;
        this.name = name;
        this.tel = tel;
        this.email = email;
    }

    public String getStudentId() {
        return this.studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return this.tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Student studentId(String studentId) {
        setStudentId(studentId);
        return this;
    }

    public Student name(String name) {
        setName(name);
        return this;
    }

    public Student tel(String tel) {
        setTel(tel);
        return this;
    }

    public Student email(String email) {
        setEmail(email);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Student)) {
            return false;
        }
        Student student = (Student) o;
        return Objects.equals(studentId, student.studentId) && Objects.equals(name, student.name) && Objects.equals(tel, student.tel) && Objects.equals(email, student.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, name, tel, email);
    }

    @Override
    public String toString() {
        return "{" +
            " studentId='" + getStudentId() + "'" +
            ", name='" + getName() + "'" +
            ", tel='" + getTel() + "'" +
            ", email='" + getEmail() + "'" +
            "}";
    }

    String studentId ;
    String name ;
    String tel ;
    String email ;

}
