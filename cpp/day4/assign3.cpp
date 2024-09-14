#include <iostream>
using namespace std;

class Employee2 {
	static int id;
	string name;
	double basicSalary, HRA, medical=2000, PF, PT, netSalary, grossSalary;

	public:
		//	defauylt constr
		Employee2() {
			cout<< "------default of Employee called------"<<endl;
			name = "NA";
			basicSalary = 0;
		}
		
		Employee2(string name, double basicSalary) {
			cout<< "------Parametrized of Employee called------"<<endl;
			this->name = name;
			this->basicSalary = basicSalary;
			this->HRA = (basicSalary/2);
			this->PT = (basicSalary*12) / 100;
			this->PF = 200;
			this->grossSalary = basicSalary + this->HRA + this->medical;
			this->netSalary = this->grossSalary - this->PT - this->PF;
			id++;
			
		}
		
//	display
		void display() {
			cout << "----Display Employee--------" << endl;
			cout << "Employee: " << id << endl;
			cout << "Name " << name << endl;
			cout << "grossSalary: " << this->grossSalary << endl;
			cout << "netSalary: " << this->netSalary << endl;
		}

};

int Employee2 :: id;

int main() {
	
//	for (int i=0; i< 4; i++) {
//		Employee2 emp("XYZ", 0.10);
//			emp.display();	
//	}
	double salary;
	string name;
	cout << "Enter name: ";
	cin >> name;
	cout << "Enter Salary: ";
	cin >> salary;
	
	Employee2 emp(name, salary);
	emp.display();

	return 0;
}
