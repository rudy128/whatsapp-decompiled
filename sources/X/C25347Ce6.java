package X;

/* renamed from: X.Ce6  reason: case insensitive filesystem */
public abstract class C25347Ce6 {
    public static final AnonymousClass0Ip A01(C17130tn r12, C24263ByM byM) {
        AnonymousClass07W r3;
        long A02;
        long A07;
        long A022;
        C18070vi.A0d(byM, 0);
        r12.COB(1079176934);
        int ordinal = byM.ordinal();
        if (ordinal == 1) {
            r12.COB(-1918041058);
            r3 = CG7.A00;
            A02 = C26257Cw2.A02(r12, r3);
            A07 = C26257Cw2.A07(r12, r3);
            A022 = C26257Cw2.A02(r12, r3);
        } else if (ordinal == 0) {
            r12.COB(-1918028807);
            A02 = C05100Qk.A04;
            r3 = CG7.A00;
            C26257Cw2 A0g = BE6.A0g(r12, r3);
            if (A0g instanceof BqD) {
                A07 = ((BqD) A0g).A02;
            } else {
                A07 = ((BqC) A0g).A02;
            }
            A022 = A02;
        } else {
            r12.COB(-1918043402);
            AnonymousClass0VR.A0U(r12);
            throw AnonymousClass3MW.A14();
        }
        long A04 = C26257Cw2.A04(r12, r3);
        r12.COB(-339300779);
        AnonymousClass0Ip r32 = new AnonymousClass0Ip(A02, A07, A022, A04);
        AnonymousClass0VR r122 = (AnonymousClass0VR) r12;
        AnonymousClass0VR.A0R(r122, false);
        AnonymousClass0VR.A0R(r122, false);
        AnonymousClass0VR.A0R(r122, false);
        return r32;
    }

    public static final AnonymousClass0Ip A00(C17130tn r11) {
        long j;
        r11.COB(610360855);
        AnonymousClass07W r2 = CG7.A00;
        long A06 = C26257Cw2.A06(r11, r2);
        C26257Cw2 A0g = BE6.A0g(r11, r2);
        if (A0g instanceof BqD) {
            j = ((BqD) A0g).A06;
        } else {
            j = ((BqC) A0g).A06;
        }
        long A08 = BE6.A0g(r11, r2).A08();
        long A04 = C26257Cw2.A04(r11, r2);
        r11.COB(-339300779);
        AnonymousClass0Ip r22 = new AnonymousClass0Ip(A06, j, A08, A04);
        AnonymousClass0VR r112 = (AnonymousClass0VR) r11;
        AnonymousClass0VR.A0R(r112, false);
        AnonymousClass0VR.A0R(r112, false);
        return r22;
    }
}
