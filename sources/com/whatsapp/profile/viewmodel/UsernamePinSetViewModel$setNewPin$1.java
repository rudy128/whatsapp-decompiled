package com.whatsapp.profile.viewmodel;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.profile.viewmodel.UsernamePinSetViewModel$setNewPin$1", f = "UsernamePinSetViewModel.kt", i = {1}, l = {65, 66}, m = "invokeSuspend", n = {"success"}, s = {"Z$0"})
public final class UsernamePinSetViewModel$setNewPin$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $usernamePin;
    public boolean Z$0;
    public int label;
    public final /* synthetic */ UsernamePinSetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsernamePinSetViewModel$setNewPin$1(UsernamePinSetViewModel usernamePinSetViewModel, String str, C30391dr r4) {
        super(2, r4);
        this.this$0 = usernamePinSetViewModel;
        this.$usernamePin = str;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new UsernamePinSetViewModel$setNewPin$1(this.this$0, this.$usernamePin, r5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0026
            if (r0 == r2) goto L_0x0038
            if (r0 != r3) goto L_0x0050
            boolean r2 = r5.Z$0
            X.C30691eM.A01(r6)
        L_0x0011:
            if (r2 != 0) goto L_0x0023
            com.whatsapp.profile.viewmodel.UsernamePinSetViewModel r0 = r5.this$0
            X.1G4 r2 = r0.A07
            X.118 r1 = r0.A01
            r0 = 2131895783(0x7f1225e7, float:1.9426409E38)
            java.lang.String r0 = r1.A01(r0)
            r2.setValue(r0)
        L_0x0023:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0026:
            X.C30691eM.A01(r6)
            com.whatsapp.profile.viewmodel.UsernamePinSetViewModel r0 = r5.this$0
            X.4Wm r1 = r0.A02
            java.lang.String r0 = r5.$usernamePin
            r5.label = r2
            java.lang.Object r6 = X.C87674Wm.A00(r1, r0, r5)
            if (r6 != r4) goto L_0x003b
            return r4
        L_0x0038:
            X.C30691eM.A01(r6)
        L_0x003b:
            boolean r2 = X.AnonymousClass000.A1Y(r6)
            com.whatsapp.profile.viewmodel.UsernamePinSetViewModel r0 = r5.this$0
            X.1G4 r1 = r0.A06
            X.9I3 r0 = X.AnonymousClass9I3.ENABLED
            r5.Z$0 = r2
            r5.label = r3
            java.lang.Object r0 = r1.BJt(r0, r5)
            if (r0 != r4) goto L_0x0011
            return r4
        L_0x0050:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.profile.viewmodel.UsernamePinSetViewModel$setNewPin$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((UsernamePinSetViewModel$setNewPin$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
