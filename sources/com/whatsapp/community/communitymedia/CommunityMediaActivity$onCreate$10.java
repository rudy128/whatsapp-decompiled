package com.whatsapp.community.communitymedia;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3Ma;
import X.C23421Fz;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C99624tC;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.communitymedia.CommunityMediaActivity$onCreate$10", f = "CommunityMediaActivity.kt", i = {}, l = {205}, m = "invokeSuspend", n = {}, s = {})
public final class CommunityMediaActivity$onCreate$10 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ CommunityMediaActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommunityMediaActivity$onCreate$10(CommunityMediaActivity communityMediaActivity, C30391dr r3) {
        super(2, r3);
        this.this$0 = communityMediaActivity;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new CommunityMediaActivity$onCreate$10(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CommunityMediaActivity$onCreate$10(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C23421Fz r2 = AnonymousClass3Ma.A0R(this.this$0).A0k;
            C99624tC A00 = C99624tC.A00(this.this$0, 41);
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
