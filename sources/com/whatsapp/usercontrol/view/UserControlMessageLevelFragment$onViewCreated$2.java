package com.whatsapp.usercontrol.view;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.usercontrol.view.UserControlMessageLevelFragment$onViewCreated$2", f = "UserControlMessageLevelFragment.kt", i = {}, l = {46, 47}, m = "invokeSuspend", n = {}, s = {})
public final class UserControlMessageLevelFragment$onViewCreated$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ UserControlMessageLevelFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserControlMessageLevelFragment$onViewCreated$2(UserControlMessageLevelFragment userControlMessageLevelFragment, C30391dr r3) {
        super(2, r3);
        this.this$0 = userControlMessageLevelFragment;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new UserControlMessageLevelFragment$onViewCreated$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new UserControlMessageLevelFragment$onViewCreated$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0041 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r2) goto L_0x002a
            if (r0 != r3) goto L_0x0042
            X.C30691eM.A01(r6)
        L_0x000f:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0012:
            X.C30691eM.A01(r6)
            com.whatsapp.usercontrol.view.UserControlMessageLevelFragment r0 = r5.this$0
            com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel r1 = X.C108965cb.A0e(r0)
            com.whatsapp.usercontrol.view.UserControlMessageLevelFragment r0 = r5.this$0
            android.content.Context r0 = r0.A14()
            r5.label = r2
            java.lang.Object r0 = r1.A0V(r0, r5)
            if (r0 != r4) goto L_0x002d
            return r4
        L_0x002a:
            X.C30691eM.A01(r6)
        L_0x002d:
            com.whatsapp.usercontrol.view.UserControlMessageLevelFragment r0 = r5.this$0
            com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel r1 = X.C108965cb.A0e(r0)
            com.whatsapp.usercontrol.view.UserControlMessageLevelFragment r0 = r5.this$0
            android.content.Context r0 = r0.A14()
            r5.label = r3
            java.lang.Object r0 = r1.A0U(r0, r5)
            if (r0 != r4) goto L_0x000f
            return r4
        L_0x0042:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.usercontrol.view.UserControlMessageLevelFragment$onViewCreated$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
