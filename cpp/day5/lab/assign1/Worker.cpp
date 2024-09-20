// conatins implementations of Worker class from Employees.h

#include <iostream>
#include "Employees.h"
using namespace std;

// constrs
Worker ::Worker()
{
    // Default values
    hourlyRate = 50.0;
    hoursWorked = 4;
}

Worker ::Worker(string name, int deptId, double basicSalary, int hoursWorked, float hourlyRate) : Emp(name, deptId, basicSalary)
{
    this->hourlyRate = hourlyRate;
    this->hoursWorked = hoursWorked;
}

// methods

double Worker::computeNetSalary()
{
    double totSalary = (hourlyRate * hoursWorked) + this->basicSalary;
    return totSalary;
}
