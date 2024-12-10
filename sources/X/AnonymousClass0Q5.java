package X;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition$animateTo$1$1;

/* renamed from: X.0Q5  reason: invalid class name */
public final class AnonymousClass0Q5 {
    public long A00;
    public final MutableTransitionState A01;
    public final C17290uQ A02;
    public final C17290uQ A03;
    public final C17330uU A04;
    public final C17330uU A05;
    public final C17330uU A06;
    public final C17330uU A07;
    public final C16300s2 A08;
    public final C06820Zu A09;
    public final String A0A;
    public final C06820Zu A0B;

    public static final void A03(AnonymousClass0Q5 r7) {
        C17330uU r6 = r7.A07;
        AnonymousClass000.A1C(r6, true);
        if (AnonymousClass001.A1b(r7.A04)) {
            C06820Zu r5 = r7.A09;
            int size = r5.size();
            for (int i = 0; i < size; i++) {
                C05830Vw r2 = (C05830Vw) r5.get(i);
                r2.A02.getValue();
                r2.A01(r7.A00);
            }
            AnonymousClass000.A1C(r6, false);
        }
    }

    public final void A05(float f, long j) {
        long j2;
        long j3 = j;
        C17290uQ r8 = this.A03;
        if (r8.BUF() == Long.MIN_VALUE) {
            r8.CJN(j3);
            AnonymousClass000.A1C(this.A01.A01, true);
        }
        AnonymousClass000.A1C(this.A07, false);
        C17290uQ r82 = this.A02;
        r82.CJN(j - r8.BUF());
        C06820Zu r7 = this.A09;
        int size = r7.size();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            C05830Vw r4 = (C05830Vw) r7.get(i);
            if (!AnonymousClass001.A1b(r4.A04)) {
                long BUF = r82.BUF();
                if (f > 0.0f) {
                    C17290uQ r9 = r4.A01;
                    float BUF2 = ((float) (BUF - r9.BUF())) / f;
                    if (!Float.isNaN(BUF2)) {
                        j2 = (long) BUF2;
                    } else {
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("Duration scale adjusted time is NaN. Duration scale: ");
                        A10.append(f);
                        A10.append(",playTimeNanos: ");
                        A10.append(BUF);
                        A10.append(", offsetTimeNanos: ");
                        A10.append(r9.BUF());
                        throw AnonymousClass000.A0m(A10);
                    }
                } else {
                    j2 = ((AnonymousClass0Ts) r4.A02.getValue()).A00;
                }
                C17330uU r92 = r4.A02;
                r4.A07.setValue(((AnonymousClass0Ts) r92.getValue()).BbD(j2));
                r4.A00 = ((AnonymousClass0Ts) r92.getValue()).BbM(j2);
                if (AnonymousClass000.A1Q((j2 > ((AnonymousClass0Ts) r92.getValue()).A00 ? 1 : (j2 == ((AnonymousClass0Ts) r92.getValue()).A00 ? 0 : -1)))) {
                    AnonymousClass000.A1C(r4.A04, true);
                    r4.A01.CJN(0);
                }
            }
            if (!AnonymousClass001.A1b(r4.A04)) {
                z = false;
            }
        }
        C06820Zu r42 = this.A0B;
        int size2 = r42.size();
        for (int i2 = 0; i2 < size2; i2++) {
            AnonymousClass0Q5 r5 = (AnonymousClass0Q5) r42.get(i2);
            if (!C18070vi.A18(r5.A06.getValue(), A02(r5))) {
                r5.A05(f, r82.BUF());
            }
            if (!C18070vi.A18(r5.A06.getValue(), A02(r5))) {
                z = false;
            }
        }
        if (z) {
            A04();
        }
    }

    public static Object A02(AnonymousClass0Q5 r0) {
        return r0.A01.A00.getValue();
    }

    public final void A04() {
        this.A03.CJN(Long.MIN_VALUE);
        MutableTransitionState mutableTransitionState = this.A01;
        mutableTransitionState.A00.setValue(this.A06.getValue());
        this.A02.CJN(0);
        AnonymousClass000.A1C(mutableTransitionState.A01, false);
    }

    public final void A06(C05830Vw r2) {
        this.A09.add(r2);
    }

    public final void A07(C05830Vw r2) {
        this.A09.remove((Object) r2);
    }

    public final void A08(AnonymousClass0Q5 r2) {
        this.A0B.add(r2);
    }

    public final void A09(AnonymousClass0Q5 r2) {
        this.A0B.remove((Object) r2);
    }

    public final void A0C(Object obj, Object obj2, long j) {
        this.A03.CJN(Long.MIN_VALUE);
        MutableTransitionState mutableTransitionState = this.A01;
        AnonymousClass000.A1C(mutableTransitionState.A01, false);
        C17330uU r2 = this.A04;
        if (!AnonymousClass001.A1b(r2) || !C18070vi.A18(mutableTransitionState.A00.getValue(), obj) || !C18070vi.A18(this.A06.getValue(), obj2)) {
            C17330uU r1 = mutableTransitionState.A00;
            if (!C18070vi.A18(r1.getValue(), obj)) {
                r1.setValue(obj);
            }
            this.A06.setValue(obj2);
            AnonymousClass000.A1C(r2, true);
            this.A05.setValue(new AnonymousClass0U4(obj, obj2));
        }
        C06820Zu r6 = this.A0B;
        int size = r6.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass0Q5 r22 = (AnonymousClass0Q5) r6.get(i);
            C18070vi.A0z(r22, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (AnonymousClass001.A1b(r22.A04)) {
                r22.A0C(A02(r22), r22.A06.getValue(), j);
            }
        }
        C06820Zu r23 = this.A09;
        int size2 = r23.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((C05830Vw) r23.get(i2)).A01(j);
        }
        this.A00 = j;
    }

    public String toString() {
        C06820Zu r4 = this.A09;
        int size = r4.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            Object obj = r4.get(i);
            StringBuilder A11 = AnonymousClass000.A11(str);
            A11.append(obj);
            str = AnonymousClass000.A0y(", ", A11);
        }
        return str;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.08Z, X.0W5, X.0uQ] */
    /* JADX WARNING: type inference failed for: r0v5, types: [X.0Ig, X.08c] */
    /* JADX WARNING: type inference failed for: r1v2, types: [X.08Z, X.0W5, X.0uQ] */
    /* JADX WARNING: type inference failed for: r0v6, types: [X.0Ig, X.08c] */
    public AnonymousClass0Q5(MutableTransitionState mutableTransitionState, String str, int i) {
        this.A01 = mutableTransitionState;
        this.A0A = str;
        this.A06 = AnonymousClass0Q9.A02(mutableTransitionState.A00.getValue());
        this.A05 = AnonymousClass0Q9.A01(new AnonymousClass0U4(A02(this), A02(this)));
        ? r1 = new AnonymousClass0W5();
        ? r0 = new C03460Ig();
        r0.A00 = 0;
        r1.A00 = r0;
        this.A02 = r1;
        ? r12 = new AnonymousClass0W5();
        ? r02 = new C03460Ig();
        r02.A00 = Long.MIN_VALUE;
        r12.A00 = r02;
        this.A03 = r12;
        this.A07 = AnonymousClass0Q9.A04(true);
        this.A09 = C04950Pq.A03();
        this.A0B = C04950Pq.A03();
        this.A04 = AnonymousClass0Q9.A04(false);
        this.A08 = C04950Pq.A01(new C07750dz(this));
    }

    public final void A0A(C17130tn r6, Object obj, int i) {
        int i2;
        r6.COC(-1493585151);
        if ((i & 14) == 0) {
            i2 = AnonymousClass001.A0Z(r6, obj) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= AnonymousClass001.A0R(r6, this);
        }
        if ((i2 & 91) == 18 && r6.BZO()) {
            r6.CNR();
        } else if (!AnonymousClass001.A1b(this.A04)) {
            A0B(r6, obj, (i2 & 14) | (i2 & 112));
            if (!C18070vi.A18(obj, A02(this)) || this.A03.BUF() != Long.MIN_VALUE || AnonymousClass001.A1b(this.A07)) {
                boolean A1V = AnonymousClass000.A1V(r6, this, 1951115890);
                Object CER = r6.CER();
                if (A1V || CER == AnonymousClass0MH.A00) {
                    CER = new Transition$animateTo$1$1(this, (C30391dr) null);
                    AnonymousClass0VR.A0V(r6, CER);
                }
                AnonymousClass0VR.A0T(r6);
                AnonymousClass0QC.A04(r6, this, (AnonymousClass1OS) CER);
            }
        }
        C05660Vf BKF = r6.BKF();
        if (BKF != null) {
            BKF.A03(new C12790mK(this, obj, i));
        }
    }

    public final void A0B(C17130tn r6, Object obj, int i) {
        int i2;
        r6.COC(-583974681);
        if ((i & 14) == 0) {
            i2 = AnonymousClass001.A0Z(r6, obj) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= AnonymousClass001.A0R(r6, this);
        }
        if ((i2 & 91) == 18 && r6.BZO()) {
            r6.CNR();
        } else if (!AnonymousClass001.A1b(this.A04)) {
            C17330uU r3 = this.A06;
            if (!C18070vi.A18(r3.getValue(), obj)) {
                this.A05.setValue(new AnonymousClass0U4(r3.getValue(), obj));
                C17330uU r2 = this.A01.A00;
                if (!C18070vi.A18(r2.getValue(), r3.getValue())) {
                    r2.setValue(r3.getValue());
                }
                r3.setValue(obj);
                if (this.A03.BUF() == Long.MIN_VALUE) {
                    AnonymousClass000.A1C(this.A07, true);
                }
                C06820Zu r4 = this.A09;
                int size = r4.size();
                for (int i3 = 0; i3 < size; i3++) {
                    AnonymousClass000.A1C(((C05830Vw) r4.get(i3)).A05, true);
                }
            }
        }
        C05660Vf BKF = r6.BKF();
        if (BKF != null) {
            BKF.A03(new C12800mL(this, obj, i));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass0Q5(MutableTransitionState mutableTransitionState, String str) {
        this(mutableTransitionState, str, 42);
        C18070vi.A0z(mutableTransitionState, "null cannot be cast to non-null type androidx.compose.animation.core.TransitionState<S of androidx.compose.animation.core.Transition>");
    }
}
