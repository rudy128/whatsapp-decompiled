package X;

import android.database.Cursor;

/* renamed from: X.9j9  reason: invalid class name */
public class AnonymousClass9j9 {
    public final AnonymousClass1Cd A00;

    public AnonymousClass9j9(AnonymousClass1Cd r1) {
        this.A00 = r1;
    }

    public Integer A00(long j) {
        Cursor A0A;
        String[] A1Y = C17880vN.A1Y();
        A1Y[0] = Long.toString(j);
        C28781at A04 = this.A00.get();
        try {
            A0A = ((C28801av) A04).A02.A0A("SELECT rating FROM message_rating WHERE message_row_id = ?", "GET_MESSAGE_RATING_BY_ROW_ID_SQL", A1Y);
            if (A0A.moveToFirst()) {
                Integer valueOf = Integer.valueOf(C17890vO.A01(A0A, "rating"));
                A0A.close();
                A04.close();
                return valueOf;
            }
            A0A.close();
            A04.close();
            return null;
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
}
