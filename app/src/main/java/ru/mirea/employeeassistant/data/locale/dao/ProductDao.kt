package ru.mirea.employeeassistant.data.locale.dao

import androidx.room.Dao
import androidx.room.Query
import ru.mirea.employeeassistant.domain.model.Product

@Dao
interface ProductDao {
    @Query("SELECT * FROM Product")
    suspend fun getAllProducts():List<Product>
}