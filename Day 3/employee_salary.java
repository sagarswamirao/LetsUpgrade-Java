// Questions 2:
// Take employee name,date of birth,month of birth
// birth year, monthly salary;
// 5l - 20%;
// 4l - 15%;
// 3l- 10%;
// 2l -5%;
// Display name,age,annual salary and the tax amount

// ------------------------------------------------------------------------------------------------

package employee_salary;

import java.util.Scanner;

public class employee_salary {

    public static void main(String[] args) {
        
        String emp_name;
        int date_of_birth, month_of_birth, year_of_birth, monthly_salary;
        int age, annual_salary;
        double tax_amount;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Name of the Employee :");
        emp_name = sc.next();
        
        System.out.println("Enter the DOB (Date, Month, Year) :");
	date_of_birth = sc.nextInt();
	month_of_birth = sc.nextInt();
	year_of_birth = sc.nextInt();
	
	System.out.println("Enter the Monthly Salary :");
	monthly_salary = sc.nextInt();
		
	annual_salary = monthly_salary * 12;
	
	if(annual_salary >= 500000){
            tax_amount = 0.20 * annual_salary;
	}
	else if(annual_salary >= 400000){
            tax_amount = 0.15 * annual_salary;
        }
        else if(annual_salary >= 300000){
            tax_amount = 0.10 * annual_salary;
        }
        else if(annual_salary >= 200000){
            tax_amount = 0.05 * annual_salary;
        }
        else{
            tax_amount = 0;
        }
        
        System.out.println("Employee Name : "+emp_name);
        age = 2020 - year_of_birth;
        System.out.println("Employee Age : "+age);
        System.out.println("Employee Annual Salary : "+annual_salary);
        System.out.println("Employee Tax Amount : "+tax_amount);
        
    }
    
}
