#include <iostream>
using namespace std;

int main()
{
    int n, oddSum = 0, evenSum = 0;
    cout << "Enter number: ";
    cin >> n;
    for (int i = 1; i <= n; i++)
    {
        if (i % 2 == 0)
            evenSum += i;
        else
            oddSum += i;
    }

    cout << "Sum of even numbers from 1 to " << n << " is " << evenSum << endl;
    cout << "Sum of odd numbers from 1 to " << n << " is " << oddSum << endl;

    return 0;
}