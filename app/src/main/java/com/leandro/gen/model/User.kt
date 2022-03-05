package com.leandro.gen.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "user")
class User(

    @PrimaryKey(autoGenerate = true)
    val id: Int,

    @ColumnInfo(name = "fullname")
    val nameCompleto: String,
    @ColumnInfo(name = "userid")
    val email: String,
    @ColumnInfo(name = "name")
    val name: String,
    @ColumnInfo(name = "password")
    val password: String

) : Serializable {

}


