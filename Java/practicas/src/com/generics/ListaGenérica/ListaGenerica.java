package com.generics.ListaGenérica;
import java.lang.reflect.Array;
import java.util.AbstractList;

// Realizado con ayuda del licenciado en todo - ChatGPT

public class ListaGenerica<E> extends AbstractList<E> {
    private E[] elementos;
    private int size;

    @SuppressWarnings("unchecked")
    public ListaGenerica(Class<E> tipo, int capacidadInicial) {
        elementos = (E[]) Array.newInstance(tipo, capacidadInicial);
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E get(int index) {
        verificarIndice(index);
        return elementos[index];
    }

    @Override
    public E set(int index, E element) {
        verificarIndice(index);
        E oldElement = elementos[index];
        elementos[index] = element;
        return oldElement;
    }

    @Override
    public void add(int index, E element) {
        verificarIndiceParaAgregar(index);
        if (size == elementos.length) {
            expandirCapacidad();
        }
        System.arraycopy(elementos, index, elementos, index + 1, size - index);
        elementos[index] = element;
        size++;
    }

    @Override
    public E remove(int index) {
        verificarIndice(index);
        E removedElement = elementos[index];
        System.arraycopy(elementos, index + 1, elementos, index, size - index - 1);
        elementos[size - 1] = null;
        size--;
        if (size < elementos.length / 4) {
            reducirCapacidad();
        }
        return removedElement;
    }

    private void verificarIndice(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Índice fuera de rango: " + index);
        }
    }

    private void verificarIndiceParaAgregar(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Índice fuera de rango: " + index);
        }
    }

    private void expandirCapacidad() {
        int nuevaCapacidad = elementos.length * 2;
        elementos = copiarArreglo(elementos, nuevaCapacidad);
    }

    private void reducirCapacidad() {
        int nuevaCapacidad = elementos.length / 2;
        elementos = copiarArreglo(elementos, nuevaCapacidad);
    }

    @SuppressWarnings("unchecked")
    private E[] copiarArreglo(E[] original, int nuevaCapacidad) {
        E[] nuevoArreglo = (E[]) Array.newInstance(original.getClass().getComponentType(), nuevaCapacidad);
        System.arraycopy(original, 0, nuevoArreglo, 0, size);
        return nuevoArreglo;
    }

    public static void main(String[] args) {
        ListaGenerica<String> lista = new ListaGenerica<>(String.class, 2);
        lista.add(0, "Hola");
        lista.add(1, "Mundo");
        lista.add(2, "!");
        System.out.println("Lista después de agregar elementos: " + lista);
        lista.set(1, "Java");
        System.out.println("Lista después de set(1, 'Java'): " + lista);
        lista.remove(2);
        System.out.println("Lista después de remove(2): " + lista);
        System.out.println("Tamaño de la lista: " + lista.size());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(elementos[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
