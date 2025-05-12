package com.example.budgetapp_youtube.ui.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.budgetapp_youtube.ui.entities.Budget
import com.example.budgetapp_youtube.ui.entities.Profile


@Database(
    entities = [Budget::class,Profile::class],
    version = 1
)
abstract class BudgetDatabase : RoomDatabase () {
    abstract fun getBudgetDao():BudgetDao
    abstract fun getProfileDao():ProfileDao
}