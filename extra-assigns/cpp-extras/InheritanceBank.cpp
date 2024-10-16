#include <iostream>
using namespace std;

class Bank_Account
{
    static int accountNoGenerator;
    int accountNo;
    double balance;
    string accountHolderName;

public:
    Bank_Account()
    {
        accountNo = 0;
        balance = 0;
        accountHolderName = "John Doe";
    }

    Bank_Account(string accountHolderName)
    {
        this->accountNo = ++accountNoGenerator;
        this->accountHolderName = accountHolderName;
        this->balance = 0;
    }

    // method to display
    void displayInfo()
    {
        cout << "Account Holder Name: " << this->accountHolderName << endl
             << "Balance: Rs." << this->balance << endl;
    }
};

int Bank_Account ::accountNoGenerator = 1000;

// Child classes:

class Saving_Account : public Bank_Account
{
    string type;

public:
    Saving_Account() : Bank_Account()
    {
        this->type = "saving";
    }

    Saving_Account(string name) : Bank_Account(name)
    {
        this->type = "saving";
    }
};

class Current_Account : public Bank_Account
{
    string type;

public:
    Current_Account() : Bank_Account()
    {
        this->type = "Current";
    }

    Current_Account(string name) : Bank_Account(name)
    {
        this->type = "Current";
    }
};

int main()
{
    Bank_Account normAccount("normalAccount");
    normAccount.displayInfo();
    Saving_Account savAccount("SavAccount");
    savAccount.displayInfo();
    Current_Account Current_Account("CurrAccount");
    Current_Account.displayInfo();
    return 0;
}