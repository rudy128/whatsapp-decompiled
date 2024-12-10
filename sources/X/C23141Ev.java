package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.CursorWrapper;
import android.database.SQLException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabase;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import android.os.SystemClock;
import com.whatsapp.util.Log;

/* renamed from: X.1Ev  reason: invalid class name and case insensitive filesystem */
public class C23141Ev {
    public final SQLiteDatabase A00;
    public final AnonymousClass1CO A01;
    public final String A02;
    public final AnonymousClass1CP A03;

    public static Cursor A00(C23141Ev r1, String str, String str2) {
        return r1.A0A(str, str2, (String[]) null);
    }

    public int A03(ContentValues contentValues, String str, String str2, String str3, String[] strArr, int i) {
        A01(strArr);
        SystemClock.uptimeMillis();
        String str4 = str;
        int updateWithOnConflict = this.A00.updateWithOnConflict(str4, contentValues, str2, strArr, i);
        this.A03.A02(this.A02, 3, str3);
        return updateWithOnConflict;
    }

    public long A05(String str, String str2, ContentValues contentValues) {
        A01((Object[]) null);
        SystemClock.uptimeMillis();
        long j = -1;
        try {
            j = this.A00.insertWithOnConflict(str, (String) null, contentValues, 0);
        } catch (SQLiteConstraintException e) {
            Log.e("insert/Record insertion raised an unexpected exception.", e);
        } catch (SQLException e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("insert/Record insertion raised ");
            sb.append(e2);
            Log.w(sb.toString());
        }
        this.A03.A02(this.A02, 2, str2);
        return j;
    }

    public long A06(String str, String str2, ContentValues contentValues) {
        A01((Object[]) null);
        SystemClock.uptimeMillis();
        long insertOrThrow = this.A00.insertOrThrow(str, (String) null, contentValues);
        this.A03.A02(this.A02, 2, str2);
        return insertOrThrow;
    }

    public long A07(String str, String str2, ContentValues contentValues) {
        A01((Object[]) null);
        SystemClock.uptimeMillis();
        long replace = this.A00.replace(str, (String) null, contentValues);
        this.A03.A02(this.A02, 5, str2);
        return replace;
    }

    public long A08(String str, String str2, ContentValues contentValues) {
        A01((Object[]) null);
        SystemClock.uptimeMillis();
        long replaceOrThrow = this.A00.replaceOrThrow(str, (String) null, contentValues);
        this.A03.A02(this.A02, 5, str2);
        return replaceOrThrow;
    }

    public long A09(String str, String str2, ContentValues contentValues, int i) {
        long j;
        A01((Object[]) null);
        SystemClock.uptimeMillis();
        try {
            j = this.A00.insertWithOnConflict(str, (String) null, contentValues, i);
        } catch (SQLiteConstraintException e) {
            Log.e("insertWithOnConflict/Record insertion raised an unexpected exception.", e);
            j = -1;
        }
        this.A03.A02(this.A02, 2, str2);
        return j;
    }

    @Deprecated
    public Cursor A0B(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        A01(strArr2);
        SystemClock.uptimeMillis();
        Cursor query = this.A00.query(false, str, strArr, str2, strArr2, str3, (String) null, str4, str5);
        this.A03.A02(this.A02, 1, str6);
        return query;
    }

    public C60042nI A0D(String str, String str2) {
        A01((Object[]) null);
        AnonymousClass1CP r2 = this.A03;
        String str3 = this.A02;
        r2.A02(str3, 6, str2);
        SystemClock.uptimeMillis();
        return new C60042nI(this.A00.compileStatement(str), r2, this.A01, str2, str3);
    }

    public void A0E(String str, String str2) {
        A01((Object[]) null);
        SystemClock.uptimeMillis();
        this.A00.execSQL(str);
        this.A03.A02(this.A02, 7, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        if (r2.length <= 999) goto L_0x0008;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(java.lang.Object[] r2) {
        /*
            if (r2 == 0) goto L_0x0008
            int r2 = r2.length
            r0 = 999(0x3e7, float:1.4E-42)
            r1 = 0
            if (r2 > r0) goto L_0x0009
        L_0x0008:
            r1 = 1
        L_0x0009:
            java.lang.String r0 = "Too many sql arguments"
            X.C17960vV.A0F(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23141Ev.A01(java.lang.Object[]):void");
    }

    public C23141Ev(SQLiteDatabase sQLiteDatabase, AnonymousClass1CP r2, AnonymousClass1CO r3, String str) {
        this.A02 = str;
        this.A00 = sQLiteDatabase;
        this.A01 = r3;
        this.A03 = r2;
    }

    public int A02(ContentValues contentValues, String str, String str2, String str3, String[] strArr) {
        A01(strArr);
        SystemClock.uptimeMillis();
        int update = this.A00.update(str, contentValues, str2, strArr);
        this.A03.A02(this.A02, 3, str3);
        return update;
    }

    public int A04(String str, String str2, String str3, String[] strArr) {
        A01(strArr);
        SystemClock.uptimeMillis();
        int delete = this.A00.delete(str, str2, strArr);
        this.A03.A02(this.A02, 4, str3);
        return delete;
    }

    public Cursor A0A(String str, String str2, String[] strArr) {
        A01(strArr);
        SystemClock.uptimeMillis();
        Cursor rawQuery = this.A00.rawQuery(str, strArr);
        this.A03.A02(this.A02, 0, str2);
        return rawQuery;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.26f, android.database.CursorWrapper] */
    public AnonymousClass26f A0C(C42621yT r5, String str, String str2, String[] strArr) {
        CancellationSignal cancellationSignal;
        A01(strArr);
        SystemClock.uptimeMillis();
        if (r5 != null) {
            try {
                cancellationSignal = (CancellationSignal) r5.A00();
            } catch (Exception e) {
                e = e;
                if (e instanceof OperationCanceledException) {
                    e = new AnonymousClass1QC();
                }
                throw e;
            }
        } else {
            cancellationSignal = null;
        }
        ? cursorWrapper = new CursorWrapper(this.A00.rawQuery(str, strArr, cancellationSignal));
        this.A03.A02(this.A02, 0, str2);
        return cursorWrapper;
    }

    public void A0F(String str, String str2, Object[] objArr) {
        A01(objArr);
        SystemClock.uptimeMillis();
        this.A00.execSQL(str, objArr);
        this.A03.A02(this.A02, 7, str2);
    }
}
