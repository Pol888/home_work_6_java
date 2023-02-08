//package org.example;
//
//import java.util.Objects;
//
//public class worker {
//    int id;
//    int salary;
//    String firstName;
//    String lastName;
//
//    @Override // вывод
//    public String toString() {
//        String info = String.format("%d - %s, %s, %d", id, firstName, lastName, salary);
//        return info;
//    }
//
//    @Override // сравнение
//    public boolean equals(Object obj) {
//        worker t = (worker) obj;
//        return id == t.id && Objects.equals(firstName, t.firstName);
//    }
//
//    @Override  // получение hashCode( по id )
//    public int hashCode() {
//        return id;
//    }
//
//static void f(){
//    worker a = new worker();
//
//    a.id = 1;
//    a.salary = 100;
//    a.firstName = "Olia";
//    a.lastName = "Pedre";
//
//    worker b = new worker();
//    b.id = 2;
//    b.salary = 300;
//    b.firstName = "Olia";
//    b.lastName = "Loo";
//
//
//    System.out.println(a.hashCode()); System.out.println(b.hashCode());
//}
//
//
//
//
//}
//