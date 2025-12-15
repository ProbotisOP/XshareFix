package com.probotisop.xsharefix

import android.content.*
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ShareHandlerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val text = intent.getStringExtra(Intent.EXTRA_TEXT) ?: ""

        val clipboard = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        clipboard.setPrimaryClip(ClipData.newPlainText("X Post", text))

        finish()
    }
}
