package com.study.rx

import android.util.Log
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable
import java.util.*

val mListNum = mutableListOf(1,2,3,4,5,6,7,8,9,10,11,12)
val arraysNum1 = arrayOf(1,2,3,4,5,6,7,8,9,10,11,12)
val arraysNum2 = arrayOf(10,20,30,40,50,60,70,80,90,100,110,120)

fun justOperator(){
    val observable = Observable.just(mListNum)

    val observer = object : Observer<List<Int>> {
        override fun onSubscribe(d: Disposable) {
            Log.d(MainActivity.TAG, "onSubscribe")
        }

        override fun onError(e: Throwable) {
            Log.d(MainActivity.TAG, "onError : $e")
        }

        override fun onComplete() {
            Log.d(MainActivity.TAG, "onComplete")
        }

        override fun onNext(t: List<Int>) {
            Log.d(MainActivity.TAG, "onNext : $t")
        }

    }

    observable.subscribe(observer)
}

fun fromOperator(){
    val observable = Observable.fromArray(arraysNum1)

    val observer = object : Observer<Array<Int>> {
        override fun onSubscribe(d: Disposable) {
            Log.d(MainActivity.TAG, "onSubscribe")
        }

        override fun onError(e: Throwable) {
            Log.d(MainActivity.TAG, "onError : $e")
        }

        override fun onComplete() {
            Log.d(MainActivity.TAG, "onComplete")
        }

        override fun onNext(t: Array<Int>) {
            Log.d(MainActivity.TAG, "onNext : ${Arrays.toString(t)}")
        }
    }

    observable.subscribe(observer)
}

fun fromIterableOperator(){
    val observable = Observable.fromIterable(mListNum)

    val observer = object : Observer<Int> {
        override fun onSubscribe(d: Disposable) {
            Log.d(MainActivity.TAG, "onSubscribe")
        }

        override fun onError(e: Throwable) {
            Log.d(MainActivity.TAG, "onError : $e")
        }

        override fun onComplete() {
            Log.d(MainActivity.TAG, "onComplete")
        }

        override fun onNext(t: Int) {
            Log.d(MainActivity.TAG, "onNext : $t")
        }
    }

    observable.subscribe(observer)
}

fun rangeOperator() : Observable<Int>{
    return Observable.range(1,1900)
}