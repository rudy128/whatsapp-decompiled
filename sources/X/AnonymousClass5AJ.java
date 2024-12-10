package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2", f = "Zip.kt", i = {}, l = {329, 258}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.5AJ  reason: invalid class name */
public final class AnonymousClass5AJ extends C30431dv implements C36001nB {
    public final /* synthetic */ AnonymousClass20H $transform$inlined;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5AJ(C30391dr r2, AnonymousClass20H r3) {
        super(3, r2);
        this.$transform$inlined = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        AnonymousClass5AJ r1 = new AnonymousClass5AJ((C30391dr) obj3, this.$transform$inlined);
        r1.L$0 = obj;
        r1.L$1 = obj2;
        return r1.invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0046 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r11.label
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r3) goto L_0x0034
            if (r0 != r4) goto L_0x0047
            X.C30691eM.A01(r12)
        L_0x000f:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0012:
            X.C30691eM.A01(r12)
            java.lang.Object r2 = r11.L$0
            X.1G2 r2 = (X.AnonymousClass1G2) r2
            java.lang.Object r1 = r11.L$1
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            X.20H r6 = r11.$transform$inlined
            r0 = 0
            r7 = r1[r0]
            r8 = r1[r3]
            r9 = r1[r4]
            r0 = 3
            r10 = r1[r0]
            r11.L$0 = r2
            r11.label = r3
            java.lang.Object r12 = r6.invoke(r7, r8, r9, r10, r11)
            if (r12 != r5) goto L_0x003b
            return r5
        L_0x0034:
            java.lang.Object r2 = r11.L$0
            X.1G2 r2 = (X.AnonymousClass1G2) r2
            X.C30691eM.A01(r12)
        L_0x003b:
            r0 = 0
            r11.L$0 = r0
            r11.label = r4
            java.lang.Object r0 = r2.BJt(r12, r11)
            if (r0 != r5) goto L_0x000f
            return r5
        L_0x0047:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5AJ.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
