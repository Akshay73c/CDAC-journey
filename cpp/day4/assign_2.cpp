#include <iostream>
using namespace std;

class Date2 {
	int day, month, year;
		
//	Default
public:
	Date2() {
		day = 1;
		month = 1;
		year = 1111;
	}
//	Parametrized constr
	Date2(int day, int month, int year) {
		this -> day = day;
		this -> month = month;
		this -> year = year;
	}
	
//	setters
	void setDay(int day) {
		this -> day = day;
	} 
	void setMonth(int month) {
		this -> month = month;
	}
	void setYear(int year) {
		this -> year = year;
	}
	
	void dateDisplay() {
		cout << "Date is " << day << "-" << month << "-" << year << endl;
	}
	
};

class Employee {
	int id;
	Date2 d1;
	string name;
	

	public:
		//	defauylt constr
		Employee() {
			cout<< "------default of Employee called------"<<endl;
			id = 100;	
			name = "A";
		}
//		setters
		void setId(int id) {
			this -> id = id;
		}
 
	void setName(string name) {
		this -> name = name;
	}
	
	
	void setDate(int i, int j, int k){
	
		d1.setDay(i);
		d1.setMonth(j);		
		d1.setYear(k);
	}
		
		void accept() {
			cout << "Enter id ";
			cin >> id;
			cout << "Enter date";
			int dd, mm, yy;
			cin >> dd >> mm >> yy;
			setDate(dd, mm, yy);
			cout << "Enter name";
			cin >> name;
					
		}
//	display
	void display() {
		cout << "----Display Employee--------" << endl;
		cout << "Employee: " << id<<endl;
		d1.dateDisplay();
		cout << "Name " << name;
	}

};

int main1() {
	Employee emp1;
	emp1.accept();
	emp1.display();
	return 0;
}
