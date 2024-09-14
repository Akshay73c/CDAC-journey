// conatins implementations of Worker class from Employees.h

#include <iostream>
#include "Employees.h"
using namespace std;

// constrs
Worker ::Worker()
{
    hourlyRate = 50.0;
    hoursWorked = 4;
}

Worker ::Worker(int id, string name, int deptId, double basicSalary, int houseWorked, float hourlyRate) : Emp(id, name, deptId, basicSalary)
{
    this->hourlyRate = hourlyRate;
    this->hoursWorked = hoursWorked;
}

// methods

double Worker::computeNetSalary()
{
    return this->basicSalary + (hourlyRate * hoursWorked);
}
