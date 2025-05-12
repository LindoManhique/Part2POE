package com.example.budgetapp_youtube.ui.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.budgetapp_youtube.ui.entities.Profile
import com.example.budgetapp_youtube.ui.repository.ProfileRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class ProfileViewModel @Inject constructor(

    val  profileRespository: ProfileRepository

) :ViewModel() {

    val profileLiveData:LiveData<List<Profile>> = profileRespository.getProfile()

    fun insertProfileData(profile: Profile) = viewModelScope.launch {
        profileRespository.insertProfileData(profile)
    }

}