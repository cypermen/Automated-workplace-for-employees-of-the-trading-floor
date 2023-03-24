package ru.mirea.employeeassistant.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.UUID
@Entity
data class Order (
    @PrimaryKey
    val id:UUID,
    val isPacked:Boolean,
    val description:String,
    val products:List<Pair<Product, Boolean>>
)