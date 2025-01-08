package com.devspace.recyclerview

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val rvList = findViewById<RecyclerView>(R.id.rv_list)
        val ivGrid = findViewById<ImageView>(R.id.iv_grid)
        val ivList = findViewById<ImageView>(R.id.iv_list)
        val adapter = ContactListAdapter()

        rvList.adapter = adapter
        rvList.layoutManager = LinearLayoutManager(this)
        adapter.submitList(contacts)

        ivGrid.setOnClickListener {
            rvList.layoutManager = GridLayoutManager(this, 2)
        }

        ivList.setOnClickListener {
            rvList.layoutManager = LinearLayoutManager(this)
        }

        adapter.setOnClickListener { contact ->
            val intent = Intent(this, ContactDetailsActivity::class.java)
            intent.putExtra("name", contact.name)
            intent.putExtra("phone", contact.phone)
            intent.putExtra("icon", contact.icon)
            startActivity(intent)


        }
    }
}

private val contacts = listOf(
    Contact(
        name = "Emanuella",
        phone = "(41) 9 9425-4523",
        icon = R.drawable.sample1
    ),
    Contact(
        name = "Frederico",
        phone = "(41) 9 9545-3555",
        icon = R.drawable.sample2
    ),
    Contact(
        name = "Ester",
        phone = "(41) 9 9645-3446",
        icon = R.drawable.sample3
    ),
    Contact(
        name = "Paulo",
        phone = "(41) 9 9654-3005",
        icon = R.drawable.sample4
    ),
    Contact(
        name = "Atais",
        phone = "(41) 9 9844-3091",
        icon = R.drawable.sample5
    ),
    Contact(
        name = "Amanda",
        phone = "(41) 9 9005-6784",
        icon = R.drawable.sample6
    ),
    Contact(
        name = "Vitória",
        phone = "(41) 9 9645-0293",
        icon = R.drawable.sample7
    ),
    Contact(
        name = "Alex",
        phone = "(41) 9 9332-3345",
        icon = R.drawable.sample8
    ),
    Contact(
        name = "Pedro",
        phone = "(41) 9 1123-0938",
        icon = R.drawable.sample9
    ),
    Contact(
        name = "Rodrigo",
        phone = "(41) 9 9234-0029",
        icon = R.drawable.sample10
    ),
    Contact(
        name = "Ivry",
        phone = "(41) 9 8923-4290",
        icon = R.drawable.sample11
    ),
    Contact(
        name = "Eduardo",
        phone = "(41) 9 9846-0944",
        icon = R.drawable.sample12
    ),
    Contact(
        name = "Emily",
        phone = "(41) 9 9437-7734",
        icon = R.drawable.sample13
    ),
    Contact(
        name = "Cezar",
        phone = "(41) 9 9095-3545",
        icon = R.drawable.sample14
    ),
    Contact(
        name = "Ana Paula",
        phone = "(41) 9 9044-8439",
        icon = R.drawable.sample15
    ),
    Contact(
        name = "Natália",
        phone = "(41) 9 9204-0344",
        icon = R.drawable.sample16
    ),
    Contact(
        name = "Cezar",
        phone = "(41) 9 9095-3545",
        icon = R.drawable.sample14
    ),
    Contact(
        name = "Ana Paula",
        phone = "(41) 9 9044-8439",
        icon = R.drawable.sample15
    ),
    Contact(
        name = "Natália",
        phone = "(41) 9 9204-0344",
        icon = R.drawable.sample16
    ),
    Contact(
        name = "Cezar",
        phone = "(41) 9 9095-3545",
        icon = R.drawable.sample14
    ),
    Contact(
        name = "Ana Paula",
        phone = "(41) 9 9044-8439",
        icon = R.drawable.sample15
    ),
    Contact(
        name = "Natália",
        phone = "(41) 9 9204-0344",
        icon = R.drawable.sample16
    ),
)