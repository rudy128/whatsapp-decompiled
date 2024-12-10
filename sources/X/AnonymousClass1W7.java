package X;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: X.1W7  reason: invalid class name */
public class AnonymousClass1W7 {
    public final AnonymousClass1Cd A00;

    public void A00(long j, byte[] bArr) {
        C28791au A05 = this.A00.A05();
        try {
            ContentValues contentValues = new ContentValues(2);
            contentValues.put("message_row_id", Long.valueOf(j));
            contentValues.put("message_secret", bArr);
            ((C28801av) A05).A02.A09("message_secret", "MessageSecretStore/insertMessageSecret", contentValues, 5);
            A05.close();
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public byte[] A01(long j) {
        Cursor A0A;
        byte[] bArr;
        C28781at A04 = this.A00.get();
        try {
            A0A = ((C28801av) A04).A02.A0A("SELECT message_secret FROM message_secret WHERE message_row_id = ?", "GET_MESSAGE_SECRET_SQL", new String[]{Long.toString(j)});
            if (A0A.moveToLast()) {
                bArr = A0A.getBlob(A0A.getColumnIndexOrThrow("message_secret"));
            } else {
                bArr = null;
            }
            A0A.close();
            A04.close();
            return bArr;
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

    public AnonymousClass1W7(AnonymousClass1Cd r1) {
        this.A00 = r1;
    }
}
