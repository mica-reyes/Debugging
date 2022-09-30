package com.example.debugging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //logging()
        division()
        //tryCatchDivision()
    }

    fun division() {
        val numerator = 60
        var denominator = 4
        repeat(5) {
            Log.d(TAG, "denominator $denominator")
            Log.v(TAG, "${numerator / denominator}")
            denominator--
        }
    }

    fun tryCatchDivision() {
        val numerator = 60
        var denominator = 4
        repeat(5) {
            Log.d(TAG, "denominator $denominator")
            try {
                 Log.v(TAG, "${numerator / denominator}")
             }catch (e: Exception){
                 Log.e(TAG, "ERROR: ${e.message}!")
             }
            denominator--
        }
    }

    fun logging(){
        //Log.v(TAG, "Hello, world!")
        Log.e(TAG, "ERROR: a serious error like an app crash")
        Log.w(TAG, "WARN: warns about the potential for serious errors")
        Log.i(TAG, "INFO: reporting technical information, such as an operation succeeding")
        Log.d(TAG, "DEBUG: reporting technical information useful for debugging")
        Log.v(TAG, "VERBOSE: more verbose than DEBUG logs")
    }
}