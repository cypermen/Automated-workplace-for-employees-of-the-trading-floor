package ru.mirea.employeeassistant.domain.repository

import ru.mirea.employeeassistant.domain.model.Worker
import java.util.UUID

interface WorkerRepository {
    suspend fun login(email:String, password:String): Pair<Worker, String>
    suspend fun getWorkerInformation(id:UUID):Worker
}