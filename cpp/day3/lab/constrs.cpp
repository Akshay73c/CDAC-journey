// 4:Write all above classes with default and parameter constructor
// and test it.
// Todo:

#include <iostream>
using namespace std;

// -------------------------------Date Class----------------------------------------------
class Date
{
private:
    int date, month, year;

public:
    Date()
    {
        cout << "-----------Default constr of Date called-----------" << endl;
        date = 1;
        month = 6;
        year = 2001;
    }

    Date(int d, int m, int y)
    {
        cout << "-----------Parameterized constr of Date called-----------" << endl;
        date = d;
        month = m;
        year = y;
    }

    void display()
    {
        cout << "Date: " << date << "-" << month << "-" << year << endl;
    }
};

// -------------------------------Box Class----------------------------------------------

class Box
{
private:
    int length, breadth, height;
    string color;

    // You must have default constructor (written yourself) if you want to have parametrized constr
public:
    Box()
    {
        cout << "-----------Default constr of Box called-----------" << endl;

        length = 2;
        breadth = 3;
        height = 4;
        color = "Yellow";
    }

    Box(int i, int j, int k, string c)
    {
        cout << "-----------Parameterized constr of Box called-----------" << endl;
        length = i;
        breadth = j;
        height = k;
        color = c;
    }

    void display()
    {
        cout << "--Box Information--" << endl;
        cout << "Length:" << length << ", Breadth:" << breadth << ", Height:" << height << endl
             << "Color: " << color << endl;
    }
};

// -------------------------------ComplexNum Class----------------------------------------------

class ComplexNum
{
private:
    int real, imaginary;

public:
    ComplexNum()
    {
        cout << "-----------Default constr of ComplexNum called-----------" << endl;

        real = 0;
        imaginary = 0;
    }

    ComplexNum(int r, int i)
    {
        cout << "-----------Parameterized constr called-----------" << endl;

        real = r;
        imaginary = i;
    }

    void display()
    {
        cout << "Your complex num: " << real << " + " << imaginary << "i." << endl;
    }
};

int main()
{
    int ch;
    cout << "---Default and parameterized constructors" << endl;
    cout << "1.Date  2.Box  3.ComplexNum" << endl;

    do
    {
        cout << "Enter choice: ";
        cin >> ch;

        switch (ch)
        {
        case 1:
        {
            Date date1;
            int d, m, y;
            cout << "Default date is: ";
            date1.display();
            cout << "Enter date as dd mm yyyy: ";
            cin >> d >> m >> y;
            Date date2(d, m, y);
            date2.display();
            break;
        }

        case 2:
        {
            cout << "---------------Box-----------------" << endl;
            Box box;
            int l, b, h;
            string col;
            box.display();
            cout << "Enter Length, breadth, height: ";
            cin >> l >> b >> h;

            break;
        }

        case 3:
        {
            ComplexNum num1;
            cout << "---------------ComplexNum-----------------" << endl;
            num1.display();
            int r, i;
            cout << "Enter real and imaginary parts";
            cin >> r >> i;
            ComplexNum num2(r, i);
            break;
        }
        }
    } while (ch != 0);

    return 0;
}