package com.example.mvvmrecipeapp.presentation

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.mvvmrecipeapp.R
import com.example.mvvmrecipeapp.presentation.BaseApplication
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val service = Retrofit.Builder().baseUrl("https://food2fork.ca/api/recipe/")
//            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
//            .build()
//            .create(RecipeServices::class.java)
//
//        CoroutineScope(IO).launch {
//            val recipe = service.get(
//                token = "Token 9c8b06d329136da358c2d00e76946b0111ce2c48",
//                id = 583
//            )
//
//            Log.d("test ", "onCreate: ${recipe.title}")
//        }

    }
}