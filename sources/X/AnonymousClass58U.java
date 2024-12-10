package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", i = {}, l = {210, 214, 215, 221}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.58U  reason: invalid class name */
public final class AnonymousClass58U extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Object $initialValue;
    public final /* synthetic */ AnonymousClass1G3 $shared;
    public final /* synthetic */ C108705cA $started;
    public final /* synthetic */ C23421Fz $upstream;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass58U(Object obj, C30391dr r3, C23421Fz r4, AnonymousClass1G3 r5, C108705cA r6) {
        super(2, r3);
        this.$started = r6;
        this.$upstream = r4;
        this.$shared = r5;
        this.$initialValue = obj;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        C108705cA r5 = this.$started;
        return new AnonymousClass58U(this.$initialValue, r8, this.$upstream, this.$shared, r5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.1g4 r6 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r9.label
            r7 = 4
            r8 = 3
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0017
            if (r0 == r3) goto L_0x006e
            if (r0 == r4) goto L_0x0046
            if (r0 == r8) goto L_0x006e
            if (r0 == r7) goto L_0x006e
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0017:
            X.C30691eM.A01(r10)
            X.5cA r2 = r9.$started
            X.5cA r0 = X.AnonymousClass4ZC.A00
            if (r2 != r0) goto L_0x002d
            X.1Fz r1 = r9.$upstream
            X.1G3 r0 = r9.$shared
            r9.label = r3
        L_0x0026:
            java.lang.Object r0 = r1.BFC(r9, r0)
        L_0x002a:
            if (r0 != r6) goto L_0x0071
            return r6
        L_0x002d:
            X.5cA r1 = X.AnonymousClass4ZC.A01
            r5 = 0
            X.1G3 r0 = r9.$shared
            if (r2 != r1) goto L_0x0050
            X.3JQ r1 = r0.BZq()
            X.50F r0 = new X.50F
            r0.<init>(r5)
            r9.label = r4
            java.lang.Object r0 = X.C26067Crh.A00(r9, r0, r1)
            if (r0 != r6) goto L_0x0049
            return r6
        L_0x0046:
            X.C30691eM.A01(r10)
        L_0x0049:
            X.1Fz r1 = r9.$upstream
            X.1G3 r0 = r9.$shared
            r9.label = r8
            goto L_0x0026
        L_0x0050:
            X.3JQ r0 = r0.BZq()
            X.1Fz r0 = r2.BFE(r0)
            X.1Fz r4 = X.C26092CsA.A02(r0)
            X.1Fz r3 = r9.$upstream
            X.1G3 r2 = r9.$shared
            java.lang.Object r1 = r9.$initialValue
            X.58T r0 = new X.58T
            r0.<init>(r1, r5, r3, r2)
            r9.label = r7
            java.lang.Object r0 = X.C88604aC.A00(r9, r0, r4)
            goto L_0x002a
        L_0x006e:
            X.C30691eM.A01(r10)
        L_0x0071:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass58U.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AnonymousClass58U) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
