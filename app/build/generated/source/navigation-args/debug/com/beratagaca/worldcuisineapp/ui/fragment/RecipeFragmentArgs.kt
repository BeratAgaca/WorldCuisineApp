package com.beratagaca.worldcuisineapp.ui.fragment

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.beratagaca.worldcuisineapp.`data`.entity.Foods
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class RecipeFragmentArgs(
  public val foodObject: Foods
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(Foods::class.java)) {
      result.putParcelable("foodObject", this.foodObject as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Foods::class.java)) {
      result.putSerializable("foodObject", this.foodObject as Serializable)
    } else {
      throw UnsupportedOperationException(Foods::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(Foods::class.java)) {
      result.set("foodObject", this.foodObject as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Foods::class.java)) {
      result.set("foodObject", this.foodObject as Serializable)
    } else {
      throw UnsupportedOperationException(Foods::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("DEPRECATION")
    public fun fromBundle(bundle: Bundle): RecipeFragmentArgs {
      bundle.setClassLoader(RecipeFragmentArgs::class.java.classLoader)
      val __foodObject : Foods?
      if (bundle.containsKey("foodObject")) {
        if (Parcelable::class.java.isAssignableFrom(Foods::class.java) ||
            Serializable::class.java.isAssignableFrom(Foods::class.java)) {
          __foodObject = bundle.get("foodObject") as Foods?
        } else {
          throw UnsupportedOperationException(Foods::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__foodObject == null) {
          throw IllegalArgumentException("Argument \"foodObject\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"foodObject\" is missing and does not have an android:defaultValue")
      }
      return RecipeFragmentArgs(__foodObject)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): RecipeFragmentArgs {
      val __foodObject : Foods?
      if (savedStateHandle.contains("foodObject")) {
        if (Parcelable::class.java.isAssignableFrom(Foods::class.java) ||
            Serializable::class.java.isAssignableFrom(Foods::class.java)) {
          __foodObject = savedStateHandle.get<Foods?>("foodObject")
        } else {
          throw UnsupportedOperationException(Foods::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__foodObject == null) {
          throw IllegalArgumentException("Argument \"foodObject\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"foodObject\" is missing and does not have an android:defaultValue")
      }
      return RecipeFragmentArgs(__foodObject)
    }
  }
}
