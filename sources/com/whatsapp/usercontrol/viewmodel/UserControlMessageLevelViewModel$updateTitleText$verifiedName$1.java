package com.whatsapp.usercontrol.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel$updateTitleText$verifiedName$1", f = "UserControlMessageLevelViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class UserControlMessageLevelViewModel$updateTitleText$verifiedName$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ UserJid $userJid;
    public int label;
    public final /* synthetic */ UserControlMessageLevelViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserControlMessageLevelViewModel$updateTitleText$verifiedName$1(UserJid userJid, UserControlMessageLevelViewModel userControlMessageLevelViewModel, C30391dr r4) {
        super(2, r4);
        this.this$0 = userControlMessageLevelViewModel;
        this.$userJid = userJid;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new UserControlMessageLevelViewModel$updateTitleText$verifiedName$1(this.$userJid, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            return UserControlMessageLevelViewModel.A03(this.$userJid, this.this$0);
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((UserControlMessageLevelViewModel$updateTitleText$verifiedName$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
