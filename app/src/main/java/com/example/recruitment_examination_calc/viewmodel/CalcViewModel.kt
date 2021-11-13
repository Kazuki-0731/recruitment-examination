package com.example.recruitment_examination_calc.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import timber.log.Timber
import javax.inject.Inject

class CalcViewModel @Inject constructor(): ViewModel() {
    // 計算結果
    val calcResult: MutableLiveData<String> = MutableLiveData()

    init {
        calcResult.value = ""
    }

    // データ保持領域
    fun test() {
        Timber.d("asflsajkfdklafjhd")
    }

    // onClick処理

}