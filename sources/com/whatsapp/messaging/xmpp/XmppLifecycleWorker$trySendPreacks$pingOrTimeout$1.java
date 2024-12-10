package com.whatsapp.messaging.xmpp;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass7R0;
import X.C108975cc;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C59412mG;
import X.C71053Dp;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.messaging.xmpp.XmppLifecycleWorker$trySendPreacks$pingOrTimeout$1", f = "XmppLifecycleWorker.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
public final class XmppLifecycleWorker$trySendPreacks$pingOrTimeout$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C59412mG $lastPreack;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ XmppLifecycleWorker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public XmppLifecycleWorker$trySendPreacks$pingOrTimeout$1(C59412mG r2, XmppLifecycleWorker xmppLifecycleWorker, C30391dr r4) {
        super(2, r4);
        this.this$0 = xmppLifecycleWorker;
        this.$lastPreack = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new XmppLifecycleWorker$trySendPreacks$pingOrTimeout$1(this.$lastPreack, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            XmppLifecycleWorker xmppLifecycleWorker = this.this$0;
            C59412mG r4 = this.$lastPreack;
            this.L$0 = xmppLifecycleWorker;
            this.L$1 = r4;
            this.label = 1;
            C71053Dp A0k = C108975cc.A0k(this);
            xmppLifecycleWorker.A03.A0B(new AnonymousClass7R0(A0k, r4, xmppLifecycleWorker, 43));
            if (A0k.A00() == r6) {
                return r6;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((XmppLifecycleWorker$trySendPreacks$pingOrTimeout$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
