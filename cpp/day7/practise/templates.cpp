#include <iostream>
using namespace std;

template <class T>
void templateFun(T a, T b)
{
    cout << a << " " << b << endl;
}

int main()
{
    templateFun("xx", "");
}

// template class
template <class T>
class XYZ
{
};