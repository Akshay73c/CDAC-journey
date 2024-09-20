#include <iostream>
using namespace std;
#include "BankAccount.cpp"

int main()
{
    string name;
    cout << "----Bank Account----" << endl;
    cout << "Enter Name of acoount holder: ";
    cin >> name;
    MyBankAccount acc(name);
    acc.display();
    acc.deposit(20000);
    cout << "Current Balance: Rs." << acc.getBalance() << endl;
    acc.withdraw(5000);
    cout << "Current Balance: Rs." << acc.getBalance() << endl;
    acc.withdraw(20000);
}