package X;

import android.database.Cursor;

/* renamed from: X.391  reason: invalid class name */
public final class AnonymousClass391 implements C447124m, C447224n, C447324o, C436720l {
    public final AnonymousClass00H A00;

    public AnonymousClass391(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void BL9(AnonymousClass206 r8) {
        Cursor A0A;
        C18070vi.A0d(r8, 0);
        AnonymousClass23U r82 = (AnonymousClass23U) r8;
        C32581hQ.A00(r82);
        String[] A1Y = C17880vN.A1Y();
        int i = 0;
        A1Y[0] = Long.toString(r82.A0x);
        C28781at A04 = ((C32581hQ) this.A00.get()).A00.get();
        try {
            A0A = ((C28801av) A04).A02.A0A("SELECT version, data, future_message_type, future_proof_stanza, edit_version, message_stanza_data FROM message_future WHERE message_row_id = ?", "GET_FUTURE_MESSAGE_BY_ROW_ID_SQL", A1Y);
            if (A0A.moveToNext()) {
                r82.A01 = (int) C17890vO.A06(A0A, "version");
                r82.A0o(C17890vO.A1X(A0A, "data"));
                r82.A00 = C17890vO.A01(A0A, "future_message_type");
                r82.A02 = C17890vO.A1X(A0A, "future_proof_stanza");
                int columnIndexOrThrow = A0A.getColumnIndexOrThrow("edit_version");
                r82.A03 = C17890vO.A1X(A0A, "message_stanza_data");
                if (!A0A.isNull(columnIndexOrThrow)) {
                    i = A0A.getInt(columnIndexOrThrow);
                }
                r82.A01 = i;
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

    public void BdY(AnonymousClass206 r2) {
        C18070vi.A0d(r2, 0);
        ((C32581hQ) this.A00.get()).A01((AnonymousClass23U) r2);
    }

    public void CQL(AnonymousClass206 r2) {
        C18070vi.A0d(r2, 0);
        ((C32581hQ) this.A00.get()).A01((AnonymousClass23U) r2);
    }
}
