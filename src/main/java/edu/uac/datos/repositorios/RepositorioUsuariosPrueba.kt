package edu.uac.datos.repositorios

import edu.uac.negocio.entidades.Usuario
import edu.uac.negocio.repositorios.RepositorioUsuarios

/**
 * Created by pjaraba on 5/23/2017.
 */
class RepositorioUsuariosPrueba : RepositorioUsuarios{
    override fun traerTodos(): List<Usuario> {
        return listOf<Usuario>(Usuario(1L, "Pedro", "pe.jaraba@hotmail.com"), Usuario(2L, "Mara", "maramb@gmail.com"))
    }
}