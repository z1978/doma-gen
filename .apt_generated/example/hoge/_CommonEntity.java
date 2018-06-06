package example.hoge;

/** */
@javax.annotation.Generated(value = { "Doma", "2.19.0" }, date = "2018-06-07T00:04:38.365+0900")
public final class _CommonEntity extends org.seasar.doma.jdbc.entity.AbstractEntityType<example.hoge.CommonEntity> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.19.0");
    }

    private static final _CommonEntity __singleton = new _CommonEntity();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    /** the name */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, example.hoge.CommonEntity, java.lang.String, Object> $name = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(example.hoge.CommonEntity.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "name", "", __namingType, true, true, false);

    /** the privateString */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, example.hoge.CommonEntity, java.lang.String, Object> $privateString = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(example.hoge.CommonEntity.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "privateString", "", __namingType, true, true, false);

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<example.hoge.CommonEntity>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<example.hoge.CommonEntity, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<example.hoge.CommonEntity, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<example.hoge.CommonEntity, ?>> __entityPropertyTypeMap;

    private _CommonEntity() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "CommonEntity";
        __catalogName = "";
        __schemaName = "";
        __tableName = "";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<example.hoge.CommonEntity, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<example.hoge.CommonEntity, ?>> __list = new java.util.ArrayList<>(2);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<example.hoge.CommonEntity, ?>> __map = new java.util.HashMap<>(2);
        __list.add($name);
        __map.put("name", $name);
        __list.add($privateString);
        __map.put("privateString", $privateString);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
    }

    @Override
    public org.seasar.doma.jdbc.entity.NamingType getNamingType() {
        return __namingType;
    }

    @Override
    public boolean isImmutable() {
        return __immutable;
    }

    @Override
    public String getName() {
        return __name;
    }

    @Override
    public String getCatalogName() {
        return __catalogName;
    }

    @Override
    public String getSchemaName() {
        return __schemaName;
    }

    @Override
    public String getTableName() {
        return getTableName(org.seasar.doma.jdbc.Naming.DEFAULT::apply);
    }

    @Override
    public String getTableName(java.util.function.BiFunction<org.seasar.doma.jdbc.entity.NamingType, String, String> namingFunction) {
        if (__tableName.isEmpty()) {
            return namingFunction.apply(__namingType, __name);
        }
        return __tableName;
    }

    @Override
    public boolean isQuoteRequired() {
        return __isQuoteRequired;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preInsert(example.hoge.CommonEntity entity, org.seasar.doma.jdbc.entity.PreInsertContext<example.hoge.CommonEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(example.hoge.CommonEntity entity, org.seasar.doma.jdbc.entity.PreUpdateContext<example.hoge.CommonEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(example.hoge.CommonEntity entity, org.seasar.doma.jdbc.entity.PreDeleteContext<example.hoge.CommonEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(example.hoge.CommonEntity entity, org.seasar.doma.jdbc.entity.PostInsertContext<example.hoge.CommonEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(example.hoge.CommonEntity entity, org.seasar.doma.jdbc.entity.PostUpdateContext<example.hoge.CommonEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(example.hoge.CommonEntity entity, org.seasar.doma.jdbc.entity.PostDeleteContext<example.hoge.CommonEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<example.hoge.CommonEntity, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<example.hoge.CommonEntity, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<example.hoge.CommonEntity, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, example.hoge.CommonEntity, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, example.hoge.CommonEntity, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.TenantIdPropertyType<java.lang.Object, example.hoge.CommonEntity, ?, ?> getTenantIdPropertyType() {
        return null;
    }

    @Override
    public example.hoge.CommonEntity newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<example.hoge.CommonEntity, ?>> __args) {
        example.hoge.CommonEntity entity = new example.hoge.CommonEntity();
        if (__args.get("name") != null) __args.get("name").save(entity);
        if (__args.get("privateString") != null) __args.get("privateString").save(entity);
        return entity;
    }

    @Override
    public Class<example.hoge.CommonEntity> getEntityClass() {
        return example.hoge.CommonEntity.class;
    }

    @Override
    public example.hoge.CommonEntity getOriginalStates(example.hoge.CommonEntity __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(example.hoge.CommonEntity __entity) {
    }

    /**
     * @return the singleton
     */
    public static _CommonEntity getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _CommonEntity newInstance() {
        return new _CommonEntity();
    }

    private static class ListenerHolder {
        private static org.seasar.doma.jdbc.entity.NullEntityListener<example.hoge.CommonEntity> listener = new org.seasar.doma.jdbc.entity.NullEntityListener<>();
    }

}
