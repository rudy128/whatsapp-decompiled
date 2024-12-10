package com.whatsapp.conversation.conversationrow.components.contextcard;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.C111145iQ;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C72453Mb;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.components.contextcard.InviteViaLinkButtonViewModel$refreshButtonVisibilityAsync$1", f = "InviteViaLinkButtonViewModel.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
public final class InviteViaLinkButtonViewModel$refreshButtonVisibilityAsync$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C111145iQ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InviteViaLinkButtonViewModel$refreshButtonVisibilityAsync$1(C111145iQ r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new InviteViaLinkButtonViewModel$refreshButtonVisibilityAsync$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new InviteViaLinkButtonViewModel$refreshButtonVisibilityAsync$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C111145iQ r2 = this.this$0;
            this.label = 1;
            if (r2.A02.BJt(AnonymousClass3MW.A0v(C72453Mb.A02(r2.A00.A0J(r2.A01) ? 1 : 0)), this) == r3) {
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
