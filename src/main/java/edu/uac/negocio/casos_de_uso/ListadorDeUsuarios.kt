package edu.uac.negocio.casos_de_uso

import edu.uac.negocio.entidades.Usuario
import edu.uac.negocio.repositorios.RepositorioUsuarios

/**
 * Created by pjaraba on 5/23/2017.
 */
class ListadorDeUsuarios (val repositorioUsuarios: RepositorioUsuarios){

    fun listarTodos(): List<Usuario>{
        return repositorioUsuarios.traerTodos()
    }
}