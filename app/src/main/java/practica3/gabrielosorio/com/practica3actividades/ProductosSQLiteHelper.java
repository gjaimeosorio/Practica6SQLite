package practica3.gabrielosorio.com.practica3actividades;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Jaime on 19/10/2016.
 */
public class ProductosSQLiteHelper extends SQLiteOpenHelper {
    private String DATA_BASE_NAME = "ProductossDB";
    private int DATA_VERSION = 1;

    String sqlCreate = "CREATE TABLE Productoss (" +
            "idproducto         INTEGER PRIMARY KEY AUTOINCREMENT, " +
            "producto     TEXT, " +
            "descripcion   TEXT, " +
            "precio     TEXT)";

    public ProductosSQLiteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL(sqlCreate);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {//Actualizar i (inicial), i1 (version final)

        sqLiteDatabase.execSQL("DROP TABLE IF EXITST Productoss"); //Si no existe la tabla, la crea.
        sqLiteDatabase.execSQL(sqlCreate);

    }
}

