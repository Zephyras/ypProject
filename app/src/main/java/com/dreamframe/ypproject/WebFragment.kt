package com.dreamframe.ypproject


import android.app.Dialog
import android.app.Notification
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_web.*

/**
 * A simple [Fragment] subclass.
 */
class WebFragment : Fragment() {

    private val url = "https://smartstore.naver.com/yangpum"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_web, container, false)
        
    }
}