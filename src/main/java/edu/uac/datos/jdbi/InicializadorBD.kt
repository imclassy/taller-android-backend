package edu.uac.datos.jdbi

import org.skife.jdbi.v2.DBI

/**
 * Created by pjaraba on 5/24/2017.
 */
class InicializadorBD(val dbi: DBI) {

    fun inicializar(){
        val handle = dbi.open()

        handle.execute("CREATE TABLE IF NOT EXISTS usuarios (id SERIAL PRIMARY KEY, nombre TEXT NOT NULL, email TEXT NOT NULL)")
        handle.execute("INSERT INTO usuarios (id,nombre, email) VALUES (1,'Pedro', 'pe.jaraba@hotmail.com') ON CONFLICT(id) DO NOTHING")
        handle.execute("INSERT INTO usuarios (id,nombre, email) VALUES (2,'Mara', 'maramb@gmail.com') ON CONFLICT(id) DO NOTHING")

        handle.close()
    }
}