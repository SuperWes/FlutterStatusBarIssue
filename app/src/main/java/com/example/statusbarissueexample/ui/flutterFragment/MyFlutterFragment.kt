package com.example.statusbarissueexample.ui.flutterFragment

import android.content.Context
import android.os.Bundle
import io.flutter.embedding.android.FlutterFragment
import io.flutter.embedding.android.RenderMode
import io.flutter.embedding.android.TransparencyMode
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.embedding.engine.FlutterEngineCache
import io.flutter.embedding.engine.dart.DartExecutor

class MyFlutterFragment : FlutterFragment() {

    override fun getRenderMode(): RenderMode {
        return RenderMode.surface
    }

    override fun getTransparencyMode(): TransparencyMode {
        return TransparencyMode.transparent
    }

    override fun shouldAttachEngineToActivity(): Boolean {
        return true
    }

    override fun getCachedEngineId(): String? {
        return "my_cached_engine"
    }

    override fun provideFlutterEngine(context: Context): FlutterEngine? {

        return FlutterEngineCache.getInstance().get("my_cached_engine")
    }
}