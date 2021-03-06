package com.study.rx

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.study.rx.data.User
import com.study.rx.data.UserProfile
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.core.Scheduler
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.schedulers.Schedulers
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
    companion object {
        const val TAG = "MainActivity"
    }

    private val compositeDisposable = CompositeDisposable()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //fromIterableOperator()
/*               repeatOperator().subscribe({
                   Log.d(MainActivity.TAG, "onNext : $it")
               },{
                   Log.d(MainActivity.TAG, "onError : $it")
               },{
                   Log.d(MainActivity.TAG, "onComplete")
               })*/
  /*          intervalOperator().subscribe({
                Log.d(MainActivity.TAG, "onNext : $it")
               // getLocation()
            },{
                Log.d(MainActivity.TAG, "onError : $it")
            },{
                Log.d(MainActivity.TAG, "onComplete")
            })*/

        /*      createOperator().subscribe({
                  Log.d(MainActivity.TAG, "onNext : $it")
              },{
                  Log.d(MainActivity.TAG, "onError : $it")
              },{
                  Log.d(MainActivity.TAG, "onComplete")
              })*/
/*        filterOperator()
            .filter{
                it.name=="demo2"
            }
            .subscribe({
                Log.d(MainActivity.TAG, "onNext : $it")
            },{
                Log.d(MainActivity.TAG, "onError : $it")
            },{
                Log.d(MainActivity.TAG, "onComplete")
            })*/
/*        lastOperator()
            .last( User(1,"demo1",15))
            .subscribe({
                Log.d(MainActivity.TAG, "onNext : $it")
            },{
                Log.d(MainActivity.TAG, "onError : $it")
            })*/
        /*       distinctOperator()
                  *//* .distinct{
                it.age
            }*//*
            .distinct()
            .subscribe({
                Log.d(MainActivity.TAG, "onNext : $it")
            },{
                Log.d(MainActivity.TAG, "onError : $it")
            },{
                Log.d(MainActivity.TAG, "onComplete")
            })*/
/*        skipOperator()
            //????????? 2??? ??????
            //.skip(2)
            //????????? 2??? ??????
//            .skipLast(2)
            //distinct ??? skipLast ????????? ?????? ?????? ?????????
            //distinct()
                //???????????? ????????????
            //.skip(1, TimeUnit.MILLISECONDS)
            .subscribe({
                Log.d(MainActivity.TAG, "onNext : $it")
            },{
                Log.d(MainActivity.TAG, "onError : $it")
            },{
                Log.d(MainActivity.TAG, "onComplete")
            })*/

/*        bufferOperator()
            .buffer(5)
            .subscribe({
                Log.d(MainActivity.TAG, "onNext : $it")
            },{
                Log.d(MainActivity.TAG, "onError : $it")
            },{
                Log.d(MainActivity.TAG, "onComplete")
            })*/

        /*      mapOperator()
                  *//*.map {
                it.age * 2
            }*//*
            .map {
                UserProfile(it.id, it.name, it.age, "https://test.com/${it.id}")
            }
            .subscribe({
                Log.d(MainActivity.TAG, "onNext : $it")
            },{
                Log.d(MainActivity.TAG, "onError : $it")
            },{
                Log.d(MainActivity.TAG, "onComplete")
            })*/

  /*      flatMapOperator()
            .flatMap {
                getUserProfile(it.id)
            }
            .subscribe({
                Log.d(MainActivity.TAG, "onNext : $it")
            }, {
                Log.d(MainActivity.TAG, "onError : $it")
            }, {
                Log.d(MainActivity.TAG, "onComplete")
            })

        flatMapOperatorTow()
            .flatMap {
                Observable.fromIterable(it)
            }
            .flatMap {
                getUserProfile(it.id)
            }
            .subscribe({
                Log.d(MainActivity.TAG, "onNext : $it")
            }, {
                Log.d(MainActivity.TAG, "onError : $it")
            }, {
                Log.d(MainActivity.TAG, "onComplete")
            })*/

/*        flatMapOperator()
            .flatMap {
                getUserProfile(it.id)
            }
            .subscribe({
                Log.d(MainActivity.TAG, "onNext : $it")
            }, {
                Log.d(MainActivity.TAG, "onError : $it")
            }, {
                Log.d(MainActivity.TAG, "onComplete")
            })*/

   /*     groupByOperator()
            .groupBy {
                it.age
            }
    *//*        .filter {
                it.key == 10
            }*//*
   *//*         .flatMapSingle {
                it.toList()
            }*//*
            .subscribe({group ->
                group.subscribe(
                    {
                        Log.d(MainActivity.TAG, "key : ${group.key}, value : $it")

                    },
                    {

                    },
                )
              Log.d(MainActivity.TAG, "onNext : $group")
            }, {
                Log.d(MainActivity.TAG, "onError : $it")
            }, {
                Log.d(MainActivity.TAG, "onComplete")
            })*/

/*        mergeOperator()
            .subscribe({
                Log.d(MainActivity.TAG, "onNext : $it")
            }, {
                Log.d(MainActivity.TAG, "onError : $it")
            }, {
                Log.d(MainActivity.TAG, "onComplete")
            })*/

    /*    concatOperator()
            .subscribe({
                Log.d(MainActivity.TAG, "onNext : $it")
            }, {
                Log.d(MainActivity.TAG, "onError : $it")
            }, {
                Log.d(MainActivity.TAG, "onComplete")
            })*/

/*        startWithOperator()
            .subscribe({
                Log.d(MainActivity.TAG, "onNext : $it")
            }, {
                Log.d(MainActivity.TAG, "onError : $it")
            }, {
                Log.d(MainActivity.TAG, "onComplete")
            })*/

/*        zipOperator()
            .subscribe({
                Log.d(MainActivity.TAG, "onNext : $it")
            }, {
                Log.d(MainActivity.TAG, "onError : $it")
            }, {
                Log.d(MainActivity.TAG, "onComplete")
            })*/

/*        getBlogs()
            .subscribe({
                Log.d(MainActivity.TAG, "onNext : $it")
            }, {
                Log.d(MainActivity.TAG, "onError : $it")
            }, {
                Log.d(MainActivity.TAG, "onComplete")
            })*/

/*        zipOperator()
            .subscribe({
                it.forEach {
                    Log.d(MainActivity.TAG, "onNext : $it")
                }
            }, {
                Log.d(MainActivity.TAG, "onError : $it")
            }, {
                Log.d(MainActivity.TAG, "onComplete")
            })*/

/*        compositeDisposable.add(
            createObservable()
                .subscribeOn(Schedulers.io())
                .subscribe(
                    {
                        Log.d(MainActivity.TAG, "onNext : $it")
                    }, {
                        Log.d(MainActivity.TAG, "onError : $it")
                    }, {
                        Log.d(MainActivity.TAG, "onComplete")
                    }
                )
        )*/

/*        compositeDisposable.add(
            Observable.just(mUserList)
                .flatMap {
                    Log.d(MainActivity.TAG, "Upstream ThreadName : ${Thread.currentThread().name}")
                    Observable.fromIterable(it)
                }
                    //?????? subscribeOn??? ???????????? observable??? ?????? ??????????????? ?????? ?????????
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                    {
                        Log.d(MainActivity.TAG, "onNext : $it, ThreadName : ${Thread.currentThread().name}")
                    }, {
                        Log.d(MainActivity.TAG, "onError : $it")
                    }, {
                        Log.d(MainActivity.TAG, "onComplete")
                    }
                )
        )*/

        //createSingleObservable().subscribe(observerSingleObservable())
        //createMaybeObservable().subscribe(observerMaybeObservable())
        //createCompletableObservable().subscribe(observeCompletableObservable())

/*        createFlowableObservable()
            .onBackpressureDrop()
            .observeOn(Schedulers.io(), false, 10)
            .subscribe(
                {
                    Log.d(MainActivity.TAG, "onNext : $it")
                }, {
                    Log.d(MainActivity.TAG, "onError : $it")
                }, {
                    Log.d(MainActivity.TAG, "onComplete")
                }
            )*/


/*        coldObservable().subscribe(coldObserver())
        Thread.sleep(2000)
        coldObservable().subscribe(coldObserver())
        Thread.sleep(2000)*/

/*        val hotObservable = hotObservable()
        hotObservable.subscribe(
            {
                Log.d(MainActivity.TAG, "onNext : $it")
            }, {
                Log.d(MainActivity.TAG, "onError : $it")
            }, {
                Log.d(MainActivity.TAG, "onComplete")
            }
        )

        hotObservable.connect()

        hotObservable.subscribe(
            {
                Log.d(MainActivity.TAG, "onNext : $it")
            }, {
                Log.d(MainActivity.TAG, "onError : $it")
            }, {
                Log.d(MainActivity.TAG, "onComplete 2")
            }
        )*/


    /*    val hotObservable = hotObservableTwo()
        hotObservable.connect()
        hotObservable.subscribe(
            {
                Log.d(MainActivity.TAG, "onNext : $it")
            }, {
                Log.d(MainActivity.TAG, "onError : $it")
            }, {
                Log.d(MainActivity.TAG, "onComplete ")
            }
        )
        Thread.sleep(5000)

        hotObservable.subscribe(
            {
                Log.d(MainActivity.TAG, "onNext 2 : $it")
            }, {
                Log.d(MainActivity.TAG, "onError 2 : $it")
            }, {
                Log.d(MainActivity.TAG, "onComplete 2")
            }
        )*/

        //asyncSubject()
        //asyncSubjectTwo()
        //behaviorSubjectTwo()
        //publishSubjectTwo()
        replaySubjectTwo()
    }

    private fun getLocation() {
        Log.d(TAG, "Latitude : 102.0303 Longitude : 1.2355")
    }

    override fun onDestroy() {
        compositeDisposable.clear()
        //disposable.dispose()
        Log.d(TAG, "onDestroy")
        super.onDestroy()
    }
}