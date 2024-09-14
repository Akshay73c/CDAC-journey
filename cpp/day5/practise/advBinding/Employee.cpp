#include <iostream>
using namespace std;

class Employee
{
protected:
    int id, salary;
    string name;

public:
    Employee()
    {
        id = 0;
        name = "John Doe";
        salary = 20000;
    }

    Employee(int id, string name, int salary)
    {
        this->id = id;
        this->name = name;
        this->salary = salary;
    }

    // methods
    void display()
    {
        cout << "Employee details: " << name << "  id " << id << "  salary " << salary << endl;
    }
    void calSalary()
    {
        cout << "Basic employee's Salary: " << salary << endl;
    }
};

class Manager : public Employee
{
private:
    int incentive;
    string deptName;

public:
    Manager()
    {
        incentive = 10000;
        deptName = "Account";
    }

    // Parameterized
    Manager(int id, int salary, string name, int incentive, string deptName) : Employee(id, name, salary)
    {
        this->incentive = incentive;
        this->deptName = deptName;
    }

    // methods
    void display()
    {
        // this->display();
        cout << "and salary " << salary << " with incentive " << incentive << endl;
    }

    void calSalary()
    {
        cout << "Manager's salary: " << this->salary + incentive << endl;
    }
};

int main()
{
    // Employee emp;
    // emp.display();
    // emp.calSalary();

    Manager mgr(1, 50000, "Akshay", 20000, "Software");
    mgr.display();
    mgr.calSalary();

    return 0;
}
