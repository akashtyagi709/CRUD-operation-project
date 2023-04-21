package com.akashtyagi;

import java.util.*;

class Employee {

     private int empno;
     private String ename;
     private int salary;

      Employee(int empno, String ename, int salary) {
         this.empno = empno;
         this.ename = ename;
         this.salary = salary;
     }

     public int getEmpno() {

          return empno;
     }

     public int getSalary() {
         return salary;
     }

     public String getEname() {
         return ename;
     }

     public String toString() {
         return empno + " " + ename + " " + salary;
     }
 }
 class CRUD{
     public static void main(String[] args) {

         List<Employee> c=new ArrayList<Employee>();
         Scanner  s=new Scanner(System.in);
         Scanner s1=new Scanner(System.in);
         Scanner s2 = new Scanner(System.in);
                  int  q;
                  do {
             System.out.println("1.INSERT");
             System.out.println("2.DISPLAY");
             System.out.println("3.SEARCH");
             System.out.println("4.DELETE");
             System.out.println("5.UPDATE");
             System.out.println("ENTER YOUR CHOICE : ");
             q =s.nextInt();
             switch (q){
                 case 1:
                     System.out.println("ENTER EMPLOYEE NUMBER : ");
                     int eno=s.nextInt();
                     System.out.println("ENTER EMPLOYEE NAME : ");
                     String ename=s1.nextLine();
                     System.out.println("ENTER EMPLOYEE SALARY : ");
                     int salary=s2.nextInt();
                     c.add(new Employee(eno,ename,salary));
                     break;

                 case 2:
                     System.out.println("------------------------------------------");
                     Iterator<Employee> i=c.iterator();
                     while (i.hasNext()){
                         Employee e=i.next();
                         System.out.println(e);
                     }
                     System.out.println("------------------------------------------");
                     break;
                 case 3:
                     boolean found =false;
                     System.out.println("ENTER  EMPNO TO SEARCH : ");
                     int empno = s.nextInt();
                     System.out.println("------------------------------------------");
                    i=c.iterator();
                     while (i.hasNext()) {
                         Employee e = i.next();
                        if (e.getEmpno() == e.getEmpno()) {
                             System.out.println(e);
                             found = true;
                         }
                     }
                     if (!found){
                         System.out.println("RECORD NOT FOUND");
                     }
                     System.out.println("------------------------------------------");
                     break;

                 case 4:
                     found =false;
                     System.out.println("ENTER  EMPNO TO DELETE : ");
                     empno = s.nextInt();
                 System.out.println("------------------------------------------");
                 i=c.iterator();
                 while (i.hasNext()) {
                     Employee e = i.next();
                     if (e.getEmpno() == e.getEmpno()) {
                         i.remove();
                         found = true;
                     }
                 }
                 if (!found){
                     System.out.println("RECORD NOT FOUND");
                 }
                 else {
                     System.out.println("RECORD IS DELETE SUCCESSFULLY.....! : ");
                 }
                 System.out.println("------------------------------------------");
                 break;

                 case 5:
                     found =false;
                     System.out.println("ENTER  EMPNO TO UPDATE : ");
                     empno = s.nextInt();
                     ListIterator<Employee>li=c.listIterator();
                     while (li.hasNext()) {
                         Employee e = li.next();
                         if (e.getEmpno() == e.getEmpno()) {
                             System.out.println("ENTER  NEW NAME :");
                             ename=s1.nextLine();
                             System.out.println("ENTER THE NEW SALARY :");
                             salary=s2.nextInt();
                             li.set(new Employee(empno,ename,salary));
                             found = true;
                         }
                     }
                     if (!found){
                         System.out.println("RECORD NOT FOUND");
                     }
                     else {
                         System.out.println("RECORD IS UPDATED SUCCESSFULLY.....! : ");
                      }
                      break;
             }
             }


         while (q!=0);
     }
 }
