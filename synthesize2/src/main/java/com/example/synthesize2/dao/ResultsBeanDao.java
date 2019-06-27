package com.example.synthesize2.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.jy.beans.ResultsBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "RESULTS_BEAN".
*/
public class ResultsBeanDao extends AbstractDao<ResultsBean, String> {

    public static final String TABLENAME = "RESULTS_BEAN";

    /**
     * Properties of entity ResultsBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property _id = new Property(0, String.class, "_id", true, "llid");
        public final static Property CreatedAt = new Property(1, String.class, "createdAt", false, "CREATED_AT");
        public final static Property Desc = new Property(2, String.class, "desc", false, "DESC");
        public final static Property PublishedAt = new Property(3, String.class, "publishedAt", false, "PUBLISHED_AT");
        public final static Property Source = new Property(4, String.class, "source", false, "SOURCE");
        public final static Property Type = new Property(5, String.class, "type", false, "TYPE");
        public final static Property Url = new Property(6, String.class, "url", false, "URL");
        public final static Property Used = new Property(7, boolean.class, "used", false, "USED");
        public final static Property Who = new Property(8, String.class, "who", false, "WHO");
    }


    public ResultsBeanDao(DaoConfig config) {
        super(config);
    }
    
    public ResultsBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"RESULTS_BEAN\" (" + //
                "\"llid\" TEXT PRIMARY KEY NOT NULL ," + // 0: _id
                "\"CREATED_AT\" TEXT," + // 1: createdAt
                "\"DESC\" TEXT," + // 2: desc
                "\"PUBLISHED_AT\" TEXT," + // 3: publishedAt
                "\"SOURCE\" TEXT," + // 4: source
                "\"TYPE\" TEXT," + // 5: type
                "\"URL\" TEXT," + // 6: url
                "\"USED\" INTEGER NOT NULL ," + // 7: used
                "\"WHO\" TEXT);"); // 8: who
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"RESULTS_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, ResultsBean entity) {
        stmt.clearBindings();
 
        String _id = entity.get_id();
        if (_id != null) {
            stmt.bindString(1, _id);
        }
 
        String createdAt = entity.getCreatedAt();
        if (createdAt != null) {
            stmt.bindString(2, createdAt);
        }
 
        String desc = entity.getDesc();
        if (desc != null) {
            stmt.bindString(3, desc);
        }
 
        String publishedAt = entity.getPublishedAt();
        if (publishedAt != null) {
            stmt.bindString(4, publishedAt);
        }
 
        String source = entity.getSource();
        if (source != null) {
            stmt.bindString(5, source);
        }
 
        String type = entity.getType();
        if (type != null) {
            stmt.bindString(6, type);
        }
 
        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(7, url);
        }
        stmt.bindLong(8, entity.getUsed() ? 1L: 0L);
 
        String who = entity.getWho();
        if (who != null) {
            stmt.bindString(9, who);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, ResultsBean entity) {
        stmt.clearBindings();
 
        String _id = entity.get_id();
        if (_id != null) {
            stmt.bindString(1, _id);
        }
 
        String createdAt = entity.getCreatedAt();
        if (createdAt != null) {
            stmt.bindString(2, createdAt);
        }
 
        String desc = entity.getDesc();
        if (desc != null) {
            stmt.bindString(3, desc);
        }
 
        String publishedAt = entity.getPublishedAt();
        if (publishedAt != null) {
            stmt.bindString(4, publishedAt);
        }
 
        String source = entity.getSource();
        if (source != null) {
            stmt.bindString(5, source);
        }
 
        String type = entity.getType();
        if (type != null) {
            stmt.bindString(6, type);
        }
 
        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(7, url);
        }
        stmt.bindLong(8, entity.getUsed() ? 1L: 0L);
 
        String who = entity.getWho();
        if (who != null) {
            stmt.bindString(9, who);
        }
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    @Override
    public ResultsBean readEntity(Cursor cursor, int offset) {
        ResultsBean entity = new ResultsBean( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // _id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // createdAt
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // desc
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // publishedAt
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // source
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // type
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // url
            cursor.getShort(offset + 7) != 0, // used
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8) // who
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, ResultsBean entity, int offset) {
        entity.set_id(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setCreatedAt(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setDesc(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setPublishedAt(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setSource(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setType(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setUrl(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setUsed(cursor.getShort(offset + 7) != 0);
        entity.setWho(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
     }
    
    @Override
    protected final String updateKeyAfterInsert(ResultsBean entity, long rowId) {
        return entity.get_id();
    }
    
    @Override
    public String getKey(ResultsBean entity) {
        if(entity != null) {
            return entity.get_id();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(ResultsBean entity) {
        return entity.get_id() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
