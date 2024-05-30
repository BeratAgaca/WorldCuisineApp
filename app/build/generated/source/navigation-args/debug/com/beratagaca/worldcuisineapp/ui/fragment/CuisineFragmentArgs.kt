package com.beratagaca.worldcuisineapp.ui.fragment

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.beratagaca.worldcuisineapp.`data`.entity.Countries
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class CuisineFragmentArgs(
  public val country: Countries
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(Countries::class.java)) {
      result.putParcelable("country", this.country as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Countries::class.java)) {
      result.putSerializable("country", this.country as Serializable)
    } else {
      throw UnsupportedOperationException(Countries::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(Countries::class.java)) {
      result.set("country", this.country as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Countries::class.java)) {
      result.set("country", this.country as Serializable)
    } else {
      throw UnsupportedOperationException(Countries::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("DEPRECATION")
    public fun fromBundle(bundle: Bundle): CuisineFragmentArgs {
      bundle.setClassLoader(CuisineFragmentArgs::class.java.classLoader)
      val __country : Countries?
      if (bundle.containsKey("country")) {
        if (Parcelable::class.java.isAssignableFrom(Countries::class.java) ||
            Serializable::class.java.isAssignableFrom(Countries::class.java)) {
          __country = bundle.get("country") as Countries?
        } else {
          throw UnsupportedOperationException(Countries::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__country == null) {
          throw IllegalArgumentException("Argument \"country\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"country\" is missing and does not have an android:defaultValue")
      }
      return CuisineFragmentArgs(__country)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): CuisineFragmentArgs {
      val __country : Countries?
      if (savedStateHandle.contains("country")) {
        if (Parcelable::class.java.isAssignableFrom(Countries::class.java) ||
            Serializable::class.java.isAssignableFrom(Countries::class.java)) {
          __country = savedStateHandle.get<Countries?>("country")
        } else {
          throw UnsupportedOperationException(Countries::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__country == null) {
          throw IllegalArgumentException("Argument \"country\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"country\" is missing and does not have an android:defaultValue")
      }
      return CuisineFragmentArgs(__country)
    }
  }
}
