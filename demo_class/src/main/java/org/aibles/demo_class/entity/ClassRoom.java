package org.aibles.demo_class.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
//@Getter
//@Setter
@Table(name = "class_room")
public class ClassRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_class")
    private int id_class;

    @Column(name ="name_class")
    private String name_class;

    @Column(name ="department")
    private String department;

    @Column(name ="training_system")
    private String training_system;

    @Column(name ="year_of_admission")
    private int year_of_admission;

    @Column(name ="number_student")
    private int number_student;

    @Column(name ="id_department")
    private int id_department;

    public int getId_class() {
        return id_class;
    }

    public void setId_class(int id_class) {
        this.id_class = id_class;
    }

    public String getName_class() {
        return name_class;
    }

    public void setName_class(String name_class) {
        this.name_class = name_class;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTraining_system() {
        return training_system;
    }

    public void setTraining_system(String training_system) {
        this.training_system = training_system;
    }

    public int getYear_of_admission() {
        return year_of_admission;
    }

    public void setYear_of_admission(int year_of_admission) {
        this.year_of_admission = year_of_admission;
    }

    public int getNumber_student() {
        return number_student;
    }

    public void setNumber_student(int number_student) {
        this.number_student = number_student;
    }

    public int getId_department() {
        return id_department;
    }

    public void setId_department(int id_department) {
        this.id_department = id_department;
    }

//    @Override
//    public String toString() {
//        return "Class{" +
//                "id_class=" + id_class +
//                ", name_class='" + name_class + '\'' +
//                ", department='" + department + '\'' +
//                ", training_system='" + training_system + '\'' +
//                ", year_of_admission='" + year_of_admission + '\'' +
//                ", number_student='" + number_student + '\'' +
//                ", id_department='" + id_department + '\'' +
//                '}';
//    }
}
