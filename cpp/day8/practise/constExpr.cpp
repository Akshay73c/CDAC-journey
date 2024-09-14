#include <iostream>
using namespace std;

template <typename T>
void displayInfo(const T a)
{
    if constexpr (is_integral_v<T>)
    {
        cout << "Integralll" << endl;
    }
    else
    {
        cout << "Nott" << endl;
    }
}

int main()
{
    displayInfo("c");
}