#include <iostream>
using namespace std;

int main()
{
    // Month from month number
    //  using if-else
    short month;
    cout << "Enter month number: ";
    cin >> month;
    if (month == 1)
        cout << "Month " << month << " is " << "January";
    else if (month == 2)
        cout << "Month " << month << " is " << "February";
    else if (month == 3)
        cout << "Month " << month << " is " << "March";
    else if (month == 4)
        cout << "Month " << month << " is " << "April";
    else if (month == 5)
        cout << "Month " << month << " is " << "May";
    else if (month == 6)
        cout << "Month " << month << " is " << "June";
    else if (month == 7)
        cout << "Month " << month << " is " << "July";
    else if (month == 8)
        cout << "Month " << month << " is " << "August";
    else if (month == 9)
        cout << "Month " << month << " is " << "September";
    else if (month == 10)
        cout << "Month " << month << " is " << "October";
    else if (month == 11)
        cout << "Month " << month << " is " << "November";
    else if (month == 12)
        cout << "Month " << month << " is " << "December";
    else
        cout << "Enter number between 0 and 12 :(";

    cout << "-----------------------------" << endl;
    // Even - odd
    int num;
    cout << "Enter num to check if even or odd: ";
    cin >> num;
    if (num % 2 == 0)
        cout << "Even";
    else
        cout << "Odd";

    cout << "-----------------------------" << endl;

    // Max-min betn 3 numbers
    // TODO
    int num1, num2, num3;
    cout << "Enter three numbers: " << endl;
    cin >> num1 >> num2 >> num3;
    if ((num1 > num2) && (num1 > num3))
    {
        cout << "Max element is " << num1 << endl;
        cout << "Min element is " << (num2 > num1 ? num1 : num2) << endl;
    }
    else if ((num2 > num1) && (num2 > num3))
    {
        cout << "Max element is " << num2 << endl;
        cout << "Min element is " << (num3 > num1 ? num1 : num3) << endl;
    }
    else if ((num3 > num1) && (num3 > num2))
    {
        cout << "Max element is " << num3 << endl;
        cout << "Min element is " << (num2 < num1 ? num2 : num1) << endl;
    }
}