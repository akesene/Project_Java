

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unsortarray.com.unsortarray;

import java.util.Scanner;

/**
 *
 * @author ak
 */
public class UnsortedClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //  use the scanner class  to take in user input
        Scanner inputFromUser = new Scanner(System.in);

        System.out.println("input the maximum dataset."); // specify a maximum number of dataset
        int userSize = Integer.parseInt(inputFromUser.nextLine());
        // creating a sortedarray object.
        UnsortedArray myarr = new   UnsortedArray(userSize);
        System.out.println("input intial number of student: ");
        int numberOfStudent = Integer.parseInt(inputFromUser.nextLine());

        if(numberOfStudent > userSize){
            numberOfStudent = userSize;

        }
        Student firstStudent = new Student("", "", "");

// using a while to loop accross the user input statement
        while(numberOfStudent > 0){
            System.out.println("input Student name:");
            String studentName = inputFromUser.nextLine();
            System.out.println("input Student ID:");
            String studentID = inputFromUser.nextLine();
            System.out.println("input Student GPA:");
            String studentGPA = inputFromUser.nextLine();
            firstStudent.setName(studentName);
            firstStudent.setStudentGpa(studentGPA);
            firstStudent.setStudentId(studentID);

            myarr.insert(firstStudent);
            numberOfStudent = numberOfStudent - 1;

        }

        boolean makeSelectOnProgram = true;
        while(makeSelectOnProgram) {
// print statement about the various options available.
            System.out.println("make your  selection");
            System.out.println("1 = insert");
            System.out.println("2 =  fetch");
            System.out.println("3 = delete ");
            System.out.println("4 = update");
            System.out.println("5 = output");
            System.out.println("6  = exiting ");
            String userChoice = inputFromUser.nextLine();

// implementing switch case  for processs user input
            switch (userChoice) {

                case "1":
                    makeSelectOnProgram = true;
                    myarr.insert(firstStudent);
                    System.out.println(myarr.insert(firstStudent));
                    break;

                case "2":
                    makeSelectOnProgram = true;
                    myarr.fetch(firstStudent.getName());
                    System.out.println(myarr.fetch(firstStudent.getName()));
                    break;

                case "3":
                    makeSelectOnProgram = true;
                    myarr.delete(firstStudent.getName());
                    System.out.println(firstStudent.getName());
                    break;

                case "4":
                    makeSelectOnProgram = true;
//                    myarr.update();

                case "5":
                    makeSelectOnProgram = true;
                    myarr.showAll();
                    break;
//

                case "6":
                    makeSelectOnProgram = false;
                    inputFromUser.close();
                    System.out.println("system is closing ");

// default if no method is selected !!!
                default :
                    inputFromUser.close();
                    System.out.println("wrong selection try again");

            }


        }
    }
    
}
