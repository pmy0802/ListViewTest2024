package kr.ac.kopo.listviewtest2024

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var list = findViewById<ListView>(R.id.list)
        var imgv = findViewById<ImageView>(R.id.imgv)

        var items = arrayOf("바나나", "토마토", "메론", "딸기", "포도", "참외", "키위")
        var imgRes = arrayOf(R.drawable.img01, R.drawable.img02, R.drawable.img03, R.drawable.img04, R.drawable.img05, R.drawable.img06, R.drawable.img07)

        var adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items)
        list.adapter = adapter

        list.setOnItemClickListener { parent, view, position, id ->
            imgv.setImageResource(imgRes[position])
            Toast.makeText(applicationContext, items[position] + "는(은) 정말 달콤해요~", Toast.LENGTH_SHORT).show()
        }

    }
}