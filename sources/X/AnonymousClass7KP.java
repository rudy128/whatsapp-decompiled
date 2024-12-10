package X;

import android.view.View;

/* renamed from: X.7KP  reason: invalid class name */
public class AnonymousClass7KP implements C23691Hg {
    public final int A00;
    public final boolean A01;

    public AnonymousClass7KP(boolean z, int i) {
        this.A00 = i;
        this.A01 = z;
    }

    public final void CGE(Object obj) {
        C1603087y r0;
        C123476Up BPj;
        View A0A;
        long A0A2;
        boolean z;
        int i;
        C123476Up BPj2;
        C123476Up BPj3;
        C123476Up BPj4;
        switch (this.A00) {
            case 0:
                boolean z2 = this.A01;
                AnonymousClass1V6 r11 = (AnonymousClass1V6) obj;
                C18070vi.A0d(r11, 1);
                r11.C6R(z2);
                return;
            case 1:
                ((AnonymousClass1TX) obj).Bth(this.A01);
                return;
            case 2:
                AnonymousClass1WY r112 = (AnonymousClass1WY) obj;
                C18070vi.A0d(r112, 1);
                r112.C2o();
                return;
            case 3:
                boolean z3 = this.A01;
                C126416ch r113 = (C126416ch) obj;
                C18070vi.A0d(r113, 1);
                AnonymousClass73S r2 = (AnonymousClass73S) r113.A00.get();
                if (r2 == null) {
                    return;
                }
                if (z3) {
                    C1603087y r02 = r2.A00;
                    if (r02 != null && (BPj4 = r02.BPj()) != null) {
                        if (C72453Mb.A1a(r2.A0C)) {
                            AnonymousClass86B A012 = AnonymousClass73S.A01(r2);
                            if (A012 != null) {
                                ((C139216yQ) r2.A07.get()).A01(A012, BPj4.A00(), false);
                                return;
                            }
                            return;
                        }
                        C30141dS r1 = r2.A04;
                        if (r1.A01() && !C108985cd.A1Y(r1)) {
                            AnonymousClass73S.A02(r2, BPj4, false);
                            return;
                        } else if (r1.A02()) {
                            AnonymousClass73S.A03(r2, BPj4, false);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    if (C72453Mb.A1a(r2.A0C)) {
                        C1603087y r03 = r2.A00;
                        if (!(r03 == null || (BPj3 = r03.BPj()) == null || !BPj3.A04)) {
                            C136056tC A002 = BPj3.A00();
                            A002.A02 = false;
                            A002.A04 = false;
                            AnonymousClass86B A013 = AnonymousClass73S.A01(r2);
                            if (A013 != null) {
                                ((C139216yQ) r2.A07.get()).A01(A013, A002, false);
                            }
                        }
                    } else {
                        C30141dS r12 = r2.A04;
                        if (r12.A01()) {
                            C1603087y r04 = r2.A00;
                            if (!(r04 == null || (BPj2 = r04.BPj()) == null || !BPj2.A04)) {
                                ((C138856xo) r2.A05.get()).A01(AnonymousClass3MW.A0A(r2.A0A), true);
                            }
                        } else if (r12.A02() && (r0 = r2.A00) != null && (BPj = r0.BPj()) != null && BPj.A04) {
                            boolean A06 = C108945cZ.A11(r2.A08).A06(AnonymousClass00R.A0Y);
                            C41821x7 A12 = C108945cZ.A12(r2.A09);
                            if (!A06) {
                                A0A = AnonymousClass3MW.A0A(r2.A0E);
                                A0A2 = C108995ce.A0A(r2.A02);
                                z = false;
                                i = 2;
                            } else {
                                A0A = AnonymousClass3MW.A0A(r2.A0D);
                                A0A2 = C108995ce.A0A(r2.A02);
                                z = false;
                                i = 1;
                            }
                            A12.A03(A0A, i, A0A2, z, z);
                        }
                    }
                    if (!r2.A0F) {
                        C108975cc.A0r(r2.A01.findViewById(2131427795));
                        return;
                    }
                    return;
                }
            default:
                C123416Uj r114 = (C123416Uj) obj;
                C18070vi.A0d(r114, 1);
                r114.A01();
                return;
        }
    }
}
