package mx.edu.itson.mydigimind

import java.io.Serializable

class Carrito : Serializable {
    var recordatorios = ArrayList<Recordatorio>()

    fun agregar(r: Recordatorio): Boolean {
        return recordatorios.add(r)
    }
}