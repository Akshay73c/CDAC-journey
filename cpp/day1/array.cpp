#include <iostream>
using namespace std;

int main()
{
    int size;
    cout << "Array Ques" << endl
         << "Enter size of array: ";
    cin >> size;
    int arr[size];

    cout << "1.Display numbers > 40 \n2.Display only even numbers \n3.Display sum of all elements \n4.Display max, min, avg \n5.Exit" << endl;
    int choice;
    do
    {
        cout << "Enter choice: ";
        cin >> choice;
        switch (choice)
        {

        default:
            break;
        }
    } while (choice != 5);
}