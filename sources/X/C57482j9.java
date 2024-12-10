package X;

import android.database.Cursor;

/* renamed from: X.2j9  reason: invalid class name and case insensitive filesystem */
public class C57482j9 {
    public final AnonymousClass1PM A00;
    public final AnonymousClass1N3 A01;
    public final AnonymousClass1Cd A02;

    public C54272ds A00(long j) {
        Cursor A0A;
        C54272ds r5;
        C28781at A04 = this.A02.get();
        try {
            C23141Ev r4 = ((C28801av) A04).A02;
            String[] A1Y = C17880vN.A1Y();
            A1Y[0] = Long.toString(j);
            A0A = r4.A0A("SELECT host_storage, actual_actors, privacy_mode_ts, business_name FROM message_privacy_state WHERE message_row_id = ?", "GET_PRIVACY_STATE_INFO_SQL", A1Y);
            int columnIndexOrThrow = A0A.getColumnIndexOrThrow("host_storage");
            int columnIndexOrThrow2 = A0A.getColumnIndexOrThrow("actual_actors");
            int columnIndexOrThrow3 = A0A.getColumnIndexOrThrow("privacy_mode_ts");
            int columnIndexOrThrow4 = A0A.getColumnIndexOrThrow("business_name");
            if (A0A.moveToNext()) {
                r5 = new C54272ds(this);
                r5.A00 = new C42691ya(A0A.getInt(columnIndexOrThrow), (long) A0A.getInt(columnIndexOrThrow3), A0A.getInt(columnIndexOrThrow2));
                r5.A01 = A0A.getString(columnIndexOrThrow4);
            } else {
                r5 = null;
            }
            A0A.close();
            A04.close();
            return r5;
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

    public C57482j9(AnonymousClass1PM r1, AnonymousClass1N3 r2, AnonymousClass1Cd r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
