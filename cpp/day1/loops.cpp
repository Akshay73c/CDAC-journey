#include <iostream>
using namespace std;

int main()
{
    // Loops
    int choice;
    do
    {
        cout << "\n_______________________________________________________________________" << endl;
        cout << "\tLoops Ques\n1.Numbers from 100 to 1 \n2.Odd numbers between user specified range \n3.Prime number\n4.Exit" << endl;
        cout << "Enter choice: ";
        cin >> choice;
        switch (choice)
        {
        case 1:
            for (int i = 100; i > 0; i--)
            {
                cout << i << "\t";
            }
            cout << endl;
            break;

        case 2:
            int start, end;
            cout << "Enter range from where to where:" << endl;
            cin >> start >> end;
            for (int i = start; i <= end; i++)
            {
                if (i % 2 != 0)
                {
                    cout << i << "\t";
                }
            }
            break;

        case 3:
            int num;
            cout << "Enter number to check if prime or not: ";
            cin >> num;
            bool isPrime = true;
            for (int i = 2; i < num / 2; i++)
            {
                if (num % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                cout << "Prime" << endl;
            else
                cout << "Not Prime" << endl;
            break;
        }

    } while (choice != 5);
}