package X;

import android.database.sqlite.SQLiteStatement;

/* renamed from: X.2nI  reason: invalid class name and case insensitive filesystem */
public class C60042nI {
    public final SQLiteStatement A00;
    public final AnonymousClass1CP A01;
    public final String A02;
    public final String A03;
    public final AnonymousClass1CO A04;

    public int A00() {
        int executeUpdateDelete = this.A00.executeUpdateDelete();
        this.A01.A02(this.A02, 7, this.A03);
        return executeUpdateDelete;
    }

    public long A01() {
        long executeInsert = this.A00.executeInsert();
        this.A01.A02(this.A02, 7, this.A03);
        return executeInsert;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((C60042nI) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C60042nI(SQLiteStatement sQLiteStatement, AnonymousClass1CP r2, AnonymousClass1CO r3, String str, String str2) {
        this.A00 = sQLiteStatement;
        this.A03 = str;
        this.A02 = str2;
        this.A04 = r3;
        this.A01 = r2;
    }
}
