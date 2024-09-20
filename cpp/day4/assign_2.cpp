#include <iostream>
using namespace std;

// Date class - named as Date2
class Date2
{
	int day, month, year;

	//	Default
public:
	Date2()
	{
		day = 1;
		month = 1;
		year = 1111;
	}
	//	Parametrized constr
	Date2(int day, int month, int year)
	{
		this->day = day;
		this->month = month;
		this->year = year;
	}

	//	setters
	void setDay(int day)
	{
		this->day = day;
	}
	void setMonth(int month)
	{
		this->month = month;
	}
	void setYear(int year)
	{
		this->year = year;
	}

	void dateDisplay()
	{
		cout << "Date is " << day << "-" << month << "-" << year << endl;
	}
};

class Employee
{
	int id;
	string name;
	Date2 dob;
	static int idGenerator;

public:
	//	defauylt constr
	Employee()
	{
		cout << "------Default constr of Employee called------" << endl;
		id = ++idGenerator;
		name = "John Doe";
		dob = Date2();
	}

	Employee(string name, int day, int month, int year)
	{
		cout << "------Parameterized constr of Employee called------" << endl;
		this->id = ++idGenerator;
		this->name = name;
		this->dob = Date2(day, month, year);
	}
	//		setters

	void setDate(int i, int j, int k)
	{

		dob.setDay(i);
		dob.setMonth(j);
		dob.setYear(k);
	}

	// made this fxn static to be able to get called without object
	static Employee accept()
	{
		string name;
		cout << "Enter name of employee: ";
		cin >> name;
		cout << "Enter date of birth as dd mm yyyy: ";
		int dd, mm, yy;
		cin >> dd >> mm >> yy;
		Employee emp(name, dd, mm, yy);
		return emp;
	}
	//	display
	void display()
	{
		cout << "----Display Employee--------" << endl;
		cout << "Employee: \nid: " << id << endl;
		cout << "Name " << name << endl;

		dob.dateDisplay();
	}
};

int Employee::idGenerator = 1000;

int main()
{
	cout << "----Employee creation----" << endl;
	Employee myEmp = Employee::accept(); // accept info
	myEmp.display();					 // display info
	return 0;
}
