package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.8ov  reason: invalid class name and case insensitive filesystem */
public class C170218ov extends C24801Ls {
    public final AnonymousClass1CP A00;
    public final AnonymousClass1CO A01;

    public C170218ov(AnonymousClass190 r7, AnonymousClass118 r8, AnonymousClass1Cb r9, AnonymousClass1CP r10, AnonymousClass1CO r11) {
        super(r8.A00, r7, r9, "commerce.db", 1);
        this.A01 = r11;
        this.A00 = r10;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        C28331Zy.A01(sQLiteDatabase, "cart_item");
        sQLiteDatabase.execSQL("CREATE TABLE cart_item(_id INTEGER PRIMARY KEY AUTOINCREMENT,business_id TEXT NOT NULL, product_id TEXT NOT NULL, product_title TEXT, product_price_1000 INTEGER, product_currency_code TEXT, product_image_id TEXT, product_scaled_image_url TEXT, product_quantity INTEGER, product_sale_price_1000 INTEGER, product_sale_start_date TIMESTAMP, product_sale_end_date TIMESTAMP, product_max_available INTEGER, product_variant_props TEXT, product_variants_ids TEXT)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS business_id_index on cart_item (business_id)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS cart_applied_promotion(_id INTEGER PRIMARY KEY AUTOINCREMENT,business_id TEXT NOT NULL, promotion_id TEXT NOT NULL, promotion_name TEXT NOT NULL, promotion_discount TEXT NOT NULL, promotion_discount_type INTEGER NOT NULL, promotion_minimum_cart_price INTEGER, promotion_start_date TIMESTAMP, promotion_end_date TIMESTAMP, promotion_description TEXT NOT NULL, promotion_more_info TEXT NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS business_id_index_on_cart_applied_promotion ON cart_applied_promotion (business_id)");
    }

    public C23141Ev A09() {
        try {
            String databaseName = getDatabaseName();
            return AnonymousClass1Eu.A03(super.A04(), this.A00, this.A01, databaseName);
        } catch (SQLiteException e) {
            Log.e("failed to open writable commerce store", e);
            String databaseName2 = getDatabaseName();
            return AnonymousClass1Eu.A03(super.A04(), this.A00, this.A01, databaseName2);
        }
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        onCreate(sQLiteDatabase);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        String A012 = C63452t6.A01(sQLiteDatabase, "cart_item");
        if (!TextUtils.isEmpty(A012)) {
            C63452t6.A03(sQLiteDatabase, A012, "cart_item", "product_price_1000", "INTEGER");
            C63452t6.A03(sQLiteDatabase, A012, "cart_item", "product_sale_price_1000", "INTEGER");
            C63452t6.A03(sQLiteDatabase, A012, "cart_item", "product_sale_start_date", "TIMESTAMP");
            C63452t6.A03(sQLiteDatabase, A012, "cart_item", "product_sale_end_date", "TIMESTAMP");
            C63452t6.A03(sQLiteDatabase, A012, "cart_item", "product_max_available", "INTEGER");
            C63452t6.A03(sQLiteDatabase, A012, "cart_item", "product_variant_props", "TEXT");
            C63452t6.A02(sQLiteDatabase, "cart_item", "product_scaled_image_url", "TEXT");
            C63452t6.A02(sQLiteDatabase, "cart_item", "product_variants_ids", "TEXT");
        }
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS cart_applied_promotion(_id INTEGER PRIMARY KEY AUTOINCREMENT,business_id TEXT NOT NULL, promotion_id TEXT NOT NULL, promotion_name TEXT NOT NULL, promotion_discount TEXT NOT NULL, promotion_discount_type INTEGER NOT NULL, promotion_minimum_cart_price INTEGER, promotion_start_date TIMESTAMP, promotion_end_date TIMESTAMP, promotion_description TEXT NOT NULL, promotion_more_info TEXT NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS business_id_index_on_cart_applied_promotion ON cart_applied_promotion (business_id)");
        C63452t6.A02(sQLiteDatabase, "cart_applied_promotion", "promotion_minimum_cart_price", "INTEGER");
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        onCreate(sQLiteDatabase);
    }
}
