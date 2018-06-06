package sample.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;

import com.mysema.query.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QMstEmployee is a Querydsl query type for QMstEmployee
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QMstEmployee extends com.mysema.query.sql.RelationalPathBase<QMstEmployee> {

    private static final long serialVersionUID = -934203212;

    public static final QMstEmployee mstEmployee = new QMstEmployee("mst_employee");

    public final StringPath employeeFirstName = createString("employeeFirstName");

    public final StringPath employeeId = createString("employeeId");

    public final StringPath employeeLastName = createString("employeeLastName");

    public final DateTimePath<java.sql.Timestamp> insertDate = createDateTime("insertDate", java.sql.Timestamp.class);

    public final StringPath insertUser = createString("insertUser");

    public final StringPath roleId = createString("roleId");

    public final DateTimePath<java.sql.Timestamp> updateDate = createDateTime("updateDate", java.sql.Timestamp.class);

    public final StringPath updateUser = createString("updateUser");

    public final NumberPath<Integer> version = createNumber("version", Integer.class);

    public final com.mysema.query.sql.PrimaryKey<QMstEmployee> primary = createPrimaryKey(employeeId);

    public QMstEmployee(String variable) {
        super(QMstEmployee.class, forVariable(variable), "null", "mst_employee");
        addMetadata();
    }

    public QMstEmployee(String variable, String schema, String table) {
        super(QMstEmployee.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QMstEmployee(Path<? extends QMstEmployee> path) {
        super(path.getType(), path.getMetadata(), "null", "mst_employee");
        addMetadata();
    }

    public QMstEmployee(PathMetadata<?> metadata) {
        super(QMstEmployee.class, metadata, "null", "mst_employee");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(employeeFirstName, ColumnMetadata.named("employee_first_name").withIndex(3).ofType(Types.VARCHAR).withSize(50));
        addMetadata(employeeId, ColumnMetadata.named("employee_id").withIndex(1).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(employeeLastName, ColumnMetadata.named("employee_last_name").withIndex(2).ofType(Types.VARCHAR).withSize(50));
        addMetadata(insertDate, ColumnMetadata.named("insert_date").withIndex(7).ofType(Types.TIMESTAMP).withSize(19));
        addMetadata(insertUser, ColumnMetadata.named("insert_user").withIndex(6).ofType(Types.VARCHAR).withSize(20));
        addMetadata(roleId, ColumnMetadata.named("role_id").withIndex(4).ofType(Types.VARCHAR).withSize(20).notNull());
        addMetadata(updateDate, ColumnMetadata.named("update_date").withIndex(9).ofType(Types.TIMESTAMP).withSize(19));
        addMetadata(updateUser, ColumnMetadata.named("update_user").withIndex(8).ofType(Types.VARCHAR).withSize(20));
        addMetadata(version, ColumnMetadata.named("version").withIndex(5).ofType(Types.INTEGER).withSize(10));
    }

}

