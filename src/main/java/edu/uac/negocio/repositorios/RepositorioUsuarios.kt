package edu.uac.negocio.repositorios

import edu.uac.negocio.entidades.Usuario

/**
 * Created by pjaraba on 5/23/2017.
 */
interface RepositorioUsuarios {

    fun traerTodos(): List<Usuario>
}