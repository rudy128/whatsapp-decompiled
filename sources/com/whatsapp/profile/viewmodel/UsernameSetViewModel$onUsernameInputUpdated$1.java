package com.whatsapp.profile.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C108425bg;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C62882s9;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.profile.viewmodel.UsernameSetViewModel$onUsernameInputUpdated$1", f = "UsernameSetViewModel.kt", i = {}, l = {170}, m = "invokeSuspend", n = {}, s = {})
public final class UsernameSetViewModel$onUsernameInputUpdated$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $username;
    public int label;
    public final /* synthetic */ UsernameSetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsernameSetViewModel$onUsernameInputUpdated$1(UsernameSetViewModel usernameSetViewModel, String str, C30391dr r4) {
        super(2, r4);
        this.this$0 = usernameSetViewModel;
        this.$username = str;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new UsernameSetViewModel$onUsernameInputUpdated$1(this.this$0, this.$username, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            this.label = 1;
            if (C62882s9.A00(this, 600) == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        ((C108425bg) this.this$0.A07.get()).BEl(this.this$0, this.$username);
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((UsernameSetViewModel$onUsernameInputUpdated$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
