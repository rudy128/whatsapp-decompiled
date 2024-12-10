package X;

import java.util.List;

/* renamed from: X.0IU  reason: invalid class name */
public final class AnonymousClass0IU {
    public boolean A00;
    public final AnonymousClass0IE A01;
    public final AnonymousClass0HE A02 = new AnonymousClass0HE();
    public final C06850Zx A03 = new C06850Zx();
    public final AnonymousClass0XV A04;

    public final int A00(AnonymousClass0HT r40, C16710ss r41, boolean z) {
        boolean z2;
        int i;
        long j;
        boolean z3;
        long CGz;
        if (this.A00) {
            return 0;
        }
        try {
            this.A00 = true;
            AnonymousClass0HE r37 = this.A02;
            AnonymousClass0HT r38 = r40;
            List list = r38.A01;
            C001100p r12 = new C001100p(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                AnonymousClass0KJ r6 = (AnonymousClass0KJ) list.get(i2);
                C001100p r11 = r37.A00;
                C03240He r1 = (C03240He) r11.A05(r6.A02);
                if (r1 == null) {
                    j = r6.A07;
                    CGz = r6.A04;
                    z3 = false;
                } else {
                    j = r1.A01;
                    z3 = r1.A02;
                    CGz = r41.CGz(r1.A00);
                }
                long j2 = r6.A02;
                long j3 = r6.A07;
                long j4 = r6.A04;
                boolean z4 = r6.A09;
                float f = r6.A00;
                int i3 = r6.A01;
                List list2 = r6.A08;
                long j5 = r6.A06;
                long j6 = r6.A03;
                AnonymousClass0KX r18 = new AnonymousClass0KX(f, i3, j2, j3, j4, j, CGz, j5, z4, z3, false);
                r18.A02 = list2;
                r18.A00 = j6;
                r12.A0A(j2, r18);
                if (z4) {
                    r11.A0A(r6.A02, new C03240He(r6.A07, r6.A09, r6.A05));
                } else {
                    r11.A08(r6.A02);
                }
            }
            AnonymousClass0IF r13 = new AnonymousClass0IF(r12, r38);
            C001100p r62 = r13.A00;
            int A002 = r62.A00();
            int i4 = 0;
            while (true) {
                if (i4 >= A002) {
                    z2 = true;
                    break;
                }
                AnonymousClass0KX r2 = (AnonymousClass0KX) r62.A04(i4);
                if (r2.A0B || r2.A0C) {
                    z2 = false;
                } else {
                    i4++;
                }
            }
            z2 = false;
            int A003 = r62.A00();
            for (int i5 = 0; i5 < A003; i5++) {
                AnonymousClass0KX r10 = (AnonymousClass0KX) r62.A04(i5);
                if (z2 || (!r10.A0C && r10.A0B)) {
                    boolean A1T = AnonymousClass000.A1T(r10.A04, 1);
                    AnonymousClass0XV r0 = this.A04;
                    long j7 = r10.A06;
                    C06850Zx r4 = this.A03;
                    r0.A0g(r4, j7, A1T, true);
                    if (!r4.isEmpty()) {
                        this.A01.A00(r4, r10.A05);
                        r4.clear();
                    }
                }
            }
            AnonymousClass0IE r02 = this.A01;
            C03700Kb r3 = r02.A00;
            r3.A01();
            C16910tQ r22 = r02.A01;
            boolean z5 = z;
            int i6 = 0;
            if (r3.A03(r62, r13, r22, z5)) {
                boolean A042 = r3.A04(r62, r13, r22, z5);
                if (r3.A05(r13) || A042) {
                    i6 = 1;
                }
            }
            int A004 = r62.A00();
            int i7 = 0;
            while (true) {
                if (i7 >= A004) {
                    i = 0;
                    break;
                }
                AnonymousClass0KX r5 = (AnonymousClass0KX) r62.A04(i7);
                if (AnonymousClass0QY.A04(r5.A06, r5.A07) != AnonymousClass0QY.A03 && r5.A02()) {
                    i = 2;
                    break;
                }
                i7++;
            }
            return i6 | i;
        } finally {
            this.A00 = false;
        }
    }

    public AnonymousClass0IU(AnonymousClass0XV r3) {
        this.A04 = r3;
        this.A01 = new AnonymousClass0IE(r3.A0G());
    }
}
