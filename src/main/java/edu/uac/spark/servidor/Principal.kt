package edu.uac.spark.servidor

import edu.uac.datos.repositorios.RepositorioUsuariosPrueba
import edu.uac.negocio.casos_de_uso.ListadorDeUsuarios
import edu.uac.spark.controladores.ControladorPrueba
import spark.Spark.*


fun main(args: Array<String>){
    val puertoEnv = System.getenv("PORT")
    val puerto: Int = if(puertoEnv == null) 8080 else Integer.getInteger(puertoEnv)
    port(puerto)
    val repositorioUsuarios = RepositorioUsuariosPrueba()
    val listadorDeUsuarios = ListadorDeUsuarios(repositorioUsuarios)
    ControladorPrueba(listadorDeUsuarios)
}