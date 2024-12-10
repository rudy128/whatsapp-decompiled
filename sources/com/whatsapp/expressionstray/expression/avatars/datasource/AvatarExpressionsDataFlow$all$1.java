package com.whatsapp.expressionstray.expression.avatars.datasource;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.avatars.datasource.AvatarExpressionsDataFlow$all$1", f = "AvatarExpressionsDataFlow.kt", i = {0}, l = {109, 111, 115}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
public final class AvatarExpressionsDataFlow$all$1 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AvatarExpressionsDataFlow this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarExpressionsDataFlow$all$1(AvatarExpressionsDataFlow avatarExpressionsDataFlow, C30391dr r3) {
        super(2, r3);
        this.this$0 = avatarExpressionsDataFlow;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        AvatarExpressionsDataFlow$all$1 avatarExpressionsDataFlow$all$1 = new AvatarExpressionsDataFlow$all$1(this.this$0, r4);
        avatarExpressionsDataFlow$all$1.L$0 = obj;
        return avatarExpressionsDataFlow$all$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x006e A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.1g4 r6 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r9.label
            r7 = 0
            r5 = 3
            r4 = 2
            r8 = 1
            if (r0 == 0) goto L_0x0015
            if (r0 == r8) goto L_0x0046
            if (r0 == r4) goto L_0x006f
            if (r0 == r5) goto L_0x006f
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0015:
            X.C30691eM.A01(r10)
            java.lang.Object r3 = r9.L$0
            X.1G2 r3 = (X.AnonymousClass1G2) r3
            com.whatsapp.expressionstray.expression.avatars.datasource.AvatarExpressionsDataFlow r0 = r9.this$0
            X.00H r0 = r0.A03
            java.lang.Object r0 = r0.get()
            X.6pK r0 = (X.C133686pK) r0
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0060
            com.whatsapp.expressionstray.expression.avatars.datasource.AvatarExpressionsDataFlow r2 = r9.this$0
            com.whatsapp.expressionstray.expression.avatars.datasource.AvatarExpressionsDataFlow$searchabilityFlow$1 r0 = new com.whatsapp.expressionstray.expression.avatars.datasource.AvatarExpressionsDataFlow$searchabilityFlow$1
            r0.<init>(r2, r7)
            X.5WL r1 = X.AnonymousClass4I4.A00(r0)
            X.0wl r0 = r2.A08
            X.1Fz r0 = X.AnonymousClass4I5.A00(r0, r1)
            r9.L$0 = r3
            r9.label = r8
            java.lang.Object r10 = X.C26067Crh.A03(r9, r0)
            if (r10 != r6) goto L_0x004d
            return r6
        L_0x0046:
            java.lang.Object r3 = r9.L$0
            X.1G2 r3 = (X.AnonymousClass1G2) r3
            X.C30691eM.A01(r10)
        L_0x004d:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            if (r10 == 0) goto L_0x0057
            boolean r0 = r10.booleanValue()
            if (r0 != 0) goto L_0x0060
        L_0x0057:
            java.lang.Boolean r0 = X.AnonymousClass000.A0h()
            r9.L$0 = r7
            r9.label = r4
            goto L_0x0068
        L_0x0060:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            r9.L$0 = r7
            r9.label = r5
        L_0x0068:
            java.lang.Object r0 = r3.BJt(r0, r9)
            if (r0 != r6) goto L_0x0072
            return r6
        L_0x006f:
            X.C30691eM.A01(r10)
        L_0x0072:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.expression.avatars.datasource.AvatarExpressionsDataFlow$all$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarExpressionsDataFlow$all$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
