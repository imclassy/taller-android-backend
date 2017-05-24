package edu.uac.datos.repositorios

import edu.uac.datos.jdbi.mappers.MapperUsuariosResultset
import edu.uac.negocio.entidades.Usuario
import edu.uac.negocio.repositorios.RepositorioUsuarios
import org.skife.jdbi.v2.DBI


class RepositorioUsuariosPostgresJDBI(val dbi: DBI, val mapperUsuariosResultset: MapperUsuariosResultset) : RepositorioUsuarios{
    override fun traerTodos(): List<Usuario> {
        val handle = dbi.open()
        val usuarios = handle.createQuery("select id, nombre, email from usuarios").map(mapperUsuariosResultset).list()
        handle.close()
        return usuarios
    }
}