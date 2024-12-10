package androidx.compose.foundation.gestures;

import X.AnonymousClass1OS;
import X.C17750vA;
import X.C27621Wu;
import X.C30391dr;
import X.C71433Fg;
import X.C98494rF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", f = "DragGestureDetector.kt", i = {0, 0, 1, 1, 1}, l = {812, 829}, m = "invokeSuspend", n = {"$this$withTimeout", "finished", "$this$withTimeout", "event", "finished"}, s = {"L$0", "I$0", "L$0", "L$1", "I$0"})
public final class DragGestureDetectorKt$awaitLongPressOrCancellation$2 extends C71433Fg implements AnonymousClass1OS {
    public final /* synthetic */ C98494rF $currentDown;
    public final /* synthetic */ C98494rF $longPress;
    public int I$0;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$awaitLongPressOrCancellation$2(C30391dr r1, C98494rF r2, C98494rF r3) {
        super(r1);
        this.$currentDown = r2;
        this.$longPress = r3;
    }

    /* renamed from: A00 */
    public final Object invoke(C17750vA r3, C30391dr r4) {
        return ((DragGestureDetectorKt$awaitLongPressOrCancellation$2) create(r3, r4)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        DragGestureDetectorKt$awaitLongPressOrCancellation$2 dragGestureDetectorKt$awaitLongPressOrCancellation$2 = new DragGestureDetectorKt$awaitLongPressOrCancellation$2(r5, this.$currentDown, this.$longPress);
        dragGestureDetectorKt$awaitLongPressOrCancellation$2.L$0 = obj;
        return dragGestureDetectorKt$awaitLongPressOrCancellation$2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0056, code lost:
        if (r1 == null) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0058, code lost:
        r15.$currentDown.element = r1;
        r15.$longPress.element = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0062, code lost:
        if (r5 == 0) goto L_0x0064;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00c4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00e8 A[EDGE_INSN: B:65:0x00e8->B:47:0x00e8 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            r3 = r16
            X.1g4 r7 = X.AnonymousClass3F6.A03()
            int r0 = r15.label
            r6 = 2
            r2 = 0
            r1 = 1
            if (r0 == 0) goto L_0x00f9
            if (r0 == r1) goto L_0x00a2
            if (r0 != r6) goto L_0x0106
            int r5 = r15.I$0
            java.lang.Object r9 = r15.L$1
            X.0Hm r9 = (X.AnonymousClass0Hm) r9
            java.lang.Object r4 = r15.L$0
            X.0vA r4 = (X.C17750vA) r4
            X.C30691eM.A01(r3)
        L_0x001e:
            X.0Hm r3 = (X.AnonymousClass0Hm) r3
            java.util.List r3 = r3.A03
            int r2 = r3.size()
            r1 = 0
        L_0x0027:
            if (r1 >= r2) goto L_0x0034
            X.0KX r0 = X.AnonymousClass000.A0f(r3, r1)
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x009f
            r5 = 1
        L_0x0034:
            X.4rF r0 = r15.$currentDown
            java.lang.Object r0 = r0.element
            X.0KX r0 = (X.AnonymousClass0KX) r0
            long r0 = r0.A05
            boolean r0 = androidx.compose.foundation.gestures.DragGestureDetectorKt.A04(r9, r0)
            if (r0 == 0) goto L_0x0078
            java.util.List r8 = r9.A03
            int r3 = r8.size()
            r2 = 0
        L_0x0049:
            if (r2 >= r3) goto L_0x0103
            java.lang.Object r1 = r8.get(r2)
            r0 = r1
            X.0KX r0 = (X.AnonymousClass0KX) r0
            boolean r0 = r0.A0B
            if (r0 == 0) goto L_0x0075
            if (r1 == 0) goto L_0x0103
            X.4rF r0 = r15.$currentDown
            r0.element = r1
            X.4rF r0 = r15.$longPress
            r0.element = r1
        L_0x0060:
            r2 = 0
            r1 = 1
            if (r5 != 0) goto L_0x0103
        L_0x0064:
            X.0CQ r0 = X.AnonymousClass0CQ.Main
            r15.L$0 = r4
            r15.L$1 = r2
            r15.I$0 = r5
            r15.label = r1
            java.lang.Object r3 = r4.BCq(r0, r15)
            if (r3 != r7) goto L_0x00ab
            return r7
        L_0x0075:
            int r2 = r2 + 1
            goto L_0x0049
        L_0x0078:
            X.4rF r13 = r15.$longPress
            java.util.List r14 = r9.A03
            X.4rF r12 = r15.$currentDown
            int r11 = r14.size()
            r10 = 0
        L_0x0083:
            if (r10 >= r11) goto L_0x009b
            java.lang.Object r9 = r14.get(r10)
            r0 = r9
            X.0KX r0 = (X.AnonymousClass0KX) r0
            long r2 = r0.A05
            java.lang.Object r0 = r12.element
            X.0KX r0 = (X.AnonymousClass0KX) r0
            long r0 = r0.A05
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 == 0) goto L_0x009c
            int r10 = r10 + 1
            goto L_0x0083
        L_0x009b:
            r9 = 0
        L_0x009c:
            r13.element = r9
            goto L_0x0060
        L_0x009f:
            int r1 = r1 + 1
            goto L_0x0027
        L_0x00a2:
            int r5 = r15.I$0
            java.lang.Object r4 = r15.L$0
            X.0vA r4 = (X.C17750vA) r4
            X.C30691eM.A01(r3)
        L_0x00ab:
            r9 = r3
            X.0Hm r9 = (X.AnonymousClass0Hm) r9
            java.util.List r12 = r9.A03
            int r2 = r12.size()
            r1 = 0
        L_0x00b5:
            if (r1 >= r2) goto L_0x00c4
            X.0KX r0 = X.AnonymousClass000.A0f(r12, r1)
            boolean r0 = X.AnonymousClass0Oz.A01(r0)
            if (r0 == 0) goto L_0x00c5
            int r1 = r1 + 1
            goto L_0x00b5
        L_0x00c4:
            r5 = 1
        L_0x00c5:
            int r11 = r12.size()
            r10 = 0
        L_0x00ca:
            if (r10 >= r11) goto L_0x00e8
            X.0KX r8 = X.AnonymousClass000.A0f(r12, r10)
            boolean r0 = r8.A02()
            if (r0 != 0) goto L_0x00e7
            long r2 = r4.BZM()
            long r0 = r4.BRT()
            boolean r0 = X.AnonymousClass0Oz.A03(r8, r2, r0)
            if (r0 != 0) goto L_0x00e7
            int r10 = r10 + 1
            goto L_0x00ca
        L_0x00e7:
            r5 = 1
        L_0x00e8:
            X.0CQ r0 = X.AnonymousClass0CQ.Final
            r15.L$0 = r4
            r15.L$1 = r9
            r15.I$0 = r5
            r15.label = r6
            java.lang.Object r3 = r4.BCq(r0, r15)
            if (r3 != r7) goto L_0x001e
            return r7
        L_0x00f9:
            X.C30691eM.A01(r3)
            java.lang.Object r4 = r15.L$0
            X.0vA r4 = (X.C17750vA) r4
            r5 = 0
            goto L_0x0064
        L_0x0103:
            X.1Wu r7 = X.C27621Wu.A00
            return r7
        L_0x0106:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
