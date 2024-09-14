#include <iostream>
#include <typeinfo.h>

using namespace std;

// Parent class - Fruit
class Fruit
{
private:
    string name, color;
    float weight;

public:
    Fruit()
    {
        name = "Sample fruit";
        color = "XX";
        weight = 0;
    }

    Fruit(string name, string color, float weight)
    {
        this->name = name;
        this->color = color;
        this->weight = weight;
    }

    // methods - display(), taste()

    virtual void display()
    {
        cout << name << "Color: " << color << "Weight: " << weight << endl;
    }

    void taste()
    {
        cout << "Parent's sweet taste" << endl;
    }
};

class Apple : public Fruit
{
public:
    // constrs
    Apple()
    {
    }
    Apple(float weight) : Fruit("Apple", "red", weight)
    {
        cout << "Apple created!" << endl;
    }

    // methods - taste(), jam()

    void taste()
    {
        cout << "Apple's sweet taste" << endl;
    }

    void jam()
    {
        cout << "Jam jam" << endl;
    }
};

class Orange : public Fruit
{
public:
    // constrs
    Orange()
    {
    }
    Orange(float weight) : Fruit("Orange", "orange color", weight)
    {
        cout << "Orange created!" << endl;
    }

    // methods - taste(), jam()

    void taste()
    {
        cout << "Orange's sore taste" << endl;
    }

    void juice()
    {
        cout << "Juice of orange" << endl;
    }
};
