// Basic swap: 3 methods
// 1. Normal swapping(which isn't efficient)
// 2. Using refrence variables
// 3. Using Pointers

#include <iostream>
using namespace std;

void swapNormal(int a, int b)
{
    // THIS SWAPPING DOESN'T WORK
    cout << "----Doing normal swapping----" << endl;
    int temp = a;
    a = b;
    b = temp;
    // cout << "In swap function a = " << a << " and b = " << b << endl;
}

void swapByRef(int &a, int &b)
{
    cout << "----Doing swapping using reference vars----" << endl;
    int temp = a;
    a = b;
    b = temp;
    cout << "Internally in swap fxn, a = " << a << " and b = " << b << endl;
}

void swapByPtr(int *a, int *b)
{
    cout << "----Doing swapping using pointers----" << endl;
    int temp = *a;
    *a = *b;
    *b = temp;
    cout << "Internally in swap fxn, a = " << *a << " and b = " << *b << endl;
}

int main()
{
    int n1 = 4, n2 = 8;

    cout << "Before swapping n1 = " << n1 << " and n2 = " << n2 << endl;
    swapByRef(n1, n2);
    cout << "After  swapping n1 = " << n1 << " and n2 = " << n2 << endl;
    cout << "_______________________________________________" << endl;

    n1 = 4, n2 = 8; // reassign n1 and n2 after first swap

    cout << "Before swapping n1 = " << n1 << " and n2 = " << n2 << endl;
    swapByPtr(&n1, &n2);
    cout << "After  swapping n1 = " << n1 << " and n2 = " << n2 << endl;

    return 0;
}