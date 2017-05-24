package edu.uac.spark.servidor

import edu.uac.datos.jdbi.FabricaDBI
import edu.uac.datos.jdbi.InicializadorBD
import edu.uac.datos.jdbi.mappers.MapperUsuariosResultset
import edu.uac.datos.repositorios.RepositorioUsuariosPostgresJDBI
import edu.uac.negocio.casos_de_uso.ListadorDeUsuarios
import edu.uac.spark.controladores.ControladorPrueba
import spark.Spark.*


fun main(args: Array<String>){
    val puertoEnv = System.getenv("PORT")
    val puerto: Int = puertoEnv?.toInt() ?: 8080
    port(puerto)


    val dbi = FabricaDBI().fabricar()
    val inicializadorBD = InicializadorBD(dbi)
    inicializadorBD.inicializar()

    val repositorioUsuarios = RepositorioUsuariosPostgresJDBI(dbi, MapperUsuariosResultset())
    val listadorDeUsuarios = ListadorDeUsuarios(repositorioUsuarios)
    ControladorPrueba(listadorDeUsuarios)
}