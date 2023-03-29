package com.zubet.calculatorcustom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var tambah : Button
    private lateinit var kurang : Button
    private lateinit var kali : Button
    private lateinit var bagi : Button
    private lateinit var reset : Button
    private lateinit var bil1 : EditText
    private lateinit var bil2 : EditText
    private lateinit var hasil : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tambah = findViewById(R.id.btnplus)
        kurang = findViewById(R.id.btnminus)
        kali = findViewById(R.id.btnkali)
        bagi = findViewById(R.id.btnbagi)
        reset = findViewById(R.id.btnreset)
        bil1 = findViewById(R.id.bilangansatu)
        bil2 = findViewById(R.id.bilangandua)
        hasil = findViewById(R.id.txthasil)

        tambah.setOnClickListener { plus() }
        kurang.setOnClickListener { minus() }
        kali.setOnClickListener { kali() }
        bagi.setOnClickListener { bagi() }
        reset.setOnClickListener { reset() }

    }

    fun plus (){
        val hitung = bil1.text.toString().toDouble() + bil2.text.toString().toDouble()
        hasil.text = hitung.toString()
    }

    fun minus (){
        val hitung = bil1.text.toString().toDouble() - bil2.text.toString().toDouble()
        hasil.text = hitung.toString()
    }

    fun kali (){
        val hitung = bil1.text.toString().toDouble() * bil2.text.toString().toDouble()
        hasil.text = hitung.toString()
    }

    fun bagi (){
        val hitung = bil1.text.toString().toDouble() / bil2.text.toString().toDouble()
        hasil.text = hitung.toString()
    }

    fun reset(){
        hasil.text = 0.toString()
        bil1.text.clear()
        bil2.text.clear()
    }

}