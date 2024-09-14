#include <iostream>
using namespace std;
#include "Fruits_RTTI.cpp"
#include <typeinfo.h>

int main()
{
    cout << "----------RTTI Fruits------------" << endl;
    Fruit *arr[4];

    // pointer of Base class Fruit
    Fruit *fruits[2];
    // created pointers of childs apple, orange
    Apple *apple = new Apple(20.0);
    Orange *orange = new Orange(15.5);

    fruits[0] = apple;  // upcasting happens implicitely
    fruits[1] = orange; // same

    for (int i = 0; i < 2; i++)
    {
        // here we need to downcast using RTTI
        //     why not static cast ? - coz we don't know rn, we'll know the type @ runtime

                if (typeid(*fruits[i]) == typeid(Apple))
        {
            cout << "Its apple" << endl;
            // so convert Fruit ptr to Apple ptr using dynamic cast
            Apple *applePtr = dynamic_cast<Apple *>(fruits[i]);
            applePtr->taste();
        }
        if (typeid(*fruits[i]) == typeid(Orange))
        {
            cout << "Its apple" << endl;
            // so convert Fruit ptr to Apple ptr using dynamic cast
            Orange *orangePtr = dynamic_cast<Orange *>(fruits[i]);
            orangePtr->taste();
        }
        // fruits[i]->taste();

        // cout << typeid(*fruits[i]).name() << endl;
    }

    return 0;
}