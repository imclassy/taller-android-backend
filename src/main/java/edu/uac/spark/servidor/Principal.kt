package edu.uac.spark.servidor

import edu.uac.datos.repositorios.RepositorioUsuariosPrueba
import edu.uac.negocio.casos_de_uso.ListadorDeUsuarios
import edu.uac.spark.controladores.ControladorPrueba
import spark.Spark.*

/**
 * Created by pjaraba on 5/22/2017.
 */

fun main(args: Array<String>){
    port(8080)
    val repositorioUsuarios = RepositorioUsuariosPrueba()
    val listadorDeUsuarios = ListadorDeUsuarios(repositorioUsuarios)
    ControladorPrueba(listadorDeUsuarios)
}