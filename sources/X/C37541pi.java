package X;

import android.database.Cursor;

/* renamed from: X.1pi  reason: invalid class name and case insensitive filesystem */
public class C37541pi {
    public final AnonymousClass1Cd A00;
    public final AnonymousClass00H A01;

    public String A00(AnonymousClass206 r7) {
        Cursor A0A;
        C28781at A04 = this.A00.get();
        try {
            A0A = ((C28801av) A04).A02.A0A("SELECT message_template_id FROM messages_hydrated_four_row_template WHERE message_row_id = ?", "GET_HFRT_BY_MESSAGE_ID", new String[]{String.valueOf(r7.A0x)});
            String str = null;
            if (A0A != null) {
                int columnIndexOrThrow = A0A.getColumnIndexOrThrow("message_template_id");
                if (A0A.moveToLast()) {
                    str = A0A.getString(columnIndexOrThrow);
                }
            }
            if (A0A != null) {
                A0A.close();
            }
            A04.close();
            return str;
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

    public C37541pi(AnonymousClass1Cd r1, AnonymousClass00H r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
