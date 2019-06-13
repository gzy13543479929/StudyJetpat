package com.example.studyjetpat.ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyStudyViewModel extends ViewModel {
    private MutableLiveData<String>  number;

    public MutableLiveData<String> getNumber() {
        if(number == null){
            number = new MutableLiveData<String>();
        }
        return number;
    }

}
