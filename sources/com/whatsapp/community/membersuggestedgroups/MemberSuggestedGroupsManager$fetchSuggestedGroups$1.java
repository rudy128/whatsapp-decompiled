package com.whatsapp.community.membersuggestedgroups;

import X.AnonymousClass000;
import X.AnonymousClass1EC;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager$fetchSuggestedGroups$1", f = "MemberSuggestedGroupsManager.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
public final class MemberSuggestedGroupsManager$fetchSuggestedGroups$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1EC $hintGroupJid;
    public final /* synthetic */ AnonymousClass1EC $parentGroupJid;
    public int label;
    public final /* synthetic */ MemberSuggestedGroupsManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemberSuggestedGroupsManager$fetchSuggestedGroups$1(MemberSuggestedGroupsManager memberSuggestedGroupsManager, AnonymousClass1EC r3, AnonymousClass1EC r4, C30391dr r5) {
        super(2, r5);
        this.this$0 = memberSuggestedGroupsManager;
        this.$parentGroupJid = r3;
        this.$hintGroupJid = r4;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new MemberSuggestedGroupsManager$fetchSuggestedGroups$1(this.this$0, this.$parentGroupJid, this.$hintGroupJid, r6);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            MemberSuggestedGroupsManager memberSuggestedGroupsManager = this.this$0;
            AnonymousClass1EC r1 = this.$parentGroupJid;
            AnonymousClass1EC r0 = this.$hintGroupJid;
            this.label = 1;
            if (MemberSuggestedGroupsManager.A00(memberSuggestedGroupsManager, r1, r0, this) == r4) {
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
        return ((MemberSuggestedGroupsManager$fetchSuggestedGroups$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
