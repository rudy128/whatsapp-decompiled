package com.whatsapp.community.membersuggestedgroups;

import X.AnonymousClass000;
import X.C22821Di;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$subgroupAction$2", f = "MemberSuggestedGroupsManagementViewModel.kt", i = {}, l = {405}, m = "invokeSuspend", n = {}, s = {})
public final class MemberSuggestedGroupsManagementViewModel$subgroupAction$2 extends C30431dv implements C22821Di {
    public final /* synthetic */ C22821Di $networkCall;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemberSuggestedGroupsManagementViewModel$subgroupAction$2(C30391dr r2, C22821Di r3) {
        super(1, r2);
        this.$networkCall = r3;
    }

    public final C30391dr create(C30391dr r3) {
        return new MemberSuggestedGroupsManagementViewModel$subgroupAction$2(r3, this.$networkCall);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new MemberSuggestedGroupsManagementViewModel$subgroupAction$2((C30391dr) obj, this.$networkCall).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C22821Di r0 = this.$networkCall;
            this.label = 1;
            obj = r0.invoke(this);
            if (obj == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }
}
