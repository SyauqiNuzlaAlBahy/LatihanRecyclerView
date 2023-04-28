package com.example.latihanrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.latihanrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listStudent = arrayListOf(
            MyContact("20202231", "Andi Baso", "081111111111", "https://spesialis1.orthopaedi.fk.unair.ac.id/wp-content/uploads/2021/02/depositphotos_39258143-stock-illustration-businessman-avatar-profile-picture.jpg"),
            MyContact("20202232", "Anto Ramadhan", "081111111112", "https://spesialis1.orthopaedi.fk.unair.ac.id/wp-content/uploads/2021/02/depositphotos_39258143-stock-illustration-businessman-avatar-profile-picture.jpg"),
            MyContact("20202233", "Budi Tabuti", "081111111113", "https://spesialis1.orthopaedi.fk.unair.ac.id/wp-content/uploads/2021/02/depositphotos_39258143-stock-illustration-businessman-avatar-profile-picture.jpg"),
            MyContact("20202234", "Budi Santoso", "081111111114", "https://spesialis1.orthopaedi.fk.unair.ac.id/wp-content/uploads/2021/02/depositphotos_39258143-stock-illustration-businessman-avatar-profile-picture.jpg"),
            MyContact("20202235", "Denny Wahyudi", "081111111115", "https://spesialis1.orthopaedi.fk.unair.ac.id/wp-content/uploads/2021/02/depositphotos_39258143-stock-illustration-businessman-avatar-profile-picture.jpg"),
            MyContact("20202236", "Donny Rohyadi", "081111111116", "https://spesialis1.orthopaedi.fk.unair.ac.id/wp-content/uploads/2021/02/depositphotos_39258143-stock-illustration-businessman-avatar-profile-picture.jpg"),
            MyContact("20202231", "Andi Baso", "081111111111", "https://spesialis1.orthopaedi.fk.unair.ac.id/wp-content/uploads/2021/02/depositphotos_39258143-stock-illustration-businessman-avatar-profile-picture.jpg"),
            MyContact("20202232", "Anto Ramadhan", "081111111112", "https://spesialis1.orthopaedi.fk.unair.ac.id/wp-content/uploads/2021/02/depositphotos_39258143-stock-illustration-businessman-avatar-profile-picture.jpg"),
            MyContact("20202233", "Budi Tabuti", "081111111113", "https://spesialis1.orthopaedi.fk.unair.ac.id/wp-content/uploads/2021/02/depositphotos_39258143-stock-illustration-businessman-avatar-profile-picture.jpg"),
            MyContact("20202234", "Budi Santoso", "081111111114", "https://spesialis1.orthopaedi.fk.unair.ac.id/wp-content/uploads/2021/02/depositphotos_39258143-stock-illustration-businessman-avatar-profile-picture.jpg"),
            MyContact("20202235", "Denny Wahyudi", "081111111115", "https://spesialis1.orthopaedi.fk.unair.ac.id/wp-content/uploads/2021/02/depositphotos_39258143-stock-illustration-businessman-avatar-profile-picture.jpg"),
            MyContact("20202236", "Donny Rohyadi", "081111111116", "https://spesialis1.orthopaedi.fk.unair.ac.id/wp-content/uploads/2021/02/depositphotos_39258143-stock-illustration-businessman-avatar-profile-picture.jpg"),
            MyContact("20202231", "Andi Baso", "081111111111", "https://spesialis1.orthopaedi.fk.unair.ac.id/wp-content/uploads/2021/02/depositphotos_39258143-stock-illustration-businessman-avatar-profile-picture.jpg"),
            MyContact("20202232", "Anto Ramadhan", "081111111112", "https://spesialis1.orthopaedi.fk.unair.ac.id/wp-content/uploads/2021/02/depositphotos_39258143-stock-illustration-businessman-avatar-profile-picture.jpg"),
            MyContact("20202233", "Budi Tabuti", "081111111113", "https://spesialis1.orthopaedi.fk.unair.ac.id/wp-content/uploads/2021/02/depositphotos_39258143-stock-illustration-businessman-avatar-profile-picture.jpg"),
            MyContact("20202234", "Budi Santoso", "081111111114", "https://spesialis1.orthopaedi.fk.unair.ac.id/wp-content/uploads/2021/02/depositphotos_39258143-stock-illustration-businessman-avatar-profile-picture.jpg"),
            MyContact("20202235", "Denny Wahyudi", "081111111115", "https://spesialis1.orthopaedi.fk.unair.ac.id/wp-content/uploads/2021/02/depositphotos_39258143-stock-illustration-businessman-avatar-profile-picture.jpg"),
            MyContact("20202236", "Donny Rohyadi", "081111111116", "https://spesialis1.orthopaedi.fk.unair.ac.id/wp-content/uploads/2021/02/depositphotos_39258143-stock-illustration-businessman-avatar-profile-picture.jpg"),
            MyContact("20202231", "Andi Baso", "081111111111", "https://spesialis1.orthopaedi.fk.unair.ac.id/wp-content/uploads/2021/02/depositphotos_39258143-stock-illustration-businessman-avatar-profile-picture.jpg"),
            MyContact("20202232", "Anto Ramadhan", "081111111112", "https://spesialis1.orthopaedi.fk.unair.ac.id/wp-content/uploads/2021/02/depositphotos_39258143-stock-illustration-businessman-avatar-profile-picture.jpg"),
            MyContact("20202233", "Budi Tabuti", "081111111113", "https://spesialis1.orthopaedi.fk.unair.ac.id/wp-content/uploads/2021/02/depositphotos_39258143-stock-illustration-businessman-avatar-profile-picture.jpg"),
            MyContact("20202234", "Budi Santoso", "081111111114", "https://spesialis1.orthopaedi.fk.unair.ac.id/wp-content/uploads/2021/02/depositphotos_39258143-stock-illustration-businessman-avatar-profile-picture.jpg"),
            MyContact("20202235", "Denny Wahyudi", "081111111115", "https://spesialis1.orthopaedi.fk.unair.ac.id/wp-content/uploads/2021/02/depositphotos_39258143-stock-illustration-businessman-avatar-profile-picture.jpg"),
            MyContact("20202236", "Donny Rohyadi", "081111111116", "https://spesialis1.orthopaedi.fk.unair.ac.id/wp-content/uploads/2021/02/depositphotos_39258143-stock-illustration-businessman-avatar-profile-picture.jpg")
        )

        cardView(listStudent)


    }

    private fun listView(value : ArrayList<MyContact>){
        val adapter = ListViewAdapter(this, value)

        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvContact.layoutManager = layoutManager
        binding.rvContact.adapter = adapter
    }

    private fun gridView(value : ArrayList<MyContact>){
        val adapter = GridViewAdapter(this,value)

        val layoutManager = GridLayoutManager(this, 2, LinearLayoutManager.VERTICAL, false)
        binding.rvContact.layoutManager = layoutManager
        binding.rvContact.adapter = adapter
    }

    private fun cardView(value : ArrayList<MyContact>){
        val adapter = CardViewAdapter(this, value)

        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvContact.layoutManager = layoutManager
        binding.rvContact.adapter = adapter
    }
}