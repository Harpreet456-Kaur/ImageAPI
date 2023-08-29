package com.example.imageapi

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.imageapi.api.APInstance
import com.example.imageapi.api.APInterface
import com.example.imageapi.api.MyData
import com.example.imageapi.databinding.ActivityMainBinding
import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        binding.getBtn.setOnClickListener {
             post()
        }
    }

    private fun post() {
//        val mediaType = MediaType.parse("application/json")
//        val url = mapOf<String, Any>(
//            "timeout" to 30000,
//            "url" to "http://google.com"
//        )

        val requestBody  = RequestData(30000,"http://google.com")
        val gson = Gson().toJson(requestBody)
        println("TAG--------> $gson")
//        val jsonString = Gson().toJson(requestBody.url)

//        val params = Params(subType = "usage")
//        params.subType = "usage"


        APInstance.apiInstance().create(APInterface::class.java).getData(gson)
        .enqueue(object : Callback<MyData> {

            //                    binding.txt.text = res!!.subType
            //System.out.println("in response body ${response.body()}")
            //Log.d("TAG--->",res.subType.toString())
            //System.out.println("in response ${response}")
//                    Glide.with(this@MainActivity)
//                        .load(res.url)
//                        .into(binding.image)

            override fun onResponse(call: Call<MyData>, response: Response<MyData>) {
                val res = response.body()
                //Log.d("TAG----->",res.toString())
              //  try {
                    Log.d("TAG---->", res!!.error)
                    Log.d("TAG---->", res.id)
                    Log.d("TAG---->", res.self)
                    Log.d("TAG---->", res.status)
                    binding.txt.text = res.error.toString()
                //} catch (e: Exception) {
                   // Toast.makeText(applicationContext, "Error", Toast.LENGTH_SHORT).show()
               // }
            }

            override fun onFailure(call: Call<MyData>, t: Throwable) {
                Log.d("TAG---->", t.message.toString())
            }
        })
    }

    data class RequestData(
        var timeout : Int ,
        var url : String
    )
}