#include <iostream>
using namespace std;

int main()
{
    int num1, num2, choice = 0;
    cout << "Arithmetic operation\n1.Addition  2.Subtraction  3.Multiplication  4.Division  5.Exit" << endl;
    cout << "Enter numbers:" << endl;
    cin >> num1 >> num2;
    do
    {
        cout << "Enter your choice:" << endl;
        cin >> choice;
        switch (choice)
        {
        case 1:
            cout << num1 << " + " << num2 << " = " << num1 + num2 << endl;
            break;
        case 2:
            cout << num1 << " - " << num2 << " = " << num1 - num2 << endl;
            ;
            break;
        case 3:
            cout << num1 << " * " << num2 << " = " << num1 * num2 << endl;
            break;
        case 4:
            cout << num1 << " / " << num2 << " = " << num1 / num2 << endl;
            break;
        case 5:
            cout << "Program ended" << endl;
            break;
        }

    } while (choice != 5);
    return 0;
}
