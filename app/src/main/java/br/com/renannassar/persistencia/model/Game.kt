package br.com.renannassar.persistencia.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import java.lang.reflect.Constructor


@Entity
class Game {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
    var nome: String? = null
    var plataforma:String? = null


    constructor(){}

    constructor(nome:String,plataforma:String){
        this.nome = nome
        this.plataforma = plataforma
    }

    constructor(id:Int,nome:String,plataforma: String){
        this.id = id
        this.nome = nome
        this.plataforma = plataforma
    }

}