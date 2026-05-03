#include <iostream>
#include <fstream>
#include <string>

using namespace std;

int main() {
    ifstream archivo("ArchivoProductos.txt");
    
    if (!archivo.is_open()) {
        cout << "Error: el archivo productos.txt no existe o no se puede abrir." << endl;
        return 1;
    }
    
    string nombre;
    double precio;
    int cantidad;
    
    double totalGlobal = 0;
    double mayorSubtotal = 0;
    string productoMayor = "";
    
    cout << "--- Detalles por Producto ---" << endl;
    
    while (archivo >> nombre >> precio >> cantidad) {
        double subtotal = precio * cantidad;
        totalGlobal += subtotal;
        
        cout << "Producto: " << nombre << " | Subtotal: $" << subtotal << endl;
        
        if (subtotal > mayorSubtotal) {
            mayorSubtotal = subtotal;
            productoMayor = nombre;
        }
    }
    
    archivo.close();
    
    cout << "-----------------------------" << endl;
    cout << "Total a pagar: $" << totalGlobal << endl;
    cout << "Producto mayor: " << productoMayor << " (Subtotal de $" << mayorSubtotal << ")" << endl;
    
    return 0;
}