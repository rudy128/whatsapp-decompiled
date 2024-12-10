package com.whatsapp.interop.blocklist;

import X.AnonymousClass000;
import X.AnonymousClass1ED;
import X.AnonymousClass1OS;
import X.AnonymousClass2Q5;
import X.C132786na;
import X.C137846w7;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.interop.blocklist.InteropBlockListManager$unblockUser$2", f = "InteropBlockListManager.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
public final class InteropBlockListManager$unblockUser$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1ED $jid;
    public int label;
    public final /* synthetic */ C132786na this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InteropBlockListManager$unblockUser$2(C132786na r2, AnonymousClass1ED r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$jid = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new InteropBlockListManager$unblockUser$2(this.this$0, this.$jid, r5);
    }

    public final Object invokeSuspend(Object obj) {
        Boolean valueOf;
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1ED r1 = this.$jid;
            this.label = 1;
            Object A00 = C137846w7.A00((C137846w7) this.this$0.A00.get(), r1, "unblock", this);
            if (A00 != r4) {
                A00 = C27621Wu.A00;
            }
            if (A00 == r4) {
                return r4;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        C132786na r42 = this.this$0;
        Set set = r42.A02;
        AnonymousClass1ED r2 = this.$jid;
        synchronized (set) {
            ((AnonymousClass2Q5) r42.A01.get()).A0I(r2, false);
            valueOf = Boolean.valueOf(r42.A02.remove(r2));
        }
        return valueOf;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((InteropBlockListManager$unblockUser$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
