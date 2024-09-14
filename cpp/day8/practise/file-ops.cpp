#include <iostream>
#include <fstream>
using namespace std;

void writeToFile()
{

    cout << "Enter file name" << endl;
    string name;
    cin >> name;
    ofstream fout;
    // open file
    fout.open(name, ios::binary | ios::app);
    if (fout.fail())
    {
        cout << "Error" << endl;
    }
    else
    {
        cout << "Opened file" << endl;
        // write to file
        fout.write("xyz", sizeof(string));
        cout << "Wrote to file" << endl;
    }
    fout.close();
}

void ReadFromFile()
{
    ifstream fin;
    cout << "ENter filke name " << endl;
    string file;
    cin >> file;
    fin.open(file);
    if (fin.fail())
    {
        cout << "failedd to open" << endl;
    }
    {
        // read from file
        string data;
        while (getline(fin, data))
        {
            cout << data << endl;
        }
    }
    fin.close();
}

void copyDataFromFile()
{
    ifstream fin;
    ofstream fout;
    cout << "Enter file names" << endl;
    string data, fileName, fileName2;
    cin >> fileName >> fileName2;
    fin.open(fileName);
    fout.open(fileName2);
    while (getline(fin, data))
    {

        fout << data << endl;
    }
    fin.close();
    fout.close();
}

int main()
{
    // ReadFromFile();
    writeToFile();
    // copyDataFromFile();
    return 0;
}
