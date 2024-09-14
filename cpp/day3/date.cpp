// 1.
// * Create a class Date with data members as dd, mm, yy.
// * Write a method   acceptDate(inti,int j,int k) fro assigning day month year;
// *Also add the display function to print day,month,year
// *Create the
// object of this class in main method and invoke all the methods in that class.

#include <iostream>
using namespace std;

class Date
{
private:
    int date, month, year;

public:
    void acceptDate(int i, int j, int k)
    {
        date = i;
        month = j;
        year = k;
    }

public:
    void display()
    {
        cout << "Entered date is : " << date << "-" << month << "-" << year << endl;
    }
};

int main()
{

    Date date;
    int d, m, y;
    cout << "Enter Date as DD, MM, YYYY: ";
    cin >> d >> m >> y;
    date.acceptDate(d, m, y);
    date.display();
    return 0;
}