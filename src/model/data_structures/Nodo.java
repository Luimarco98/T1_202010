package model.data_structures;

/*******************************************************************************
 * 2020, All rights reserved.
 *******************************************************************************/

import java.util.HashSet;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Nodo.
 * 
 * @author daniel
 */
public class Nodo <E>{
	

	/**
	 * Description of the property Anterior.
	 */
	private Nodo<E> Anterior ;

	/**
	 * Description of the property Siguiente.
	 */
	private Nodo<E> Siguiente ;

	/**
	 * Description of the property Item.
	 */
	private E Item = null;
	
	private int ID;

	/**
	 * Description of the property .
	 */
	public Nodo(E item, int pId)
	{
		Siguiente=null;
		this.Item = Item;
		ID=pId;
	}
public int darId()
{
	return ID;
}
public void insertarDespues( Nodo<E> node )
{
    node.Siguiente = Siguiente;
    Siguiente = node;
}
	/**
	 * Description of the property .
	 */
public void desconectarSiguiente( )
{
    Siguiente = Siguiente.Siguiente;
}
	/**
	 * Description of the property anterior.
	 */
	public HashSet<Nodo> anterior = new HashSet<Nodo>();

	/**
	 * Description of the property e.
	 */
	public HashSet<E> e = new HashSet<E>();

	// Start of user code (user defined attributes for Nodo)

	// End of user code

	
	
	 public void cambiarSiguiente( Nodo<E> node )
	    {
	        Siguiente = node;
	    }
	
	/**

	// Start of user code (user defined methods for Nodo)

	// End of user code
	/**
	 * Returns primero.
	 * @return primero 


	/**
	 * Returns Anterior.
	 * @return Anterior 
	 */
	public Nodo<E> getAnterior() {
		return this.Anterior;
	}

	/**
	 * Sets a value to attribute Anterior. 
	 * @param newAnterior 
	 */
	public void setAnterior(Nodo<E> newAnterior) {
		this.Anterior = newAnterior;
	}

	/**
	 * Returns Siguiente.
	 * @return Siguiente 
	 */
	public Nodo<E> getSiguiente() {
		return this.Siguiente;
	}

	/**
	 * Sets a value to attribute Siguiente. 
	 * @param newSiguiente 
	 */
	public void setSiguiente(Nodo<E> newSiguiente) {
		this.Siguiente = newSiguiente;
	}

	/**
	 * Returns Item.
	 * @return Item 
	 */
	public E getItem() {
		return this.Item;
	}

	/**
	 * Sets a value to attribute Item. 
	 * @param newItem 
	 */
	public void setItem(E newItem) {
		this.Item = newItem;
	}

	/**
	 * Returns .
	 * @return  
	 */


	/**
	 * Sets a value to attribute . 
	 * @param new 
	 */
	
	/**
	 * Returns .
	 * @return  
	 */

	/**
	 * Returns anterior.
	 * @return anterior 
	 */
	
	/**
	 * Returns e.
	 * @return e 
	 */
	public HashSet<E> getE() {
		return this.e;
	}

}
