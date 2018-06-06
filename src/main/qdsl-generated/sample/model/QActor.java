package sample.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;

import com.mysema.query.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QActor is a Querydsl query type for QActor
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QActor extends com.mysema.query.sql.RelationalPathBase<QActor> {

    private static final long serialVersionUID = 1801943117;

    public static final QActor actor = new QActor("actor");

    public final DatePath<java.sql.Date> birthday = createDate("birthday", java.sql.Date.class);

    public final NumberPath<Short> birthplaceId = createNumber("birthplaceId", Short.class);

    public final StringPath blood = createString("blood");

    public final NumberPath<Short> height = createNumber("height", Short.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath name = createString("name");

    public final DateTimePath<java.sql.Timestamp> updateAt = createDateTime("updateAt", java.sql.Timestamp.class);

    public final com.mysema.query.sql.PrimaryKey<QActor> primary = createPrimaryKey(id);

    public QActor(String variable) {
        super(QActor.class, forVariable(variable), "null", "actor");
        addMetadata();
    }

    public QActor(String variable, String schema, String table) {
        super(QActor.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QActor(Path<? extends QActor> path) {
        super(path.getType(), path.getMetadata(), "null", "actor");
        addMetadata();
    }

    public QActor(PathMetadata<?> metadata) {
        super(QActor.class, metadata, "null", "actor");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(birthday, ColumnMetadata.named("birthday").withIndex(5).ofType(Types.DATE).withSize(10));
        addMetadata(birthplaceId, ColumnMetadata.named("birthplace_id").withIndex(6).ofType(Types.SMALLINT).withSize(5));
        addMetadata(blood, ColumnMetadata.named("blood").withIndex(4).ofType(Types.VARCHAR).withSize(2));
        addMetadata(height, ColumnMetadata.named("height").withIndex(3).ofType(Types.SMALLINT).withSize(5));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(2).ofType(Types.VARCHAR).withSize(30).notNull());
        addMetadata(updateAt, ColumnMetadata.named("update_at").withIndex(7).ofType(Types.TIMESTAMP).withSize(19).notNull());
    }

}

