package X;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.ArrayList;

/* renamed from: X.1QY  reason: invalid class name */
public class AnonymousClass1QY {
    public final AnonymousClass11S A00;
    public final AnonymousClass1M9 A01;
    public final AnonymousClass1LW A02;
    public final AnonymousClass1CJ A03;
    public final AnonymousClass1DL A04;
    public final C22611Cn A05;
    public final AnonymousClass1Cd A06;
    public final AnonymousClass00H A07;

    public static ArrayList A00(AnonymousClass1QY r8, long j, boolean z) {
        String str;
        String str2;
        Cursor A0A;
        if (z) {
            str = "SELECT vcard FROM message_quoted_vcard WHERE message_row_id = ? AND vcard IS NOT NULL AND vcard != \"\"";
        } else {
            str = "SELECT vcard FROM message_vcard WHERE message_row_id = ? AND vcard IS NOT NULL AND vcard != \"\"";
        }
        if (z) {
            str2 = "GET_QUOTED_VCARDS_BY_MESSAGE_ROW_ID_SQL";
        } else {
            str2 = "GET_VCARDS_BY_MESSAGE_ROW_ID_SQL";
        }
        ArrayList arrayList = new ArrayList();
        C28781at A042 = r8.A06.get();
        try {
            A0A = ((C28801av) A042).A02.A0A(str, str2, new String[]{Long.toString(j)});
            int columnIndexOrThrow = A0A.getColumnIndexOrThrow("vcard");
            while (A0A.moveToNext()) {
                arrayList.add(A0A.getString(columnIndexOrThrow));
            }
            A0A.close();
            A042.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public static void A01(AnonymousClass1QY r5, String str, long j) {
        C28791au A052 = r5.A06.A05();
        try {
            ContentValues contentValues = new ContentValues(2);
            contentValues.put("message_row_id", Long.valueOf(j));
            contentValues.put("vcard", str);
            ((C28801av) A052).A02.A09("message_quoted_vcard", "INSERT_QUOTED_VCARD_SQL", contentValues, 4);
            A052.close();
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public static void A02(AnonymousClass1QY r5, String str, long j) {
        C28791au A052 = r5.A06.A05();
        try {
            ContentValues contentValues = new ContentValues(2);
            contentValues.put("message_row_id", Long.valueOf(j));
            contentValues.put("vcard", str);
            ((C28801av) A052).A02.A09("message_vcard", "INSERT_VCARD_SQL", contentValues, 4);
            A052.close();
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public void A03(C438921i r7) {
        Cursor A0A;
        if (r7.A09 == 7 && r7.A02 != null) {
            C28781at A042 = this.A06.get();
            try {
                A0A = ((C28801av) A042).A02.A0A("SELECT count FROM message_media_vcard_count WHERE message_row_id = ?", "GET_VCARD_COUNT_BY_MESSAGE_ROW_ID_SQL", new String[]{Long.toString(r7.A0x)});
                if (A0A.moveToFirst()) {
                    r7.A02.A01 = A0A.getInt(A0A.getColumnIndexOrThrow("count"));
                }
                A0A.close();
                A042.close();
                return;
            } catch (Throwable th) {
                try {
                    A042.close();
                    throw th;
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                    throw th;
                }
            }
        } else {
            return;
        }
        throw th;
    }

    public void A04(C438921i r6) {
        if (r6.A09 == 7 && r6.A02 != null) {
            C28791au A052 = this.A06.A05();
            try {
                ContentValues contentValues = new ContentValues(2);
                contentValues.put("message_row_id", Long.valueOf(r6.A0x));
                contentValues.put("count", Integer.valueOf(r6.A02.A01));
                ((C28801av) A052).A02.A07("message_media_vcard_count", "REPLACE_VCARD_COUNT_SQL", contentValues);
                A052.close();
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
                throw th;
            }
        }
    }

    public AnonymousClass1QY(AnonymousClass11S r1, AnonymousClass1M9 r2, AnonymousClass1LW r3, AnonymousClass1CJ r4, AnonymousClass1DL r5, C22611Cn r6, AnonymousClass1Cd r7, AnonymousClass00H r8) {
        this.A04 = r5;
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
        this.A07 = r8;
        this.A06 = r7;
        this.A05 = r6;
    }
}
