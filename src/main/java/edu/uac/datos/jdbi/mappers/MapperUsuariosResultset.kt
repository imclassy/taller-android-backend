package edu.uac.datos.jdbi.mappers

import edu.uac.negocio.entidades.Usuario
import org.skife.jdbi.v2.StatementContext
import org.skife.jdbi.v2.tweak.ResultSetMapper
import java.sql.ResultSet


class MapperUsuariosResultset : ResultSetMapper<Usuario>{
    override fun map(posicion: Int, resultSet: ResultSet?, contexto: StatementContext?): Usuario {
        if(resultSet == null)
            throw IllegalArgumentException("Resultset no puede ser nulo")

        val id = resultSet.getLong("id")
        val nombre = resultSet.getString("nombre")
        val email  = resultSet.getString("email")

        return Usuario(id, nombre, email)
    }
}