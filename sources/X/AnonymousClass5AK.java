package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2", f = "Zip.kt", i = {}, l = {329, 258}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.5AK  reason: invalid class name */
public final class AnonymousClass5AK extends C30431dv implements C36001nB {
    public final /* synthetic */ AnonymousClass20I $transform$inlined;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5AK(C30391dr r2, AnonymousClass20I r3) {
        super(3, r2);
        this.$transform$inlined = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        AnonymousClass5AK r1 = new AnonymousClass5AK((C30391dr) obj3, this.$transform$inlined);
        r1.L$0 = obj;
        r1.L$1 = obj2;
        return r1.invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0049 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r12.label
            r4 = 2
            r5 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r5) goto L_0x0037
            if (r0 != r4) goto L_0x004a
            X.C30691eM.A01(r13)
        L_0x000f:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0012:
            X.C30691eM.A01(r13)
            java.lang.Object r2 = r12.L$0
            X.1G2 r2 = (X.AnonymousClass1G2) r2
            java.lang.Object r1 = r12.L$1
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            X.20I r6 = r12.$transform$inlined
            r0 = 0
            r7 = r1[r0]
            r8 = r1[r5]
            r9 = r1[r4]
            r0 = 3
            r10 = r1[r0]
            r0 = 4
            r11 = r1[r0]
            r12.L$0 = r2
            r12.label = r5
            java.lang.Object r13 = r6.invoke(r7, r8, r9, r10, r11, r12)
            if (r13 != r3) goto L_0x003e
            return r3
        L_0x0037:
            java.lang.Object r2 = r12.L$0
            X.1G2 r2 = (X.AnonymousClass1G2) r2
            X.C30691eM.A01(r13)
        L_0x003e:
            r0 = 0
            r12.L$0 = r0
            r12.label = r4
            java.lang.Object r0 = r2.BJt(r13, r12)
            if (r0 != r3) goto L_0x000f
            return r3
        L_0x004a:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5AK.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
