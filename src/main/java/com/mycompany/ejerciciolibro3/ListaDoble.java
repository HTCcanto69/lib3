/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciolibro3;

/**
 *
 * @author Hermes
 */
public class ListaDoble {
    Nodo cabeza;
// mÃ©todos de la clase (implementaciÃ³n en apartado 8.9)
public ListaDoble(){ 
    cabeza = null;
}
public ListaDoble insertarCabezaLista(int entrada)
{
 Nodo nuevo;
nuevo = new Nodo(entrada);
nuevo.adelante = cabeza;
if (cabeza != null )
 cabeza.atras = nuevo;
cabeza = nuevo;
return this;
}
public ListaDoble insertaDespues(Nodo anterior, int entrada)
{
Nodo nuevo;
nuevo = new Nodo(entrada);
nuevo.adelante = anterior.adelante;
if (anterior.adelante != null)
 anterior.adelante.atras = nuevo;
anterior.adelante = nuevo;
nuevo.atras = anterior;
return this;
}
public void eliminar (int entrada)
{
Nodo actual;
boolean encontrado = false;
actual = cabeza;
// Bucle de bÃºsqueda
while ((actual != null) && (!encontrado))
{
 /* la comparaciÃ³n se realiza con el mÃ©todo equals()...,
 depende del tipo Elemento */
 encontrado = (actual.dato == entrada);
 if (!encontrado)
 actual = actual.adelante;
}
 // Enlace de nodo anterior con el siguiente
if (actual != null)
{
 //distingue entre nodo cabecera o resto de la lista
 if (actual == cabeza)
 {
 cabeza = actual.adelante;
 if (actual.adelante != null)
 actual.adelante.atras = null;
 }
 else if (actual.adelante != null) // No es el Ãºltimo nodo
 {
 actual.atras.adelante = actual.adelante;
 actual.adelante.atras = actual.atras;
 }
 else // Ãºltimo nodo
 actual.atras.adelante = null;
 actual = null;
}
} 
public void visualizar()
{
 Nodo n;
 int k = 0;
 n = cabeza;
 while (n != null)
 {
 System.out.print(n.dato + " ");
 n = n.adelante;
 k++;
 System.out.print( (k%15 != 0 ? " " : "\n"));
 }
}
public void buscarLista(int destino) {;}
}