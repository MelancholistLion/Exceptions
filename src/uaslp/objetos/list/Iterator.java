package uaslp.objetos.list;

// Comentario de línea

/*
 Comentario de bloque
 */


// Refactorización: Código que necesita ser comentado es código que apesta

public interface Iterator {

    /**
     * Indica si hay un elemento disponible en el Iterador
     * @return true si hay un elemento disponible, de lo contrario false
     */
    boolean hasNext();


    /**
     * Regresa el elemento actual y avanza al siguiente
     * @return El elemento actual
     */
    String next();
}
