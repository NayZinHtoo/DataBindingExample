package com.nzh.databindingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.nzh.databindingexample.databinding.ActivityMainBinding
import com.nzh.databindingexample.model.Person

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.txtWelcome.text="Hello Ko Ko Nay Zin Htoo"

        binding.btnAdd.setOnClickListener {
            var person=Person(binding.editName.text.toString())
            binding.myName=person
        }
    }
}
