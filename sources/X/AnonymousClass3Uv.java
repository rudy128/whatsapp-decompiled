package X;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3Uv  reason: invalid class name */
public final class AnonymousClass3Uv extends AnonymousClass1J2 {
    public AnonymousClass1DT A00 = AnonymousClass3MW.A0L();
    public AnonymousClass206 A01;
    public AtomicBoolean A02 = new AtomicBoolean(false);
    public final C22801Dg A03;
    public final AnonymousClass1KB A04;
    public final C33251iW A05;
    public final C26911Ty A06;
    public final C25741Pl A07;
    public final C51652Zc A08;
    public final AnonymousClass1UD A09;
    public final C32951i1 A0A;
    public final AnonymousClass121 A0B;
    public final AnonymousClass1NJ A0C;
    public final C25931Qe A0D;
    public final AnonymousClass1BI A0E;
    public final AnonymousClass10I A0F;
    public final C95504mL A0G;
    public final AnonymousClass1R3 A0H;
    public final C24681Lg A0I;

    public AnonymousClass3Uv(AnonymousClass1KB r9, C33251iW r10, C26911Ty r11, C25741Pl r12, C51652Zc r13, AnonymousClass1UD r14, C32951i1 r15, AnonymousClass121 r16, AnonymousClass1R3 r17, C24681Lg r18, AnonymousClass1NJ r19, C25931Qe r20, AnonymousClass1BI r21, AnonymousClass10I r22) {
        AnonymousClass10I r3 = r22;
        AnonymousClass1NJ r0 = r19;
        C18070vi.A0w(r14, r9, r3, r0, r10);
        C25931Qe r4 = r20;
        AnonymousClass1R3 r5 = r17;
        C24681Lg r2 = r18;
        C18070vi.A0x(r5, r2, r15, r4, r12);
        AnonymousClass121 r1 = r16;
        C18070vi.A0r(r13, r11, r1);
        this.A09 = r14;
        this.A04 = r9;
        this.A0F = r3;
        this.A0C = r0;
        this.A05 = r10;
        this.A0H = r5;
        this.A0I = r2;
        this.A0A = r15;
        this.A0D = r4;
        this.A07 = r12;
        this.A08 = r13;
        this.A06 = r11;
        this.A0B = r1;
        AnonymousClass1BI r7 = r21;
        this.A0E = r7;
        C22801Dg r6 = new C22801Dg();
        this.A03 = r6;
        C95504mL r02 = new C95504mL(this, 3);
        this.A0G = r02;
        r2.registerObserver(r02);
        AnonymousClass3MZ.A1R(this.A00, r6, new C105025Qk(this), 17);
        AnonymousClass206 A032 = r5.A03(r7);
        if (A032 == null) {
            return;
        }
        if (r4.A0B(C18070vi.A09(A032, C20955Ac9.class))) {
            r3.CGN(new C21451AkI(this, A032, 33));
        } else {
            A00(this, A032);
        }
    }

    public static final void A00(AnonymousClass3Uv r6, AnonymousClass206 r7) {
        AnonymousClass1DT r3 = r6.A00;
        AnonymousClass206 A0r = AnonymousClass3MX.A0r(r3);
        C49452Qn r4 = null;
        if (A0r != null) {
            long j = A0r.A0y;
            if (Long.valueOf(j) != null && r7.A0y < j) {
                return;
            }
        }
        if (C83574Fq.A00(r7)) {
            return;
        }
        if (r7.A0v.A02) {
            r3.A0F((Object) null);
            return;
        }
        Set A0S = C200410p.A0S(new C49452Qn[]{null, C49452Qn.LAST, C49452Qn.FULL});
        C692036h A002 = AnonymousClass2UW.A00(r7);
        if (A002 != null) {
            r4 = A002.A01;
        }
        if (A0S.contains(r4) || r7.A0x()) {
            C692136i A003 = AnonymousClass2UX.A00(r7);
            if (A003 == null || A003.A00 == null) {
                r3.A0F(r7);
            }
        }
    }

    public void A0S() {
        this.A0I.unregisterObserver(this.A0G);
    }
}
