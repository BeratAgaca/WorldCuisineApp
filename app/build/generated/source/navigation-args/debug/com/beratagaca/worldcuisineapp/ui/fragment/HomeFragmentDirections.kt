package com.beratagaca.worldcuisineapp.ui.fragment

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.beratagaca.worldcuisineapp.R
import com.beratagaca.worldcuisineapp.`data`.entity.Countries
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class HomeFragmentDirections private constructor() {
  private data class HomeToCuisine(
    public val country: Countries
  ) : NavDirections {
    public override val actionId: Int = R.id.homeToCuisine

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
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
  }

  public companion object {
    public fun homeToCuisine(country: Countries): NavDirections = HomeToCuisine(country)
  }
}
