package com.whatsapp.community;

import X.AnonymousClass000;
import X.AnonymousClass11S;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C99434so;
import com.whatsapp.jid.PhoneUserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.CommunityMembersViewModel$myStatusChangeObserver$1$onAboutMeChanged$1", f = "CommunityMembersViewModel.kt", i = {}, l = {201}, m = "invokeSuspend", n = {}, s = {})
public final class CommunityMembersViewModel$myStatusChangeObserver$1$onAboutMeChanged$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ CommunityMembersViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommunityMembersViewModel$myStatusChangeObserver$1$onAboutMeChanged$1(CommunityMembersViewModel communityMembersViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = communityMembersViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new CommunityMembersViewModel$myStatusChangeObserver$1$onAboutMeChanged$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CommunityMembersViewModel$myStatusChangeObserver$1$onAboutMeChanged$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            CommunityMembersViewModel communityMembersViewModel = this.this$0;
            C99434so r0 = new C99434so(new PhoneUserJid[]{AnonymousClass11S.A00(communityMembersViewModel.A07)}, 3);
            this.label = 1;
            if (CommunityMembersViewModel.A00(communityMembersViewModel, this, r0, false) == r6) {
                return r6;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
