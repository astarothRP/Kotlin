package com.astaroth.trainingkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import com.squareup.picasso.Picasso

fun Context.toast(text:CharSequence, lengh:Int = Toast.LENGTH_SHORT){
	Toast.makeText(this, text, lengh).show()
}

fun ViewGroup.inflate(layoutRes: Int): View {
	return LayoutInflater.from(context).inflate(layoutRes, this, false)
}

fun ImageView.loadUrl(url: String) {
	Picasso.with(context).load(url).into(this)
}