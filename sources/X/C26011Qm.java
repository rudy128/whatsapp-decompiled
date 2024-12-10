package X;

import android.database.Cursor;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1Qm  reason: invalid class name and case insensitive filesystem */
public class C26011Qm {
    public final AnonymousClass1Cd A00;
    public final AnonymousClass11S A01;
    public final AnonymousClass1DL A02;

    public UserJid A01(AnonymousClass206 r2) {
        DeviceJid A002;
        if (!r2.A0v.A02) {
            return r2.A0I();
        }
        if (C50362Ud.A00(r2) == null && (A002 = A00(r2)) != null) {
            return A002.userJid;
        }
        AnonymousClass11S r0 = this.A01;
        r0.A0I();
        PhoneUserJid phoneUserJid = r0.A0E;
        C17960vV.A07(phoneUserJid);
        return phoneUserJid;
    }

    public C26011Qm(AnonymousClass11S r1, AnonymousClass1DL r2, AnonymousClass1Cd r3) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = r3;
    }

    public DeviceJid A00(AnonymousClass206 r8) {
        Cursor A0A;
        DeviceJid deviceJid = null;
        if (C50362Ud.A00(r8) != null || r8.A0x == -1) {
            return null;
        }
        C28781at A04 = this.A00.get();
        try {
            A0A = ((C28801av) A04).A02.A0A("SELECT author_device_jid FROM message_details WHERE message_row_id = ?", "GET_MESSAGE_AUTHOR_SQL", new String[]{Long.toString(r8.A0x)});
            if (A0A.moveToLast()) {
                Jid A0B = this.A02.A0B(A0A.getLong(A0A.getColumnIndexOrThrow("author_device_jid")));
                if (A0B instanceof DeviceJid) {
                    deviceJid = DeviceJid.Companion.A02(A0B);
                }
            }
            A0A.close();
            A04.close();
            return deviceJid;
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
