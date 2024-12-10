package com.whatsapp.community;

import X.AnonymousClass000;
import X.AnonymousClass1EC;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.CommunityMembersDirectory$getCommunityContacts$1", f = "CommunityMembersDirectory.kt", i = {}, l = {335}, m = "invokeSuspend", n = {}, s = {})
public final class CommunityMembersDirectory$getCommunityContacts$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1EC $linkedParentGroupJid;
    public int label;
    public final /* synthetic */ CommunityMembersDirectory this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommunityMembersDirectory$getCommunityContacts$1(CommunityMembersDirectory communityMembersDirectory, AnonymousClass1EC r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = communityMembersDirectory;
        this.$linkedParentGroupJid = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new CommunityMembersDirectory$getCommunityContacts$1(this.this$0, this.$linkedParentGroupJid, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            CommunityMembersDirectory communityMembersDirectory = this.this$0;
            AnonymousClass1EC r3 = this.$linkedParentGroupJid;
            this.label = 1;
            obj = C30451dy.A00(this, communityMembersDirectory.A0E, new CommunityMembersDirectory$getCommunityContacts$3(communityMembersDirectory, r3, (C30391dr) null));
            if (obj == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CommunityMembersDirectory$getCommunityContacts$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
