#include <iostream>
#include "Employees.h"
using namespace std;

int main()
{
    cout << "-------Welcome to Organization-------" << endl;

    Emp arr[20];

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
            int id = 1, deptId;
            string name;
            double basicSalary, perfBonus;
            cout << "Enter name: ";
            cin >> name;
            cout << "Enter deptId of dept of manager: ";
            cin >> deptId;
            cout << "Enter basic Salary: ";
            cin >> basicSalary;
            cout << "Enter performance bonus: ";
            cin >> perfBonus;

            Emp *empPtr;
            Mgr manager = Mgr(id, name, deptId, basicSalary, perfBonus);
            empPtr = &manager;
            Mgr *mgrPtr = static_cast<Mgr *>(empPtr);
            arr[index] = *mgrPtr;
            index++;
            break;
        }
        case 2:
        {

            cout << "-------Hire Worker-------" << endl;
            int id = 2, deptId, hoursWorked;
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

            Emp *empPtr;
            Worker worker = Worker(id, name, deptId, basicSalary, hoursWorked, hourlyrate);
            empPtr = &worker;
            Worker *workerPtr = static_cast<Worker *>(empPtr);
            arr[index] = *workerPtr;
            index++;
            break;
        }

        case 3:
            for (int i = 0; i < index; i++)
            {
                cout << "Net salary: " << arr[i].computeNetSalary() << endl;
            }

            break;

        default:
            break;
        }
    } while (ch != 4);
}