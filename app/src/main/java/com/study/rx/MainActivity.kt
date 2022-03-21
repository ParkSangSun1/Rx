package com.study.rx

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable

class MainActivity : AppCompatActivity() {
    companion object {
        const val TAG = "MainActivity"
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //fromIterableOperator()
        rangeOperator().subscribe({
            Log.d(MainActivity.TAG, "onNext : $it")
        },{
            Log.d(MainActivity.TAG, "onError : $it")
        },{
            Log.d(MainActivity.TAG, "onComplete")
        })
    }
}