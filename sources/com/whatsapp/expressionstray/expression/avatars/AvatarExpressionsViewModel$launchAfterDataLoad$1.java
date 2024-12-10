package com.whatsapp.expressionstray.expression.avatars;

import X.AnonymousClass1OS;
import X.C22821Di;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsViewModel$launchAfterDataLoad$1", f = "AvatarExpressionsViewModel.kt", i = {}, l = {432, 433}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarExpressionsViewModel$launchAfterDataLoad$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C22821Di $block;
    public int label;
    public final /* synthetic */ AvatarExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarExpressionsViewModel$launchAfterDataLoad$1(AvatarExpressionsViewModel avatarExpressionsViewModel, C30391dr r3, C22821Di r4) {
        super(2, r3);
        this.this$0 = avatarExpressionsViewModel;
        this.$block = r4;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new AvatarExpressionsViewModel$launchAfterDataLoad$1(this.this$0, r5, this.$block);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r4.label
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r1) goto L_0x0022
            if (r0 != r2) goto L_0x0030
            X.C30691eM.A01(r5)
        L_0x000f:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0012:
            X.C30691eM.A01(r5)
            com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsViewModel r0 = r4.this$0
            X.5cY r0 = r0.A0H
            r4.label = r1
            java.lang.Object r0 = r0.BCp(r4)
            if (r0 != r3) goto L_0x0025
            return r3
        L_0x0022:
            X.C30691eM.A01(r5)
        L_0x0025:
            X.1Di r0 = r4.$block
            r4.label = r2
            java.lang.Object r0 = r0.invoke(r4)
            if (r0 != r3) goto L_0x000f
            return r3
        L_0x0030:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsViewModel$launchAfterDataLoad$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarExpressionsViewModel$launchAfterDataLoad$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
