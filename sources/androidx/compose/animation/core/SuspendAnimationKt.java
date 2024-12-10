package androidx.compose.animation.core;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0D0;
import X.AnonymousClass0DZ;
import X.AnonymousClass0J2;
import X.AnonymousClass0Ts;
import X.AnonymousClass3F6;
import X.C04460Nm;
import X.C05780Vr;
import X.C10540iV;
import X.C16000rY;
import X.C16900tP;
import X.C17870vM;
import X.C18560wh;
import X.C22821Di;
import X.C27621Wu;
import X.C30391dr;

public abstract class SuspendAnimationKt {
    public static final Object A04(C16000rY r8, C05780Vr r9, Object obj, C30391dr r11, C22821Di r12) {
        Object value = r9.A05.getValue();
        C16000rY r1 = r8;
        AnonymousClass0Ts r5 = new AnonymousClass0Ts(r1, r9.A02, r9.A04, value, obj);
        Object A01 = A01(r5, r9, r11, r12, r9.A01);
        if (A01 != AnonymousClass3F6.A03()) {
            return C27621Wu.A00;
        }
        return A01;
    }

    public static final void A05(C16900tP r11, AnonymousClass0J2 r12, C05780Vr r13, C22821Di r14, float f, long j) {
        long j2;
        C16900tP r5 = r11;
        AnonymousClass0J2 r6 = r12;
        long j3 = j;
        if (f == 0.0f) {
            j2 = r11.BQy();
        } else {
            j2 = (long) (((float) (j - r12.A03)) / f);
        }
        A07(r5, r6, r13, r14, j3, j2);
    }

    public static final float A00(C18560wh r1) {
        C17870vM r0 = (C17870vM) r1.get(C17870vM.A00);
        if (r0 == null) {
            return 1.0f;
        }
        float BYY = r0.BYY();
        if (BYY >= 0.0f) {
            return BYY;
        }
        throw AnonymousClass000.A0n("negative scale factor");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b8 A[Catch:{ CancellationException -> 0x00de }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0105 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.C16900tP r23, X.C05780Vr r24, X.C30391dr r25, X.C22821Di r26, long r27) {
        /*
            r4 = r25
            r9 = r24
            r8 = r23
            r12 = r26
            boolean r0 = r4 instanceof X.AnonymousClass0bO
            if (r0 == 0) goto L_0x00fc
            r0 = r4
            X.0bO r0 = (X.AnonymousClass0bO) r0
            int r3 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x00fc
            int r3 = r3 - r2
            r0.label = r3
        L_0x001a:
            java.lang.Object r2 = r0.result
            X.1g4 r3 = X.AnonymousClass3F6.A03()
            int r1 = r0.label
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x0040
            if (r1 == r5) goto L_0x002f
            if (r1 == r4) goto L_0x002f
            java.lang.IllegalStateException r6 = X.AnonymousClass000.A0l()
        L_0x002e:
            throw r6
        L_0x002f:
            java.lang.Object r13 = r0.L$3
            X.4rF r13 = (X.C98494rF) r13
            java.lang.Object r12 = r0.L$2
            X.1Di r12 = (X.C22821Di) r12
            java.lang.Object r8 = r0.L$1
            X.0tP r8 = (X.C16900tP) r8
            java.lang.Object r9 = r0.L$0
            X.0Vr r9 = (X.C05780Vr) r9
            goto L_0x00a6
        L_0x0040:
            X.C30691eM.A01(r2)
            r1 = 0
            java.lang.Object r11 = r8.BbD(r1)
            X.0D0 r10 = r8.BbM(r1)
            X.4rF r13 = new X.4rF
            r13.<init>()
            r6 = -9223372036854775808
            r20 = r27
            int r1 = (r27 > r6 ? 1 : (r27 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x0079
            X.0wh r1 = r0.getContext()     // Catch:{ CancellationException -> 0x00de }
            float r14 = A00(r1)     // Catch:{ CancellationException -> 0x00de }
            X.0kA r7 = new X.0kA     // Catch:{ CancellationException -> 0x00de }
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ CancellationException -> 0x00de }
            r0.L$0 = r9     // Catch:{ CancellationException -> 0x00de }
            r0.L$1 = r8     // Catch:{ CancellationException -> 0x00de }
            r0.L$2 = r12     // Catch:{ CancellationException -> 0x00de }
            r0.L$3 = r13     // Catch:{ CancellationException -> 0x00de }
            r0.label = r5     // Catch:{ CancellationException -> 0x00de }
            java.lang.Object r1 = A02(r8, r0, r7)     // Catch:{ CancellationException -> 0x00de }
            if (r1 != r3) goto L_0x00a9
            goto L_0x0103
        L_0x0079:
            X.0sg r16 = r8.Bav()     // Catch:{ CancellationException -> 0x00de }
            java.lang.Object r18 = r8.BaD()     // Catch:{ CancellationException -> 0x00de }
            X.0dy r1 = new X.0dy     // Catch:{ CancellationException -> 0x00de }
            r1.<init>(r9)     // Catch:{ CancellationException -> 0x00de }
            X.0J2 r14 = new X.0J2     // Catch:{ CancellationException -> 0x00de }
            r15 = r10
            r17 = r11
            r19 = r1
            r22 = r20
            r14.<init>(r15, r16, r17, r18, r19, r20, r22)     // Catch:{ CancellationException -> 0x00de }
            X.0wh r1 = r0.getContext()     // Catch:{ CancellationException -> 0x00de }
            float r26 = A00(r1)     // Catch:{ CancellationException -> 0x00de }
            r22 = r8
            r23 = r14
            r25 = r12
            A05(r22, r23, r24, r25, r26, r27)     // Catch:{ CancellationException -> 0x00de }
            r13.element = r14     // Catch:{ CancellationException -> 0x00de }
            goto L_0x00a9
        L_0x00a6:
            X.C30691eM.A01(r2)     // Catch:{ CancellationException -> 0x00de }
        L_0x00a9:
            java.lang.Object r1 = r13.element     // Catch:{ CancellationException -> 0x00de }
            X.C18070vi.A0b(r1)     // Catch:{ CancellationException -> 0x00de }
            X.0J2 r1 = (X.AnonymousClass0J2) r1     // Catch:{ CancellationException -> 0x00de }
            X.0uU r1 = r1.A04     // Catch:{ CancellationException -> 0x00de }
            boolean r1 = X.AnonymousClass001.A1b(r1)     // Catch:{ CancellationException -> 0x00de }
            if (r1 == 0) goto L_0x0105
            X.0wh r1 = r0.getContext()     // Catch:{ CancellationException -> 0x00de }
            float r19 = A00(r1)     // Catch:{ CancellationException -> 0x00de }
            X.0k0 r1 = new X.0k0     // Catch:{ CancellationException -> 0x00de }
            r14 = r1
            r15 = r8
            r16 = r9
            r17 = r12
            r18 = r13
            r14.<init>(r15, r16, r17, r18, r19)     // Catch:{ CancellationException -> 0x00de }
            r0.L$0 = r9     // Catch:{ CancellationException -> 0x00de }
            r0.L$1 = r8     // Catch:{ CancellationException -> 0x00de }
            r0.L$2 = r12     // Catch:{ CancellationException -> 0x00de }
            r0.L$3 = r13     // Catch:{ CancellationException -> 0x00de }
            r0.label = r4     // Catch:{ CancellationException -> 0x00de }
            java.lang.Object r1 = A02(r8, r0, r1)     // Catch:{ CancellationException -> 0x00de }
            if (r1 != r3) goto L_0x00a9
            goto L_0x0104
        L_0x00de:
            r6 = move-exception
            java.lang.Object r0 = r13.element
            X.0J2 r0 = (X.AnonymousClass0J2) r0
            r5 = 0
            if (r0 == 0) goto L_0x00eb
            X.0uU r0 = r0.A04
            X.AnonymousClass000.A1C(r0, r5)
        L_0x00eb:
            java.lang.Object r0 = r13.element
            X.0J2 r0 = (X.AnonymousClass0J2) r0
            if (r0 == 0) goto L_0x002e
            long r3 = r0.A01
            long r1 = r9.A01
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x002e
            r9.A03 = r5
            throw r6
        L_0x00fc:
            X.0bO r0 = new X.0bO
            r0.<init>(r4)
            goto L_0x001a
        L_0x0103:
            return r3
        L_0x0104:
            return r3
        L_0x0105:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SuspendAnimationKt.A01(X.0tP, X.0Vr, X.1dr, X.1Di, long):java.lang.Object");
    }

    public static final void A07(C16900tP r2, AnonymousClass0J2 r3, C05780Vr r4, C22821Di r5, long j, long j2) {
        r3.A01 = j;
        r3.A05.setValue(r2.BbD(j2));
        r3.A02 = r2.BbM(j2);
        if (r2.Ben(j2)) {
            r3.A00 = r3.A01;
            AnonymousClass000.A1C(r3.A04, false);
        }
        A08(r3, r4);
        r5.invoke(r3);
    }

    public static final void A08(AnonymousClass0J2 r5, C05780Vr r6) {
        r6.A05.setValue(r5.A05.getValue());
        AnonymousClass0D0 r4 = r6.A02;
        AnonymousClass0D0 r3 = r5.A02;
        int A01 = r4.A01();
        for (int i = 0; i < A01; i++) {
            r4.A04(i, r3.A00(i));
        }
        r6.A00 = r5.A00;
        r6.A01 = r5.A01;
        r6.A03 = AnonymousClass001.A1b(r5.A04);
    }

    public static final Object A02(C16900tP r0, C30391dr r1, C22821Di r2) {
        if (r0.Bf5()) {
            return AnonymousClass0DZ.A00(r1, r2);
        }
        return C04460Nm.A02(r1, new C10540iV(r2));
    }
}
