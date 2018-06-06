package sample.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;

import com.mysema.query.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QMstRole is a Querydsl query type for QMstRole
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QMstRole extends com.mysema.query.sql.RelationalPathBase<QMstRole> {

    private static final long serialVersionUID = -982139524;

    public static final QMstRole mstRole = new QMstRole("mst_role");

    public final DateTimePath<java.sql.Timestamp> insertDate = createDateTime("insertDate", java.sql.Timestamp.class);

    public final StringPath insertUser = createString("insertUser");

    public final StringPath roleId = createString("roleId");

    public final StringPath roleName = createString("roleName");

    public final DateTimePath<java.sql.Timestamp> updateDate = createDateTime("updateDate", java.sql.Timestamp.class);

    public final StringPath updateUser = createString("updateUser");

    public final NumberPath<Integer> version = createNumber("version", Integer.class);

    public final com.mysema.query.sql.PrimaryKey<QMstRole> primary = createPrimaryKey(roleId);

    public QMstRole(String variable) {
        super(QMstRole.class, forVariable(variable), "null", "mst_role");
        addMetadata();
    }

    public QMstRole(String variable, String schema, String table) {
        super(QMstRole.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QMstRole(Path<? extends QMstRole> path) {
        super(path.getType(), path.getMetadata(), "null", "mst_role");
        addMetadata();
    }

    public QMstRole(PathMetadata<?> metadata) {
        super(QMstRole.class, metadata, "null", "mst_role");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(insertDate, ColumnMetadata.named("insert_date").withIndex(5).ofType(Types.TIMESTAMP).withSize(19));
        addMetadata(insertUser, ColumnMetadata.named("insert_user").withIndex(4).ofType(Types.VARCHAR).withSize(20));
        addMetadata(roleId, ColumnMetadata.named("role_id").withIndex(1).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(roleName, ColumnMetadata.named("role_name").withIndex(2).ofType(Types.VARCHAR).withSize(100));
        addMetadata(updateDate, ColumnMetadata.named("update_date").withIndex(7).ofType(Types.TIMESTAMP).withSize(19));
        addMetadata(updateUser, ColumnMetadata.named("update_user").withIndex(6).ofType(Types.VARCHAR).withSize(20));
        addMetadata(version, ColumnMetadata.named("version").withIndex(3).ofType(Types.INTEGER).withSize(10));
    }

}

