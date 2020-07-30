package com.example.statusbarissueexample

import android.app.Application
import android.content.res.Configuration
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.embedding.engine.FlutterEngineCache
import io.flutter.embedding.engine.dart.DartExecutor

class MyCustomApplication : Application() {
    lateinit var myFlutterEngine: FlutterEngine

    override fun onCreate() {
        super.onCreate()
        myFlutterEngine = FlutterEngine(applicationContext)

        myFlutterEngine.dartExecutor.executeDartEntrypoint(
            DartExecutor.DartEntrypoint.createDefault()
        )

        FlutterEngineCache
            .getInstance()
            .put("my_cached_engine", myFlutterEngine)
    }

    override fun onConfigurationChanged ( newConfig : Configuration) {
        super.onConfigurationChanged(newConfig)
    }

    override fun onLowMemory() {
        super.onLowMemory()
    }
}