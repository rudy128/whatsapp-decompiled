package com.whatsapp.usercontrol.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass1PM;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C42741yf;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.usercontrol.viewmodel.UserControlStopResumeViewModel$buildFragmentConfig$verifiedName$1", f = "UserControlStopResumeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class UserControlStopResumeViewModel$buildFragmentConfig$verifiedName$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ UserControlStopResumeViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserControlStopResumeViewModel$buildFragmentConfig$verifiedName$1(UserControlStopResumeViewModel userControlStopResumeViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = userControlStopResumeViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new UserControlStopResumeViewModel$buildFragmentConfig$verifiedName$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new UserControlStopResumeViewModel$buildFragmentConfig$verifiedName$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            UserControlStopResumeViewModel userControlStopResumeViewModel = this.this$0;
            C42741yf A01 = ((AnonymousClass1PM) userControlStopResumeViewModel.A09.get()).A01(userControlStopResumeViewModel.A00);
            if (A01 != null) {
                return A01.A08;
            }
            return null;
        }
        throw AnonymousClass000.A0l();
    }
}
