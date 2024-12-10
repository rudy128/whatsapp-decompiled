package com.whatsapp.usercontrol.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C135026rX;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel$updateStopActionTitle$verifiedName$1", f = "UserControlMessageLevelViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class UserControlMessageLevelViewModel$updateStopActionTitle$verifiedName$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ UserControlMessageLevelViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserControlMessageLevelViewModel$updateStopActionTitle$verifiedName$1(UserControlMessageLevelViewModel userControlMessageLevelViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = userControlMessageLevelViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new UserControlMessageLevelViewModel$updateStopActionTitle$verifiedName$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new UserControlMessageLevelViewModel$updateStopActionTitle$verifiedName$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        UserJid userJid;
        if (this.label == 0) {
            C30691eM.A01(obj);
            UserControlMessageLevelViewModel userControlMessageLevelViewModel = this.this$0;
            C135026rX r0 = userControlMessageLevelViewModel.A01;
            if (r0 != null) {
                userJid = r0.A00;
            } else {
                userJid = null;
            }
            return UserControlMessageLevelViewModel.A03(userJid, userControlMessageLevelViewModel);
        }
        throw AnonymousClass000.A0l();
    }
}
