package com.whatsapp.community;

import X.AnonymousClass000;
import X.AnonymousClass1D6;
import X.AnonymousClass1OS;
import X.C108485bm;
import X.C27621Wu;
import X.C29431cG;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C73303Uh;
import com.whatsapp.jid.GroupJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.ReviewGroupsPermissionsBeforeLinkViewModel$handleGroupVisibilityClick$1", f = "ReviewGroupsPermissionsBeforeLinkViewModel.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
public final class ReviewGroupsPermissionsBeforeLinkViewModel$handleGroupVisibilityClick$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ GroupJid $groupJid;
    public int label;
    public final /* synthetic */ C73303Uh this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReviewGroupsPermissionsBeforeLinkViewModel$handleGroupVisibilityClick$1(C73303Uh r2, GroupJid groupJid, C30391dr r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$groupJid = groupJid;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ReviewGroupsPermissionsBeforeLinkViewModel$handleGroupVisibilityClick$1(this.this$0, this.$groupJid, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C73303Uh r0 = this.this$0;
            C108485bm r2 = r0.A02;
            GroupJid groupJid = this.$groupJid;
            AnonymousClass1D6 A01 = AnonymousClass1D6.A01(groupJid, Boolean.valueOf(C29431cG.A18(r0.A00, groupJid)));
            this.label = 1;
            if (r2.CHH(A01, this) == r4) {
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
        return ((ReviewGroupsPermissionsBeforeLinkViewModel$handleGroupVisibilityClick$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
