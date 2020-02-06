package model.data_structures;
/*******************************************************************************
 * 2020, All rights reserved.
 *******************************************************************************/

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Lista.
 * 
 * @author daniel
 */
public class Lista<T> implements List <T> {
	/**
	 * Description of the property primero.
	 */
	private Nodo <T>primero ;

	/**
	 * Description of the property Lista.
	 */
	

	/**
	 * Description of the property numComparendos.
	 */
	private int numComparendos;

	// Start of user code (user defined attributes for Lista)

	// End of user code
	
		public Lista ()
		{
		primero= null;
		}

		public Lista (T item)
		
		  
		{		primero = new Nodo<T> (item) ;
		numComparendos = 1;
		 }

		
	/**
	 * Description of the method agregarAlComienzo.
	 * @param node 
	 */
	public void agregarAlComienzo  (Nodo<T>node  ) {
		if( primero == null ) // Crea la cabeza si no existe
        {
            primero = node;
        }
        else
      
        {
            node.cambiarSiguiente( primero );
            primero = node;
        }
        numComparendos++;
		// Start of user code for method agregarAlComienzo
		// End of user code
	}

	/**
	 * Description of the method agregarNodoAntesDe.
	 * @param ID 
	 * @param node 
	 */
	public void agregarNodoAntesDe(int ID, Nodo<T> node)throws Exception
	{
		if( primero == null )
            throw new Exception( "no existe ningun elemento" );
        else if( ID == primero.darId() )
        {
            node.cambiarSiguiente( (Nodo<T>) primero );
            primero = node;
        }
        else
        {
            Nodo<T> anterior= node.getAnterior();
            if( node.getAnterior() == null )
                throw new Exception("esta vacia la lista");
            anterior.insertarDespues( node );
        }
        numComparendos++;
		// Start of user code for method agregarNodoAntesDe
		// End of user code
	}

	/**
	 * Description of the method agregarDespuesDe.
	 * @param ID 
	 * @param node 
	 */
	public void agregarDespuesDe(int ID, E node)throws Exception {
		
		E anterior = consultarPorPosicion( ID );

        if( anterior == null ) // Si no existe el paciente después del que se desea realizar la adición se arroja la excepción
        {
            throw new Exception (" ") ;
        }
        else
        // Se adiciona el paciente
        {
            anterior.insertarDespues( node );
        }
        numComparendos++;
		// Start of user code for method agregarDespuesDe
		// End of user code
	}

	/**
	 * Description of the method eliminarNodo.
	 * @param ID 
	 */
	public void eliminarNodo(int ID) throws Exception {
		if( primero == null )
            throw new Exception ( "no hay nada que eliminar" );
        else if( ID == primero.darId())
        {
           
            primero = primero.getSiguiente( );
        }
        else
        {
            
            Nodo anterior = localizarAnterior( ID);
            if( anterior == null )
                throw new Exception("vacio");
            anterior.desconectarSiguiente( );
        }
        numComparendos--;
		// Start of user code for method eliminarNodo
		// End of user code
	}
	public Nodo localizarAnterior( int id )
    {
        Nodo anterior = null;
       Nodo actual = primero;

        while( actual != null && actual.darId( ) != id)
        {
            anterior = actual;
            actual = actual.getSiguiente( );
        }

        return actual != null ? anterior : null;
    }


	/**
	 * Description of the method darNumeroComparendos.
	 * @return 
	 */
	public int darNumeroComparendos() {
		// Start of user code for method darNumeroComparendos
		return numComparendos;
		// End of user code
	}

	/**
	 * Description of the method darTamano.
	 * @return 
	 */
	public int darTamano() {
		// Start of user code for method darTamano
		Nodo actual = primero;
        int longitud = 0;

        while( actual != null )
        {
            longitud++;
            actual = actual.getSiguiente( );
        }
        return longitud;
		// End of user code
	}

	/**
	 * Description of the method consultarPorPosicion.
	 * @param pos 
	 * @return 
	 */
	public Nodo consultarPorPosicion(int pos) {
		// Start of user code for method consultarPorPosicion
		Nodo actual = primero;
        while( actual != null && actual.darId( ) != pos)
        {
            actual = actual.getSiguiente( );
        }
        return actual;
    }
		// End of user code
	

	/**
	 * Description of the method iniciarRecorrido.
	 * @param node 
	 */
	public void iniciarRecorrido(E node) {
		// Start of user code for method iniciarRecorrido
		// End of user code
	}

	/**
	 * Description of the method consultarActual.
	 * @return 
	 */
	public Nodo consultarActual() {
		// Start of user code for method consultarActual
		Nodo consultarActual = null;
		return consultarActual;
		// End of user code
	}

	/**
	 * Description of the method avanzarNodo.
	 */
	public void avanzarNodo() {
		// Start of user code for method avanzarNodo
		// End of user code
	}

	/**
	 * Description of the method retrocederNodo.
	 */
	public void retrocederNodo() {
		// Start of user code for method retrocederNodo
		// End of user code
	}

	/**
	 * Description of the method agregarAlFinal.
	 * @param node 
	 */
	public void agregarAlFinal(E node) {
		// Start of user code for method agregarAlFinal
		// End of user code
	}

	// Start of user code (user defined methods for Lista)

	// End of user code
	/**
	 * Returns primero.
	 * @return primero 
	 */
	public Nodo getPrimero() {
		return this.primero;
	}

	/**
	 * Sets a value to attribute primero. 
	 * @param newPrimero 
	 */
	public void setPrimero(Nodo newPrimero) {
		if (this.primero != null) {
			this.primero.set(null);
		}
		this.primero.set(this);
	}

	/**
	 * Returns Lista.
	 * @return Lista 
	 */
	public Nodo getLista() {
		return this.Lista;
	}

	/**
	 * Sets a value to attribute Lista. 
	 * @param newLista 
	 */
	public void setLista(Nodo newLista) {
		this.Lista = newLista;
	}

	/**
	 * Returns numComparendos.
	 * @return numComparendos 
	 */
	public int getNumComparendos() {
		return this.numComparendos;
	}

	/**
	 * Sets a value to attribute numComparendos. 
	 * @param newNumComparendos 
	 */
	public void setNumComparendos(int newNumComparendos) {
		this.numComparendos = newNumComparendos;
	}

	/**
	 * Description of My Generic.
	 * 
	 * @author daniel
	 */
	public class My Generic
	{}
		// Start of user code (user defined attributes for My Generic)
		
		// End of user code

		/**
		 * The constructor.
		 */
		public My Generic() {
			// Start of user code constructor for My Generic)
			super();
			// End of user code
		}

		// Start of user code (user defined methods for My Generic)

		// End of user code

	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(T e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends T> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends T> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T set(int index, T element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, T element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<T> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<T> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

}
