#include <iostream>
using namespace std;
#include <string.h>

#include "Employee.h"

Employee ::Employee()
{
    // Default constr
    id = 0;
    name = "John Doe";
    salary = 10000;
}

void Employee ::displayEmployee()
{
    cout << "Employee details: " << id << " Name " << name << endl;
}

int main()
{
    return 0;
}