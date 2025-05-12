package com.example.budgetapp_youtube.ui.repository

import com.example.budgetapp_youtube.ui.db.ProfileDao
import com.example.budgetapp_youtube.ui.entities.Profile
import javax.inject.Inject

class ProfileRepository @Inject constructor(
    private val profileDao: ProfileDao
) {
    fun getProfile() = profileDao.getProfileData()

    suspend fun insertProfileData(profile: Profile) {
        profileDao.insertProfileData(profile)
    }
}
