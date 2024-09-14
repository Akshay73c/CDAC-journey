// 3:Create a class ComplexNumber with data members real, imaginary.  *create a methods for assigning values and displaying values
// *write a method for retriving realNumber
// ex. int getReal(){ return real;}
//  write same method for getImaginary
// *create an objct in main method and invoke all methods

#include <iostream>
using namespace std;

class ComplexNum
{
private:
    int real, imaginary;

public:
    void assignVal(int r, int i)
    {
        real = r;
        imaginary = i;
    }

public:
    void display()
    {
        cout << "Complex Num entered is " << real << " + " << imaginary << "i." << endl;
    }
};

int main()
{
    cout << "---Complex number----" << endl;
    ComplexNum num;
    int r, i;
    cout << "Enter real and imaginary part: ";
    cin >> r >> i;
    num.assignVal(r, i);
    num.display();
}