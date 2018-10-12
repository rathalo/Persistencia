package br.com.renannassar.persistencia

import com.facebook.stetho.Stetho
import android.app.Application

//cria essa class para usar o stetho
//nao esquecer de chamar ele no manifest para ele executar logo de inicio

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Stetho.initializeWithDefaults(this)
    }
}