package com.beratagaca.worldcuisineapp.ui.fragment

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.beratagaca.worldcuisineapp.R
import com.beratagaca.worldcuisineapp.`data`.entity.Foods
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class CuisineFragmentDirections private constructor() {
  private data class ActionCuisineFragmentToRecipeFragment(
    public val foodObject: Foods
  ) : NavDirections {
    public override val actionId: Int = R.id.action_cuisineFragment_to_recipeFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
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
  }

  public companion object {
    public fun actionCuisineFragmentToRecipeFragment(foodObject: Foods): NavDirections =
        ActionCuisineFragmentToRecipeFragment(foodObject)
  }
}
