package sample.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;

import com.mysema.query.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTestTbl is a Querydsl query type for QTestTbl
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QTestTbl extends com.mysema.query.sql.RelationalPathBase<QTestTbl> {

    private static final long serialVersionUID = 534673956;

    public static final QTestTbl testTbl = new QTestTbl("test_tbl");

    public final DateTimePath<java.sql.Timestamp> createdAt = createDateTime("createdAt", java.sql.Timestamp.class);

    public final StringPath description = createString("description");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> price = createNumber("price", Integer.class);

    public final com.mysema.query.sql.PrimaryKey<QTestTbl> primary = createPrimaryKey(id);

    public QTestTbl(String variable) {
        super(QTestTbl.class, forVariable(variable), "null", "test_tbl");
        addMetadata();
    }

    public QTestTbl(String variable, String schema, String table) {
        super(QTestTbl.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTestTbl(Path<? extends QTestTbl> path) {
        super(path.getType(), path.getMetadata(), "null", "test_tbl");
        addMetadata();
    }

    public QTestTbl(PathMetadata<?> metadata) {
        super(QTestTbl.class, metadata, "null", "test_tbl");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(createdAt, ColumnMetadata.named("created_at").withIndex(5).ofType(Types.TIMESTAMP).withSize(19));
        addMetadata(description, ColumnMetadata.named("description").withIndex(3).ofType(Types.VARCHAR).withSize(30));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(2).ofType(Types.VARCHAR).withSize(10));
        addMetadata(price, ColumnMetadata.named("price").withIndex(4).ofType(Types.INTEGER).withSize(10));
    }

}

