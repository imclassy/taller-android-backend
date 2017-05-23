package edu.uac.spark.controladores

import com.google.gson.Gson
import edu.uac.negocio.casos_de_uso.ListadorDeUsuarios
import edu.uac.spark.servidor.RUTA_PRUEBA
import spark.Spark.get

/**
 * Created by pjaraba on 5/23/2017.
 */
class ControladorPrueba(val listadorDeUsuarios: ListadorDeUsuarios) {
    val gson : Gson
    init {
        gson = Gson()
        get(RUTA_PRUEBA, { request, response -> listadorDeUsuarios.listarTodos() }, gson::toJson)
    }

}