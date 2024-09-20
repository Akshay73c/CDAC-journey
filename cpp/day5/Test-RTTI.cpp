#include <iostream>
#include <string.h>
#include <typeinfo.h>
using namespace std;

class Car
{
	int carid;
	string name, color;

public:
	Car()
	{
		cout << "---Car----" << endl;
		carid = 1;
		name = "Simple Car";
		color = "white";
	}
	Car(int id, string nm, string col)
	{
		cout << "---Car Parameter----" << endl;
		carid = id;
		name = nm;
		color = col;
	}
	virtual void speed()
	{
		cout << "---Car Speed---->60km/hr" << endl;
	}
	void display()
	{
		cout << "Id " << carid << "  Name " << name << "  col " << color << endl;
	}
};

class SportCar : public Car
{
	int nos;

public:
	SportCar()
	{
		nos = 1;
	}
	SportCar(int id, string name, string col, int ns) : Car(id, name, col)
	{
		nos = ns;
	}
	void speed()
	{
		cout << "----SportCar Speed----->350km/hr" << endl;
	}
	void startNos()
	{
		cout << "---increasing speed----" << endl;
	}
};

class SUV : public Car
{
private:
	int airBags;

public:
	SUV()
	{
		cout << "----default ---Suv----" << endl;
		airBags = 1;
	}
	SUV(int id, string name, string col) : Car(id, name, col)
	{
		cout << "----default ---Suv----" << endl;
		airBags = 1;
	}
	void speed()
	{
		cout << "---SUV Speed----->150km/hr" << endl;
	}
	void ABS()
	{
		cout << "--------ABS----" << endl;
	}
};

class AdvCar : public Car
{
public:
	void AdvCarFunction()
	{
		cout << "-----Adv Car-------" << endl;
	}
	void speed()
	{
		cout << "-----ad car speed---" << endl;
	}
};

int main()
{
	cout << "------------------RTTI Demo----------" << endl;
	// base ptr
	// upcasting
	// downcasting

	// create collection of cars
	// racing
	// create an array for storing all types of cars

	Car *racingCars[3];
	//
	SportCar *sp = new SportCar(101, "Ferrari", "Red", 5);
	SUV *suv = new SUV(102, "SUV Car", "Black");
	AdvCar *advCar = new AdvCar();

	// add cars into collection
	racingCars[0] = sp;		// upcasting
	racingCars[1] = suv;	// upcasting
	racingCars[2] = advCar; // upcasting

	// start race
	int i;
	for (i = 0; i < 3; i++)
	{
		// overriding:same fun name with same signature
		racingCars[i]->speed();
		// if we selected SportCar we must get startNos at execution time
		// use RTTI
		// why?to avoid runtime exception related to casting
		// use dynamic_cast<>
		// find out type of ref stored by baseClass ptr at runtime
		// use typeid()  include<typeinfo.h>

		cout << "---------------TypeId at index " << i << ":" << typeid(*racingCars[i]).name() << endl;

		if (typeid(*racingCars[i]) == typeid(SportCar))
		{
			cout << "\t\t\t\t   ---------SportCar Funcions-----" << endl;

			// convert basePtr into SportCar

			SportCar *spp1 = dynamic_cast<SportCar *>(racingCars[i]);
			// downcasting
			spp1->startNos();
		}
		if (typeid(*racingCars[i]) == typeid(SUV))
		{
			cout << "\t\t\t\t SUV functions--------" << endl;

			SUV *suv11 = dynamic_cast<SUV *>(racingCars[i]);
			suv11->ABS();
			cout << "\n\n";
		}
	}
}
