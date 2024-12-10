package com.whatsapp.usernames;

import X.AnonymousClass000;
import X.AnonymousClass1E2;
import X.AnonymousClass1OS;
import X.AnonymousClass7FW;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.usernames.UsernameMessageObserver$markOwnPnShared$2", f = "UsernameMessageObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class UsernameMessageObserver$markOwnPnShared$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1E2 $lidUserJid;
    public int label;
    public final /* synthetic */ AnonymousClass7FW this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsernameMessageObserver$markOwnPnShared$2(AnonymousClass1E2 r2, AnonymousClass7FW r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = r3;
        this.$lidUserJid = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new UsernameMessageObserver$markOwnPnShared$2(this.$lidUserJid, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            this.this$0.A01.A08(this.$lidUserJid);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((UsernameMessageObserver$markOwnPnShared$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
