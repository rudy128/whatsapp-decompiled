package com.whatsapp.conversation.conversationrow.components.contextcard;

import X.AnonymousClass000;
import X.AnonymousClass1G4;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.C161548Fr;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C62822s3;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.components.contextcard.AddMembersButtonViewModel$refreshButtonVisibilityAsync$1", f = "AddMembersButtonViewModel.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
public final class AddMembersButtonViewModel$refreshButtonVisibilityAsync$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C161548Fr this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddMembersButtonViewModel$refreshButtonVisibilityAsync$1(C161548Fr r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new AddMembersButtonViewModel$refreshButtonVisibilityAsync$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new AddMembersButtonViewModel$refreshButtonVisibilityAsync$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C161548Fr r3 = this.this$0;
            this.label = 1;
            boolean A01 = C62822s3.A01(r3.A01, r3.A00.A0H(r3.A03), r3.A02);
            AnonymousClass1G4 r1 = r3.A04;
            int i2 = 0;
            if (!A01) {
                i2 = 8;
            }
            if (r1.BJt(AnonymousClass3MW.A0v(i2), this) == r4) {
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
