package com.whatsapp.productinfra.avatar.liveediting.network;

import X.AnonymousClass1OS;
import X.C25067CVz;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.liveediting.network.AvatarLiveEditingConnectivityResolver$connectivityStateChanges$1", f = "AvatarLiveEditingConnectivityResolver.kt", i = {0, 0}, l = {54, 55}, m = "invokeSuspend", n = {"$this$callbackFlow", "observer"}, s = {"L$0", "L$1"})
public final class AvatarLiveEditingConnectivityResolver$connectivityStateChanges$1 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ C25067CVz this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarLiveEditingConnectivityResolver$connectivityStateChanges$1(C25067CVz cVz, C30391dr r3) {
        super(2, r3);
        this.this$0 = cVz;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        AvatarLiveEditingConnectivityResolver$connectivityStateChanges$1 avatarLiveEditingConnectivityResolver$connectivityStateChanges$1 = new AvatarLiveEditingConnectivityResolver$connectivityStateChanges$1(this.this$0, r4);
        avatarLiveEditingConnectivityResolver$connectivityStateChanges$1.L$0 = obj;
        return avatarLiveEditingConnectivityResolver$connectivityStateChanges$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x006a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r7.label
            r5 = 2
            r6 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r6) goto L_0x004b
            if (r0 != r5) goto L_0x006b
            X.C30691eM.A01(r8)
        L_0x000f:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0012:
            X.C30691eM.A01(r8)
            java.lang.Object r3 = r7.L$0
            X.5bl r3 = (X.C108475bl) r3
            X.7Dg r2 = new X.7Dg
            r2.<init>(r3, r6)
            X.CVz r0 = r7.this$0
            X.11E r0 = r0.A00
            r0.registerObserver(r2)
            X.CVz r0 = r7.this$0
            X.11E r0 = r0.A00
            X.2mn r0 = r0.A05()
            if (r0 == 0) goto L_0x0049
            X.1LR r0 = r0.A01
            if (r0 == 0) goto L_0x0049
            int r1 = X.AnonymousClass1SL.A00(r0)
        L_0x0037:
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
            r7.L$0 = r3
            r7.L$1 = r2
            r7.label = r6
            java.lang.Object r0 = r3.CHH(r0, r7)
            if (r0 != r4) goto L_0x0056
            return r4
        L_0x0049:
            r1 = 5
            goto L_0x0037
        L_0x004b:
            java.lang.Object r2 = r7.L$1
            X.11J r2 = (X.AnonymousClass11J) r2
            java.lang.Object r3 = r7.L$0
            X.5bl r3 = (X.C108475bl) r3
            X.C30691eM.A01(r8)
        L_0x0056:
            X.CVz r0 = r7.this$0
            X.DmU r1 = new X.DmU
            r1.<init>(r2, r0)
            r0 = 0
            r7.L$0 = r0
            r7.L$1 = r0
            r7.label = r5
            java.lang.Object r0 = X.AnonymousClass4W9.A00(r7, r1, r3)
            if (r0 != r4) goto L_0x000f
            return r4
        L_0x006b:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.productinfra.avatar.liveediting.network.AvatarLiveEditingConnectivityResolver$connectivityStateChanges$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarLiveEditingConnectivityResolver$connectivityStateChanges$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
