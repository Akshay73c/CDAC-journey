#include <iostream>
using namespace std;

class Date {
	int day, month, year;
		
//	Default
public:
	Date() {
		day = 1;
		month = 1;
		year = 2000;
	}
//	Parametrized constr
	Date(int day, int month, int year) {
		this -> day = day;
		this -> month = month;
		this -> year = year;
	}
	
	void display() {
		cout << "----Display date--------" << endl;
		cout << "Date is " << day << "-" << month << "-" << year << endl;
	}
	
};



int main2() {
	Date s1;
	s1.display();
	Date s2(13, 4, 2005);
	s2.display();
	return 0;
}
