package com.example.livedatamvvm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UserModel: ViewModel() {
    var text:MutableLiveData<String> =MutableLiveData("Type")
    var intValue:MutableLiveData<Int> =MutableLiveData(0)
    var a = 0

    fun updateValue(isIncrease : Boolean = true){
        if(isIncrease)
        a++
        else a = 0
        intValue.setValue(a)
    }
}