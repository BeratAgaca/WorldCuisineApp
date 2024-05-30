package com.beratagaca.worldcuisineapp.ui.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001!B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u001c\u0010\u0019\u001a\u00020\u001a2\n\u0010\u001b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0018H\u0016J\u001c\u0010\u001d\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0018H\u0016R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\""}, d2 = {"Lcom/beratagaca/worldcuisineapp/ui/adapter/CuisineAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/beratagaca/worldcuisineapp/ui/adapter/CuisineAdapter$CardDesignHolder;", "mContext", "Landroid/content/Context;", "foodList", "", "Lcom/beratagaca/worldcuisineapp/data/entity/Foods;", "viewModel", "Lcom/beratagaca/worldcuisineapp/ui/viewmodel/CuisineViewModel;", "(Landroid/content/Context;Ljava/util/List;Lcom/beratagaca/worldcuisineapp/ui/viewmodel/CuisineViewModel;)V", "getFoodList", "()Ljava/util/List;", "setFoodList", "(Ljava/util/List;)V", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "getViewModel", "()Lcom/beratagaca/worldcuisineapp/ui/viewmodel/CuisineViewModel;", "setViewModel", "(Lcom/beratagaca/worldcuisineapp/ui/viewmodel/CuisineViewModel;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "CardDesignHolder", "app_debug"})
public final class CuisineAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.beratagaca.worldcuisineapp.ui.adapter.CuisineAdapter.CardDesignHolder> {
    @org.jetbrains.annotations.NotNull
    private android.content.Context mContext;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.beratagaca.worldcuisineapp.data.entity.Foods> foodList;
    @org.jetbrains.annotations.NotNull
    private com.beratagaca.worldcuisineapp.ui.viewmodel.CuisineViewModel viewModel;
    
    public CuisineAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context mContext, @org.jetbrains.annotations.NotNull
    java.util.List<com.beratagaca.worldcuisineapp.data.entity.Foods> foodList, @org.jetbrains.annotations.NotNull
    com.beratagaca.worldcuisineapp.ui.viewmodel.CuisineViewModel viewModel) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getMContext() {
        return null;
    }
    
    public final void setMContext(@org.jetbrains.annotations.NotNull
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.beratagaca.worldcuisineapp.data.entity.Foods> getFoodList() {
        return null;
    }
    
    public final void setFoodList(@org.jetbrains.annotations.NotNull
    java.util.List<com.beratagaca.worldcuisineapp.data.entity.Foods> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.beratagaca.worldcuisineapp.ui.viewmodel.CuisineViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull
    com.beratagaca.worldcuisineapp.ui.viewmodel.CuisineViewModel p0) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.beratagaca.worldcuisineapp.ui.adapter.CuisineAdapter.CardDesignHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.beratagaca.worldcuisineapp.ui.adapter.CuisineAdapter.CardDesignHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/beratagaca/worldcuisineapp/ui/adapter/CuisineAdapter$CardDesignHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "design", "Lcom/beratagaca/worldcuisineapp/databinding/CardCuisineDesignBinding;", "(Lcom/beratagaca/worldcuisineapp/ui/adapter/CuisineAdapter;Lcom/beratagaca/worldcuisineapp/databinding/CardCuisineDesignBinding;)V", "getDesign", "()Lcom/beratagaca/worldcuisineapp/databinding/CardCuisineDesignBinding;", "setDesign", "(Lcom/beratagaca/worldcuisineapp/databinding/CardCuisineDesignBinding;)V", "app_debug"})
    public final class CardDesignHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private com.beratagaca.worldcuisineapp.databinding.CardCuisineDesignBinding design;
        
        public CardDesignHolder(@org.jetbrains.annotations.NotNull
        com.beratagaca.worldcuisineapp.databinding.CardCuisineDesignBinding design) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.beratagaca.worldcuisineapp.databinding.CardCuisineDesignBinding getDesign() {
            return null;
        }
        
        public final void setDesign(@org.jetbrains.annotations.NotNull
        com.beratagaca.worldcuisineapp.databinding.CardCuisineDesignBinding p0) {
        }
    }
}