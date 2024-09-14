// conatins implementations of Mgr class from Employees.h

#include <iostream>
#include "Employees.h"
using namespace std;

// constrs
Mgr::Mgr()
{
    perfBonus = 5000;
}

Mgr::Mgr(int id, string name, int deptId, double basicSalary, double perfBonus) : Emp(id, name, deptId, basicSalary)
{
    this->perfBonus = perfBonus;
}

// methods
double Mgr::computeNetSalary()
{
    return basicSalary + perfBonus;
}
