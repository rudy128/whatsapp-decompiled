package com.whatsapp.community.membersuggestedgroups;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3Ma;
import X.C23421Fz;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C99614tB;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity$setupNotifications$1", f = "MemberSuggestedGroupsManagementActivity.kt", i = {}, l = {365}, m = "invokeSuspend", n = {}, s = {})
public final class MemberSuggestedGroupsManagementActivity$setupNotifications$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ MemberSuggestedGroupsManagementActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemberSuggestedGroupsManagementActivity$setupNotifications$1(MemberSuggestedGroupsManagementActivity memberSuggestedGroupsManagementActivity, C30391dr r3) {
        super(2, r3);
        this.this$0 = memberSuggestedGroupsManagementActivity;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new MemberSuggestedGroupsManagementActivity$setupNotifications$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new MemberSuggestedGroupsManagementActivity$setupNotifications$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C23421Fz r2 = AnonymousClass3Ma.A0Q(this.this$0).A09;
            C99614tB A00 = C99614tB.A00(this.this$0, 5);
            this.label = 1;
            if (r2.BFC(this, A00) == r4) {
                return r4;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
