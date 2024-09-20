// has If-else problems and switch statements, loops - do while
#include <iostream>
using namespace std;

int main()
{
    int ch;
    cout << "1.Even-odd \n2.Num divisible by 5 and 7 \n3.Income tax from salary \n ";
    do
    {
        cout << "Enter choice ";
        cin >> ch;
        switch (ch)
        // Added scoping {} to cases avoid runtime errors
        {
        case 1:
        {
            cout << "----Even-odd-----\n";

            int num;
            cout << "Enter number to check even or odd: ";
            cin >> num;
            if (num % 2 == 0)
                cout << "Even" << endl;
            else
                cout << "Odd" << endl;
            break;
        }

        case 2:
        {
            cout << "----Divisibility-----\n";
            int num;
            cout << "Enter number to check if divisible by 5 and 7: ";
            cin >> num;
            if ((num % 5 == 0) && (num % 7 == 0))
                cout << "Divisible by both 5 and 7" << endl;
            else
                cout << "Not divisible by both 5 and 7" << endl;
            break;
        }

        case 3:
        {
            cout << "----Salary taxes-----\n";
            int sal;
            cout << "Enter your salary: ";
            cin >> sal;
            if (sal <= 150000)
                cout << "Tax = 0" << endl;
            else if (sal > 150000 && sal < 300000)
                cout << "Tax is 20% : Rs. " << sal * 20 / 100 << endl;
            else if (sal > 300000)
                cout << "Tax is 30% : Rs. " << sal * 30 / 100 << endl;
            break;
        }
        }

    } while (ch != 0);
}