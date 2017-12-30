package com.popumovie.keyalive.firstkotlin

import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.support.v7.app.AlertDialog
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//      click listener
        btn_hitung.setOnClickListener{
            if (input1.text.toString().isNotEmpty()&& input2.text.toString().isNotEmpty()){

//            Toast.makeText(this, "Hai ini pake kotlin loo",Toast.LENGTH_SHORT).show()
//            ambil input user
            var satu = input1.text.toString()
            var dua =input2.text.toString()

//            convert nilai string ke interger atau double
//            kalau java
//            Double.parseDouble("stringnya");
            var x = satu.toDouble()
            var y = dua.toDouble()

            var hit= x*y
            //            hasil di tampilkan pada toast
//            Toast.makeText(this,hit.toInt().toString(),Toast.LENGTH_SHORT).show()
//            var alert = AlertDialog.Builder(this)
//            alert.setMessage(hit.toString())
//            alert.setIcon(R.mipmap.ic_launcher)
//            tambahkan button interface

//            alert.setPositiveButton("ok", DialogInterface.OnClickListener { dialog, i ->  dialog.dismiss()})
//            alert.show()
                ErrorAlert(hit.toString())

            }else{
//                Toast.makeText(this,"KUDU DI ISI",Toast.LENGTH_SHORT).show()
                ErrorAlert("KUDU DI ISI")
            }

        }
    }
    fun ErrorAlert(message: String){
        var alert = AlertDialog.Builder(this)
        alert.setMessage(message)
        alert.setIcon(R.mipmap.ic_launcher)
        alert.setPositiveButton("ok", DialogInterface.OnClickListener { dialog, i ->  dialog.dismiss()})
        alert.show()


    }

}
