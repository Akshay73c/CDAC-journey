#include <iostream>
using namespace std;

class Employee2
{
	static int idGenerator;
	int id;
	string name;
	double basicSalary, HRA, medical = 2000, PF, PT, netSalary, grossSalary;

public:
	//	Constrs
	Employee2()
	{
		cout << "------Default of Employee called------" << endl;
		id = ++idGenerator;
		name = "John Doe";
		basicSalary = 0;
	}

	Employee2(string name, double basicSalary)
	{
		this->id = ++idGenerator;
		this->name = name;
		this->basicSalary = basicSalary;
		this->HRA = (basicSalary / 2);
		this->PT = (basicSalary * 12) / 100;
		this->PF = 200;
		this->grossSalary = basicSalary + this->HRA + this->medical;
		this->netSalary = this->grossSalary - this->PT - this->PF;
		cout << "Employee created using parameterized constr!" << endl;
	}

	double calculateGrossSal()
	{
		return this->grossSalary;
	}
	double calculateNetSal()
	{
		return this->netSalary;
	}

	//	display
	void display()
	{
		cout << "----Display Employee--------" << endl;
		cout << "Employee: " << id << endl;
		cout << "Name " << name << endl;
	}
};

int Employee2 ::idGenerator = 1000;

int main()
{

	double salary;
	string name;
	cout << "Enter name: ";
	cin >> name;
	cout << "Enter Salary: ";
	cin >> salary;

	Employee2 emp(name, salary);
	emp.display();
	cout << "Gross salary: Rs." << emp.calculateGrossSal() << endl;
	cout << "Net salary: Rs." << emp.calculateNetSal() << endl;
	return 0;
}
