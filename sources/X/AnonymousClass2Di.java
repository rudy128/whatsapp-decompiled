package X;

import android.content.Context;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.2Di  reason: invalid class name */
public class AnonymousClass2Di extends C24801Ls {
    public final AnonymousClass1CP A00;
    public final AnonymousClass1CO A01;
    public final AnonymousClass10W A02;

    /* JADX WARNING: type inference failed for: r5v0, types: [X.1Cb, java.lang.Object] */
    public AnonymousClass2Di(Context context, AnonymousClass190 r10, AnonymousClass1CP r11, AnonymousClass1CO r12, Set set) {
        super(context, r10, new Object(), "payments.db", 4);
        this.A01 = r12;
        this.A00 = r11;
        this.A02 = new AnonymousClass10W(new C18150vq(set, (C18140vp) null));
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        Log.i("PAY: creating payments database version 4");
        sQLiteDatabase.execSQL("CREATE TABLE methods (credential_id TEXT NOT NULL PRIMARY KEY, country TEXT, readable_name TEXT, issuer_name TEXT, type INTEGER NOT NULL, subtype INTEGER, creation_ts INTEGER, updated_ts INTEGER, debit_mode INTEGER NOT NULL, credit_mode INTEGER NOT NULL, balance_1000 INTEGER, balance_ts INTEGER, country_data TEXT, icon BLOB, p2m_debit_mode INTEGER NOT NULL DEFAULT 0, p2m_credit_mode INTEGER NOT NULL DEFAULT 0)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS payment_methods_index ON methods (credential_id)");
        sQLiteDatabase.execSQL("CREATE TABLE tmp_transactions (tmp_id TEXT NOT NULL, tmp_metadata TEXT, tmp_ts INTEGER)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS message_payment_transactions_index ON tmp_transactions (tmp_id)");
        sQLiteDatabase.execSQL("CREATE TABLE contacts (jid NOT NULL, country_data TEXT, merchant INTEGER, consumer_status INTEGER, default_payment_type INTEGER)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS payment_constacts_index ON contacts (jid)");
    }

    public C23141Ev A09() {
        try {
            String databaseName = getDatabaseName();
            return AnonymousClass1Eu.A03(super.A04(), this.A00, this.A01, databaseName);
        } catch (SQLiteException e) {
            Log.e("failed to open payment store", e);
            SQLiteCantOpenDatabaseException sQLiteCantOpenDatabaseException = new SQLiteCantOpenDatabaseException();
            Iterator it = this.A02.iterator();
            while (it.hasNext()) {
                ((AnonymousClass1Ce) it.next()).Bqv(sQLiteCantOpenDatabaseException);
            }
            String databaseName2 = getDatabaseName();
            return AnonymousClass1Eu.A03(super.A04(), this.A00, this.A01, databaseName2);
        }
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PaymentDbHelper/onDowngrade/oldVersion:");
        A10.append(i);
        C17900vP.A0j(", newVersion:", A10, i2);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS methods");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS tmp_transactions");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS contacts");
        onCreate(sQLiteDatabase);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        String A012 = C63452t6.A01(sQLiteDatabase, "methods");
        if (!TextUtils.isEmpty(A012)) {
            C63452t6.A03(sQLiteDatabase, A012, "methods", PublicKeyCredentialControllerUtility.JSON_KEY_ICON, "BLOB");
        }
        String A013 = C63452t6.A01(sQLiteDatabase, "contacts");
        if (!TextUtils.isEmpty(A013)) {
            C63452t6.A03(sQLiteDatabase, A013, "contacts", "merchant", "INTEGER");
            C63452t6.A03(sQLiteDatabase, A013, "contacts", "default_payment_type", "INTEGER");
            C63452t6.A03(sQLiteDatabase, A013, "contacts", "consumer_status", "INTEGER");
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PaymentDbHelper/onUpgrade/old version: ");
        A10.append(i);
        C17900vP.A0j(", new version: ", A10, i2);
        if (i == 1 || i == 2) {
            sQLiteDatabase.execSQL("ALTER TABLE methods ADD p2m_debit_mode  INTEGER NOT NULL DEFAULT 0");
            sQLiteDatabase.execSQL("ALTER TABLE methods ADD p2m_credit_mode  INTEGER NOT NULL DEFAULT 0");
        } else if (i != 3) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("PaymentDbHelper/onUpgrade/Unknown upgrade from ");
            A102.append(i);
            throw new SQLiteException(AnonymousClass001.A1I(" to ", A102, i2));
        }
    }
}
