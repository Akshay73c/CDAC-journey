#include <iostream>
using namespace std;

int main()
{
    int iterate = 2;
    while (iterate < 50)
    {
        bool Prime = true;
        for (int i = 2; i < iterate / 2; i++)
        {
            if (iterate % i == 0)
            {
                Prime = false;
                break;
            }
        }
        if (Prime)
            cout << iterate << "\t";
        iterate++;
    }
    cout << endl;
}