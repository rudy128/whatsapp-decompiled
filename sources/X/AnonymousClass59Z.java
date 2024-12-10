package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {51, 73, 76}, m = "invokeSuspend", n = {"latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"})
/* renamed from: X.59Z  reason: invalid class name */
public final class AnonymousClass59Z extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C18090vk $arrayFactory;
    public final /* synthetic */ C23421Fz[] $flows;
    public final /* synthetic */ AnonymousClass1G2 $this_combineInternal;
    public final /* synthetic */ C36001nB $transform;
    public int I$0;
    public int I$1;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass59Z(C30391dr r2, C18090vk r3, C36001nB r4, AnonymousClass1G2 r5, C23421Fz[] r6) {
        super(2, r2);
        this.$flows = r6;
        this.$arrayFactory = r3;
        this.$transform = r4;
        this.$this_combineInternal = r5;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        C30391dr r1 = r8;
        AnonymousClass59Z r0 = new AnonymousClass59Z(r1, this.$arrayFactory, this.$transform, this.$this_combineInternal, this.$flows);
        r0.L$0 = obj;
        return r0;
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006d A[LOOP:1: B:21:0x006d->B:30:0x008d, LOOP_START, PHI: r3 r11 
      PHI: (r3v2 int) = (r3v1 int), (r3v3 int) binds: [B:18:0x0068, B:30:0x008d] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r11v4 X.9rE) = (r11v3 X.9rE), (r11v7 X.9rE) binds: [B:18:0x0068, B:30:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f4 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            r1 = r16
            X.1g4 r7 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r15.label
            r6 = 3
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L_0x0016
            if (r0 == r4) goto L_0x004a
            if (r0 == r5) goto L_0x00cc
            if (r0 == r6) goto L_0x00cc
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0016:
            X.C30691eM.A01(r1)
            java.lang.Object r1 = r15.L$0
            X.1OX r1 = (X.AnonymousClass1OX) r1
            X.1Fz[] r0 = r15.$flows
            int r3 = r0.length
            if (r3 == 0) goto L_0x006a
            java.lang.Object[] r2 = new java.lang.Object[r3]
            X.1I8 r8 = X.AnonymousClass4IV.A02
            r0 = 0
            java.util.Arrays.fill(r2, r0, r3, r8)
            r11 = 0
            X.1Pg r0 = X.C25691Pg.SUSPEND
            X.DXn r12 = X.AnonymousClass4W8.A01(r0, r3)
            java.util.concurrent.atomic.AtomicInteger r10 = new java.util.concurrent.atomic.AtomicInteger
            r10.<init>(r3)
            r8 = 0
            r14 = 0
        L_0x0038:
            X.1Fz[] r13 = r15.$flows
            X.58V r9 = new X.58V
            r9.<init>(r10, r11, r12, r13, r14)
            X.AnonymousClass3MX.A1Q(r9, r1)
            int r14 = r14 + 1
            if (r14 < r3) goto L_0x0038
            byte[] r9 = new byte[r3]
            goto L_0x00df
        L_0x004a:
            int r8 = r15.I$1
            int r3 = r15.I$0
            java.lang.Object r9 = r15.L$2
            byte[] r9 = (byte[]) r9
            java.lang.Object r12 = r15.L$1
            X.5bw r12 = (X.C108585bw) r12
            java.lang.Object r2 = r15.L$0
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            X.C30691eM.A01(r1)
            X.Cqb r1 = (X.C26020Cqb) r1
            java.lang.Object r11 = r1.A00
        L_0x0061:
            boolean r0 = r11 instanceof X.AnonymousClass4PR
            if (r0 == 0) goto L_0x0066
            r11 = 0
        L_0x0066:
            X.9rE r11 = (X.C194139rE) r11
            if (r11 != 0) goto L_0x006d
        L_0x006a:
            X.1Wu r7 = X.C27621Wu.A00
            return r7
        L_0x006d:
            int r10 = r11.A00
            r1 = r2[r10]
            java.lang.Object r0 = r11.A01
            r2[r10] = r0
            X.1I8 r0 = X.AnonymousClass4IV.A02
            if (r1 != r0) goto L_0x007b
            int r3 = r3 + -1
        L_0x007b:
            byte r0 = r9[r10]
            if (r0 == r8) goto L_0x008f
            byte r0 = (byte) r8
            r9[r10] = r0
            java.lang.Object r11 = r12.CPy()
            boolean r0 = r11 instanceof X.AnonymousClass4PR
            if (r0 == 0) goto L_0x008b
            r11 = 0
        L_0x008b:
            X.9rE r11 = (X.C194139rE) r11
            if (r11 != 0) goto L_0x006d
        L_0x008f:
            if (r3 != 0) goto L_0x00df
            X.0vk r0 = r15.$arrayFactory
            java.lang.Object r10 = r0.invoke()
            if (r10 != 0) goto L_0x00b0
            X.1nB r1 = r15.$transform
            X.1G2 r0 = r15.$this_combineInternal
            r15.L$0 = r2
            r15.L$1 = r12
            r15.L$2 = r9
            r15.I$0 = r3
            r15.I$1 = r8
            r15.label = r5
            java.lang.Object r0 = r1.invoke(r0, r2, r15)
            if (r0 != r7) goto L_0x00df
            return r7
        L_0x00b0:
            int r1 = r2.length
            r0 = 0
            java.lang.System.arraycopy(r2, r0, r10, r0, r1)
            X.1nB r1 = r15.$transform
            X.1G2 r0 = r15.$this_combineInternal
            r15.L$0 = r2
            r15.L$1 = r12
            r15.L$2 = r9
            r15.I$0 = r3
            r15.I$1 = r8
            r15.label = r6
            java.lang.Object r0 = r1.invoke(r0, r10, r15)
            if (r0 != r7) goto L_0x00df
            return r7
        L_0x00cc:
            int r8 = r15.I$1
            int r3 = r15.I$0
            java.lang.Object r9 = r15.L$2
            byte[] r9 = (byte[]) r9
            java.lang.Object r12 = r15.L$1
            X.5bw r12 = (X.C108585bw) r12
            java.lang.Object r2 = r15.L$0
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            X.C30691eM.A01(r1)
        L_0x00df:
            int r0 = r8 + 1
            byte r8 = (byte) r0
            r15.L$0 = r2
            r15.L$1 = r12
            r15.L$2 = r9
            r15.I$0 = r3
            r15.I$1 = r8
            r15.label = r4
            java.lang.Object r11 = r12.CDX(r15)
            if (r11 != r7) goto L_0x0061
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass59Z.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AnonymousClass59Z) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
