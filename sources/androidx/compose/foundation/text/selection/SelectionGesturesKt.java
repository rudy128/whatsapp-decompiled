package androidx.compose.foundation.text.selection;

import X.AnonymousClass000;
import X.AnonymousClass0Hm;
import X.AnonymousClass0PB;
import X.C16630sk;
import X.C16850tK;
import X.C17090tj;
import X.C22821Di;
import X.C30391dr;
import java.util.List;

public abstract class SelectionGesturesKt {
    public static final C17090tj A00(C16850tK r2, C16630sk r3, C17090tj r4) {
        return AnonymousClass0PB.A00(r4, r3, r2, new SelectionGesturesKt$selectionGestureInput$1(r2, r3, (C30391dr) null));
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0066 A[Catch:{ CancellationException -> 0x00c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a5 A[Catch:{ CancellationException -> 0x00c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(X.C16850tK r8, X.C17750vA r9, X.AnonymousClass0Hm r10, X.C30391dr r11) {
        /*
            boolean r0 = r11 instanceof X.C07560bL
            if (r0 == 0) goto L_0x002b
            r5 = r11
            X.0bL r5 = (X.C07560bL) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002b
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r7 = r5.result
            X.1g4 r6 = X.AnonymousClass3F6.A03()
            int r0 = r5.label
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0043
            if (r0 == r3) goto L_0x0036
            if (r0 != r4) goto L_0x0031
            java.lang.Object r8 = r5.L$1
            X.0tK r8 = (X.C16850tK) r8
            java.lang.Object r9 = r5.L$0
            X.0vA r9 = (X.C17750vA) r9
            goto L_0x009c
        L_0x002b:
            X.0bL r5 = new X.0bL
            r5.<init>(r11)
            goto L_0x0012
        L_0x0031:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0036:
            java.lang.Object r2 = r5.L$2
            X.0KX r2 = (X.AnonymousClass0KX) r2
            java.lang.Object r8 = r5.L$1
            X.0tK r8 = (X.C16850tK) r8
            java.lang.Object r9 = r5.L$0
            X.0vA r9 = (X.C17750vA) r9
            goto L_0x005f
        L_0x0043:
            X.C30691eM.A01(r7)
            java.util.List r0 = r10.A03     // Catch:{ CancellationException -> 0x00c8 }
            java.lang.Object r2 = X.C29431cG.A0b(r0)     // Catch:{ CancellationException -> 0x00c8 }
            X.0KX r2 = (X.AnonymousClass0KX) r2     // Catch:{ CancellationException -> 0x00c8 }
            long r0 = r2.A05     // Catch:{ CancellationException -> 0x00c8 }
            r5.L$0 = r9     // Catch:{ CancellationException -> 0x00c8 }
            r5.L$1 = r8     // Catch:{ CancellationException -> 0x00c8 }
            r5.L$2 = r2     // Catch:{ CancellationException -> 0x00c8 }
            r5.label = r3     // Catch:{ CancellationException -> 0x00c8 }
            java.lang.Object r7 = androidx.compose.foundation.gestures.DragGestureDetectorKt.A01(r9, r5, r0)     // Catch:{ CancellationException -> 0x00c8 }
            if (r7 != r6) goto L_0x0062
            return r6
        L_0x005f:
            X.C30691eM.A01(r7)     // Catch:{ CancellationException -> 0x00c8 }
        L_0x0062:
            X.0KX r7 = (X.AnonymousClass0KX) r7     // Catch:{ CancellationException -> 0x00c8 }
            if (r7 == 0) goto L_0x00c5
            long r2 = r2.A06     // Catch:{ CancellationException -> 0x00c8 }
            long r0 = r7.A06     // Catch:{ CancellationException -> 0x00c8 }
            long r2 = X.AnonymousClass0QY.A04(r2, r0)     // Catch:{ CancellationException -> 0x00c8 }
            float r3 = X.AnonymousClass0QY.A00(r2)     // Catch:{ CancellationException -> 0x00c8 }
            X.0tN r2 = r9.getViewConfiguration()     // Catch:{ CancellationException -> 0x00c8 }
            float r2 = r2.Baf()     // Catch:{ CancellationException -> 0x00c8 }
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            r2 = 0
            if (r3 >= 0) goto L_0x0080
            r2 = 1
        L_0x0080:
            if (r2 == 0) goto L_0x00c5
            r8.C6H(r0)     // Catch:{ CancellationException -> 0x00c8 }
            long r2 = r7.A05     // Catch:{ CancellationException -> 0x00c8 }
            X.0hK r1 = new X.0hK     // Catch:{ CancellationException -> 0x00c8 }
            r1.<init>(r8)     // Catch:{ CancellationException -> 0x00c8 }
            r5.L$0 = r9     // Catch:{ CancellationException -> 0x00c8 }
            r5.L$1 = r8     // Catch:{ CancellationException -> 0x00c8 }
            r0 = 0
            r5.L$2 = r0     // Catch:{ CancellationException -> 0x00c8 }
            r5.label = r4     // Catch:{ CancellationException -> 0x00c8 }
            java.lang.Object r7 = androidx.compose.foundation.gestures.DragGestureDetectorKt.A02(r9, r5, r1, r2)     // Catch:{ CancellationException -> 0x00c8 }
            if (r7 != r6) goto L_0x009f
            return r6
        L_0x009c:
            X.C30691eM.A01(r7)     // Catch:{ CancellationException -> 0x00c8 }
        L_0x009f:
            boolean r0 = X.AnonymousClass000.A1Y(r7)     // Catch:{ CancellationException -> 0x00c8 }
            if (r0 == 0) goto L_0x00c5
            X.0Hm r0 = r9.BPt()     // Catch:{ CancellationException -> 0x00c8 }
            java.util.List r4 = r0.A03     // Catch:{ CancellationException -> 0x00c8 }
            int r3 = r4.size()     // Catch:{ CancellationException -> 0x00c8 }
            r2 = 0
        L_0x00b0:
            if (r2 >= r3) goto L_0x00c2
            X.0KX r1 = X.AnonymousClass000.A0f(r4, r2)     // Catch:{ CancellationException -> 0x00c8 }
            boolean r0 = X.AnonymousClass0Oz.A00(r1)     // Catch:{ CancellationException -> 0x00c8 }
            if (r0 == 0) goto L_0x00bf
            r1.A01()     // Catch:{ CancellationException -> 0x00c8 }
        L_0x00bf:
            int r2 = r2 + 1
            goto L_0x00b0
        L_0x00c2:
            r8.C6z()     // Catch:{ CancellationException -> 0x00c8 }
        L_0x00c5:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x00c8:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.A02(X.0tK, X.0vA, X.0Hm, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A04(X.C03220Hc r15, X.C16630sk r16, X.C17750vA r17, X.AnonymousClass0Hm r18, X.C30391dr r19) {
        /*
            r3 = r19
            r8 = r17
            boolean r0 = r3 instanceof X.C07500bC
            if (r0 == 0) goto L_0x00bc
            r7 = r3
            X.0bC r7 = (X.C07500bC) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00bc
            int r2 = r2 - r1
            r7.label = r2
        L_0x0016:
            java.lang.Object r2 = r7.result
            X.1g4 r11 = X.AnonymousClass3F6.A03()
            int r0 = r7.label
            r6 = 0
            r9 = 2
            r5 = 1
            if (r0 == 0) goto L_0x0050
            if (r0 == r5) goto L_0x00c8
            if (r0 != r9) goto L_0x00c3
            java.lang.Object r8 = r7.L$0
            X.0vA r8 = (X.C17750vA) r8
            X.C30691eM.A01(r2)
        L_0x002e:
            boolean r0 = X.AnonymousClass000.A1Y(r2)
            if (r0 == 0) goto L_0x00f1
            X.0Hm r0 = r8.BPt()
            java.util.List r3 = r0.A03
            int r2 = r3.size()
        L_0x003e:
            if (r6 >= r2) goto L_0x00f1
            X.0KX r1 = X.AnonymousClass000.A0f(r3, r6)
            boolean r0 = X.AnonymousClass0Oz.A00(r1)
            if (r0 == 0) goto L_0x004d
            r1.A01()
        L_0x004d:
            int r6 = r6 + 1
            goto L_0x003e
        L_0x0050:
            X.C30691eM.A01(r2)
            X.0KX r12 = r15.A01
            r0 = r18
            java.util.List r10 = r0.A03
            X.0KX r4 = X.AnonymousClass000.A0f(r10, r6)
            if (r12 == 0) goto L_0x00b9
            long r2 = r4.A0A
            long r0 = r12.A0A
            long r2 = r2 - r0
            X.0tN r0 = r15.A02
            long r13 = r0.BQp()
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b9
            long r2 = r4.A06
            long r0 = r12.A06
            long r0 = X.AnonymousClass0QY.A04(r2, r0)
            float r0 = X.AnonymousClass0QY.A00(r0)
            double r0 = (double) r0
            r12 = 4636737291354636288(0x4059000000000000, double:100.0)
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 >= 0) goto L_0x00b9
            int r0 = r15.A00
            int r0 = r0 + 1
            r15.A00 = r0
        L_0x0087:
            r15.A01 = r4
            X.0KX r2 = X.AnonymousClass000.A0f(r10, r6)
            int r0 = r15.A00
            if (r0 == r5) goto L_0x00b6
            if (r0 == r9) goto L_0x00b3
            X.0tb r3 = X.AnonymousClass0PJ.A02
        L_0x0095:
            long r0 = r2.A06
            r4 = r16
            boolean r0 = r4.C6G(r3, r0)
            if (r0 == 0) goto L_0x00f1
            long r0 = r2.A05
            X.0i7 r2 = new X.0i7
            r2.<init>(r4, r3)
            r7.L$0 = r8
            r7.L$1 = r4
            r7.label = r9
            java.lang.Object r2 = androidx.compose.foundation.gestures.DragGestureDetectorKt.A02(r8, r7, r2, r0)
            if (r2 != r11) goto L_0x002e
            return r11
        L_0x00b3:
            X.0tb r3 = X.AnonymousClass0PJ.A03
            goto L_0x0095
        L_0x00b6:
            X.0tb r3 = X.AnonymousClass0PJ.A01
            goto L_0x0095
        L_0x00b9:
            r15.A00 = r5
            goto L_0x0087
        L_0x00bc:
            X.0bC r7 = new X.0bC
            r7.<init>(r3)
            goto L_0x0016
        L_0x00c3:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x00c8:
            java.lang.Object r1 = r7.L$0
            X.0vA r1 = (X.C17750vA) r1
            X.C30691eM.A01(r2)
            boolean r0 = X.AnonymousClass000.A1Y(r2)
            if (r0 == 0) goto L_0x00f1
            X.0Hm r0 = r1.BPt()
            java.util.List r3 = r0.A03
            int r2 = r3.size()
        L_0x00df:
            if (r6 >= r2) goto L_0x00f1
            X.0KX r1 = X.AnonymousClass000.A0f(r3, r6)
            boolean r0 = X.AnonymousClass0Oz.A00(r1)
            if (r0 == 0) goto L_0x00ee
            r1.A01()
        L_0x00ee:
            int r6 = r6 + 1
            goto L_0x00df
        L_0x00f1:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.A04(X.0Hc, X.0sk, X.0vA, X.0Hm, X.1dr):java.lang.Object");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0056 A[SYNTHETIC] */
    public static final java.lang.Object A06(X.C17750vA r9, X.C30391dr r10) {
        /*
            boolean r0 = r10 instanceof X.C07470az
            if (r0 == 0) goto L_0x0050
            r8 = r10
            X.0az r8 = (X.C07470az) r8
            int r2 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0050
            int r2 = r2 - r1
            r8.label = r2
        L_0x0012:
            java.lang.Object r7 = r8.result
            X.1g4 r6 = X.AnonymousClass3F6.A03()
            int r0 = r8.label
            r5 = 1
            if (r0 == 0) goto L_0x0040
            if (r0 != r5) goto L_0x0057
            java.lang.Object r9 = r8.L$0
            X.0vA r9 = (X.C17750vA) r9
            X.C30691eM.A01(r7)
        L_0x0026:
            X.0Hm r7 = (X.AnonymousClass0Hm) r7
            java.util.List r4 = r7.A03
            int r3 = r4.size()
            r2 = 0
        L_0x002f:
            if (r2 >= r3) goto L_0x0056
            X.0KX r1 = X.AnonymousClass000.A0f(r4, r2)
            boolean r0 = r1.A0C
            if (r0 != 0) goto L_0x0043
            boolean r0 = r1.A0B
            if (r0 == 0) goto L_0x0043
            int r2 = r2 + 1
            goto L_0x002f
        L_0x0040:
            X.C30691eM.A01(r7)
        L_0x0043:
            X.0CQ r0 = X.AnonymousClass0CQ.Main
            r8.L$0 = r9
            r8.label = r5
            java.lang.Object r7 = r9.BCq(r0, r8)
            if (r7 != r6) goto L_0x0026
            return r6
        L_0x0050:
            X.0az r8 = new X.0az
            r8.<init>(r10)
            goto L_0x0012
        L_0x0056:
            return r7
        L_0x0057:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.A06(X.0vA, X.1dr):java.lang.Object");
    }

    public static final boolean A08(AnonymousClass0Hm r5) {
        List list = r5.A03;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (AnonymousClass000.A0f(list, i).A04 != 2) {
                return false;
            }
        }
        return true;
    }

    public static final C17090tj A01(C17090tj r3, C22821Di r4) {
        return AnonymousClass0PB.A01(r3, 8675309, new SelectionGesturesKt$updateSelectionTouchMode$1((C30391dr) null, r4));
    }
}
