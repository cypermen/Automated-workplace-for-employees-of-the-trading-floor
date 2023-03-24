package ru.mirea.employeeassistant.data.locale

import androidx.room.Database
import androidx.room.RoomDatabase
import ru.mirea.employeeassistant.domain.model.Order
import ru.mirea.employeeassistant.domain.model.Product
import ru.mirea.employeeassistant.domain.model.Task
import ru.mirea.employeeassistant.domain.model.Worker

@Database(entities = [Product::class, Task::class,  Worker::class,  Order::class ], version = 1)
abstract class RoomDB:RoomDatabase() {
}