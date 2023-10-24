package com.example.geografiapp

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao

interface UsuarioDao {
    @Query("select * from usuarios_table")
    fun getAll(): List<Usuario>

    @Insert
    fun insertUsuario(usuario: Usuario)

}