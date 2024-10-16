#include <iostream>
using namespace std;

struct Complex
{
    double real;
    double imag;
};

Complex addComplex(Complex num1, Complex num2)
{
    Complex result;
    result.real = num1.real + num2.real;
    result.imag = num1.imag + num2.imag;
    return result;
}

int main()
{
    Complex num1, num2, sum;

    cout << "Enter the real and imaginary parts of the first complex number: ";
    cin >> num1.real >> num1.imag;

    cout << "Enter the real and imaginary parts of the second complex number: ";
    cin >> num2.real >> num2.imag;

    sum = addComplex(num1, num2);

    cout << "The sum of the two complex numbers is: " << sum.real << " + " << sum.imag << "i" << endl;

    return 0;
}