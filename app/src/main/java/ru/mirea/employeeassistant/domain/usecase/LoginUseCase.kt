package ru.mirea.employeeassistant.domain.usecase

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import ru.mirea.employeeassistant.domain.repository.WorkerRepository
import javax.inject.Inject

class LoginUseCase @Inject constructor(private val workerRepository: WorkerRepository,
@ApplicationContext private val cont:Context) {
    suspend  operator fun invoke(email:String,password:String ):String{
        val loginInformation = workerRepository.login(email = email, password = password)
        val prefs = cont.getSharedPreferences(applicationName, Context.MODE_PRIVATE)
        prefs.edit().putString(jwt, loginInformation.second).apply()
        return loginInformation.second
    }

    companion object{
        const val jwt = "TOKEN"
        const val applicationName = "EmployeeHelper"
        const val somethingWrong = "Неверно введён логин или пароль"
        const val successLogin = "Авторизация прошла успешно"
    }
}