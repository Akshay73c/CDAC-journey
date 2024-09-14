#include <iostream>
using namespace std;
#include "BankAccount.cpp"

int main()
{
    // BankAccount arr[20];

    // int ch;
    // cout << "---------Bank---------" << endl;
    // cout << "1.Create a account" << endl;

    BankAccount acc("Akshay", 0);
    acc.display();
    acc.deposit(20000);
    cout << "Current Balance: Rs." << acc.getBalance() << endl;
    acc.withdraw(5000);
    cout << "Current Balance: Rs." << acc.getBalance() << endl;
}