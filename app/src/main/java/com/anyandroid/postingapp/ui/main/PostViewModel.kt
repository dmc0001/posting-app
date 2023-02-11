package com.anyandroid.postingapp.ui.main


import android.annotation.SuppressLint
import android.content.ContentValues.TAG
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.anyandroid.postingapp.data.PostsClient.Companion.getINSTANCE
import com.anyandroid.postingapp.pojo.PostModel
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.schedulers.Schedulers

class PostViewModel : ViewModel() {
    val postsMutableLiveData = MutableLiveData<List<PostModel>>()
    private val compositeDisposable = CompositeDisposable()

    @SuppressLint("CheckResult")
    fun getPosts() {
        val single = getINSTANCE().getPosts()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
        compositeDisposable.add(
            single.subscribe(
                // set value to live data
                { t ->
                    postsMutableLiveData.postValue(t)
                },
                // onError
                { e -> Log.d(TAG, "dmc69 error: $e") })
        )

    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.clear()
    }

}
