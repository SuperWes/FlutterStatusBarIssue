package com.example.statusbarissueexample.ui.flutterFragment

import io.flutter.embedding.android.FlutterFragment
import io.flutter.embedding.android.RenderMode
import io.flutter.embedding.android.TransparencyMode

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

    override fun shouldDestroyEngineWithHost(): Boolean {
        return true
    }
}