package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;

/* renamed from: X.1hQ  reason: invalid class name and case insensitive filesystem */
public class C32581hQ {
    public final AnonymousClass1Cd A00;

    public static void A00(AnonymousClass206 r8) {
        boolean z = false;
        boolean z2 = false;
        if (r8.A0x > 0) {
            z2 = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("FutureMessageStore/validateMessage/message must have row_id set; key=");
        AnonymousClass205 r2 = r8.A0v;
        sb.append(r2);
        C17960vV.A0G(z2, sb.toString());
        if (r8.A0E() == 1) {
            z = true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FutureMessageStore/validateMessage/message in main storage; key=");
        sb2.append(r2);
        C17960vV.A0G(z, sb2.toString());
    }

    public void A01(AnonymousClass23U r17) {
        AnonymousClass23U r1 = r17;
        A00(r1);
        C28791au A05 = this.A00.A05();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("message_row_id", Long.valueOf(r1.A0x));
            contentValues.put("version", Integer.valueOf(r1.A01));
            C63432t4.A03(contentValues, "data", r1.A12());
            contentValues.put("future_message_type", Integer.valueOf(r1.A00));
            byte[] bArr = r1.A02;
            if (bArr != null) {
                contentValues.put("future_proof_stanza", bArr);
            }
            contentValues.put("edit_version", Integer.valueOf(r1.A01));
            contentValues.put("message_stanza_data", r1.A03);
            C23141Ev r10 = ((C28801av) A05).A02;
            long A052 = r10.A05("message_future", "INSERT_MESSAGE_FUTURE_SQL", contentValues);
            boolean z = false;
            if (A052 != -1) {
                if (A052 == r1.A0x) {
                    z = true;
                }
                C17960vV.A0H(z, "FutureMessageStore/insertOrUpdateFutureMessage/inserted row should have same row_id");
            } else {
                contentValues.remove("message_row_id");
                if (r10.A02(contentValues, "message_future", "message_row_id = ?", "UPDATE_MESSAGE_FUTURE_SQL", new String[]{String.valueOf(r1.A0x)}) != 1) {
                    throw new SQLiteException("Failed to insert / update futureproof message");
                }
            }
            A05.close();
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public C32581hQ(AnonymousClass1Cd r1) {
        this.A00 = r1;
    }
}
