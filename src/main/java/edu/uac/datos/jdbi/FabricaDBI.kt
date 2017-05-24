package edu.uac.datos.jdbi

import org.skife.jdbi.v2.DBI
import java.net.URI



class FabricaDBI {

    fun fabricar(): DBI{
        return obtenerDBIHeroku()?:obtenerDBILocal()
    }

    fun obtenerDBIHeroku():DBI?{
        val herokuDbUrl = System.getenv("DATABASE_URL")

        if(herokuDbUrl != null){
            val dbUri = URI(System.getenv("DATABASE_URL"))
            val username = dbUri.userInfo.split(":")[0]
            val password = dbUri.userInfo.split(":")[1]
            val dbUrl = "jdbc:postgresql://" + dbUri.getHost() + ':' + dbUri.getPort() + dbUri.getPath()
            return DBI(dbUrl,username,password)
        }

        return null
    }

    fun obtenerDBILocal():DBI{
        val url = "jdbc:postgresql:taller"
        val usuario = "postgres"
        val pass = "pello1994"
        val dbi = DBI(url,usuario,pass)
        return dbi
    }
}