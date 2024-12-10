package com.whatsapp.status.playback.fragment;

import X.AnonymousClass000;
import X.AnonymousClass1E7;
import X.AnonymousClass1M9;
import X.AnonymousClass1OS;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment$onActivityCreated$2", f = "StatusPlaybackContactFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StatusPlaybackContactFragment$onActivityCreated$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ UserJid $jid;
    public int label;
    public final /* synthetic */ StatusPlaybackContactFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatusPlaybackContactFragment$onActivityCreated$2(UserJid userJid, StatusPlaybackContactFragment statusPlaybackContactFragment, C30391dr r4) {
        super(2, r4);
        this.this$0 = statusPlaybackContactFragment;
        this.$jid = userJid;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new StatusPlaybackContactFragment$onActivityCreated$2(this.$jid, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass1M9 r1 = this.this$0.A09;
            if (r1 != null) {
                AnonymousClass1E7 A0H = r1.A0H(this.$jid);
                if (A0H.A14) {
                    A0H.A14 = false;
                    AnonymousClass1M9 r0 = this.this$0.A09;
                    if (r0 != null) {
                        r0.A0V(A0H);
                    }
                }
                return C27621Wu.A00;
            }
            C18070vi.A11("contactManager");
            throw null;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StatusPlaybackContactFragment$onActivityCreated$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
