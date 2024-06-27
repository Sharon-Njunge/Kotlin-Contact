package com.akirachix.mycontacts

import android.os.Binder
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.LayoutInflaterCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.mycontacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvContacts.layoutManager=LinearLayoutManager(this)
        displayContacts()
        }

    fun displayContacts(){
        val contact1 = Contact("Maureen", "0715775485","njeri@gmail.com","")
        val contact2 = Contact("Sharon", "0715775485","shazzy@gmail.com","")
        val contact3 = Contact("Martha", "0715775485","mongeli@gmail.com","")
        val contact4 = Contact("Lau", "0715775485","laura@gmail.com","")
        val contact5 = Contact("Wanjoix", "0715775485","wanjoix@gmail.com","")
        val contact6 = Contact("Blondie", "0715775485","debz@gmail.com","")
        val contact7 = Contact("Kinuthia", "0715775485","essie@gmail.com","")
        val contact8 = Contact("Kuria", "0715775485","kuria@gmail.com","")
        val contact9 = Contact("Samidoo", "0715775485","samsam@gmail.com","")

        val contactList = listOf(contact1, contact2, contact3, contact4, contact5, contact6, contact7, contact8, contact9)
        val contactsAdapter = ContactsAdapter(contactList)
        binding.rvContacts.adapter= contactsAdapter

    }
    }
