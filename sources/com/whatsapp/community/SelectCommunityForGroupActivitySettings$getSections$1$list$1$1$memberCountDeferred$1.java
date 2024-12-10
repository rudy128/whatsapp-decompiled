package com.whatsapp.community;

import X.AnonymousClass000;
import X.AnonymousClass1EC;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C32101gd;
import X.C77073pJ;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.SelectCommunityForGroupActivitySettings$getSections$1$list$1$1$memberCountDeferred$1", f = "SelectCommunityForGroupActivitySettings.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SelectCommunityForGroupActivitySettings$getSections$1$list$1$1$memberCountDeferred$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1EC $communityJid;
    public int label;
    public final /* synthetic */ C77073pJ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectCommunityForGroupActivitySettings$getSections$1$list$1$1$memberCountDeferred$1(C77073pJ r2, AnonymousClass1EC r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$communityJid = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new SelectCommunityForGroupActivitySettings$getSections$1$list$1$1$memberCountDeferred$1(this.this$0, this.$communityJid, r5);
    }

    public final Object invokeSuspend(Object obj) {
        int i;
        if (this.label == 0) {
            C30691eM.A01(obj);
            C32101gd r2 = this.this$0.A02;
            if (r2 != null) {
                AnonymousClass1EC r1 = this.$communityJid;
                CommunityMembersDirectory communityMembersDirectory = (CommunityMembersDirectory) r2;
                C18070vi.A0d(r1, 0);
                AnonymousClass1EC A04 = AnonymousClass3MW.A0Z(communityMembersDirectory.A09).A04(r1);
                if (A04 != null) {
                    i = communityMembersDirectory.A06.A08.A0B(A04).A0B().size();
                } else {
                    i = 0;
                }
                return AnonymousClass3MW.A0v(i);
            }
            C18070vi.A11("communityMembersManager");
            throw null;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SelectCommunityForGroupActivitySettings$getSections$1$list$1$1$memberCountDeferred$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
