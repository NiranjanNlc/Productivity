package com.example.habittracker.modal.data

import androidx.room.PrimaryKey
import java.io.Serializable
import java.util.*

@kotlinx.serialization.Serializable
data class Users(val profilePic:String?=null,
                 val userName:String?=null,
                 val mail:String?=null,
                 @PrimaryKey(autoGenerate = true)
                 var userId:String = (Random().nextInt(9999910) + 1).toString(),
                 var bio:String?=null
) : Serializable