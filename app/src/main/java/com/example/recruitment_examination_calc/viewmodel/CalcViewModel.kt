package com.example.recruitment_examination_calc.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class CalcViewModel @Inject constructor(): ViewModel() {
    // 計算結果
    val inputNumber: MutableLiveData<String> = MutableLiveData("")
    val inputOperator: MutableLiveData<String> = MutableLiveData("")
    val calcResult: MutableLiveData<String> = MutableLiveData("")

    // onClick処理
    fun onClickNumber0() {
        calcResult.value += "0"
    }
    fun onClickNumber1() {
        calcResult.value += "1"
    }
    fun onClickNumber2() {
        calcResult.value += "2"
    }
    fun onClickNumber3() {
        calcResult.value += "3"
    }
    fun onClickNumber4() {
        calcResult.value += "4"
    }
    fun onClickNumber5() {
        calcResult.value += "5"
    }
    fun onClickNumber6() {
        calcResult.value += "6"
    }
    fun onClickNumber7() {
        calcResult.value += "7"
    }
    fun onClickNumber8() {
        calcResult.value += "8"
    }
    fun onClickNumber9() {
        calcResult.value += "9"
    }

    // 演算子
    fun onClickPlus() {}
    fun onClickMinus() {}
    fun onClickAsterisk() {}
    fun onClickSolidus() {}

    // 結果出力
    fun onClickEqual() {}
}