#include <iostream>
#include "Employees.h"
#include <typeinfo.h>
using namespace std;

int main()
{
    cout << "-------Welcome to Organization-------" << endl;

    Emp *arr[20];

    int ch, index = 0;
    cout << "1.Hire manager\n2.Hire Worker\n3.Display all employees' details\n4.Exit" << endl;
    do
    {
        cout << "Enter choice ";
        cin >> ch;
        switch (ch)
        {
        case 1:
        {

            cout << "-------Hire manager-------" << endl;
            int deptId;
            string name;
            double basicSalary, perfBonus;
            cout << "Enter name: ";
            cin >> name;
            cout << "Enter deptId of the dept for manager: ";
            cin >> deptId;
            cout << "Enter basic Salary: ";
            cin >> basicSalary;
            cout << "Enter performance bonus: ";
            cin >> perfBonus;

            Mgr *manager = new Mgr(name, deptId, basicSalary, perfBonus); // ptr of child class Mgr
            arr[index] = manager;                                         // upcasting implicit
            index++;
            break;
        }
        case 2:
        {

            cout << "-------Hire Worker-------" << endl;
            int deptId, hoursWorked;
            string name;
            double basicSalary;
            float hourlyrate;
            cout << "Enter name: ";
            cin >> name;
            cout << "Enter deptId of dept of manager: ";
            cin >> deptId;
            cout << "Enter basic Salary: ";
            cin >> basicSalary;
            cout << "Enter hourlyRate  ";
            cin >> hourlyrate;
            cout << "Enter hours Worked  ";
            cin >> hoursWorked;

            Worker *worker = new Worker(name, deptId, basicSalary, hoursWorked, hourlyrate); // ptr of child class Worker
            arr[index] = worker;
            index++;
            break;
        }

        case 3:
            // Here we've to do dynamic downcasting
            for (int i = 0; i < index; i++)
            {
                // find type of ref stored at runtime using typeid()
                if (typeid(*arr[i]) == typeid(Mgr))
                {
                    // downcast basePtr to childPtr-Mgr
                    Mgr *mgrPtr = dynamic_cast<Mgr *>(arr[i]);
                    cout << "Manager Name: " << mgrPtr->getName() << endl;
                    cout << "Salary is: " << mgrPtr->computeNetSalary() << endl;
                }
                if (typeid(*arr[i]) == typeid(Worker))
                {
                    // downcast basePtr to childPtr-Worker
                    Worker *workerPtr = dynamic_cast<Worker *>(arr[i]);
                    cout << "Worker Name: " << workerPtr->getName() << endl;
                    cout << "Salary is: " << workerPtr->computeNetSalary() << endl;
                }
            }

            break;

        default:
            break;
        }
    } while (ch != 4);
}