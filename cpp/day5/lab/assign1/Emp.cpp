// conatins implementations of Emp class from Employees.h

#include <iostream>
#include "Employees.h"
using namespace std;

// constrs
Emp::Emp()
{
    id = 1;
    name = "John Doe";
    deptId = 1;
    basicSalary = 20000;
}

Emp::Emp(int id, string name, int deptId, double basicSalary)
{
    this->id = id;
    this->name = name;
    this->deptId = deptId;
    this->basicSalary = basicSalary;
}

// methods

double Emp::computeNetSalary()
{
    return this->basicSalary;
}
