package ru.mirea.employeeassistant.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*
@Entity
data class Task(

    @PrimaryKey
    val id: UUID,
    val title:String,
    val description:String,
    val isDone:Boolean,
    val WorkerId:UUID
)
