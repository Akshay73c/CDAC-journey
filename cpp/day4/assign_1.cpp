#include <iostream>
using namespace std;

class Date
{
	int day, month, year;

	//	Default
public:
	Date()
	{
		day = 1;
		month = 1;
		year = 2000;
	}
	//	Parametrized constr
	Date(int day, int month, int year)
	{
		this->day = day;
		this->month = month;
		this->year = year;
	}

	void display()
	{
		cout << "----Display date--------" << endl;
		cout << "Date is " << day << "-" << month << "-" << year << endl;
	}
};

int main()
{
	cout << "----Constructors----" << endl;
	cout << "Using default constr" << endl;
	Date s1;
	s1.display();
	cout << "Using parameterized constr" << endl;
	Date s2(15, 4, 2024);
	s2.display();
	return 0;
}
