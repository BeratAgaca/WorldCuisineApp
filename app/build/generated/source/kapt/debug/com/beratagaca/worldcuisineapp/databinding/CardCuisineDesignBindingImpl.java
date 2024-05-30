package com.beratagaca.worldcuisineapp.databinding;
import com.beratagaca.worldcuisineapp.R;
import com.beratagaca.worldcuisineapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class CardCuisineDesignBindingImpl extends CardCuisineDesignBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cardViewCuisine, 3);
        sViewsWithIds.put(R.id.imageViewFood, 4);
        sViewsWithIds.put(R.id.button, 5);
        sViewsWithIds.put(R.id.floatingActionButton, 6);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public CardCuisineDesignBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private CardCuisineDesignBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[5]
            , (androidx.cardview.widget.CardView) bindings[3]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[6]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textViewFoodName.setTag(null);
        this.textViewRecipe.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.foodObject == variableId) {
            setFoodObject((com.beratagaca.worldcuisineapp.data.entity.Foods) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFoodObject(@Nullable com.beratagaca.worldcuisineapp.data.entity.Foods FoodObject) {
        this.mFoodObject = FoodObject;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.foodObject);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String foodObjectExplanation = null;
        com.beratagaca.worldcuisineapp.data.entity.Foods foodObject = mFoodObject;
        java.lang.String foodObjectName = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (foodObject != null) {
                    // read foodObject.explanation
                    foodObjectExplanation = foodObject.getExplanation();
                    // read foodObject.name
                    foodObjectName = foodObject.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewFoodName, foodObjectName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewRecipe, foodObjectExplanation);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): foodObject
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}