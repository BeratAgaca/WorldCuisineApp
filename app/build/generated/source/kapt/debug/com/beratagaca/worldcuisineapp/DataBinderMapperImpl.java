package com.beratagaca.worldcuisineapp;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.beratagaca.worldcuisineapp.databinding.CardCountryDesignBindingImpl;
import com.beratagaca.worldcuisineapp.databinding.CardCuisineDesignBindingImpl;
import com.beratagaca.worldcuisineapp.databinding.CardRecipeDesignBindingImpl;
import com.beratagaca.worldcuisineapp.databinding.FragmentCuisineBindingImpl;
import com.beratagaca.worldcuisineapp.databinding.FragmentHomeBindingImpl;
import com.beratagaca.worldcuisineapp.databinding.FragmentRecipeBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_CARDCOUNTRYDESIGN = 1;

  private static final int LAYOUT_CARDCUISINEDESIGN = 2;

  private static final int LAYOUT_CARDRECIPEDESIGN = 3;

  private static final int LAYOUT_FRAGMENTCUISINE = 4;

  private static final int LAYOUT_FRAGMENTHOME = 5;

  private static final int LAYOUT_FRAGMENTRECIPE = 6;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(6);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.beratagaca.worldcuisineapp.R.layout.card_country_design, LAYOUT_CARDCOUNTRYDESIGN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.beratagaca.worldcuisineapp.R.layout.card_cuisine_design, LAYOUT_CARDCUISINEDESIGN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.beratagaca.worldcuisineapp.R.layout.card_recipe_design, LAYOUT_CARDRECIPEDESIGN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.beratagaca.worldcuisineapp.R.layout.fragment_cuisine, LAYOUT_FRAGMENTCUISINE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.beratagaca.worldcuisineapp.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.beratagaca.worldcuisineapp.R.layout.fragment_recipe, LAYOUT_FRAGMENTRECIPE);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_CARDCOUNTRYDESIGN: {
          if ("layout/card_country_design_0".equals(tag)) {
            return new CardCountryDesignBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for card_country_design is invalid. Received: " + tag);
        }
        case  LAYOUT_CARDCUISINEDESIGN: {
          if ("layout/card_cuisine_design_0".equals(tag)) {
            return new CardCuisineDesignBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for card_cuisine_design is invalid. Received: " + tag);
        }
        case  LAYOUT_CARDRECIPEDESIGN: {
          if ("layout/card_recipe_design_0".equals(tag)) {
            return new CardRecipeDesignBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for card_recipe_design is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCUISINE: {
          if ("layout/fragment_cuisine_0".equals(tag)) {
            return new FragmentCuisineBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_cuisine is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTRECIPE: {
          if ("layout/fragment_recipe_0".equals(tag)) {
            return new FragmentRecipeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_recipe is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(8);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "country");
      sKeys.put(2, "countryName");
      sKeys.put(3, "countryObj");
      sKeys.put(4, "food");
      sKeys.put(5, "foodObject");
      sKeys.put(6, "foods");
      sKeys.put(7, "homeToolbarTitle");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(6);

    static {
      sKeys.put("layout/card_country_design_0", com.beratagaca.worldcuisineapp.R.layout.card_country_design);
      sKeys.put("layout/card_cuisine_design_0", com.beratagaca.worldcuisineapp.R.layout.card_cuisine_design);
      sKeys.put("layout/card_recipe_design_0", com.beratagaca.worldcuisineapp.R.layout.card_recipe_design);
      sKeys.put("layout/fragment_cuisine_0", com.beratagaca.worldcuisineapp.R.layout.fragment_cuisine);
      sKeys.put("layout/fragment_home_0", com.beratagaca.worldcuisineapp.R.layout.fragment_home);
      sKeys.put("layout/fragment_recipe_0", com.beratagaca.worldcuisineapp.R.layout.fragment_recipe);
    }
  }
}
