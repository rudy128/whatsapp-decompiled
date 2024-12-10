package androidx.compose.foundation.gestures;

import X.AnonymousClass1OS;
import X.C17750vA;
import X.C18090vk;
import X.C22821Di;
import X.C27621Wu;
import X.C30391dr;
import X.C71433Fg;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5", f = "DragGestureDetector.kt", i = {0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {175, 884, 926, 192}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down", "overSlop", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointerDirectionConfig$iv", "pointer$iv", "touchSlop$iv", "totalPositionChange$iv", "$this$awaitEachGesture", "down", "overSlop", "$this$awaitPointerSlopOrCancellation_u2dpn7EDYM$iv", "pointerDirectionConfig$iv", "pointer$iv", "dragEvent$iv", "touchSlop$iv", "totalPositionChange$iv"}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "F$0", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "F$0", "J$0"})
public final class DragGestureDetectorKt$detectDragGestures$5 extends C71433Fg implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1OS $onDrag;
    public final /* synthetic */ C18090vk $onDragCancel;
    public final /* synthetic */ C18090vk $onDragEnd;
    public final /* synthetic */ C22821Di $onDragStart;
    public float F$0;
    public long J$0;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$detectDragGestures$5(C30391dr r1, C18090vk r2, C18090vk r3, C22821Di r4, AnonymousClass1OS r5) {
        super(r1);
        this.$onDragStart = r4;
        this.$onDrag = r5;
        this.$onDragCancel = r2;
        this.$onDragEnd = r3;
    }

    /* renamed from: A00 */
    public final Object invoke(C17750vA r3, C30391dr r4) {
        return ((DragGestureDetectorKt$detectDragGestures$5) create(r3, r4)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        C30391dr r1 = r8;
        DragGestureDetectorKt$detectDragGestures$5 dragGestureDetectorKt$detectDragGestures$5 = new DragGestureDetectorKt$detectDragGestures$5(r1, this.$onDragCancel, this.$onDragEnd, this.$onDragStart, this.$onDrag);
        dragGestureDetectorKt$detectDragGestures$5.L$0 = obj;
        return dragGestureDetectorKt$detectDragGestures$5;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: X.0KX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: X.0KX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: X.0KX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: X.0KX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: X.0KX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v33, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: X.0KX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v34, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: X.0KX} */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0153, code lost:
        if (r13.A02() != false) goto L_0x0027;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0094 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x012c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0157 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r11 = r21
            X.1g4 r10 = X.AnonymousClass3F6.A03()
            r9 = r20
            int r3 = r9.label
            r2 = 4
            r1 = 3
            r14 = 2
            r0 = 1
            r13 = 0
            if (r3 == 0) goto L_0x002d
            if (r3 == r0) goto L_0x003f
            if (r3 == r14) goto L_0x0095
            if (r3 == r1) goto L_0x012d
            if (r3 != r2) goto L_0x01af
            X.C30691eM.A01(r11)
        L_0x001c:
            boolean r0 = X.AnonymousClass000.A1Y(r11)
            if (r0 != 0) goto L_0x002a
            X.0vk r0 = r9.$onDragCancel
        L_0x0024:
            r0.invoke()
        L_0x0027:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x002a:
            X.0vk r0 = r9.$onDragEnd
            goto L_0x0024
        L_0x002d:
            X.C30691eM.A01(r11)
            java.lang.Object r8 = r9.L$0
            X.0vA r8 = (X.C17750vA) r8
            r9.L$0 = r8
            r9.label = r0
            java.lang.Object r11 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A07(r8, r9, r14)
            if (r11 != r10) goto L_0x0046
            return r10
        L_0x003f:
            java.lang.Object r8 = r9.L$0
            X.0vA r8 = (X.C17750vA) r8
            X.C30691eM.A01(r11)
        L_0x0046:
            X.0KX r11 = (X.AnonymousClass0KX) r11
            X.4rE r2 = new X.4rE
            r2.<init>()
            long r5 = X.AnonymousClass0QY.A03
            r2.element = r5
            long r0 = r11.A05
            int r12 = r11.A04
            X.0sh r3 = androidx.compose.foundation.gestures.DragGestureDetectorKt.A01
            X.0Hm r4 = r8.BPt()
            boolean r4 = androidx.compose.foundation.gestures.DragGestureDetectorKt.A04(r4, r0)
            if (r4 != 0) goto L_0x0027
            X.0tN r7 = r8.getViewConfiguration()
            boolean r4 = X.AnonymousClass000.A1T(r12, r14)
            float r7 = r7.Baf()
            if (r4 == 0) goto L_0x0072
            float r4 = androidx.compose.foundation.gestures.DragGestureDetectorKt.A00
            float r7 = r7 * r4
        L_0x0072:
            X.4rE r4 = new X.4rE
            r4.<init>()
            r4.element = r0
            r12 = r8
        L_0x007a:
            r9.L$0 = r12
            r9.L$1 = r11
            r9.L$2 = r2
            r9.L$3 = r8
            r9.L$4 = r3
            r9.L$5 = r4
            r9.L$6 = r13
            r9.F$0 = r7
            r9.J$0 = r5
            r9.label = r14
            java.lang.Object r1 = r8.BCq(X.AnonymousClass0CQ.Main, r9)
            if (r1 != r10) goto L_0x00b4
            return r10
        L_0x0095:
            long r5 = r9.J$0
            float r7 = r9.F$0
            java.lang.Object r4 = r9.L$5
            X.4rE r4 = (X.C98484rE) r4
            java.lang.Object r3 = r9.L$4
            X.0sh r3 = (X.C16600sh) r3
            java.lang.Object r8 = r9.L$3
            X.0vA r8 = (X.C17750vA) r8
            java.lang.Object r2 = r9.L$2
            X.4rE r2 = (X.C98484rE) r2
            java.lang.Object r0 = r9.L$1
            java.lang.Object r12 = r9.L$0
            X.0vA r12 = (X.C17750vA) r12
            X.C30691eM.A01(r11)
            r1 = r11
            r11 = r0
        L_0x00b4:
            X.0Hm r1 = (X.AnonymousClass0Hm) r1
            java.util.List r15 = r1.A03
            int r19 = r15.size()
            r14 = 0
        L_0x00bd:
            r0 = r19
            if (r14 >= r0) goto L_0x00d5
            java.lang.Object r13 = r15.get(r14)
            r0 = r13
            X.0KX r0 = (X.AnonymousClass0KX) r0
            long r0 = r0.A05
            r17 = r0
            long r0 = r4.element
            int r16 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
            if (r16 == 0) goto L_0x00d6
            int r14 = r14 + 1
            goto L_0x00bd
        L_0x00d5:
            r13 = 0
        L_0x00d6:
            X.0KX r13 = (X.AnonymousClass0KX) r13
            if (r13 == 0) goto L_0x0027
            boolean r0 = r13.A02()
            if (r0 != 0) goto L_0x0027
            boolean r0 = X.AnonymousClass0Oz.A01(r13)
            if (r0 == 0) goto L_0x00fb
            int r14 = r15.size()
            r13 = 0
        L_0x00eb:
            if (r13 >= r14) goto L_0x0157
            java.lang.Object r1 = r15.get(r13)
            r0 = r1
            X.0KX r0 = (X.AnonymousClass0KX) r0
            boolean r0 = r0.A0B
            if (r0 != 0) goto L_0x0158
            int r13 = r13 + 1
            goto L_0x00eb
        L_0x00fb:
            long r14 = r13.A06
            long r0 = r13.A07
            long r0 = X.AnonymousClass0QY.A04(r14, r0)
            long r5 = X.AnonymousClass0QY.A05(r5, r0)
            float r0 = r3.BDl(r5)
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0164
            X.0CQ r1 = X.AnonymousClass0CQ.Final
            r9.L$0 = r12
            r9.L$1 = r11
            r9.L$2 = r2
            r9.L$3 = r8
            r9.L$4 = r3
            r9.L$5 = r4
            r9.L$6 = r13
            r9.F$0 = r7
            r9.J$0 = r5
            r0 = 3
            r9.label = r0
            java.lang.Object r0 = r8.BCq(r1, r9)
            if (r0 != r10) goto L_0x014f
            return r10
        L_0x012d:
            long r5 = r9.J$0
            float r7 = r9.F$0
            java.lang.Object r13 = r9.L$6
            X.0KX r13 = (X.AnonymousClass0KX) r13
            java.lang.Object r4 = r9.L$5
            X.4rE r4 = (X.C98484rE) r4
            java.lang.Object r3 = r9.L$4
            X.0sh r3 = (X.C16600sh) r3
            java.lang.Object r8 = r9.L$3
            X.0vA r8 = (X.C17750vA) r8
            java.lang.Object r2 = r9.L$2
            X.4rE r2 = (X.C98484rE) r2
            java.lang.Object r0 = r9.L$1
            java.lang.Object r12 = r9.L$0
            X.0vA r12 = (X.C17750vA) r12
            X.C30691eM.A01(r11)
            r11 = r0
        L_0x014f:
            boolean r0 = r13.A02()
            if (r0 == 0) goto L_0x0160
            goto L_0x0027
        L_0x0157:
            r1 = 0
        L_0x0158:
            X.0KX r1 = (X.AnonymousClass0KX) r1
            if (r1 == 0) goto L_0x0027
            long r0 = r1.A05
            r4.element = r0
        L_0x0160:
            r14 = 2
            r13 = 0
            goto L_0x007a
        L_0x0164:
            long r0 = r3.BDw(r7, r5)
            r13.A01()
            r2.element = r0
            boolean r0 = r13.A02()
            if (r0 == 0) goto L_0x01a9
            X.1Di r1 = r9.$onDragStart
            X.0QY r0 = X.AnonymousClass000.A0e(r14)
            r1.invoke(r0)
            X.1OS r3 = r9.$onDrag
            long r0 = r2.element
            X.0QY r0 = X.AnonymousClass000.A0e(r0)
            r3.invoke(r13, r0)
            long r1 = r13.A05
            X.1OS r0 = r9.$onDrag
            X.0ib r3 = new X.0ib
            r3.<init>(r0)
            r0 = 0
            r9.L$0 = r0
            r9.L$1 = r0
            r9.L$2 = r0
            r9.L$3 = r0
            r9.L$4 = r0
            r9.L$5 = r0
            r9.L$6 = r0
            r0 = 4
            r9.label = r0
            java.lang.Object r11 = androidx.compose.foundation.gestures.DragGestureDetectorKt.A02(r12, r9, r3, r1)
            if (r11 != r10) goto L_0x001c
            return r10
        L_0x01a9:
            r13 = 0
            long r5 = X.AnonymousClass0QY.A03
            r14 = 2
            goto L_0x007a
        L_0x01af:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
