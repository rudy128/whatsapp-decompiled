package X;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: X.1Qi  reason: invalid class name and case insensitive filesystem */
public class C25971Qi {
    public final AnonymousClass1Cd A00;

    public static void A00(C25971Qi r4, AnonymousClass21D r5, String str, String str2) {
        Cursor A0A;
        C28781at A04 = r4.A00.get();
        try {
            A0A = ((C28801av) A04).A02.A0A(str, str2, new String[]{Long.toString(r5.A0x)});
            if (A0A.moveToLast()) {
                r5.A00 = A0A.getInt(A0A.getColumnIndexOrThrow("service"));
                r5.A01 = A0A.getLong(A0A.getColumnIndexOrThrow("expiration_timestamp"));
            }
            A0A.close();
            A04.close();
            return;
        } catch (Throwable th) {
            try {
                A04.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public static void A01(C25971Qi r3, String str, String str2, int i, long j, long j2) {
        C28791au A05 = r3.A00.A05();
        try {
            ContentValues contentValues = new ContentValues(3);
            contentValues.put("message_row_id", Long.valueOf(j));
            contentValues.put("service", Integer.valueOf(i));
            contentValues.put("expiration_timestamp", Long.valueOf(j2));
            ((C28801av) A05).A02.A09(str, str2, contentValues, 5);
            A05.close();
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public C25971Qi(AnonymousClass1Cd r1) {
        this.A00 = r1;
    }
}
