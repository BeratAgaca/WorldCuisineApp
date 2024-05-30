package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.beratagaca.worldcuisineapp.DataBinderMapperImpl());
  }
}
