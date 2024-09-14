#include <iostream>
using namespace std;

class BankAccount
{
private:
    int accountNo;
    string name;
    double balance;
    static int accountCount;

public:
    // default constr
    BankAccount()
    {
        accountNo = ++accountCount;
        name = "John Doe";
        balance = 0;
    }

    // Parameterized
    BankAccount(string name, double balance)
    {
        this->accountNo = ++accountCount;
        this->name = name;
        this->balance = balance;
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
    }

    void display()
    {
        cout << "Acc " << this->accountNo << " Name: " << this->name << " balance: " << this->balance << endl;
        ;
    }
};
int BankAccount ::accountCount = 1000;