package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", i = {1, 2, 3}, l = {174, 176, 178, 179, 181}, m = "invokeSuspend", n = {"$this$transformLatest", "$this$transformLatest", "$this$transformLatest"}, s = {"L$0", "L$0", "L$0"})
/* renamed from: X.5AN  reason: invalid class name */
public final class AnonymousClass5AN extends C30431dv implements C36001nB {
    public /* synthetic */ int I$0;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C99654tF this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5AN(C30391dr r2, C99654tF r3) {
        super(3, r2);
        this.this$0 = r3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0052 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0069 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r8.label
            r4 = 5
            r6 = 4
            r7 = 3
            r5 = 2
            r1 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r1) goto L_0x007d
            if (r0 == r5) goto L_0x003f
            if (r0 == r7) goto L_0x0053
            if (r0 == r6) goto L_0x006a
            if (r0 == r4) goto L_0x007d
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x001a:
            X.C30691eM.A01(r9)
            java.lang.Object r3 = r8.L$0
            X.1G2 r3 = (X.AnonymousClass1G2) r3
            int r0 = r8.I$0
            if (r0 <= 0) goto L_0x0030
            X.4D2 r0 = X.AnonymousClass4D2.START
            r8.label = r1
            java.lang.Object r0 = r3.BJt(r0, r8)
        L_0x002d:
            if (r0 != r2) goto L_0x0080
            return r2
        L_0x0030:
            X.4tF r0 = r8.this$0
            long r0 = r0.A00
            r8.L$0 = r3
            r8.label = r5
            java.lang.Object r0 = X.C62882s9.A00(r8, r0)
            if (r0 != r2) goto L_0x0046
            return r2
        L_0x003f:
            java.lang.Object r3 = r8.L$0
            X.1G2 r3 = (X.AnonymousClass1G2) r3
            X.C30691eM.A01(r9)
        L_0x0046:
            X.4D2 r0 = X.AnonymousClass4D2.STOP
            r8.L$0 = r3
            r8.label = r7
            java.lang.Object r0 = r3.BJt(r0, r8)
            if (r0 != r2) goto L_0x005a
            return r2
        L_0x0053:
            java.lang.Object r3 = r8.L$0
            X.1G2 r3 = (X.AnonymousClass1G2) r3
            X.C30691eM.A01(r9)
        L_0x005a:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r8.L$0 = r3
            r8.label = r6
            java.lang.Object r0 = X.C62882s9.A00(r8, r0)
            if (r0 != r2) goto L_0x0071
            return r2
        L_0x006a:
            java.lang.Object r3 = r8.L$0
            X.1G2 r3 = (X.AnonymousClass1G2) r3
            X.C30691eM.A01(r9)
        L_0x0071:
            X.4D2 r1 = X.AnonymousClass4D2.STOP_AND_RESET_REPLAY_CACHE
            r0 = 0
            r8.L$0 = r0
            r8.label = r4
            java.lang.Object r0 = r3.BJt(r1, r8)
            goto L_0x002d
        L_0x007d:
            X.C30691eM.A01(r9)
        L_0x0080:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5AN.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int A0M = AnonymousClass000.A0M(obj2);
        AnonymousClass5AN r1 = new AnonymousClass5AN((C30391dr) obj3, this.this$0);
        r1.L$0 = obj;
        r1.I$0 = A0M;
        return r1.invokeSuspend(C27621Wu.A00);
    }
}
