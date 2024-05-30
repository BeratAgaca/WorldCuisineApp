package com.beratagaca.worldcuisineapp.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull
import java.io.Serializable


class Foods (var id :String? = "",
             var name : String? = "",
             var explanation : String? = "" ,
             var country_name : String? = "",
             var ingredients : String? = "",
             var long_recipe : String? = "",
             var img_path : String? = ""
):Serializable {

}