package X;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.Locale;

/* renamed from: X.1Ly  reason: invalid class name and case insensitive filesystem */
public abstract class C24861Ly {
    public final C24811Lt A00;

    public static long A00(ContentValues contentValues, C28791au r3, String str) {
        return ((C28801av) r3).A02.A06(str, A04("ContactProvider/insertOrReplace/INSERT_", str), contentValues);
    }

    public static long A01(ContentValues contentValues, C28791au r5, String str, String str2, String[] strArr) {
        return (long) ((C28801av) r5).A02.A02(contentValues, str, str2, A04("ContactProvider/delete/UPDATE_", str), strArr);
    }

    public static long A02(C28791au r1, String str, String str2, String[] strArr) {
        return (long) ((C28801av) r1).A02.A04(str, str2, A04("ContactProvider/delete/DELETE_", str), strArr);
    }

    public static Cursor A03(C28781at r2, String str, String str2, String[] strArr) {
        C23141Ev r22 = ((C28801av) r2).A02;
        StringBuilder sb = new StringBuilder();
        sb.append("ContactProvider/query/QUERY_");
        sb.append(str2);
        return r22.A0A(str, sb.toString(), strArr);
    }

    public static String A04(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2.toUpperCase(Locale.ROOT));
        return sb.toString();
    }

    public static void A05(ContentValues contentValues, C28791au r3, String str) {
        ((C28801av) r3).A02.A08(str, A04("ContactProvider/insertOrReplace/REPLACE_", str), contentValues);
    }

    public void A0H() {
        if (this instanceof AnonymousClass1M2) {
            AnonymousClass1M2 r2 = (AnonymousClass1M2) this;
            synchronized (r2.A0A) {
                r2.A02 = 0;
            }
        }
    }

    public C24861Ly(C24811Lt r3) {
        this.A00 = r3;
        r3.A04.registerObserver(new AnonymousClass1M0(this));
    }
}
