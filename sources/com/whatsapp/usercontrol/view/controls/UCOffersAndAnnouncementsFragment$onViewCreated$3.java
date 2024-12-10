package com.whatsapp.usercontrol.view.controls;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import android.content.Context;
import com.whatsapp.usercontrol.viewmodel.UserControlStopResumeViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.usercontrol.view.controls.UCOffersAndAnnouncementsFragment$onViewCreated$3", f = "UCOffersAndAnnouncementsFragment.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
public final class UCOffersAndAnnouncementsFragment$onViewCreated$3 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ UCOffersAndAnnouncementsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UCOffersAndAnnouncementsFragment$onViewCreated$3(UCOffersAndAnnouncementsFragment uCOffersAndAnnouncementsFragment, C30391dr r3) {
        super(2, r3);
        this.this$0 = uCOffersAndAnnouncementsFragment;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new UCOffersAndAnnouncementsFragment$onViewCreated$3(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new UCOffersAndAnnouncementsFragment$onViewCreated$3(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            Context A14 = this.this$0.A14();
            this.label = 1;
            if (((UserControlStopResumeViewModel) this.this$0.A05.getValue()).A0T(A14, this) == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
