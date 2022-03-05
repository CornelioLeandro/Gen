package com.leandro.gen.database.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.leandro.gen.model.User
import org.jetbrains.annotations.Nullable

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addUser(user: User)

    @Query("Select * FROM user ORDER BY id ASC")
    fun getUser(): LiveData<List<User>>

}

