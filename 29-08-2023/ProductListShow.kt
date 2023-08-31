package com.example.amulproducts

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class ProductListShow : AppCompatActivity() {
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


        imgbutter.setOnClickListener {

            var butterUrl = "https://amul.com/products/amul-tablebutter-info.php"
            var i = Intent (Intent.ACTION_VIEW)
            i.setData(Uri.parse(butterUrl))
            startActivity(i)
        }

        txtbutter.setOnClickListener {

            Toast.makeText(applicationContext, "210 Rs", Toast.LENGTH_SHORT).show()
        }

        imgcheese.setOnClickListener {

            var cheeseUrl = "https://amul.com/products/cheese.php"
            var i = Intent (Intent.ACTION_VIEW)
            i.setData(Uri.parse(cheeseUrl))
            startActivity(i)
        }

        txtcheese.setOnClickListener {

            Toast.makeText(applicationContext, "190 Rs", Toast.LENGTH_SHORT).show()
        }

        imgchoco.setOnClickListener {

            var chocoUrl = "https://amul.com/products/chocolate.php"
            var i = Intent (Intent.ACTION_VIEW)
            i.setData(Uri.parse(chocoUrl))
            startActivity(i)
        }

        txtchoco.setOnClickListener {

            Toast.makeText(applicationContext, "100 Rs", Toast.LENGTH_SHORT).show()
        }

        imgcool.setOnClickListener {

            var coolUrl = "https://amul.com/products/beverage-range.php"
            var i = Intent (Intent.ACTION_VIEW)
            i.setData(Uri.parse(coolUrl))
            startActivity(i)
        }

        txtcool.setOnClickListener {

            Toast.makeText(applicationContext, "30 Rs", Toast.LENGTH_SHORT).show()
        }

        imglassi.setOnClickListener {

            var lassiUrl = "https://amul.com/products/beverage-range.php"
            var i = Intent (Intent.ACTION_VIEW)
            i.setData(Uri.parse(lassiUrl))
            startActivity(i)
        }

        txtlassi.setOnClickListener {

            Toast.makeText(applicationContext, "35 Rs", Toast.LENGTH_SHORT).show()
        }
        imgice.setOnClickListener {

            var iceUrl = "https://amul.com/products/icecream.php"
            var i = Intent (Intent.ACTION_VIEW)
            i.setData(Uri.parse(iceUrl))
            startActivity(i)
        }

        txtice.setOnClickListener {

            Toast.makeText(applicationContext, "25 Rs", Toast.LENGTH_SHORT).show()
        }



        imgmilk.setOnClickListener {

            var milkUrl = "https://amul.com/products/milk.php"
            var i = Intent (Intent.ACTION_VIEW)
            i.setData(Uri.parse(milkUrl))
            startActivity(i)
        }

        txtmilk.setOnClickListener {

            Toast.makeText(applicationContext, "32 Rs", Toast.LENGTH_SHORT).show()
        }



    }
}