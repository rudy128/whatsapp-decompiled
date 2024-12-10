package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", i = {}, l = {213, 213}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.5AH  reason: invalid class name */
public final class AnonymousClass5AH extends C30431dv implements C36001nB {
    public final /* synthetic */ AnonymousClass1OS $transform;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5AH(C30391dr r2, AnonymousClass1OS r3) {
        super(3, r2);
        this.$transform = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        AnonymousClass5AH r1 = new AnonymousClass5AH((C30391dr) obj3, this.$transform);
        r1.L$0 = obj;
        r1.L$1 = obj2;
        return r1.invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r3) goto L_0x0028
            if (r0 != r4) goto L_0x003b
            X.C30691eM.A01(r7)
        L_0x000f:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0012:
            X.C30691eM.A01(r7)
            java.lang.Object r2 = r6.L$0
            X.1G2 r2 = (X.AnonymousClass1G2) r2
            java.lang.Object r1 = r6.L$1
            X.1OS r0 = r6.$transform
            r6.L$0 = r2
            r6.label = r3
            java.lang.Object r7 = r0.invoke(r1, r6)
            if (r7 != r5) goto L_0x002f
            return r5
        L_0x0028:
            java.lang.Object r2 = r6.L$0
            X.1G2 r2 = (X.AnonymousClass1G2) r2
            X.C30691eM.A01(r7)
        L_0x002f:
            r0 = 0
            r6.L$0 = r0
            r6.label = r4
            java.lang.Object r0 = r2.BJt(r7, r6)
            if (r0 != r5) goto L_0x000f
            return r5
        L_0x003b:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5AH.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
