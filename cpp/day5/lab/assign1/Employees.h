// This file conatins declarations
//  1 Solve this.
//  Fresh business scenario to apply inheritance , polymorphism   to emp based organization scenario.

#include <iostream>
using namespace std;

class Emp
{
private:
    static int idGenerator;
    int id, deptId;
    string name;

protected:
    double basicSalary;

    // Constrs
public:
    Emp();
    Emp(string name, int deptId, double basicSalary);

    // Methods
    virtual double computeNetSalary();
    string getName();
};

//________________________________________________________________________________

class Mgr : public Emp
{
private:
    double perfBonus;

public:
    // constrs
    Mgr();
    Mgr(string name, int deptId, double basicSalary, double perfBonus);

    // methods
    double computeNetSalary();
};

//________________________________________________________________________________
class Worker : public Emp
{
private:
    int hoursWorked;
    float hourlyRate;

public:
    Worker();
    Worker(string name, int deptId, double basicSalary, int houseWorked, float hourlyRate);

    // methods
    double computeNetSalary();

    // Getters
    float getHourlyRate();
};