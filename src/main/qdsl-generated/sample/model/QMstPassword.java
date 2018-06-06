package sample.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;

import com.mysema.query.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QMstPassword is a Querydsl query type for QMstPassword
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QMstPassword extends com.mysema.query.sql.RelationalPathBase<QMstPassword> {

    private static final long serialVersionUID = -910687071;

    public static final QMstPassword mstPassword = new QMstPassword("mst_password");

    public final StringPath employeeId = createString("employeeId");

    public final StringPath generation = createString("generation");

    public final DateTimePath<java.sql.Timestamp> insertDate = createDateTime("insertDate", java.sql.Timestamp.class);

    public final StringPath insertUser = createString("insertUser");

    public final NumberPath<Integer> mstPasswordId = createNumber("mstPasswordId", Integer.class);

    public final StringPath password = createString("password");

    public final DateTimePath<java.sql.Timestamp> updateDate = createDateTime("updateDate", java.sql.Timestamp.class);

    public final StringPath updateUser = createString("updateUser");

    public final NumberPath<Integer> version = createNumber("version", Integer.class);

    public final com.mysema.query.sql.PrimaryKey<QMstPassword> primary = createPrimaryKey(mstPasswordId);

    public QMstPassword(String variable) {
        super(QMstPassword.class, forVariable(variable), "null", "mst_password");
        addMetadata();
    }

    public QMstPassword(String variable, String schema, String table) {
        super(QMstPassword.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QMstPassword(Path<? extends QMstPassword> path) {
        super(path.getType(), path.getMetadata(), "null", "mst_password");
        addMetadata();
    }

    public QMstPassword(PathMetadata<?> metadata) {
        super(QMstPassword.class, metadata, "null", "mst_password");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(employeeId, ColumnMetadata.named("employee_id").withIndex(2).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(generation, ColumnMetadata.named("generation").withIndex(4).ofType(Types.VARCHAR).withSize(2));
        addMetadata(insertDate, ColumnMetadata.named("insert_date").withIndex(7).ofType(Types.TIMESTAMP).withSize(19));
        addMetadata(insertUser, ColumnMetadata.named("insert_user").withIndex(6).ofType(Types.VARCHAR).withSize(20));
        addMetadata(mstPasswordId, ColumnMetadata.named("mst_password_id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(password, ColumnMetadata.named("password").withIndex(3).ofType(Types.VARCHAR).withSize(256));
        addMetadata(updateDate, ColumnMetadata.named("update_date").withIndex(9).ofType(Types.TIMESTAMP).withSize(19));
        addMetadata(updateUser, ColumnMetadata.named("update_user").withIndex(8).ofType(Types.VARCHAR).withSize(20));
        addMetadata(version, ColumnMetadata.named("version").withIndex(5).ofType(Types.INTEGER).withSize(10));
    }

}

