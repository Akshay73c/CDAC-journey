#include <iostream>
using namespace std;

int main()
{
    int ch;
    cout << "1.Vowel-consonant \n2.Valid triangle \n3.Factorial \n4.m to the power n \n5.Exit \n";

    do
    {
        cout << "Enter choice: ";
        cin >> ch;
        switch (ch)
        {
        case 1:
        {
            char c;
            cout << "----Vowel or consonant----\nEnter a character: ";
            cin >> c;
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            {
                cout << "Vowel" << endl;
            }
            else
                cout << "Consonant" << endl;
            break;
        }

        case 2:
        {
            int a1, a2, a3;
            cout << "----Valid Triangle----\nEnter angles of triangle as a1, a2, a3: ";
            cin >> a1 >> a2 >> a3;
            if (a1 + a2 + a3 != 180)
            {
                cout << "Not a valid triangle!!" << endl;
            }
            else
                cout << "Valid triangle." << endl;
            break;
        }

        case 3:
        {
            int n, factorial = 1;
            cout << "----Factorial----\nEnter number: ";
            cin >> n;
            while (n > 0)
            {
                factorial = factorial * n;
                n--;
            }
            cout << "Factorial of is " << factorial << endl;
            break;
        }

        case 4:
        {
            int m, n, answer = 1;
            cout << "----m to the power n----\nEnter m and n to calculate m^n: ";
            cin >> m >> n;
            for (int i = 0; i < n; i++)
            {
                answer = answer * m;
            }
            cout << m << "^" << n << " = " << answer << endl;
            ;
            break;
        }
        }
    } while (ch != 5);
}