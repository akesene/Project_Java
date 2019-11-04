/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unsortarray.com.unsortarray;
import java.util.Arrays;
/**
 *
 * @author ak
 */

public class UnsortedArray {
    private int size;
    private int next;
    private Student[] data;
    
    
    // defining a constructor
    public UnsortedArray(int size) { // int size
        this.size = size;
        this.next = 0;
        this.data = new Student[size];
    }

    // defined a insert method
    public boolean insert(Student newStudentAdd) {
        // defining
        if (next >= size)
            return false;

        data[next] = newStudentAdd.deepCopy();

        if (data[next] == null)
            return false;
        next = next + 1;
        return true;

    }
// defining a fetch method to return a specific key.
   public Student fetch(String key) {
        Student student;
        Student temp;
        int i = 0;
        while (i < next && !(data[i].compareTo(key) == 0)) {
            i++;
        }
        if (i == next)
            return null;
        student = data[i].deepCopy();

        if (i != 0) {
            temp = data[i - 1];
            data[i - 1] = data[i];
            data[i] = temp;

        }
        return student;
    }
    // defined  a delete method
    public boolean delete(String key){

        int i = 0;
        while(i < next && !(data[i].compareTo(key) == 0)){
            i++;
        }
        if(i == next)
            return  false;
        data[i] = data[next - 1];
        data[next - 1] = null;
        next = next - 1;
        return true;

    }
   // defined a update  method
    public boolean update (String key, Student newStudent){
        if(delete(key) == false)
            return false;
        else if (insert(newStudent) == false)
            return false;
        else
            return true;

    }

// defining showall method for the sorted array class.
   public  void  showAll() {

            for (int i = 0; i < next; i++){
                System.out.println(data[i]);
            }

        }
    }
