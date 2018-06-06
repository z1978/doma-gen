package sample.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;

import com.mysema.query.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QEmp is a Querydsl query type for QEmp
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QEmp extends com.mysema.query.sql.RelationalPathBase<QEmp> {

    private static final long serialVersionUID = -1405940448;

    public static final QEmp emp = new QEmp("emp");

    public final NumberPath<Integer> empID = createNumber("empID", Integer.class);

    public final StringPath empName = createString("empName");

    public QEmp(String variable) {
        super(QEmp.class, forVariable(variable), "null", "emp");
        addMetadata();
    }

    public QEmp(String variable, String schema, String table) {
        super(QEmp.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QEmp(Path<? extends QEmp> path) {
        super(path.getType(), path.getMetadata(), "null", "emp");
        addMetadata();
    }

    public QEmp(PathMetadata<?> metadata) {
        super(QEmp.class, metadata, "null", "emp");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(empID, ColumnMetadata.named("empID").withIndex(1).ofType(Types.INTEGER).withSize(10));
        addMetadata(empName, ColumnMetadata.named("empName").withIndex(2).ofType(Types.VARCHAR).withSize(30));
    }

}

