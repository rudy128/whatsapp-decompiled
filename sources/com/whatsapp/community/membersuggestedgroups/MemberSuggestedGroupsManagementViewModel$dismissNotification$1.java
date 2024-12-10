package com.whatsapp.community.membersuggestedgroups;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C108485bm;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C77323pq;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$dismissNotification$1", f = "MemberSuggestedGroupsManagementViewModel.kt", i = {}, l = {274}, m = "invokeSuspend", n = {}, s = {})
public final class MemberSuggestedGroupsManagementViewModel$dismissNotification$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ MemberSuggestedGroupsManagementViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemberSuggestedGroupsManagementViewModel$dismissNotification$1(MemberSuggestedGroupsManagementViewModel memberSuggestedGroupsManagementViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = memberSuggestedGroupsManagementViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new MemberSuggestedGroupsManagementViewModel$dismissNotification$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new MemberSuggestedGroupsManagementViewModel$dismissNotification$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C108485bm r1 = this.this$0.A08;
            C77323pq r0 = C77323pq.A00;
            this.label = 1;
            if (r1.CHH(r0, this) == r3) {
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
