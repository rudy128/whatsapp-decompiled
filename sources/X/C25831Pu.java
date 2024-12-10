package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.1Pu  reason: invalid class name and case insensitive filesystem */
public final class C25831Pu {
    public static final long[] A08 = {0, 180000, 900000};
    public final AnonymousClass1CJ A00;
    public final AnonymousClass1MZ A01;
    public final AnonymousClass00H A02;
    public final C19880zA A03;
    public final AnonymousClass1PM A04;
    public final C25491Ok A05;
    public final AnonymousClass12L A06;
    public final AnonymousClass00H A07;

    public C25831Pu(C19880zA r2, AnonymousClass1PM r3, C25491Ok r4, AnonymousClass1CJ r5, AnonymousClass1MZ r6, AnonymousClass12L r7, AnonymousClass00H r8, AnonymousClass00H r9) {
        C18070vi.A0d(r5, 1);
        C18070vi.A0d(r7, 2);
        C18070vi.A0d(r4, 3);
        C18070vi.A0d(r8, 4);
        C18070vi.A0d(r3, 5);
        C18070vi.A0d(r6, 7);
        C18070vi.A0d(r9, 8);
        this.A00 = r5;
        this.A06 = r7;
        this.A05 = r4;
        this.A02 = r8;
        this.A04 = r3;
        this.A03 = r2;
        this.A01 = r6;
        this.A07 = r9;
    }

    public final boolean A00(AnonymousClass1E7 r3, AnonymousClass1EC r4) {
        C18070vi.A0d(r3, 0);
        AnonymousClass1MZ r0 = this.A01;
        boolean A0J = r0.A0J(r4);
        boolean A0K = r0.A0K(r4);
        if (!A0J || ((!A0K && r3.A13) || this.A00.A06(r4) == 3 || ((C42211xo) this.A02.get()).A00(r3))) {
            return false;
        }
        return true;
    }

    public final boolean A01(UserJid userJid) {
        C18070vi.A0d(userJid, 0);
        if (!this.A04.A04(userJid)) {
            C19880zA r1 = this.A03;
            if ((!r1.A07() || !((C25811Ps) r1.A03()).A0D(userJid)) && !C42761yh.A01(this.A06, userJid)) {
                this.A07.get();
                if (this.A05.A00(userJid)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
