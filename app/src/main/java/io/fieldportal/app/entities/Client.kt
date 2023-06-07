package io.fieldportal.app.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Client(
    @PrimaryKey val id: Int,

    val name: String?
)