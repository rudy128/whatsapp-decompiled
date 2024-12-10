package androidx.compose.material.ripple;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0E9;
import X.AnonymousClass0LG;
import X.AnonymousClass0MV;
import X.AnonymousClass0Oy;
import X.AnonymousClass0Q3;
import X.AnonymousClass0Q9;
import X.AnonymousClass0QG;
import X.AnonymousClass0QY;
import X.AnonymousClass0WZ;
import X.AnonymousClass0t6;
import X.AnonymousClass1OW;
import X.AnonymousClass3F6;
import X.AnonymousClass5WJ;
import X.C02000Cg;
import X.C04820Pb;
import X.C05100Qk;
import X.C108935cY;
import X.C17330uU;
import X.C17770vC;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;

public final class RippleAnimation {
    public AnonymousClass0QY A00;
    public AnonymousClass0QY A01;
    public Float A02;
    public Float A03;
    public final AnonymousClass0Q3 A04 = AnonymousClass0MV.A00(0.0f);
    public final AnonymousClass0Q3 A05 = AnonymousClass0MV.A00(0.0f);
    public final AnonymousClass0Q3 A06 = AnonymousClass0MV.A00(0.0f);
    public final C17330uU A07;
    public final C17330uU A08;
    public final float A09;
    public final C108935cY A0A = A02();
    public final boolean A0B;

    private final Object A00(C30391dr r3) {
        Object A002 = AnonymousClass1OW.A00(r3, new RippleAnimation$fadeIn$2(this, (C30391dr) null));
        if (A002 != AnonymousClass3F6.A03()) {
            return C27621Wu.A00;
        }
        return A002;
    }

    private final Object A01(C30391dr r3) {
        Object A002 = AnonymousClass1OW.A00(r3, new RippleAnimation$fadeOut$2(this, (C30391dr) null));
        if (A002 != AnonymousClass3F6.A03()) {
            return C27621Wu.A00;
        }
        return A002;
    }

    public final void A04() {
        AnonymousClass000.A1C(this.A07, true);
        this.A0A.BFN(C27621Wu.A00);
    }

    public static final AnonymousClass5WJ A02() {
        return new AnonymousClass5WJ();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0050, code lost:
        if (r0.BCp(r7) != r5) goto L_0x005a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(X.C30391dr r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.AnonymousClass0bD
            if (r0 == 0) goto L_0x0066
            r7 = r9
            X.0bD r7 = (X.AnonymousClass0bD) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0066
            int r2 = r2 - r1
            r7.label = r2
        L_0x0012:
            java.lang.Object r6 = r7.result
            X.1g4 r5 = X.AnonymousClass3F6.A03()
            int r0 = r7.label
            r4 = 3
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L_0x002b
            if (r0 == r2) goto L_0x003a
            if (r0 == r3) goto L_0x0053
            if (r0 != r4) goto L_0x006c
            X.C30691eM.A01(r6)
        L_0x0028:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x002b:
            X.C30691eM.A01(r6)
            r7.L$0 = r8
            r7.label = r2
            java.lang.Object r0 = r8.A00(r7)
            if (r0 == r5) goto L_0x0052
            r1 = r8
            goto L_0x0041
        L_0x003a:
            java.lang.Object r1 = r7.L$0
            androidx.compose.material.ripple.RippleAnimation r1 = (androidx.compose.material.ripple.RippleAnimation) r1
            X.C30691eM.A01(r6)
        L_0x0041:
            X.0uU r0 = r1.A08
            X.AnonymousClass000.A1C(r0, r2)
            X.5cY r0 = r1.A0A
            r7.L$0 = r1
            r7.label = r3
            java.lang.Object r0 = r0.BCp(r7)
            if (r0 != r5) goto L_0x005a
        L_0x0052:
            return r5
        L_0x0053:
            java.lang.Object r1 = r7.L$0
            androidx.compose.material.ripple.RippleAnimation r1 = (androidx.compose.material.ripple.RippleAnimation) r1
            X.C30691eM.A01(r6)
        L_0x005a:
            r0 = 0
            r7.L$0 = r0
            r7.label = r4
            java.lang.Object r0 = r1.A01(r7)
            if (r0 != r5) goto L_0x0028
            return r5
        L_0x0066:
            X.0bD r7 = new X.0bD
            r7.<init>(r8, r9)
            goto L_0x0012
        L_0x006c:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ripple.RippleAnimation.A03(X.1dr):java.lang.Object");
    }

    public final void A05(C17770vC r18, long j) {
        float A052;
        float CPQ;
        C17770vC r9 = r18;
        if (this.A02 == null) {
            long BZL = r9.BZL();
            this.A02 = Float.valueOf(Math.max(AnonymousClass0QG.A02(BZL), AnonymousClass0QG.A00(BZL)) * 0.3f);
        }
        if (this.A03 == null) {
            float f = this.A09;
            if (Float.isNaN(f)) {
                CPQ = AnonymousClass0E9.A00(r9, r9.BZL(), this.A0B);
            } else {
                CPQ = r9.CPQ(f);
            }
            this.A03 = Float.valueOf(CPQ);
        }
        if (this.A00 == null) {
            this.A00 = AnonymousClass000.A0e(r9.BOQ());
        }
        if (this.A01 == null) {
            long BZL2 = r9.BZL();
            this.A01 = AnonymousClass000.A0e(AnonymousClass0LG.A01(AnonymousClass0QG.A02(BZL2), BZL2));
        }
        if (!AnonymousClass001.A1b(this.A07) || AnonymousClass001.A1b(this.A08)) {
            A052 = AnonymousClass001.A05(this.A04.A04.A05);
        } else {
            A052 = 1.0f;
        }
        Float f2 = this.A02;
        C18070vi.A0b(f2);
        float floatValue = f2.floatValue();
        Float f3 = this.A03;
        C18070vi.A0b(f3);
        float A002 = AnonymousClass001.A00(AnonymousClass001.A05(this.A06.A04.A05), floatValue, f3.floatValue());
        AnonymousClass0QY r0 = this.A00;
        C18070vi.A0b(r0);
        float A012 = AnonymousClass0QY.A01(r0.A00);
        AnonymousClass0QY r02 = this.A01;
        C18070vi.A0b(r02);
        float A013 = AnonymousClass0QY.A01(r02.A00);
        C17330uU r5 = this.A05.A04.A05;
        float A003 = AnonymousClass001.A00(AnonymousClass001.A05(r5), A012, A013);
        AnonymousClass0QY r03 = this.A00;
        C18070vi.A0b(r03);
        float A022 = AnonymousClass0QY.A02(r03.A00);
        AnonymousClass0QY r04 = this.A01;
        C18070vi.A0b(r04);
        long A0p = AnonymousClass001.A0p(A003, AnonymousClass001.A00(AnonymousClass001.A05(r5), A022, AnonymousClass0QY.A02(r04.A00)));
        long j2 = j;
        long A053 = AnonymousClass0Oy.A03(AnonymousClass001.A11(j2), C05100Qk.A04(j2), C05100Qk.A03(j2), C05100Qk.A02(j2), C05100Qk.A01(j2) * A052);
        if (this.A0B) {
            long BZL3 = r9.BZL();
            float A023 = AnonymousClass0QG.A02(BZL3);
            float A004 = AnonymousClass0QG.A00(BZL3);
            AnonymousClass0t6 BQs = r9.BQs();
            long BZL4 = BQs.BZL();
            AnonymousClass0WZ.A00(BQs).BF0(0.0f, 0.0f, A023, A004, 1);
            C04820Pb.A04(r9, (C02000Cg) null, A002, 120, A053, A0p);
            AnonymousClass001.A1P(BQs, BZL4);
            return;
        }
        C04820Pb.A04(r9, (C02000Cg) null, A002, 120, A053, A0p);
    }

    public RippleAnimation(AnonymousClass0QY r3, float f, boolean z) {
        this.A00 = r3;
        this.A09 = f;
        this.A0B = z;
        Boolean A0h = AnonymousClass000.A0h();
        this.A08 = AnonymousClass0Q9.A02(A0h);
        this.A07 = AnonymousClass0Q9.A01(A0h);
    }
}
