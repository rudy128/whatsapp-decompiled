package X;

import com.whatsapp.voipcalling.CallState;

/* renamed from: X.2rH  reason: invalid class name and case insensitive filesystem */
public final class C62362rH {
    public final AnonymousClass00H A00;

    public C62362rH(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final boolean A01(AnonymousClass22M r5) {
        C178119Bw r0;
        C18070vi.A0d(r5, 0);
        AnonymousClass25F r1 = r5.A00;
        if (A02(r5) || (r0 = (C178119Bw) r1.A02) == null) {
            return false;
        }
        int i = r0.A06;
        if (Integer.valueOf(i) == null) {
            return false;
        }
        if (i != 2 && i != 4 && i != 1 && i != 0 && i != 3) {
            return false;
        }
        if (A03(r5) || !A00(r5)) {
            return true;
        }
        return false;
    }

    public final boolean A02(AnonymousClass22M r6) {
        C178119Bw r0;
        C18070vi.A0d(r6, 0);
        AnonymousClass25F r2 = r6.A00;
        C178119Bw r02 = (C178119Bw) r2.A02;
        Boolean bool = null;
        if (r02 != null) {
            bool = Boolean.valueOf(r02.A0O());
        }
        if (C18070vi.A19(bool, true)) {
            C178119Bw r03 = (C178119Bw) r2.A02;
            if (r03 == null || r03.A0E == null) {
                return false;
            }
            return true;
        } else if (!C18070vi.A19(bool, false) || (r0 = (C178119Bw) r2.A02) == null || r0.A06 != 0) {
            return false;
        } else {
            C56762hz r22 = (C56762hz) this.A00.get();
            String str = r6.A0v.A01;
            if (str == null) {
                return false;
            }
            String A09 = C40811vJ.A09(str);
            C18070vi.A0X(A09);
            Object obj = r22.A00.get(A09);
            if (obj == null || obj == CallState.NONE || obj == CallState.LINK || obj == CallState.PRECALLING) {
                return false;
            }
            return true;
        }
    }

    public static final boolean A00(AnonymousClass22M r2) {
        C178119Bw r0;
        AnonymousClass25F r22 = r2.A00;
        C178119Bw r02 = (C178119Bw) r22.A02;
        if (r02 == null || r02.A0C == null || (r0 = (C178119Bw) r22.A02) == null || !r0.A0W()) {
            return false;
        }
        return true;
    }

    public final boolean A03(AnonymousClass22M r3) {
        C178119Bw r0;
        AnonymousClass25F r1 = r3.A00;
        if (A00(r3) && (r0 = (C178119Bw) r1.A02) != null) {
            C178119Bw.A00(r0);
            if (r0.A09 != 0) {
                return false;
            }
            return true;
        }
        return false;
    }
}
