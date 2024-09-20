// Palindrome number
#include <iostream>
using namespace std;

int main()
{
    int num;
    cout << "Enter number: ";
    cin >> num;

    int reverse = 0, x = num;
    while (num > 0)
    {
        int rem = num % 10;
        reverse = reverse * 10 + rem;

        num /= 10;
    }
    if (reverse == x)
        cout << "Palindrome" << endl;
    else
        cout << "Not a palindrome" << endl;

    return 0;
}