#include <iostream>
using namespace std;

// declaration file

class Parent
{
private:
    int private_num;

protected:
    int protected_num;

    // Constructors
public:
    Parent()
    {
        cout << "----Default of parent ------" << endl;

        private_num = 0;
        protected_num = 0;
    }

    Parent(int private_num, int protected_num)
    {
        cout << "----Parameterized of parent------" << endl;

        this->private_num = private_num;
        this->protected_num = protected_num;
    }

    // Parent Fxns
    void display()
    {
        cout << "----Display method of parent" << endl;
        cout << "Private num " << private_num << endl;
    }
};

class Child : public Parent
{
private:
    int child_private_num;

public:
    Child()
    {
        cout << "----Default of child-----" << endl;

        child_private_num = 0;
    }

    Child(int child_private_num)
    {
        cout << "----Parametrized of child------" << endl;

        this->child_private_num = child_private_num;
    }

    // Child Fxns
    void display()
    {
        cout << "----Display method of Child" << endl;
    }
};