package X;

import android.database.Cursor;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2pv  reason: invalid class name and case insensitive filesystem */
public final class C61582pv {
    public final long A00;
    public final AnonymousClass1BI A01;
    public final UserJid A02;
    public final AnonymousClass205 A03;

    public C61582pv(AnonymousClass1BI r1, UserJid userJid, AnonymousClass205 r3, long j) {
        this.A01 = r1;
        this.A02 = userJid;
        this.A00 = j;
        this.A03 = r3;
    }

    public C61582pv(Cursor cursor, AnonymousClass1BI r4, UserJid userJid) {
        this.A01 = r4;
        this.A02 = userJid;
        this.A00 = cursor.getLong(3);
        this.A03 = AnonymousClass205.A01(r4, cursor.getString(4), cursor.getInt(1) != 1 ? false : true);
    }
}
