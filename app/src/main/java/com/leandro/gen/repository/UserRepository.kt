package com.leandro.gen.repository

import androidx.lifecycle.LiveData
import com.leandro.gen.database.dao.UserDao
import com.leandro.gen.model.User

class UserRepository(private val userDao: UserDao) {

    val readAllData: LiveData<List<User>>? = userDao.getUser()

    fun addUser(user: User) {
        userDao.addUser(user)
    }

}
