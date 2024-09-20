// conatins implementations of Emp class from Employees.h

#include <iostream>
#include "Employees.h"
using namespace std;

// static var - idGenerator
int Emp::idGenerator = 100;

// constrs
Emp::Emp()
{
    id = ++idGenerator;
    name = "John Doe";
    deptId = 1;
    basicSalary = 20000;
}

Emp::Emp(string name, int deptId, double basicSalary)
{
    this->id = ++idGenerator;
    this->name = name;
    this->deptId = deptId;
    this->basicSalary = basicSalary;
}

// methods

double Emp::computeNetSalary()
{
    return this->basicSalary;
}

string Emp::getName()
{
    return this->name;
}
