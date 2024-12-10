package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.PhoneUserJid;

/* renamed from: X.1fL  reason: invalid class name and case insensitive filesystem */
public class C31301fL {
    public long A00 = 0;
    public String A01;
    public final C26371Rw A02;
    public final AnonymousClass11P A03;
    public final AnonymousClass18K A04;
    public final AnonymousClass11S A05;
    public final AnonymousClass1P3 A06;
    public final AnonymousClass10I A07;

    public static void A00(C31301fL r6, int i, long j) {
        C31301fL r3 = r6;
        if (r6.A01 == null) {
            AnonymousClass11S r0 = r6.A05;
            r0.A0I();
            PhoneUserJid phoneUserJid = r0.A0E;
            if (phoneUserJid != null) {
                DeviceJid primaryDevice = phoneUserJid.getPrimaryDevice();
                C26371Rw r2 = r6.A02;
                r6.A01 = C26371Rw.A05(r2.A05.A01.A03().A01, r6.A06.A0D(C63962tz.A02(primaryDevice)));
            }
        }
        r6.A07.CGF(new AnonymousClass3C2(r3, i, 2, j));
    }

    public C31301fL(AnonymousClass11S r3, C26371Rw r4, AnonymousClass11P r5, AnonymousClass1P3 r6, AnonymousClass18K r7, AnonymousClass10I r8) {
        this.A03 = r5;
        this.A05 = r3;
        this.A07 = r8;
        this.A04 = r7;
        this.A02 = r4;
        this.A06 = r6;
    }

    public void A01(int i, long j) {
        A00(this, i, j);
    }
}
