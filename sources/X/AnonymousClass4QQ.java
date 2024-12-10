package X;

import com.whatsapp.voipcalling.CallState;

/* renamed from: X.4QQ  reason: invalid class name */
public final class AnonymousClass4QQ {
    public final C18030ve A00;
    public final AnonymousClass126 A01;
    public final C24901Mc A02;

    public final boolean A00(C86534Sa r5, AnonymousClass1EC r6, C178119Bw r7) {
        C18070vi.A0d(r5, 1);
        if (r6 == null) {
            return false;
        }
        C18030ve r2 = this.A00;
        if (!C40811vJ.A0U(r2)) {
            return false;
        }
        if (C72463Mc.A1S(this.A01, r6, this.A02)) {
            return false;
        }
        if (r7 == null || r7.A07 != 3 || r7.A0E == null || !C18070vi.A18(r7.A0C, r6) || (C18020vd.A00(C18040vf.A01, r2, 9788) & 1) == 0) {
            if (!C18070vi.A18(r5.A08, r6)) {
                return false;
            }
            CallState callState = r5.A0B;
            C18070vi.A0W(callState);
            if (((!AnonymousClass72U.A03(callState) || !r5.A0G) && ((!AnonymousClass72U.A01(callState) && !AnonymousClass72U.A00(callState)) || r5.A02 != 3)) || (C18020vd.A00(C18040vf.A01, r2, 9788) & 1) == 0) {
                return false;
            }
        }
        return true;
    }

    public AnonymousClass4QQ(C18030ve r1, AnonymousClass126 r2, C24901Mc r3) {
        C18070vi.A0o(r1, r3, r2);
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }
}
