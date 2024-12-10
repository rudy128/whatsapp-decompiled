package com.whatsapp.profile.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C87674Wm;
import X.C98034qT;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.profile.viewmodel.UsernamePinSetViewModel$fetchPin$1$1", f = "UsernamePinSetViewModel.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
public final class UsernamePinSetViewModel$fetchPin$1$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ UsernamePinSetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsernamePinSetViewModel$fetchPin$1$1(UsernamePinSetViewModel usernamePinSetViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = usernamePinSetViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new UsernamePinSetViewModel$fetchPin$1$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new UsernamePinSetViewModel$fetchPin$1$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C87674Wm r0 = this.this$0.A02;
            this.label = 1;
            r0.A01.Bb8(new C98034qT());
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
