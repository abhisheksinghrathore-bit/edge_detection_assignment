package com.example.edgedetection

import android.Manifest
import android.app.Activity
import android.content.pm.PackageManager
import android.os.Bundle
import android.view.SurfaceView
import android.widget.FrameLayout
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class MainActivity : Activity() {

    companion object {
        init {
            System.loadLibrary("native-lib")
        }
    }

    private val CAMERA_PERMISSION = 101

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view = SurfaceView(this)
        setContentView(FrameLayout(this).apply { addView(view) })

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CAMERA), CAMERA_PERMISSION)
        } else {
            // init camera and GL renderer (stub)
        }
    }

    // JNI bridge example
    external fun processFrame(ptr: Long, width: Int, height: Int): Long
}
