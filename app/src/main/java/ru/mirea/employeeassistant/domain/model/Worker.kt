package ru.mirea.employeeassistant.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*
@Entity
data class Worker(

    @PrimaryKey
    val id: UUID,
    val name:String,
    val surname:String,
    val phone:String,
    val email:String
)