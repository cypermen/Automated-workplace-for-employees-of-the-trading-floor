package ru.mirea.employeeassistant.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.math.BigDecimal
import java.util.*
@Entity
data class Product(
    @PrimaryKey(autoGenerate = true)
    val id: UUID,
    val name:String,
    val price:BigDecimal
)
