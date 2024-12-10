package X;

import java.util.List;

/* renamed from: X.3UR  reason: invalid class name */
public final class AnonymousClass3UR extends AnonymousClass1J2 {
    public final AnonymousClass1DS A00;
    public final AnonymousClass1DS A01;
    public final AnonymousClass1DT A02;
    public final AnonymousClass1DT A03;
    public final AnonymousClass4KO A04;
    public final AnonymousClass1N4 A05;
    public final AnonymousClass1E7 A06;
    public final C18030ve A07;
    public final AnonymousClass1BI A08;
    public final AnonymousClass10I A09;

    public final boolean A0T(int i) {
        List<AnonymousClass4EV> A10 = AnonymousClass3MW.A10(this.A03);
        if (A10 == null) {
            return false;
        }
        for (AnonymousClass4EV r1 : A10) {
            if ((r1 instanceof AnonymousClass403) && Integer.valueOf(((AnonymousClass403) r1).A00).equals(Integer.valueOf(i))) {
                return true;
            }
        }
        return false;
    }

    public AnonymousClass3UR(AnonymousClass4KO r2, AnonymousClass1N4 r3, AnonymousClass1E7 r4, C18030ve r5, AnonymousClass1BI r6, AnonymousClass10I r7) {
        C18070vi.A0w(r5, r7, r2, r3, r6);
        C18070vi.A0d(r4, 6);
        this.A07 = r5;
        this.A09 = r7;
        this.A04 = r2;
        this.A05 = r3;
        this.A08 = r6;
        this.A06 = r4;
        AnonymousClass1DT A0L = AnonymousClass3MW.A0L();
        this.A03 = A0L;
        this.A01 = A0L;
        AnonymousClass1DT A0L2 = AnonymousClass3MW.A0L();
        this.A02 = A0L2;
        this.A00 = A0L2;
    }
}
