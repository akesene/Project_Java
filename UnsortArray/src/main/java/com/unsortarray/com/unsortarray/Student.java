/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unsortarray.com.unsortarray;

/**
 *
 * @author ak
 */

public class Student {

//  declare variable
    private String name;
    private String studentId;
    private String studentGpa;

// student class constructor.
    public Student(String name, String studentId, String studentGpa) {
        this.name = name;
        this.studentId = studentId;
        this.studentGpa = studentGpa;

        }

    // to string method to return the all the values of the student
       public String toString () {
        // declare a variable data
           String data = ("name is : " + name +
                   "\nstudent ID  is : "
                   + studentId + "\n student ID is : "
                   + studentGpa);
           return  data;
        }
        // clone the student class and make a deepcopy of the data
        public  Student  deepCopy (){
        Student clone = new Student(name, studentId, studentGpa);
        return clone;
    }
// compare string !!!
     public int compareTo(String key){
        return ( name.compareTo(key));

    }
//     implement set method name
      public void setName(String name) {
        this.name = name;
    }
//     implement set method student ID

      public void setStudentId (String studentId){
        this.studentId = studentId;
    }
//     implement set method student GPA

        public void  setStudentGpa(String studentGpa){
        this.studentGpa = studentGpa;
    }

// define a get class for name
     public String getName(){

        return name;
    }
// define a get class for student ID
     public String getStudentId (){
        return studentId;
    }

// define a get class

      public String getStudentGpa(){
        return studentGpa;
    }


}
