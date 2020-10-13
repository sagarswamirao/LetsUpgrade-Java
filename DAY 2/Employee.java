package com.sagarswamirao;

// Questions 1:
// Create a class employee. Inside that class create three variable name,age,city. Also create a function to
// display the three variables. In the main function create two objects and call the function using it.
// Output:
/*--- Employee Details ---
        The Name is : Nikki
        The Age is : 23
        The City is : Mysusru
        The Name is : Sagar Swami Rao
        The Age is : 22
        The City is : Bengaluru*/

public class Employee {

    String name, city;
    int age;

    public void display() {

        System.out.println("The Name is : " +name);
        System.out.println("The Age is : " +age);
        System.out.println("The City is : " +city);

    }

    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.name = "Nikki";
        emp1.age = 23;
        emp1.city = "Mysusru";

        Employee emp2 = new Employee();
        emp2.name = "Sagar Swami Rao";
        emp2.age = 22;
        emp2.city = "Bengaluru";

        System.out.println("--- Employee Details ---");
        emp1.display();
        emp2.display();
    }

}

