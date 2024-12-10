package X;

import java.util.Iterator;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", i = {0, 0, 0, 2, 2, 3, 3}, l = {34, 40, 49, 55, 58}, m = "invokeSuspend", n = {"$this$iterator", "buffer", "gap", "$this$iterator", "buffer", "$this$iterator", "buffer"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$0", "L$1"})
/* renamed from: X.Aoq  reason: case insensitive filesystem */
public final class C21720Aoq extends C71433Fg implements AnonymousClass1OS {
    public final /* synthetic */ Iterator $iterator;
    public final /* synthetic */ boolean $partialWindows;
    public final /* synthetic */ boolean $reuseBuffer;
    public final /* synthetic */ int $size;
    public final /* synthetic */ int $step;
    public int I$0;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21720Aoq(Iterator it, C30391dr r2, int i, int i2, boolean z, boolean z2) {
        super(r2);
        this.$size = i;
        this.$step = i2;
        this.$iterator = it;
        this.$reuseBuffer = z;
        this.$partialWindows = z2;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        C30391dr r2 = r9;
        C21720Aoq aoq = new C21720Aoq(this.$iterator, r2, this.$size, this.$step, this.$reuseBuffer, this.$partialWindows);
        aoq.L$0 = obj;
        return aoq;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0090, code lost:
        r2.A00(r5, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0093, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0131, code lost:
        if (r13.$partialWindows == false) goto L_0x0179;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0060 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            X.1g4 r12 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r13.label
            r6 = 5
            r5 = 4
            r8 = 3
            r7 = 2
            r10 = 1
            r3 = 0
            if (r0 == 0) goto L_0x001b
            if (r0 == r10) goto L_0x0038
            if (r0 == r7) goto L_0x0176
            if (r0 == r8) goto L_0x00a6
            if (r0 == r5) goto L_0x0134
            if (r0 == r6) goto L_0x0176
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x001b:
            X.C30691eM.A01(r14)
            java.lang.Object r2 = r13.L$0
            X.Akx r2 = (X.C21488Akx) r2
            int r9 = r13.$size
            r1 = r9
            r0 = 1024(0x400, float:1.435E-42)
            if (r9 <= r0) goto L_0x002b
            r1 = 1024(0x400, float:1.435E-42)
        L_0x002b:
            int r4 = r13.$step
            int r4 = r4 - r9
            if (r4 < 0) goto L_0x009b
            java.util.ArrayList r5 = X.C17880vN.A0z(r1)
            java.util.Iterator r6 = r13.$iterator
            r8 = 0
            goto L_0x0051
        L_0x0038:
            int r8 = r13.I$0
            java.lang.Object r6 = r13.L$2
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r5 = r13.L$1
            java.util.AbstractCollection r5 = (java.util.AbstractCollection) r5
            java.lang.Object r2 = r13.L$0
            X.Akx r2 = (X.C21488Akx) r2
            X.C30691eM.A01(r14)
            boolean r0 = r13.$reuseBuffer
            if (r0 == 0) goto L_0x0094
            r5.clear()
        L_0x0050:
            r4 = r8
        L_0x0051:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0060
            java.lang.Object r0 = r6.next()
            if (r8 <= 0) goto L_0x007b
            int r8 = r8 + -1
            goto L_0x0051
        L_0x0060:
            boolean r0 = X.C17880vN.A1X(r5)
            if (r0 == 0) goto L_0x0179
            boolean r0 = r13.$partialWindows
            if (r0 != 0) goto L_0x0072
            int r1 = r5.size()
            int r0 = r13.$size
            if (r1 != r0) goto L_0x0179
        L_0x0072:
            r13.L$0 = r3
            r13.L$1 = r3
            r13.L$2 = r3
            r13.label = r7
            goto L_0x0090
        L_0x007b:
            r5.add(r0)
            int r1 = r5.size()
            int r0 = r13.$size
            if (r1 != r0) goto L_0x0051
            r13.L$0 = r2
            r13.L$1 = r5
            r13.L$2 = r6
            r13.I$0 = r4
            r13.label = r10
        L_0x0090:
            r2.A00(r5, r13)
            return r12
        L_0x0094:
            int r0 = r13.$size
            java.util.ArrayList r5 = X.C17880vN.A0z(r0)
            goto L_0x0050
        L_0x009b:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0 = 0
            X.An3 r4 = new X.An3
            r4.<init>(r1, r0)
            java.util.Iterator r7 = r13.$iterator
            goto L_0x00ba
        L_0x00a6:
            java.lang.Object r7 = r13.L$2
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r4 = r13.L$1
            X.An3 r4 = (X.C21614An3) r4
            java.lang.Object r2 = r13.L$0
            X.Akx r2 = (X.C21488Akx) r2
            X.C30691eM.A01(r14)
            int r0 = r13.$step
            r4.A0C(r0)
        L_0x00ba:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x012f
            java.lang.Object r11 = r7.next()
            int r0 = r4.size()
            int r1 = r4.A02
            if (r0 != r1) goto L_0x00d3
            java.lang.String r0 = "ring buffer is full"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x00d3:
            java.lang.Object[] r10 = r4.A03
            int r9 = r4.A01
            int r0 = r4.size()
            int r9 = r9 + r0
            int r9 = r9 % r1
            r10[r9] = r11
            int r0 = r4.size()
            int r0 = r0 + 1
            r4.A00 = r0
            int r0 = r4.size()
            if (r0 != r1) goto L_0x00ba
            int r0 = r4.size()
            int r9 = r13.$size
            if (r0 >= r9) goto L_0x0119
            int r0 = r1 >> 1
            int r1 = r1 + r0
            int r1 = r1 + 1
            if (r1 <= r9) goto L_0x00fd
            r1 = r9
        L_0x00fd:
            int r0 = r4.A01
            if (r0 != 0) goto L_0x0112
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r10, r1)
            X.C18070vi.A0X(r1)
        L_0x0108:
            int r0 = r4.size()
            X.An3 r4 = new X.An3
            r4.<init>(r1, r0)
            goto L_0x00ba
        L_0x0112:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.Object[] r1 = r4.toArray(r0)
            goto L_0x0108
        L_0x0119:
            boolean r0 = r13.$reuseBuffer
            if (r0 == 0) goto L_0x012a
            r0 = r4
        L_0x011e:
            r13.L$0 = r2
            r13.L$1 = r4
            r13.L$2 = r7
            r13.label = r8
            r2.A00(r0, r13)
            return r12
        L_0x012a:
            java.util.ArrayList r0 = X.C17880vN.A10(r4)
            goto L_0x011e
        L_0x012f:
            boolean r0 = r13.$partialWindows
            if (r0 == 0) goto L_0x0179
            goto L_0x0144
        L_0x0134:
            java.lang.Object r4 = r13.L$1
            X.An3 r4 = (X.C21614An3) r4
            java.lang.Object r2 = r13.L$0
            X.Akx r2 = (X.C21488Akx) r2
            X.C30691eM.A01(r14)
            int r0 = r13.$step
            r4.A0C(r0)
        L_0x0144:
            int r1 = r4.size()
            int r0 = r13.$step
            if (r1 <= r0) goto L_0x0162
            boolean r0 = r13.$reuseBuffer
            if (r0 == 0) goto L_0x015d
            r0 = r4
        L_0x0151:
            r13.L$0 = r2
            r13.L$1 = r4
            r13.L$2 = r3
            r13.label = r5
            r2.A00(r0, r13)
            return r12
        L_0x015d:
            java.util.ArrayList r0 = X.C17880vN.A10(r4)
            goto L_0x0151
        L_0x0162:
            boolean r0 = r4.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0179
            r13.L$0 = r3
            r13.L$1 = r3
            r13.L$2 = r3
            r13.label = r6
            r2.A00(r4, r13)
            return r12
        L_0x0176:
            X.C30691eM.A01(r14)
        L_0x0179:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21720Aoq.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C21720Aoq) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
