package com.whatsapp.community;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass1b2;
import X.AnonymousClass1b3;
import X.C106355Vn;
import X.C27621Wu;
import X.C29431cG;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import java.util.Collection;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.CommunityMembersViewModel$contactObserver$1$onContactsStateChanged$1", f = "CommunityMembersViewModel.kt", i = {}, l = {168}, m = "invokeSuspend", n = {}, s = {})
public final class CommunityMembersViewModel$contactObserver$1$onContactsStateChanged$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Collection $contactsChanged;
    public int label;
    public final /* synthetic */ CommunityMembersViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommunityMembersViewModel$contactObserver$1$onContactsStateChanged$1(CommunityMembersViewModel communityMembersViewModel, Collection collection, C30391dr r4) {
        super(2, r4);
        this.this$0 = communityMembersViewModel;
        this.$contactsChanged = collection;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new CommunityMembersViewModel$contactObserver$1$onContactsStateChanged$1(this.this$0, this.$contactsChanged, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            CommunityMembersViewModel communityMembersViewModel = this.this$0;
            AnonymousClass1b3 A0C = AnonymousClass1b2.A0C(C106355Vn.A00, C29431cG.A0V(this.$contactsChanged));
            this.label = 1;
            if (CommunityMembersViewModel.A00(communityMembersViewModel, this, A0C, false) == r4) {
                return r4;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CommunityMembersViewModel$contactObserver$1$onContactsStateChanged$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
