package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.4Qf  reason: invalid class name and case insensitive filesystem */
public final class C86114Qf {
    public final AnonymousClass11S A00;
    public final C71263Eo A01;
    public final AnonymousClass1M9 A02;
    public final AnonymousClass1MZ A03;

    public final C93104iR A00(AnonymousClass1EC r8, UserJid userJid, Integer num, double d) {
        Integer num2;
        C18070vi.A0d(r8, 0);
        C71263Eo r1 = this.A01;
        if (!r1.containsKey(userJid)) {
            C63312sr A06 = this.A03.A06(r8, userJid);
            if (A06 != null) {
                num2 = Integer.valueOf(A06.A00);
            } else {
                num2 = null;
            }
            r1.A02(userJid, num2);
        }
        Object obj = r1.get(userJid);
        C17960vV.A07(obj);
        return new C93104iR(this.A02.A0H(userJid), num, d, AnonymousClass3MY.A03((Number) obj), true);
    }

    public C86114Qf(AnonymousClass11S r1, C71263Eo r2, AnonymousClass1M9 r3, AnonymousClass1MZ r4) {
        C18070vi.A0s(r1, r3, r2, r4);
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
    }
}
