package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5iq  reason: invalid class name and case insensitive filesystem */
public final class C111205iq extends AnonymousClass1J2 {
    public final AnonymousClass1DT A00 = C108945cZ.A0S();
    public final AnonymousClass1DT A01 = C108945cZ.A0S();
    public final AnonymousClass1DT A02 = C108945cZ.A0S();
    public final AnonymousClass1DT A03 = C108945cZ.A0S();
    public final AnonymousClass1DT A04 = C108945cZ.A0S();
    public final AnonymousClass11P A05;
    public final AnonymousClass1CJ A06;
    public final C130126iv A07;
    public final C32021gV A08;
    public final List A09;
    public final C23421Fz A0A;
    public final boolean A0B;
    public final C33251iW A0C;
    public final C108485bm A0D;

    public C111205iq(C124926aD r9, C33251iW r10, AnonymousClass11P r11, AnonymousClass1CJ r12, C32021gV r13, List list, boolean z) {
        C72473Md.A1M(r9, r11, r10, 1);
        C18070vi.A0l(r13, r12);
        this.A09 = list;
        this.A0B = z;
        this.A05 = r11;
        this.A0C = r10;
        this.A08 = r13;
        this.A06 = r12;
        AnonymousClass1OX A002 = C41561wd.A00(this);
        AnonymousClass10E r1 = r9.A00.A02;
        AnonymousClass10I AL1 = AnonymousClass10E.AL1(r1);
        this.A07 = new C130126iv(AnonymousClass10E.A4z(r1), AnonymousClass3Ma.A0d(r1), (C35681md) r1.A7N.get(), AL1, AnonymousClass3MZ.A1B(r1), A002);
        C27178DXn A012 = AnonymousClass4W8.A01(C25691Pg.SUSPEND, -2);
        this.A0D = A012;
        this.A0A = AnonymousClass4WB.A01(A012);
    }

    private final long A00(C136216tS r10, C136216tS r11, List list) {
        if (!this.A0B || !r11.A05) {
            int i = r11.A00;
            if (i > 1) {
                long j = ((long) i) - 1;
                String A042 = C1409073n.A03.A04(r11.A03);
                String str = r11.A02;
                list.add(new C136216tS(r11.A01, str, A042, r11.A04, (int) j, false));
                return j;
            }
        } else if (!C18070vi.A18(r10.A01.A0v.toString(), r11.A01.A0v.toString())) {
            list.add(r11);
        }
        return 0;
    }

    public static final void A03(C136216tS r24, C111205iq r25, boolean z) {
        long A002;
        C136216tS r14 = r24;
        AnonymousClass206 r12 = r14.A01;
        C111205iq r13 = r25;
        if (AnonymousClass3MZ.A05(r13.A05, r12) < 2592000000L) {
            ArrayList A13 = AnonymousClass000.A13();
            C1409073n r10 = C1409073n.A03;
            String str = r14.A03;
            String A042 = r10.A04(str);
            AnonymousClass1DT r8 = r13.A00;
            C134836rE r0 = (C134836rE) r8.A06();
            long j = 0;
            if (r0 != null) {
                for (C136216tS r6 : r0.A01) {
                    String str2 = r6.A03;
                    if (!C18070vi.A18(r10.A04(str2), A042)) {
                        boolean z2 = r6.A05;
                        if (!z2 || r13.A0B || !z) {
                            A13.add(r6);
                            if (!r13.A0B || !z2) {
                                A002 = (long) r6.A00;
                            }
                        } else {
                            A002 = r13.A00(r6, r6, A13);
                        }
                    } else {
                        int i = r6.A00;
                        if (i >= 1) {
                            if (!z) {
                                A002 = r13.A00(r14, r6, A13);
                            } else if (!r13.A0B) {
                                A002 = ((long) i) + 1;
                                String str3 = r6.A02;
                                AnonymousClass206 r20 = r6.A01;
                                A13.add(new C136216tS(r20, str3, str2, r6.A04, (int) A002, true));
                            } else {
                                A002 = 0;
                            }
                        }
                    }
                    j += A002;
                }
            }
            if (A13.isEmpty()) {
                AnonymousClass3MY.A1M(r13.A01, true);
            } else {
                r8.A0E(new C134836rE(A13, j));
            }
            if (!z) {
                str = "";
            }
            r13.A0C.A0r(r12, str, true);
            return;
        }
        C72463Mc.A1B(r13.A03);
    }

    public final void A0T(int i) {
        AnonymousClass1DT r2 = this.A04;
        C134856rG r0 = (C134856rG) r2.A06();
        if (r0 == null || i != r0.A00) {
            C134856rG r02 = (C134856rG) r2.A06();
            C134856rG r1 = null;
            if (r02 != null) {
                r1 = new C134856rG(r02.A01, i);
            }
            r2.A0F(r1);
        }
    }
}
