package sample.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;

import com.mysema.query.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QPrefecture is a Querydsl query type for QPrefecture
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QPrefecture extends com.mysema.query.sql.RelationalPathBase<QPrefecture> {

    private static final long serialVersionUID = -479612259;

    public static final QPrefecture prefecture = new QPrefecture("prefecture");

    public final NumberPath<Short> id = createNumber("id", Short.class);

    public final StringPath name = createString("name");

    public final com.mysema.query.sql.PrimaryKey<QPrefecture> primary = createPrimaryKey(id);

    public QPrefecture(String variable) {
        super(QPrefecture.class, forVariable(variable), "null", "prefecture");
        addMetadata();
    }

    public QPrefecture(String variable, String schema, String table) {
        super(QPrefecture.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPrefecture(Path<? extends QPrefecture> path) {
        super(path.getType(), path.getMetadata(), "null", "prefecture");
        addMetadata();
    }

    public QPrefecture(PathMetadata<?> metadata) {
        super(QPrefecture.class, metadata, "null", "prefecture");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.SMALLINT).withSize(5).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(2).ofType(Types.VARCHAR).withSize(6).notNull());
    }

}

