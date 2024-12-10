package X;

import androidx.compose.animation.core.Animatable$runAnimation$2;
import androidx.compose.animation.core.Animatable$snapTo$2;

/* renamed from: X.0Q3  reason: invalid class name */
public final class AnonymousClass0Q3 {
    public Object A00;
    public AnonymousClass0D0 A01;
    public AnonymousClass0D0 A02;
    public Object A03;
    public final C05780Vr A04;
    public final C16590sg A05;
    public final C17330uU A06 = AnonymousClass0Q9.A03(false);
    public final C17330uU A07;
    public final AnonymousClass0D0 A08;
    public final AnonymousClass0D0 A09;
    public final AnonymousClass0OK A0A;
    public final AnonymousClass0U0 A0B;
    public final Object A0C;

    public static final AnonymousClass0Ts A00(C16000rY r4, C16590sg r5, Object obj, Object obj2, Object obj3) {
        return new AnonymousClass0Ts(r4, (AnonymousClass0D0) r5.BPS().invoke(obj3), r5, obj, obj2);
    }

    private final Object A03(C16900tP r10, Object obj, C30391dr r12) {
        return this.A0A.A02(AnonymousClass0CG.Default, r12, new Animatable$runAnimation$2(this, r10, obj, (C30391dr) null, (C22821Di) null, this.A04.A01));
    }

    public static final Object A02(AnonymousClass0Q3 r8, Object obj) {
        if (!C18070vi.A18(r8.A01, r8.A08) || !C18070vi.A18(r8.A02, r8.A09)) {
            C16590sg r6 = r8.A05;
            AnonymousClass0D0 r5 = (AnonymousClass0D0) r6.BPS().invoke(obj);
            int A012 = r5.A01();
            boolean z = false;
            for (int i = 0; i < A012; i++) {
                float A002 = r5.A00(i);
                AnonymousClass0D0 r7 = r8.A01;
                if (A002 < r7.A00(i) || r5.A00(i) > r8.A02.A00(i)) {
                    r5.A04(i, C28851b7.A02(r5.A00(i), r7.A00(i), r8.A02.A00(i)));
                    z = true;
                }
            }
            if (z) {
                return r6.BPR().invoke(r5);
            }
        }
        return obj;
    }

    public static final void A04(AnonymousClass0Q3 r3) {
        C05780Vr r2 = r3.A04;
        r2.A02.A03();
        r2.A01 = Long.MIN_VALUE;
        AnonymousClass000.A1C(r3.A06, false);
    }

    public final Object A05() {
        return this.A05.BPR().invoke(this.A04.A02);
    }

    public final Object A06(C16000rY r3, Object obj, Object obj2, C30391dr r6) {
        return A03(A00(r3, this.A05, this.A04.A05.getValue(), obj, obj2), obj2, r6);
    }

    public final Object A07(Object obj, C30391dr r5) {
        Object A002 = this.A0A.A02(AnonymousClass0CG.Default, r5, new Animatable$snapTo$2(this, obj, (C30391dr) null));
        if (A002 != AnonymousClass3F6.A03()) {
            return C27621Wu.A00;
        }
        return A002;
    }

    public final void A08(Object obj, Object obj2) {
        AnonymousClass0D0 r5;
        AnonymousClass0D0 r4;
        if (obj == null || (r5 = (AnonymousClass0D0) this.A05.BPS().invoke(obj)) == null) {
            r5 = this.A08;
        }
        if (obj2 == null || (r4 = (AnonymousClass0D0) this.A05.BPS().invoke(obj2)) == null) {
            r4 = this.A09;
        }
        int A012 = r5.A01();
        int i = 0;
        while (i < A012) {
            if (r5.A00(i) <= r4.A00(i)) {
                i++;
            } else {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: ");
                A10.append(r5);
                A10.append(" is greater than upper bound ");
                A10.append(r4);
                throw AnonymousClass000.A0n(AnonymousClass001.A1I(" on index ", A10, i));
            }
        }
        this.A01 = r5;
        this.A02 = r4;
        this.A00 = obj2;
        this.A03 = obj;
        if (!AnonymousClass001.A1b(this.A06)) {
            C17330uU r2 = this.A04.A05;
            Object A022 = A02(this, r2.getValue());
            if (!C18070vi.A18(A022, r2.getValue())) {
                r2.setValue(A022);
            }
        }
    }

    public AnonymousClass0Q3(C16590sg r10, Object obj, Object obj2) {
        AnonymousClass0D0 r3;
        AnonymousClass0D0 r0;
        this.A05 = r10;
        this.A0C = obj2;
        this.A04 = new C05780Vr((AnonymousClass0D0) null, r10, obj, Long.MIN_VALUE, Long.MIN_VALUE, false);
        this.A07 = AnonymousClass0Q9.A01(obj);
        this.A0A = new AnonymousClass0OK();
        this.A0B = AnonymousClass0U0.A01(obj2);
        AnonymousClass0D0 r1 = this.A04.A02;
        if (r1 instanceof AnonymousClass074) {
            r3 = AnonymousClass0MV.A00;
        } else if (r1 instanceof AnonymousClass077) {
            r3 = AnonymousClass0MV.A02;
        } else if (r1 instanceof AnonymousClass075) {
            r3 = AnonymousClass0MV.A04;
        } else {
            r3 = AnonymousClass0MV.A06;
        }
        C18070vi.A0z(r3, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.A08 = r3;
        AnonymousClass0D0 r12 = this.A04.A02;
        if (r12 instanceof AnonymousClass074) {
            r0 = AnonymousClass0MV.A01;
        } else if (r12 instanceof AnonymousClass077) {
            r0 = AnonymousClass0MV.A03;
        } else if (r12 instanceof AnonymousClass075) {
            r0 = AnonymousClass0MV.A05;
        } else {
            r0 = AnonymousClass0MV.A07;
        }
        C18070vi.A0z(r0, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
        this.A09 = r0;
        this.A01 = r3;
        this.A02 = r0;
    }
}
