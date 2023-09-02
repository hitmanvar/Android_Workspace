package com.example.amulproducts

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.speech.tts.TextToSpeech.QUEUE_ADD
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.Locale

class ProductListShow : AppCompatActivity(), TextToSpeech.OnInitListener {
    lateinit var imgbutter : ImageView
    lateinit var imgcheese : ImageView
    lateinit var imgchoco : ImageView
    lateinit var imgcool : ImageView
    lateinit var imgice : ImageView
    lateinit var imglassi : ImageView
    lateinit var imgmilk : ImageView

    lateinit var txtbutter : TextView
    lateinit var txtcheese : TextView
    lateinit var txtchoco : TextView
    lateinit var txtcool : TextView
    lateinit var txtice : TextView
    lateinit var txtlassi : TextView
    lateinit var txtmilk : TextView
    lateinit var tts: TextToSpeech

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_list_show)

        imgbutter=findViewById(R.id.butterimg)
        imgcheese=findViewById(R.id.cheeseimg)
        imgchoco=findViewById(R.id.chocoimg)
        imgcool=findViewById(R.id.coolimg)
        imgice=findViewById(R.id.iceimg)
        imglassi=findViewById(R.id.lassimg)
        imgmilk=findViewById(R.id.milkimg)

        txtbutter=findViewById(R.id.txtbutter)
        txtcheese=findViewById(R.id.txtcheese)
        txtchoco=findViewById(R.id.txtchoco)
        txtcool=findViewById(R.id.txtcool)
        txtice=findViewById(R.id.txtice)
        txtlassi=findViewById(R.id.txtlassi)
        txtmilk=findViewById(R.id.txtmilk)

        tts = TextToSpeech(applicationContext,this)

        imgbutter.setOnClickListener {

/*            var butterUrl = "https://amul.com/products/amul-tablebutter-info.php"
            var i = Intent (Intent.ACTION_VIEW)
            i.setData(Uri.parse(butterUrl))
            startActivity(i)*/

            var txt1 = txtbutter.text.toString()
            tts.speak(txt1,QUEUE_ADD,null)


        }

        txtbutter.setOnClickListener {

            Toast.makeText(applicationContext, "210 Rs", Toast.LENGTH_SHORT).show()
        }

        imgcheese.setOnClickListener {

          /*  var cheeseUrl = "https://amul.com/products/cheese.php"
            var i = Intent (Intent.ACTION_VIEW)
            i.setData(Uri.parse(cheeseUrl))
            startActivity(i)*/

            var txt1 = txtcheese.text.toString()
            tts.speak(txt1,QUEUE_ADD,null)
        }

        txtcheese.setOnClickListener {

            Toast.makeText(applicationContext, "190 Rs", Toast.LENGTH_SHORT).show()
        }

        imgchoco.setOnClickListener {

            /*var chocoUrl = "https://amul.com/products/chocolate.php"
            var i = Intent (Intent.ACTION_VIEW)
            i.setData(Uri.parse(chocoUrl))
            startActivity(i)*/
            var txt1 = txtchoco.text.toString()
            tts.speak(txt1,QUEUE_ADD,null)
        }

        txtchoco.setOnClickListener {

            Toast.makeText(applicationContext, "100 Rs", Toast.LENGTH_SHORT).show()
        }

        imgcool.setOnClickListener {

          /*  var coolUrl = "https://amul.com/products/beverage-range.php"
            var i = Intent (Intent.ACTION_VIEW)
            i.setData(Uri.parse(coolUrl))
            startActivity(i)*/

            var txt1 = txtcool.text.toString()
            tts.speak(txt1,QUEUE_ADD,null)
        }

        txtcool.setOnClickListener {

            Toast.makeText(applicationContext, "30 Rs", Toast.LENGTH_SHORT).show()
        }

        imglassi.setOnClickListener {

            /*var lassiUrl = "https://amul.com/products/beverage-range.php"
            var i = Intent (Intent.ACTION_VIEW)
            i.setData(Uri.parse(lassiUrl))
            startActivity(i)*/

            var txt1 = txtlassi.text.toString()
            tts.speak(txt1,QUEUE_ADD,null)

        }

        txtlassi.setOnClickListener {

            Toast.makeText(applicationContext, "35 Rs", Toast.LENGTH_SHORT).show()
        }
        imgice.setOnClickListener {

         /*   var iceUrl = "https://amul.com/products/icecream.php"
            var i = Intent (Intent.ACTION_VIEW)
            i.setData(Uri.parse(iceUrl))
            startActivity(i)*/

            var txt1 = txtice.text.toString()
            tts.speak(txt1,QUEUE_ADD,null)
        }

        txtice.setOnClickListener {

            Toast.makeText(applicationContext, "25 Rs", Toast.LENGTH_SHORT).show()
        }



        imgmilk.setOnClickListener {

            /*var milkUrl = "https://amul.com/products/milk.php"
            var i = Intent (Intent.ACTION_VIEW)
            i.setData(Uri.parse(milkUrl))
            startActivity(i)*/
            var txt1 = txtmilk.text.toString()
            tts.speak(txt1,QUEUE_ADD,null)
        }

        txtmilk.setOnClickListener {

            Toast.makeText(applicationContext, "32 Rs", Toast.LENGTH_SHORT).show()
        }



    }

    override fun onInit(p0: Int) {
        tts.setLanguage(Locale.US)
        tts.setSpeechRate(.8f)
        tts.setPitch(.8F)
    }
}