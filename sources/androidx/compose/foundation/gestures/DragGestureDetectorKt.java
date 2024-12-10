package androidx.compose.foundation.gestures;

import X.AnonymousClass0Hm;
import X.AnonymousClass0KX;
import X.AnonymousClass0UT;
import X.AnonymousClass1OS;
import X.AnonymousClass3F6;
import X.C16600sh;
import X.C17730v8;
import X.C18090vk;
import X.C22821Di;
import X.C27621Wu;
import X.C30391dr;
import java.util.List;

public abstract class DragGestureDetectorKt {
    public static final float A00 = (0.125f / 18.0f);
    public static final C16600sh A01 = new AnonymousClass0UT(0);
    public static final C16600sh A02 = new AnonymousClass0UT(1);
    public static final C16600sh A03 = new AnonymousClass0UT(2);

    public static final Object A03(C17730v8 r6, C30391dr r7, C18090vk r8, C18090vk r9, C22821Di r10, AnonymousClass1OS r11) {
        Object A012 = ForEachGestureKt.A01(r6, r7, new DragGestureDetectorKt$detectDragGestures$5((C30391dr) null, r9, r8, r10, r11));
        if (A012 != AnonymousClass3F6.A03()) {
            return C27621Wu.A00;
        }
        return A012;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0097, code lost:
        if (X.AnonymousClass0QY.A04(r8.A06, r8.A07) == X.AnonymousClass0QY.A03) goto L_0x0099;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x004b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C17750vA r15, X.C30391dr r16, long r17) {
        /*
            r3 = r16
            boolean r0 = r3 instanceof X.AnonymousClass0b4
            if (r0 == 0) goto L_0x00a6
            r7 = r3
            X.0b4 r7 = (X.AnonymousClass0b4) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00a6
            int r2 = r2 - r1
            r7.label = r2
        L_0x0014:
            java.lang.Object r1 = r7.result
            X.1g4 r6 = X.AnonymousClass3F6.A03()
            int r0 = r7.label
            r5 = 1
            r14 = 0
            if (r0 == 0) goto L_0x0074
            if (r0 != r5) goto L_0x00ad
            java.lang.Object r4 = r7.L$1
            X.4rE r4 = (X.C98484rE) r4
            java.lang.Object r15 = r7.L$0
            X.0vA r15 = (X.C17750vA) r15
            X.C30691eM.A01(r1)
        L_0x002d:
            X.0Hm r1 = (X.AnonymousClass0Hm) r1
            java.util.List r10 = r1.A03
            int r13 = r10.size()
            r9 = 0
            r12 = 0
        L_0x0037:
            if (r12 >= r13) goto L_0x004b
            java.lang.Object r8 = r10.get(r12)
            r0 = r8
            X.0KX r0 = (X.AnonymousClass0KX) r0
            long r2 = r0.A05
            long r0 = r4.element
            int r11 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r11 == 0) goto L_0x004c
            int r12 = r12 + 1
            goto L_0x0037
        L_0x004b:
            r8 = r14
        L_0x004c:
            X.0KX r8 = (X.AnonymousClass0KX) r8
            if (r8 == 0) goto L_0x00b9
            boolean r0 = X.AnonymousClass0Oz.A01(r8)
            if (r0 == 0) goto L_0x008b
            int r2 = r10.size()
        L_0x005a:
            if (r9 >= r2) goto L_0x006a
            java.lang.Object r1 = r10.get(r9)
            r0 = r1
            X.0KX r0 = (X.AnonymousClass0KX) r0
            boolean r0 = r0.A0B
            if (r0 != 0) goto L_0x006b
            int r9 = r9 + 1
            goto L_0x005a
        L_0x006a:
            r1 = r14
        L_0x006b:
            X.0KX r1 = (X.AnonymousClass0KX) r1
            if (r1 == 0) goto L_0x00b2
            long r0 = r1.A05
            r4.element = r0
            goto L_0x0099
        L_0x0074:
            X.C30691eM.A01(r1)
            X.0Hm r2 = r15.BPt()
            r0 = r17
            boolean r2 = A04(r2, r0)
            if (r2 != 0) goto L_0x00b9
            X.4rE r4 = new X.4rE
            r4.<init>()
            r4.element = r0
            goto L_0x0099
        L_0x008b:
            long r2 = r8.A07
            long r0 = r8.A06
            long r9 = X.AnonymousClass0QY.A04(r0, r2)
            long r1 = X.AnonymousClass0QY.A03
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00b2
        L_0x0099:
            r7.L$0 = r15
            r7.L$1 = r4
            r7.label = r5
            java.lang.Object r1 = r15.BCq(X.AnonymousClass0CQ.Main, r7)
            if (r1 != r6) goto L_0x002d
            return r6
        L_0x00a6:
            X.0b4 r7 = new X.0b4
            r7.<init>(r3)
            goto L_0x0014
        L_0x00ad:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x00b2:
            boolean r0 = r8.A02()
            if (r0 != 0) goto L_0x00b9
            return r8
        L_0x00b9:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.A00(X.0vA, X.1dr, long):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(X.C17750vA r11, X.C30391dr r12, long r13) {
        /*
            boolean r0 = r12 instanceof X.AnonymousClass0b5
            if (r0 == 0) goto L_0x0027
            r7 = r12
            X.0b5 r7 = (X.AnonymousClass0b5) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0027
            int r2 = r2 - r1
            r7.label = r2
        L_0x0012:
            java.lang.Object r1 = r7.result
            X.1g4 r6 = X.AnonymousClass3F6.A03()
            int r0 = r7.label
            r8 = 1
            r5 = 0
            if (r0 == 0) goto L_0x0036
            if (r0 != r8) goto L_0x0031
            java.lang.Object r9 = r7.L$1
            X.4rF r9 = (X.C98494rF) r9
            java.lang.Object r4 = r7.L$0
            goto L_0x002d
        L_0x0027:
            X.0b5 r7 = new X.0b5
            r7.<init>(r12)
            goto L_0x0012
        L_0x002d:
            X.C30691eM.A01(r1)     // Catch:{ 0af -> 0x008d }
            return r5
        L_0x0031:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0036:
            X.C30691eM.A01(r1)
            X.0Hm r0 = r11.BPt()
            boolean r0 = A04(r0, r13)
            if (r0 != 0) goto L_0x0092
            X.0Hm r0 = r11.BPt()
            java.util.List r10 = r0.A03
            int r9 = r10.size()
            r3 = 0
        L_0x004e:
            if (r3 >= r9) goto L_0x0064
            java.lang.Object r4 = r10.get(r3)
            r0 = r4
            X.0KX r0 = (X.AnonymousClass0KX) r0
            long r0 = r0.A05
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1P(r2)
            if (r0 != 0) goto L_0x0065
            int r3 = r3 + 1
            goto L_0x004e
        L_0x0064:
            r4 = r5
        L_0x0065:
            if (r4 == 0) goto L_0x0092
            X.4rF r9 = new X.4rF
            r9.<init>()
            X.4rF r3 = new X.4rF
            r3.<init>()
            r3.element = r4
            X.0tN r0 = r11.getViewConfiguration()
            long r1 = r0.BUE()
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2 r0 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2     // Catch:{ 0af -> 0x008d }
            r0.<init>(r5, r3, r9)     // Catch:{ 0af -> 0x008d }
            r7.L$0 = r4     // Catch:{ 0af -> 0x008d }
            r7.L$1 = r9     // Catch:{ 0af -> 0x008d }
            r7.label = r8     // Catch:{ 0af -> 0x008d }
            java.lang.Object r0 = r11.CSF(r7, r0, r1)     // Catch:{ 0af -> 0x008d }
            if (r0 != r6) goto L_0x0092
            return r6
        L_0x008d:
            java.lang.Object r5 = r9.element
            if (r5 != 0) goto L_0x0092
            return r4
        L_0x0092:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.A01(X.0vA, X.1dr, long):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0053 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(X.C17750vA r5, X.C30391dr r6, X.C22821Di r7, long r8) {
        /*
            boolean r0 = r6 instanceof X.AnonymousClass0b6
            if (r0 == 0) goto L_0x0054
            r4 = r6
            X.0b6 r4 = (X.AnonymousClass0b6) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0054
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r3 = r4.result
            X.1g4 r2 = X.AnonymousClass3F6.A03()
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L_0x003e
            if (r0 != r1) goto L_0x005a
            java.lang.Object r7 = r4.L$1
            X.1Di r7 = (X.C22821Di) r7
            java.lang.Object r5 = r4.L$0
            X.0vA r5 = (X.C17750vA) r5
            X.C30691eM.A01(r3)
        L_0x002a:
            X.0KX r3 = (X.AnonymousClass0KX) r3
            if (r3 != 0) goto L_0x0033
            java.lang.Boolean r0 = X.AnonymousClass000.A0h()
            return r0
        L_0x0033:
            boolean r0 = X.AnonymousClass0Oz.A01(r3)
            if (r0 == 0) goto L_0x0042
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L_0x003e:
            X.C30691eM.A01(r3)
            goto L_0x0047
        L_0x0042:
            r7.invoke(r3)
            long r8 = r3.A05
        L_0x0047:
            r4.L$0 = r5
            r4.L$1 = r7
            r4.label = r1
            java.lang.Object r3 = A00(r5, r4, r8)
            if (r3 != r2) goto L_0x002a
            return r2
        L_0x0054:
            X.0b6 r4 = new X.0b6
            r4.<init>(r6)
            goto L_0x0012
        L_0x005a:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.A02(X.0vA, X.1dr, X.1Di, long):java.lang.Object");
    }

    public static final boolean A04(AnonymousClass0Hm r7, long j) {
        Object obj;
        List list = r7.A03;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (((AnonymousClass0KX) obj).A05 == j) {
                break;
            }
            i++;
        }
        AnonymousClass0KX r3 = (AnonymousClass0KX) obj;
        if (r3 != null && r3.A0B) {
            z = true;
        }
        return true ^ z;
    }
}
