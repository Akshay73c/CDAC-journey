// 2:Create a class Box with data members
//  *create function to assign values and retrive value
//  * create object of this class in main method and invoke all the methods in that class.
#include <iostream>
using namespace std;

class Box
{
private:
    int length, breadth, height;
    string color;

public:
    void
    acceptData(int i, int j, int k, string c)
    {
        length = i;
        breadth = j;
        height = k;
        color = c;
    }

    void display()
    {
        cout << "Box \nLength:" << length << ", Breadth:" << breadth << ", Height:" << height << endl
             << "Color: " << color << endl;
    }
};

int main()
{
    cout << "----Box----" << endl;
    Box box;
    int l, b, h;
    string col;
    cout << "Enter length, breadth, height" << endl;
    cin >> l >> b >> h;
    cout << "Enter color: " << endl;
    cin >> col;
    box.acceptData(l, b, h, col);
    box.display();
    return 0;
}
