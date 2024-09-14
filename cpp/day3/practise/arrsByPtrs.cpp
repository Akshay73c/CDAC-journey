#include <iostream>
using namespace std;
#include <array>

int main()
{
    cout << "Arrays using ptrs" << endl;
    int *arr[5];

    *arr[0] = 2;
    *arr[1] = 3;
    *arr[2] = 4;
    *arr[3] = 5;
    *arr[4] = 6;

    return 0;
}
