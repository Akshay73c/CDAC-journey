#include <iostream>
using namespace std;

class MyBankAccount
{
private:
    int accountNo;
    string name;
    double balance;
    static int accountCount;

public:
    // default constr
    MyBankAccount()
    {
        accountNo = ++accountCount;
        name = "John Doe";
        balance = 0;
        cout << "Sample account created for " << this->name << " !" << endl;
    }

    // Parameterized
    MyBankAccount(string name)
    {
        this->accountNo = ++accountCount;
        this->name = name;
        this->balance = 0; // initial balance should be 0
        cout << "Account created for " << this->name << " !" << endl;
    }

    // getters and setters
    double getBalance()
    {
        return this->balance;
    }

    // methods
    void withdraw(double amt)
    {
        if (amt > this->balance)
            cout << "Not sufficient balance!!" << endl;
        else
        {
            this->balance -= amt;
            cout << "Amount debited successfully!" << endl;
        }
    }

    void deposit(double amt)
    {
        this->balance += amt;
        cout << "Amount credited successfully!" << endl;
    }

    void display()
    {
        cout << "Acc " << this->accountNo << " Name: " << this->name << " balance: " << this->balance << endl;
        ;
    }
};
int MyBankAccount::accountCount = 1000;