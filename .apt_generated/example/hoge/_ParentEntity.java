package example.hoge;

/** */
@javax.annotation.Generated(value = { "Doma", "2.19.0" }, date = "2018-06-07T00:04:38.332+0900")
public final class _ParentEntity extends org.seasar.doma.jdbc.entity.AbstractEntityType<example.hoge.ParentEntity> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.19.0");
    }

    private static final _ParentEntity __singleton = new _ParentEntity();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    /** the hoge */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, example.hoge.ParentEntity, java.lang.String, Object> $hoge = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(example.hoge.ParentEntity.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "hoge", "EMP_NAME", __namingType, true, true, false);

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<example.hoge.ParentEntity>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<example.hoge.ParentEntity, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<example.hoge.ParentEntity, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<example.hoge.ParentEntity, ?>> __entityPropertyTypeMap;

    private _ParentEntity() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "ParentEntity";
        __catalogName = "";
        __schemaName = "";
        __tableName = "";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<example.hoge.ParentEntity, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<example.hoge.ParentEntity, ?>> __list = new java.util.ArrayList<>(1);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<example.hoge.ParentEntity, ?>> __map = new java.util.HashMap<>(1);
        __list.add($hoge);
        __map.put("hoge", $hoge);
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
    public void preInsert(example.hoge.ParentEntity entity, org.seasar.doma.jdbc.entity.PreInsertContext<example.hoge.ParentEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(example.hoge.ParentEntity entity, org.seasar.doma.jdbc.entity.PreUpdateContext<example.hoge.ParentEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(example.hoge.ParentEntity entity, org.seasar.doma.jdbc.entity.PreDeleteContext<example.hoge.ParentEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(example.hoge.ParentEntity entity, org.seasar.doma.jdbc.entity.PostInsertContext<example.hoge.ParentEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(example.hoge.ParentEntity entity, org.seasar.doma.jdbc.entity.PostUpdateContext<example.hoge.ParentEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(example.hoge.ParentEntity entity, org.seasar.doma.jdbc.entity.PostDeleteContext<example.hoge.ParentEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<example.hoge.ParentEntity, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<example.hoge.ParentEntity, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<example.hoge.ParentEntity, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, example.hoge.ParentEntity, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, example.hoge.ParentEntity, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.TenantIdPropertyType<java.lang.Object, example.hoge.ParentEntity, ?, ?> getTenantIdPropertyType() {
        return null;
    }

    @Override
    public example.hoge.ParentEntity newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<example.hoge.ParentEntity, ?>> __args) {
        example.hoge.ParentEntity entity = new example.hoge.ParentEntity();
        if (__args.get("hoge") != null) __args.get("hoge").save(entity);
        return entity;
    }

    @Override
    public Class<example.hoge.ParentEntity> getEntityClass() {
        return example.hoge.ParentEntity.class;
    }

    @Override
    public example.hoge.ParentEntity getOriginalStates(example.hoge.ParentEntity __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(example.hoge.ParentEntity __entity) {
    }

    /**
     * @return the singleton
     */
    public static _ParentEntity getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _ParentEntity newInstance() {
        return new _ParentEntity();
    }

    private static class ListenerHolder {
        private static org.seasar.doma.jdbc.entity.NullEntityListener<example.hoge.ParentEntity> listener = new org.seasar.doma.jdbc.entity.NullEntityListener<>();
    }

}
