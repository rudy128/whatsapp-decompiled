package androidx.compose.foundation.gestures;

import X.AnonymousClass1OS;
import X.AnonymousClass3F6;
import X.C17730v8;
import X.C27621Wu;
import X.C30391dr;

public abstract class ForEachGestureKt {
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0057, code lost:
        r0 = X.AnonymousClass0CQ.Final;
        r5.L$0 = r7;
        r5.label = 1;
        r1 = r7.BCq(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0061, code lost:
        if (r1 != r6) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0063, code lost:
        return r6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006f A[EDGE_INSN: B:28:0x006f->B:25:0x006f ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C17750vA r7, X.C30391dr r8) {
        /*
            boolean r0 = r8 instanceof X.C07430av
            if (r0 == 0) goto L_0x0064
            r5 = r8
            X.0av r5 = (X.C07430av) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0064
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r1 = r5.result
            X.1g4 r6 = X.AnonymousClass3F6.A03()
            int r0 = r5.label
            r4 = 1
            if (r0 == 0) goto L_0x003c
            if (r0 != r4) goto L_0x006a
            java.lang.Object r7 = r5.L$0
            X.0vA r7 = (X.C17750vA) r7
            X.C30691eM.A01(r1)
        L_0x0026:
            X.0Hm r1 = (X.AnonymousClass0Hm) r1
            java.util.List r3 = r1.A03
            int r2 = r3.size()
            r1 = 0
        L_0x002f:
            if (r1 >= r2) goto L_0x006f
            X.0KX r0 = X.AnonymousClass000.A0f(r3, r1)
            boolean r0 = r0.A0B
            if (r0 != 0) goto L_0x0057
            int r1 = r1 + 1
            goto L_0x002f
        L_0x003c:
            X.C30691eM.A01(r1)
            X.0Hm r0 = r7.BPt()
            java.util.List r3 = r0.A03
            int r2 = r3.size()
            r1 = 0
        L_0x004a:
            if (r1 >= r2) goto L_0x006f
            X.0KX r0 = X.AnonymousClass000.A0f(r3, r1)
            boolean r0 = r0.A0B
            if (r0 != 0) goto L_0x0057
            int r1 = r1 + 1
            goto L_0x004a
        L_0x0057:
            X.0CQ r0 = X.AnonymousClass0CQ.Final
            r5.L$0 = r7
            r5.label = r4
            java.lang.Object r1 = r7.BCq(r0, r5)
            if (r1 != r6) goto L_0x0026
            return r6
        L_0x0064:
            X.0av r5 = new X.0av
            r5.<init>(r8)
            goto L_0x0012
        L_0x006a:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x006f:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.A00(X.0vA, X.1dr):java.lang.Object");
    }

    public static final Object A01(C17730v8 r3, C30391dr r4, AnonymousClass1OS r5) {
        Object BCr = r3.BCr(r4, new ForEachGestureKt$awaitEachGesture$2((C30391dr) null, r4.getContext(), r5));
        if (BCr != AnonymousClass3F6.A03()) {
            return C27621Wu.A00;
        }
        return BCr;
    }
}
