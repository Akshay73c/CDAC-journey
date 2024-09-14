#include <iostream>
using namespace std;

class MyStackException : public exception
{
    char *msg;

public:
    MyStackException(char *msg)
    {
        this->msg = msg;
    }

    char *what()
    {
        return msg;
    }
};

template <class T>
class MyStack
{
    T *arr;
    int size, top = -1;

public:
    MyStack(int size)
    {
        this->size = size;
        arr = new T[size];
    }

    void push(T ele)
    {
        arr[++top] = ele;
    }

    T pop()
    {
        if (top < 0)
        {
            throw MyStackException("Stack Empty");
        }
        else
            return arr[top--];
    }
};

int main()
{

    MyStack<int> stack(3);
    try
    {

        stack.push(1);
        stack.push(2);
        stack.push(3);
        cout << stack.pop() << endl;
        cout << stack.pop() << endl;
        cout << stack.pop() << endl;
        stack.pop();
    }
    catch (MyStackException ex)
    {
        cout << ex.what();
    }

    return 0;
}