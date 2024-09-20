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
    cout << "Reverse of the number is: " << reverse << endl;

    return 0;
}