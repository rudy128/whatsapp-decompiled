package X;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: X.39A  reason: invalid class name */
public final class AnonymousClass39A implements C447124m, C447224n, C447324o, C436720l {
    public final AnonymousClass00H A00;

    public AnonymousClass39A(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void BL9(AnonymousClass206 r8) {
        Cursor A0A;
        C18070vi.A0d(r8, 0);
        C444223j r82 = (C444223j) r8;
        C28781at A04 = ((C52042aH) this.A00.get()).A00.get();
        try {
            C23141Ev r4 = ((C28801av) A04).A02;
            String[] A1Y = C17880vN.A1Y();
            C17880vN.A1U(A1Y, 0, r82.A0x);
            A0A = r4.A0A("SELECT scheduled_timestamp_ms, call_type, title FROM message_scheduled_call WHERE message_row_id = ?", "GET_MESSAGE_SCHEDULED_CALL", A1Y);
            if (A0A.moveToLast()) {
                int columnIndexOrThrow = A0A.getColumnIndexOrThrow("scheduled_timestamp_ms");
                int columnIndexOrThrow2 = A0A.getColumnIndexOrThrow("call_type");
                int columnIndexOrThrow3 = A0A.getColumnIndexOrThrow("title");
                r82.A01 = A0A.getLong(columnIndexOrThrow);
                r82.A00 = A0A.getInt(columnIndexOrThrow2);
                r82.A02 = A0A.getString(columnIndexOrThrow3);
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

    public void BdY(AnonymousClass206 r7) {
        C18070vi.A0d(r7, 0);
        C444223j r72 = (C444223j) r7;
        C28791au A05 = ((C52042aH) this.A00.get()).A00.A05();
        try {
            ContentValues A09 = C17880vN.A09(4);
            AnonymousClass206.A04(A09, r72);
            C17880vN.A19(A09, "scheduled_timestamp_ms", r72.A01);
            C17880vN.A18(A09, "call_type", r72.A00);
            A09.put("title", r72.A02);
            if (((C28801av) A05).A02.A09("message_scheduled_call", "ScheduledCallMessageStore/insertOrUpdateMessageScheduledCall", A09, 5) < 0) {
                StringBuilder A10 = AnonymousClass000.A10();
                AnonymousClass206.A06(r72, "ScheduledCallMessageStore/insertOrUpdateMessageScheduledCall/insert error, rowId=", A10);
                C17890vO.A0w(A10);
            }
            A05.close();
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public void CQL(AnonymousClass206 r1) {
    }
}
