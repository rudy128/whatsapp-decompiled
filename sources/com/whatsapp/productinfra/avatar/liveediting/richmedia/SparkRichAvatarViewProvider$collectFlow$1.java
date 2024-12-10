package com.whatsapp.productinfra.avatar.liveediting.richmedia;

import X.AnonymousClass1OS;
import X.C26027Cql;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.liveediting.richmedia.SparkRichAvatarViewProvider$collectFlow$1", f = "SparkRichAvatarViewProvider.kt", i = {0}, l = {242, 244}, m = "invokeSuspend", n = {"$this$onStart"}, s = {"L$0"})
public final class SparkRichAvatarViewProvider$collectFlow$1 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ C26027Cql this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SparkRichAvatarViewProvider$collectFlow$1(C26027Cql cql, C30391dr r3) {
        super(2, r3);
        this.this$0 = cql;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        SparkRichAvatarViewProvider$collectFlow$1 sparkRichAvatarViewProvider$collectFlow$1 = new SparkRichAvatarViewProvider$collectFlow$1(this.this$0, r4);
        sparkRichAvatarViewProvider$collectFlow$1.L$0 = obj;
        return sparkRichAvatarViewProvider$collectFlow$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r3) goto L_0x0031
            if (r0 != r4) goto L_0x004c
            X.C30691eM.A01(r7)
        L_0x000f:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0012:
            X.C30691eM.A01(r7)
            java.lang.Object r2 = r6.L$0
            X.1G2 r2 = (X.AnonymousClass1G2) r2
            X.Cql r0 = r6.this$0
            X.Bz4 r1 = r0.A01
            if (r1 == 0) goto L_0x0038
            X.BRF r0 = new X.BRF
            r0.<init>(r1)
            r6.L$0 = r2
            r6.L$1 = r0
            r6.label = r3
            java.lang.Object r0 = r2.BJt(r0, r6)
            if (r0 != r5) goto L_0x0038
            return r5
        L_0x0031:
            java.lang.Object r2 = r6.L$0
            X.1G2 r2 = (X.AnonymousClass1G2) r2
            X.C30691eM.A01(r7)
        L_0x0038:
            X.Cql r0 = r6.this$0
            X.BRG r1 = r0.A03
            if (r1 == 0) goto L_0x000f
            r6.L$0 = r1
            r0 = 0
            r6.L$1 = r0
            r6.label = r4
            java.lang.Object r0 = r2.BJt(r1, r6)
            if (r0 != r5) goto L_0x000f
            return r5
        L_0x004c:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.productinfra.avatar.liveediting.richmedia.SparkRichAvatarViewProvider$collectFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SparkRichAvatarViewProvider$collectFlow$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
