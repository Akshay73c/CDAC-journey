// 1 Solve this.
// Fresh business scenario to apply inheritance , polymorphism   to emp based organization scenario.

#include <iostream>
using namespace std;

class Emp
{
private:
    int id, deptId;
    string name;

protected:
    double basicSalary;

    // Constrs
public:
    Emp();
    Emp(int id, string name, int deptId, double basicSalary);

    // Methods
    double computeNetSalary();
};

//_________________________________________________________________________________________________________

class Mgr : public Emp
{
private:
    double perfBonus;

public:
    // constrs
    Mgr();
    Mgr(int id, string name, int deptId, double basicSalary, double perfBonus);

    // methods
    double computeNetSalary();
};

//______________________________________________________________________________________________________

class Worker : public Emp
{
private:
    int hoursWorked;
    float hourlyRate;

public:
    Worker();
    Worker(int id, string name, int deptId, double basicSalary, int houseWorked, float hourlyRate);

    // methods
    double computeNetSalary();

    // Getters
    float getHourlyRate();
};