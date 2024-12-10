package androidx.compose.foundation.gestures;

import X.AnonymousClass001;
import X.AnonymousClass07D;
import X.AnonymousClass07E;
import X.AnonymousClass0K4;
import X.AnonymousClass0KX;
import X.AnonymousClass0QY;
import X.AnonymousClass0UQ;
import X.C108495bn;
import X.C11130jX;
import X.C16060re;
import X.C17750vA;
import X.C22821Di;
import X.C30391dr;

public abstract class DraggableKt {
    public static final C16060re A00 = new AnonymousClass0UQ();

    public static final Object A02(C17750vA r8, AnonymousClass0KX r9, AnonymousClass0K4 r10, C30391dr r11, C22821Di r12, C108495bn r13, long j) {
        long j2 = r9.A06;
        r13.CQ0(new AnonymousClass07E(AnonymousClass0QY.A04(j2, AnonymousClass001.A0p(AnonymousClass0QY.A01(j) * Math.signum(AnonymousClass0QY.A01(j2)), AnonymousClass0QY.A02(j) * Math.signum(AnonymousClass0QY.A02(j2))))));
        r13.CQ0(new AnonymousClass07D(j));
        return A04(r8, r11, r12, new C11130jX(r10, r13), r9.A05);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0083, code lost:
        if (X.AnonymousClass000.A1Y(r7.invoke(r10)) != false) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a8, code lost:
        if (androidx.compose.foundation.gestures.DragGestureDetectorKt.A04(r15.BPt(), r1) != false) goto L_0x00aa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x005b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A04(X.C17750vA r15, X.C30391dr r16, X.C22821Di r17, X.C22821Di r18, long r19) {
        /*
            r7 = r17
            r1 = r19
            r6 = r18
            r8 = r16
            boolean r0 = r8 instanceof X.C07620bU
            if (r0 == 0) goto L_0x00d1
            r5 = r8
            X.0bU r5 = (X.C07620bU) r5
            int r4 = r5.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r3
            if (r0 == 0) goto L_0x00d1
            int r4 = r4 - r3
            r5.label = r4
        L_0x001a:
            java.lang.Object r10 = r5.result
            X.1g4 r4 = X.AnonymousClass3F6.A03()
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L_0x009d
            if (r0 != r3) goto L_0x00d8
            java.lang.Object r8 = r5.L$4
            X.4rE r8 = (X.C98484rE) r8
            java.lang.Object r9 = r5.L$3
            X.0vA r9 = (X.C17750vA) r9
            java.lang.Object r15 = r5.L$2
            X.0vA r15 = (X.C17750vA) r15
            java.lang.Object r6 = r5.L$1
            X.1Di r6 = (X.C22821Di) r6
            java.lang.Object r7 = r5.L$0
            X.1Di r7 = (X.C22821Di) r7
            X.C30691eM.A01(r10)
        L_0x003e:
            X.0Hm r10 = (X.AnonymousClass0Hm) r10
            java.util.List r11 = r10.A03
            int r14 = r11.size()
            r13 = 0
        L_0x0047:
            if (r13 >= r14) goto L_0x005b
            java.lang.Object r10 = r11.get(r13)
            r0 = r10
            X.0KX r0 = (X.AnonymousClass0KX) r0
            long r2 = r0.A05
            long r0 = r8.element
            int r12 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r12 == 0) goto L_0x005c
            int r13 = r13 + 1
            goto L_0x0047
        L_0x005b:
            r10 = 0
        L_0x005c:
            X.0KX r10 = (X.AnonymousClass0KX) r10
            if (r10 == 0) goto L_0x00aa
            boolean r12 = X.AnonymousClass0Oz.A01(r10)
            if (r12 == 0) goto L_0x007b
            int r3 = r11.size()
            r2 = 0
        L_0x006b:
            if (r2 >= r3) goto L_0x0092
            java.lang.Object r1 = r11.get(r2)
            r0 = r1
            X.0KX r0 = (X.AnonymousClass0KX) r0
            boolean r0 = r0.A0B
            if (r0 != 0) goto L_0x0093
            int r2 = r2 + 1
            goto L_0x006b
        L_0x007b:
            java.lang.Object r0 = r7.invoke(r10)
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            if (r0 == 0) goto L_0x009b
        L_0x0085:
            boolean r0 = r10.A02()
            if (r0 != 0) goto L_0x00aa
            if (r12 == 0) goto L_0x00b0
            r6.invoke(r10)
            r0 = 1
            goto L_0x00ab
        L_0x0092:
            r1 = 0
        L_0x0093:
            X.0KX r1 = (X.AnonymousClass0KX) r1
            if (r1 == 0) goto L_0x0085
            long r0 = r1.A05
            r8.element = r0
        L_0x009b:
            r3 = 1
            goto L_0x00be
        L_0x009d:
            X.C30691eM.A01(r10)
            X.0Hm r0 = r15.BPt()
            boolean r0 = androidx.compose.foundation.gestures.DragGestureDetectorKt.A04(r0, r1)
            if (r0 == 0) goto L_0x00b6
        L_0x00aa:
            r0 = 0
        L_0x00ab:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x00b0:
            r6.invoke(r10)
            long r1 = r10.A05
            r3 = 1
        L_0x00b6:
            X.4rE r8 = new X.4rE
            r8.<init>()
            r8.element = r1
            r9 = r15
        L_0x00be:
            r5.L$0 = r7
            r5.L$1 = r6
            r5.L$2 = r15
            r5.L$3 = r9
            r5.L$4 = r8
            r5.label = r3
            java.lang.Object r10 = r9.BCq(X.AnonymousClass0CQ.Main, r5)
            if (r10 != r4) goto L_0x003e
            return r4
        L_0x00d1:
            X.0bU r5 = new X.0bU
            r5.<init>(r8)
            goto L_0x001a
        L_0x00d8:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.A04(X.0vA, X.1dr, X.1Di, X.1Di, long):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0056, code lost:
        if (r12.A02() == false) goto L_0x018e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0125 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01c1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x015f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0185 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C16600sh r13, X.C17750vA r14, X.AnonymousClass0K4 r15, X.C30391dr r16, X.C18090vk r17, X.C22821Di r18) {
        /*
            r4 = r16
            r7 = r18
            r6 = r17
            r1 = r15
            r11 = r13
            r10 = r14
            boolean r0 = r4 instanceof X.C07650bX
            if (r0 == 0) goto L_0x01e4
            r9 = r4
            X.0bX r9 = (X.C07650bX) r9
            int r3 = r9.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L_0x01e4
            int r3 = r3 - r2
            r9.label = r3
        L_0x001b:
            java.lang.Object r14 = r9.result
            X.1g4 r8 = X.AnonymousClass3F6.A03()
            int r5 = r9.label
            r4 = 4
            r3 = 2
            r13 = 0
            r2 = 1
            r12 = 0
            if (r5 == 0) goto L_0x005a
            if (r5 == r2) goto L_0x0072
            if (r5 == r3) goto L_0x00c3
            r0 = 3
            if (r5 == r0) goto L_0x0126
            if (r5 != r4) goto L_0x01eb
            long r3 = r9.J$0
            float r7 = r9.F$0
            java.lang.Object r12 = r9.L$5
            X.0KX r12 = (X.AnonymousClass0KX) r12
            java.lang.Object r6 = r9.L$4
            X.4rE r6 = (X.C98484rE) r6
            java.lang.Object r10 = r9.L$3
            X.0vA r10 = (X.C17750vA) r10
            java.lang.Object r5 = r9.L$2
            X.1OS r5 = (X.AnonymousClass1OS) r5
            java.lang.Object r2 = r9.L$1
            X.4rE r2 = (X.C98484rE) r2
            java.lang.Object r11 = r9.L$0
            X.0sh r11 = (X.C16600sh) r11
            X.C30691eM.A01(r14)
        L_0x0052:
            boolean r0 = r12.A02()
            if (r0 == 0) goto L_0x018e
        L_0x0058:
            r12 = 0
        L_0x0059:
            return r12
        L_0x005a:
            X.C30691eM.A01(r14)
            X.0CQ r0 = X.AnonymousClass0CQ.Initial
            r9.L$0 = r10
            r9.L$1 = r7
            r9.L$2 = r6
            r9.L$3 = r15
            r9.L$4 = r11
            r9.label = r2
            java.lang.Object r14 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A01(r10, r0, r9, r13)
            if (r14 != r8) goto L_0x0089
            return r8
        L_0x0072:
            java.lang.Object r11 = r9.L$4
            X.0sh r11 = (X.C16600sh) r11
            java.lang.Object r1 = r9.L$3
            X.0K4 r1 = (X.AnonymousClass0K4) r1
            java.lang.Object r6 = r9.L$2
            X.0vk r6 = (X.C18090vk) r6
            java.lang.Object r7 = r9.L$1
            X.1Di r7 = (X.C22821Di) r7
            java.lang.Object r10 = r9.L$0
            X.0vA r10 = (X.C17750vA) r10
            X.C30691eM.A01(r14)
        L_0x0089:
            X.0KX r14 = (X.AnonymousClass0KX) r14
            java.lang.Object r0 = r7.invoke(r14)
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            if (r0 == 0) goto L_0x0059
            java.lang.Object r0 = r6.invoke()
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            if (r0 == 0) goto L_0x00b0
            r14.A01()
            X.AnonymousClass0M5.A00(r14, r1)
            long r0 = X.AnonymousClass0QY.A03
            X.0QY r0 = X.AnonymousClass000.A0e(r0)
            X.1D6 r12 = X.AnonymousClass6YK.A00(r14, r0)
            return r12
        L_0x00b0:
            r9.L$0 = r10
            r9.L$1 = r1
            r9.L$2 = r11
            r9.L$3 = r12
            r9.L$4 = r12
            r9.label = r3
            java.lang.Object r14 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A07(r10, r9, r3)
            if (r14 != r8) goto L_0x00d2
            return r8
        L_0x00c3:
            java.lang.Object r11 = r9.L$2
            X.0sh r11 = (X.C16600sh) r11
            java.lang.Object r1 = r9.L$1
            X.0K4 r1 = (X.AnonymousClass0K4) r1
            java.lang.Object r10 = r9.L$0
            X.0vA r10 = (X.C17750vA) r10
            X.C30691eM.A01(r14)
        L_0x00d2:
            X.0KX r14 = (X.AnonymousClass0KX) r14
            X.AnonymousClass0M5.A00(r14, r1)
            X.4rE r2 = new X.4rE
            r2.<init>()
            long r3 = X.AnonymousClass0QY.A03
            r2.element = r3
            X.0ml r5 = new X.0ml
            r5.<init>(r1, r2)
            long r0 = r14.A05
            int r14 = r14.A04
            X.0Hm r6 = r10.BPt()
            boolean r6 = androidx.compose.foundation.gestures.DragGestureDetectorKt.A04(r6, r0)
            if (r6 != 0) goto L_0x0058
            X.0tN r7 = r10.getViewConfiguration()
            r6 = 2
            boolean r6 = X.AnonymousClass000.A1T(r14, r6)
            float r7 = r7.Baf()
            if (r6 == 0) goto L_0x0105
            float r6 = androidx.compose.foundation.gestures.DragGestureDetectorKt.A00
            float r7 = r7 * r6
        L_0x0105:
            X.4rE r6 = new X.4rE
            r6.<init>()
            r6.element = r0
        L_0x010c:
            r9.L$0 = r11
            r9.L$1 = r2
            r9.L$2 = r5
            r9.L$3 = r10
            r9.L$4 = r6
            r9.L$5 = r12
            r9.F$0 = r7
            r9.J$0 = r3
            r0 = 3
            r9.label = r0
            java.lang.Object r14 = r10.BCq(X.AnonymousClass0CQ.Main, r9)
            if (r14 != r8) goto L_0x0141
            return r8
        L_0x0126:
            long r3 = r9.J$0
            float r7 = r9.F$0
            java.lang.Object r6 = r9.L$4
            X.4rE r6 = (X.C98484rE) r6
            java.lang.Object r10 = r9.L$3
            X.0vA r10 = (X.C17750vA) r10
            java.lang.Object r5 = r9.L$2
            X.1OS r5 = (X.AnonymousClass1OS) r5
            java.lang.Object r2 = r9.L$1
            X.4rE r2 = (X.C98484rE) r2
            java.lang.Object r11 = r9.L$0
            X.0sh r11 = (X.C16600sh) r11
            X.C30691eM.A01(r14)
        L_0x0141:
            X.0Hm r14 = (X.AnonymousClass0Hm) r14
            java.util.List r14 = r14.A03
            int r18 = r14.size()
        L_0x0149:
            r0 = r18
            if (r13 >= r0) goto L_0x015f
            java.lang.Object r12 = r14.get(r13)
            r0 = r12
            X.0KX r0 = (X.AnonymousClass0KX) r0
            long r15 = r0.A05
            long r0 = r6.element
            int r17 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r17 == 0) goto L_0x0160
            int r13 = r13 + 1
            goto L_0x0149
        L_0x015f:
            r12 = 0
        L_0x0160:
            X.0KX r12 = (X.AnonymousClass0KX) r12
            if (r12 == 0) goto L_0x0058
            boolean r0 = r12.A02()
            if (r0 != 0) goto L_0x0058
            boolean r0 = X.AnonymousClass0Oz.A01(r12)
            if (r0 == 0) goto L_0x0192
            int r13 = r14.size()
            r12 = 0
        L_0x0175:
            if (r12 >= r13) goto L_0x0185
            java.lang.Object r1 = r14.get(r12)
            r0 = r1
            X.0KX r0 = (X.AnonymousClass0KX) r0
            boolean r0 = r0.A0B
            if (r0 != 0) goto L_0x0186
            int r12 = r12 + 1
            goto L_0x0175
        L_0x0185:
            r1 = 0
        L_0x0186:
            X.0KX r1 = (X.AnonymousClass0KX) r1
            if (r1 == 0) goto L_0x0058
            long r0 = r1.A05
            r6.element = r0
        L_0x018e:
            r13 = 0
            r12 = 0
            goto L_0x010c
        L_0x0192:
            long r13 = r12.A06
            long r0 = r12.A07
            long r0 = X.AnonymousClass0QY.A04(r13, r0)
            long r3 = X.AnonymousClass0QY.A05(r3, r0)
            float r0 = r11.BDl(r3)
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x01c2
            X.0CQ r1 = X.AnonymousClass0CQ.Final
            r9.L$0 = r11
            r9.L$1 = r2
            r9.L$2 = r5
            r9.L$3 = r10
            r9.L$4 = r6
            r9.L$5 = r12
            r9.F$0 = r7
            r9.J$0 = r3
            r0 = 4
            r9.label = r0
            java.lang.Object r0 = r10.BCq(r1, r9)
            if (r0 != r8) goto L_0x0052
            return r8
        L_0x01c2:
            long r0 = r11.BDw(r7, r3)
            X.0QY r0 = X.AnonymousClass000.A0e(r0)
            r5.invoke(r12, r0)
            boolean r0 = r12.A02()
            if (r0 == 0) goto L_0x01de
            long r0 = r2.element
            X.0QY r0 = X.AnonymousClass000.A0e(r0)
            X.1D6 r12 = X.AnonymousClass6YK.A00(r12, r0)
            return r12
        L_0x01de:
            long r3 = X.AnonymousClass0QY.A03
            r12 = 0
            r13 = 0
            goto L_0x010c
        L_0x01e4:
            X.0bX r9 = new X.0bX
            r9.<init>(r4)
            goto L_0x001b
        L_0x01eb:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.A00(X.0sh, X.0vA, X.0K4, X.1dr, X.0vk, X.1Di):java.lang.Object");
    }
}
