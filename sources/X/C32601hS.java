package X;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: X.1hS  reason: invalid class name and case insensitive filesystem */
public class C32601hS {
    public final AnonymousClass1LW A00;
    public final AnonymousClass1Cd A01;

    public C32601hS(AnonymousClass1LW r1, AnonymousClass1Cd r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void A00(AnonymousClass206 r13) {
        Cursor A0A;
        if (r13.A11(131072)) {
            C28781at A04 = this.A01.get();
            try {
                A0A = ((C28801av) A04).A02.A0A("SELECT original_key_id,edited_timestamp,sender_timestamp FROM message_edit_info WHERE message_row_id = ?", "GET_MESSAGE_EDIT_INFO_FOR_ROW_ID_SQL", new String[]{Long.toString(r13.A0x)});
                if (A0A.moveToNext()) {
                    String string = A0A.getString(A0A.getColumnIndexOrThrow("original_key_id"));
                    long j = A0A.getLong(A0A.getColumnIndexOrThrow("edited_timestamp"));
                    long j2 = A0A.getLong(A0A.getColumnIndexOrThrow("sender_timestamp"));
                    AnonymousClass205 r0 = r13.A0v;
                    C60492o7.A01(r13, new C691536c(new AnonymousClass205(r0.A00, string, r0.A02), j, j2));
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
        } else {
            return;
        }
        throw th;
    }

    public void A01(AnonymousClass206 r7) {
        if (r7.A11(131072)) {
            C691536c A002 = C60492o7.A00(r7);
            if (A002 != null) {
                C28791au A05 = this.A01.A05();
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("message_row_id", Long.valueOf(r7.A0x));
                    contentValues.put("original_key_id", A002.A02.A01);
                    contentValues.put("edited_timestamp", Long.valueOf(A002.A00));
                    contentValues.put("sender_timestamp", Long.valueOf(A002.A01));
                    ((C28801av) A05).A02.A09("message_edit_info", "INSERT_MESSAGE_EDIT_INFO", contentValues, 5);
                    A05.close();
                } catch (Throwable th) {
                    AnonymousClass0DT.A00(th, th);
                    throw th;
                }
            } else {
                throw new IllegalStateException("MessageEditInfoStore/insertEditInfo/missing information in the FMessage");
            }
        }
    }
}
