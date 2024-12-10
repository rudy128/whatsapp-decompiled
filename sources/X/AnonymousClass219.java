package X;

import android.database.Cursor;
import com.whatsapp.jid.UserJid;

/* renamed from: X.219  reason: invalid class name */
public class AnonymousClass219 extends AnonymousClass218 {
    public int A00;
    public long A01;
    public C60072nL A02;
    public String A03;

    public AnonymousClass219(AnonymousClass205 r2, long j) {
        super(r2, 16, j);
        this.A02 = 1;
        this.A02 = 0;
    }

    public void A18(Cursor cursor, AnonymousClass11S r11) {
        UserJid A0I;
        super.A18(cursor, r11);
        this.A00 = cursor.getInt(cursor.getColumnIndexOrThrow("live_location_share_duration"));
        this.A01 = cursor.getLong(cursor.getColumnIndexOrThrow("live_location_sequence_number"));
        double d = cursor.getDouble(cursor.getColumnIndexOrThrow("live_location_final_latitude"));
        double d2 = cursor.getDouble(cursor.getColumnIndexOrThrow("live_location_final_longitude"));
        long j = cursor.getLong(cursor.getColumnIndexOrThrow("live_location_final_timestamp"));
        if (d != 0.0d || d2 != 0.0d || j != 0) {
            if (this.A0v.A02) {
                A0I = r11.A09();
            } else {
                A0I = A0I();
            }
            C17960vV.A07(A0I);
            C60072nL r0 = new C60072nL(A0I);
            r0.A00 = d;
            r0.A01 = d2;
            r0.A05 = j;
            this.A02 = r0;
        }
    }
}
