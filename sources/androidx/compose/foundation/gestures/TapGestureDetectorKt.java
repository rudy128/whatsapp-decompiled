package androidx.compose.foundation.gestures;

import X.AnonymousClass0CQ;
import X.AnonymousClass0KX;
import X.AnonymousClass1OW;
import X.AnonymousClass3F6;
import X.C17730v8;
import X.C17750vA;
import X.C22821Di;
import X.C27621Wu;
import X.C30391dr;
import X.C36001nB;

public abstract class TapGestureDetectorKt {
    public static final C36001nB A00 = new TapGestureDetectorKt$NoPressGesture$1((C30391dr) null);

    public static /* synthetic */ Object A07(C17750vA r3, C30391dr r4, int i) {
        boolean z = false;
        AnonymousClass0CQ r1 = null;
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            r1 = AnonymousClass0CQ.Main;
        }
        return A01(r3, r1, r4, z);
    }

    public static final Object A0A(C17730v8 r6, C30391dr r7, C22821Di r8, C36001nB r9) {
        Object A002 = AnonymousClass1OW.A00(r7, new TapGestureDetectorKt$detectTapGestures$2(r6, (C30391dr) null, (C22821Di) null, (C22821Di) null, r8, r9));
        if (A002 != AnonymousClass3F6.A03()) {
            return C27621Wu.A00;
        }
        return A002;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0079, code lost:
        r5 = r11.size();
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007e, code lost:
        if (r4 >= r5) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0080, code lost:
        r12 = X.AnonymousClass000.A0f(r11, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0088, code lost:
        if (r12.A02() != false) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0096, code lost:
        if (X.AnonymousClass0Oz.A03(r12, r14.BZM(), r14.BRT()) != false) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0098, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009e, code lost:
        r0 = X.AnonymousClass0CQ.A01;
        r10.L$0 = r14;
        r10.L$1 = r15;
        r10.label = 2;
        r1 = r14.BCq(r0, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00aa, code lost:
        if (r1 != r9) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ac, code lost:
        return r9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046 A[LOOP:0: B:11:0x003a->B:14:0x0046, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b9 A[EDGE_INSN: B:41:0x00b9->B:38:0x00b9 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x004c A[EDGE_INSN: B:42:0x004c->B:16:0x004c ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ba A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C17750vA r14, X.AnonymousClass0CQ r15, X.C30391dr r16) {
        /*
            r3 = r16
            boolean r0 = r3 instanceof X.C07490bB
            if (r0 == 0) goto L_0x00ad
            r10 = r3
            X.0bB r10 = (X.C07490bB) r10
            int r2 = r10.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00ad
            int r2 = r2 - r1
            r10.label = r2
        L_0x0014:
            java.lang.Object r1 = r10.result
            X.1g4 r9 = X.AnonymousClass3F6.A03()
            int r0 = r10.label
            r13 = 0
            r8 = 2
            r7 = 0
            r6 = 1
            if (r0 == 0) goto L_0x0049
            if (r0 == r6) goto L_0x0059
            if (r0 != r8) goto L_0x00b4
            java.lang.Object r15 = r10.L$1
            X.0CQ r15 = (X.AnonymousClass0CQ) r15
            java.lang.Object r14 = r10.L$0
            X.0vA r14 = (X.C17750vA) r14
            X.C30691eM.A01(r1)
        L_0x0031:
            X.0Hm r1 = (X.AnonymousClass0Hm) r1
            java.util.List r3 = r1.A03
            int r2 = r3.size()
            r1 = 0
        L_0x003a:
            if (r1 >= r2) goto L_0x004c
            X.0KX r0 = X.AnonymousClass000.A0f(r3, r1)
            boolean r0 = r0.A02()
            if (r0 != 0) goto L_0x00b9
            int r1 = r1 + 1
            goto L_0x003a
        L_0x0049:
            X.C30691eM.A01(r1)
        L_0x004c:
            r10.L$0 = r14
            r10.L$1 = r15
            r10.label = r6
            java.lang.Object r1 = r14.BCq(r15, r10)
            if (r1 != r9) goto L_0x0064
            return r9
        L_0x0059:
            java.lang.Object r15 = r10.L$1
            X.0CQ r15 = (X.AnonymousClass0CQ) r15
            java.lang.Object r14 = r10.L$0
            X.0vA r14 = (X.C17750vA) r14
            X.C30691eM.A01(r1)
        L_0x0064:
            X.0Hm r1 = (X.AnonymousClass0Hm) r1
            java.util.List r11 = r1.A03
            int r2 = r11.size()
            r1 = 0
        L_0x006d:
            if (r1 >= r2) goto L_0x00ba
            X.0KX r0 = X.AnonymousClass000.A0f(r11, r1)
            boolean r0 = X.AnonymousClass0Oz.A00(r0)
            if (r0 != 0) goto L_0x009b
            int r5 = r11.size()
            r4 = 0
        L_0x007e:
            if (r4 >= r5) goto L_0x009e
            X.0KX r12 = X.AnonymousClass000.A0f(r11, r4)
            boolean r0 = r12.A02()
            if (r0 != 0) goto L_0x00b9
            long r2 = r14.BZM()
            long r0 = r14.BRT()
            boolean r0 = X.AnonymousClass0Oz.A03(r12, r2, r0)
            if (r0 != 0) goto L_0x00b9
            int r4 = r4 + 1
            goto L_0x007e
        L_0x009b:
            int r1 = r1 + 1
            goto L_0x006d
        L_0x009e:
            X.0CQ r0 = X.AnonymousClass0CQ.Final
            r10.L$0 = r14
            r10.L$1 = r15
            r10.label = r8
            java.lang.Object r1 = r14.BCq(r0, r10)
            if (r1 != r9) goto L_0x0031
            return r9
        L_0x00ad:
            X.0bB r10 = new X.0bB
            r10.<init>(r3)
            goto L_0x0014
        L_0x00b4:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x00b9:
            return r13
        L_0x00ba:
            java.lang.Object r0 = r11.get(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.A00(X.0vA, X.0CQ, X.1dr):java.lang.Object");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0060 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0067 A[SYNTHETIC] */
    public static final java.lang.Object A01(X.C17750vA r9, X.AnonymousClass0CQ r10, X.C30391dr r11, boolean r12) {
        /*
            boolean r0 = r11 instanceof X.C07540bJ
            if (r0 == 0) goto L_0x0061
            r8 = r11
            X.0bJ r8 = (X.C07540bJ) r8
            int r2 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0061
            int r2 = r2 - r1
            r8.label = r2
        L_0x0012:
            java.lang.Object r1 = r8.result
            X.1g4 r7 = X.AnonymousClass3F6.A03()
            int r0 = r8.label
            r6 = 1
            if (r0 == 0) goto L_0x004f
            if (r0 != r6) goto L_0x006c
            boolean r12 = r8.Z$0
            java.lang.Object r10 = r8.L$1
            X.0CQ r10 = (X.AnonymousClass0CQ) r10
            java.lang.Object r9 = r8.L$0
            X.0vA r9 = (X.C17750vA) r9
            X.C30691eM.A01(r1)
        L_0x002c:
            X.0Hm r1 = (X.AnonymousClass0Hm) r1
            java.util.List r5 = r1.A03
            int r4 = r5.size()
            r3 = 0
            r2 = 0
        L_0x0036:
            if (r2 >= r4) goto L_0x0067
            X.0KX r1 = X.AnonymousClass000.A0f(r5, r2)
            if (r12 == 0) goto L_0x0044
            boolean r0 = r1.A02()
            if (r0 != 0) goto L_0x0052
        L_0x0044:
            boolean r0 = r1.A0C
            if (r0 != 0) goto L_0x0052
            boolean r0 = r1.A0B
            if (r0 == 0) goto L_0x0052
            int r2 = r2 + 1
            goto L_0x0036
        L_0x004f:
            X.C30691eM.A01(r1)
        L_0x0052:
            r8.L$0 = r9
            r8.L$1 = r10
            r8.Z$0 = r12
            r8.label = r6
            java.lang.Object r1 = r9.BCq(r10, r8)
            if (r1 != r7) goto L_0x002c
            return r7
        L_0x0061:
            X.0bJ r8 = new X.0bJ
            r8.<init>(r11)
            goto L_0x0012
        L_0x0067:
            java.lang.Object r0 = r5.get(r3)
            return r0
        L_0x006c:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.A01(X.0vA, X.0CQ, X.1dr, boolean):java.lang.Object");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032 A[LOOP:0: B:10:0x0030->B:11:0x0032, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0061 A[SYNTHETIC] */
    public static final java.lang.Object A04(X.C17750vA r8, X.C30391dr r9) {
        /*
            boolean r0 = r9 instanceof X.C07460ay
            if (r0 == 0) goto L_0x005b
            r7 = r9
            X.0ay r7 = (X.C07460ay) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005b
            int r2 = r2 - r1
            r7.label = r2
        L_0x0012:
            java.lang.Object r1 = r7.result
            X.1g4 r6 = X.AnonymousClass3F6.A03()
            int r0 = r7.label
            r5 = 1
            if (r0 == 0) goto L_0x004d
            if (r0 != r5) goto L_0x0064
            java.lang.Object r8 = r7.L$0
            X.0vA r8 = (X.C17750vA) r8
            X.C30691eM.A01(r1)
        L_0x0026:
            X.0Hm r1 = (X.AnonymousClass0Hm) r1
            java.util.List r4 = r1.A03
            int r3 = r4.size()
            r2 = 0
            r1 = 0
        L_0x0030:
            if (r1 >= r3) goto L_0x003c
            X.0KX r0 = X.AnonymousClass000.A0f(r4, r1)
            r0.A01()
            int r1 = r1 + 1
            goto L_0x0030
        L_0x003c:
            int r1 = r4.size()
        L_0x0040:
            if (r2 >= r1) goto L_0x0061
            X.0KX r0 = X.AnonymousClass000.A0f(r4, r2)
            boolean r0 = r0.A0B
            if (r0 != 0) goto L_0x0050
            int r2 = r2 + 1
            goto L_0x0040
        L_0x004d:
            X.C30691eM.A01(r1)
        L_0x0050:
            r7.L$0 = r8
            r7.label = r5
            java.lang.Object r1 = r8.BCq(X.AnonymousClass0CQ.Main, r7)
            if (r1 != r6) goto L_0x0026
            return r6
        L_0x005b:
            X.0ay r7 = new X.0ay
            r7.<init>(r9)
            goto L_0x0012
        L_0x0061:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0064:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.A04(X.0vA, X.1dr):java.lang.Object");
    }

    public static final Object A09(C17730v8 r5, C30391dr r6, C22821Di r7, C36001nB r8) {
        Object A002 = AnonymousClass1OW.A00(r6, new TapGestureDetectorKt$detectTapAndPress$2(new PressGestureScopeImpl(r5), r5, (C30391dr) null, r7, r8));
        if (A002 != AnonymousClass3F6.A03()) {
            return C27621Wu.A00;
        }
        return A002;
    }

    public static final Object A02(C17750vA r4, AnonymousClass0KX r5, C30391dr r6) {
        return r4.CSG(r6, new TapGestureDetectorKt$awaitSecondDown$2(r5, (C30391dr) null), r4.getViewConfiguration().BQp());
    }
}
