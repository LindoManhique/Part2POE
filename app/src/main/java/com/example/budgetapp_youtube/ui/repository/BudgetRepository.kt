package com.example.budgetapp_youtube.ui.repository

import com.example.budgetapp_youtube.ui.db.BudgetDao
import javax.inject.Inject

class BudgetRepository  @Inject constructor(

    val budgetDao: BudgetDao
){
}