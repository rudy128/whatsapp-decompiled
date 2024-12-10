package X;

import android.database.DatabaseErrorHandler;
import android.database.DefaultDatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;

/* renamed from: X.1Lu  reason: invalid class name and case insensitive filesystem */
public class C24821Lu implements DatabaseErrorHandler {
    public final DefaultDatabaseErrorHandler A00;
    public final AnonymousClass190 A01;
    public final String A02;
    public final ThreadLocal A03 = new ThreadLocal();

    public void onCorruption(SQLiteDatabase sQLiteDatabase) {
        String str;
        Boolean bool = Boolean.TRUE;
        ThreadLocal threadLocal = this.A03;
        if (bool == threadLocal.get()) {
            this.A00.onCorruption(sQLiteDatabase);
            return;
        }
        threadLocal.set(true);
        try {
            C63102sV A002 = C63452t6.A00(sQLiteDatabase);
            AnonymousClass190 r2 = this.A01;
            StringBuilder sb = new StringBuilder();
            sb.append("db-corrupted/");
            sb.append(this.A02);
            sb.append("/");
            int i = A002.A00;
            if (i == -2) {
                str = "unknown-query-failed";
            } else if (i == -1) {
                str = "unknown-exception";
            } else if (i == -3) {
                str = "unknown-corrupted";
            } else if (i == 0) {
                str = "non-corrupted";
            } else if (A002.A01.isEmpty()) {
                str = "recoverable";
            } else {
                str = "non-recoverable";
            }
            sb.append(str);
            r2.A0G(sb.toString(), (String) null, false);
            this.A00.onCorruption(sQLiteDatabase);
        } catch (SQLiteDatabaseCorruptException e) {
            AnonymousClass190 r22 = this.A01;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("db-corrupted/");
            sb2.append(this.A02);
            sb2.append("/unknown-corrupted-global");
            r22.A0G(sb2.toString(), e.toString(), false);
            this.A00.onCorruption(sQLiteDatabase);
        } catch (Exception e2) {
            AnonymousClass190 r23 = this.A01;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("db-corrupted/");
            sb3.append(this.A02);
            sb3.append("/");
            sb3.append("unknown");
            r23.A0G(sb3.toString(), e2.toString(), false);
            this.A00.onCorruption(sQLiteDatabase);
        } catch (Throwable th) {
            threadLocal.set(false);
            throw th;
        }
        threadLocal.set(false);
    }

    public C24821Lu(AnonymousClass190 r2, String str) {
        this.A01 = r2;
        this.A02 = str;
        this.A00 = new DefaultDatabaseErrorHandler();
    }
}
