package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {215, 418}, m = "invokeSuspend", n = {"downstream", "values", "lastValue", "timeoutMillis", "downstream", "values", "lastValue"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
/* renamed from: X.5AQ  reason: invalid class name */
public final class AnonymousClass5AQ extends C30431dv implements C36001nB {
    public final /* synthetic */ C23421Fz $this_debounceInternal;
    public final /* synthetic */ C22821Di $timeoutMillisSelector;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5AQ(C30391dr r2, C22821Di r3, C23421Fz r4) {
        super(3, r2);
        this.$timeoutMillisSelector = r3;
        this.$this_debounceInternal = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        AnonymousClass5AQ r1 = new AnonymousClass5AQ((C30391dr) obj3, this.$timeoutMillisSelector, this.$this_debounceInternal);
        r1.L$0 = obj;
        r1.L$1 = obj2;
        return r1.invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: type inference failed for: r11v3, types: [java.lang.Object, X.4rE] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            r22 = this;
            X.1g4 r8 = X.C31751g4.COROUTINE_SUSPENDED
            r7 = r22
            int r0 = r7.label
            r6 = 2
            r5 = 1
            r13 = 0
            r4 = 0
            if (r0 == 0) goto L_0x00c9
            if (r0 == r5) goto L_0x005c
            if (r0 != r6) goto L_0x00f2
            java.lang.Object r9 = r7.L$2
            X.4rF r9 = (X.C98494rF) r9
            java.lang.Object r2 = r7.L$1
            X.5bw r2 = (X.C108585bw) r2
            java.lang.Object r3 = r7.L$0
            X.1G2 r3 = (X.AnonymousClass1G2) r3
            X.C30691eM.A01(r23)
        L_0x0020:
            java.lang.Object r1 = r9.element
            X.1I8 r0 = X.AnonymousClass4IV.A00
            if (r1 == r0) goto L_0x00ef
            X.4rE r11 = new X.4rE
            r11.<init>()
            if (r1 == 0) goto L_0x0071
            X.1Di r0 = r7.$timeoutMillisSelector
            X.1I8 r12 = X.AnonymousClass4IV.A01
            if (r1 != r12) goto L_0x0034
            r1 = r4
        L_0x0034:
            java.lang.Object r0 = r0.invoke(r1)
            long r0 = X.C17880vN.A05(r0)
            r11.element = r0
            int r10 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r10 < 0) goto L_0x00e8
            int r10 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r10 != 0) goto L_0x0071
            java.lang.Object r0 = r9.element
            if (r0 != r12) goto L_0x004b
            r0 = r4
        L_0x004b:
            r7.L$0 = r3
            r7.L$1 = r2
            r7.L$2 = r9
            r7.L$3 = r11
            r7.label = r5
            java.lang.Object r0 = r3.BJt(r0, r7)
            if (r0 != r8) goto L_0x006f
            return r8
        L_0x005c:
            java.lang.Object r11 = r7.L$3
            X.4rE r11 = (X.C98484rE) r11
            java.lang.Object r9 = r7.L$2
            X.4rF r9 = (X.C98494rF) r9
            java.lang.Object r2 = r7.L$1
            X.5bw r2 = (X.C108585bw) r2
            java.lang.Object r3 = r7.L$0
            X.1G2 r3 = (X.AnonymousClass1G2) r3
            X.C30691eM.A01(r23)
        L_0x006f:
            r9.element = r4
        L_0x0071:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.C27175DXk.A05
            X.0wh r0 = r7.getContext()
            X.DXk r10 = new X.DXk
            r10.<init>(r0)
            java.lang.Object r0 = r9.element
            if (r0 == 0) goto L_0x00ac
            long r0 = r11.element
            X.4vM r12 = new X.4vM
            r12.<init>(r4, r9, r3)
            X.4M6 r11 = new X.4M6
            r11.<init>(r0)
            X.5Ao r1 = X.AnonymousClass5Ao.A00
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }"
            X.C18070vi.A0z(r1, r0)
            r0 = 3
            X.C41681wt.A04(r1, r0)
            X.1nB r20 = X.CIE.A00
            X.1I8 r17 = X.CIE.A02
            X.CTe r15 = new X.CTe
            r16 = r11
            r18 = r12
            r19 = r1
            r21 = r10
            r15.<init>(r16, r17, r18, r19, r20, r21)
            r0 = 0
            r10.A06(r15, r0)
        L_0x00ac:
            X.CQk r1 = r2.BVk()
            X.58S r0 = new X.58S
            r0.<init>(r4, r9, r3)
            r10.A05(r0, r1)
            r7.L$0 = r3
            r7.L$1 = r2
            r7.L$2 = r9
            r7.L$3 = r4
            r7.label = r6
            java.lang.Object r0 = X.C27175DXk.A03(r7, r10)
            if (r0 != r8) goto L_0x0020
            return r8
        L_0x00c9:
            X.C30691eM.A01(r23)
            java.lang.Object r9 = r7.L$0
            X.1OX r9 = (X.AnonymousClass1OX) r9
            java.lang.Object r3 = r7.L$1
            X.1G2 r3 = (X.AnonymousClass1G2) r3
            X.1Fz r0 = r7.$this_debounceInternal
            X.55M r2 = new X.55M
            r2.<init>(r4, r0)
            X.1OR r1 = X.AnonymousClass1OR.A00
            r0 = 0
            X.5WI r2 = X.AnonymousClass4W9.A01(r1, r2, r9, r0)
            X.4rF r9 = X.C98494rF.A00()
            goto L_0x0020
        L_0x00e8:
            java.lang.String r0 = "Debounce timeout should not be negative"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x00ef:
            X.1Wu r8 = X.C27621Wu.A00
            return r8
        L_0x00f2:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5AQ.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
