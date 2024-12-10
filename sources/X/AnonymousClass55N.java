package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$1", f = "Delay.kt", i = {0, 1, 2}, l = {307, 309, 310}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$0"})
/* renamed from: X.55N  reason: invalid class name */
public final class AnonymousClass55N extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ long $delayMillis;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass55N(C30391dr r2, long j) {
        super(2, r2);
        this.$delayMillis = j;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        AnonymousClass55N r0 = new AnonymousClass55N(r5, this.$delayMillis);
        r0.L$0 = obj;
        return r0;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0027 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b A[RETURN] */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.1g4 r6 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r7.label
            r5 = 3
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0014
            if (r0 == r3) goto L_0x0028
            if (r0 == r4) goto L_0x003c
            if (r0 == r5) goto L_0x0028
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0014:
            X.C30691eM.A01(r8)
            java.lang.Object r2 = r7.L$0
            X.5bn r2 = (X.C108495bn) r2
            long r0 = r7.$delayMillis
            r7.L$0 = r2
            r7.label = r3
        L_0x0021:
            java.lang.Object r0 = X.C62882s9.A00(r7, r0)
            if (r0 != r6) goto L_0x002f
            return r6
        L_0x0028:
            java.lang.Object r2 = r7.L$0
            X.5bn r2 = (X.C108495bn) r2
            X.C30691eM.A01(r8)
        L_0x002f:
            X.1Wu r0 = X.C27621Wu.A00
            r7.L$0 = r2
            r7.label = r4
            java.lang.Object r0 = r2.CHH(r0, r7)
            if (r0 != r6) goto L_0x0043
            return r6
        L_0x003c:
            java.lang.Object r2 = r7.L$0
            X.5bn r2 = (X.C108495bn) r2
            X.C30691eM.A01(r8)
        L_0x0043:
            long r0 = r7.$delayMillis
            r7.L$0 = r2
            r7.label = r5
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass55N.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AnonymousClass55N) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
