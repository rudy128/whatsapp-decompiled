package com.whatsapp.messaging.xmpp;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C162168Jj;
import X.C162178Jk;
import X.C179589Io;
import X.C18020vd;
import X.C18040vf;
import X.C196999vz;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C62882s9;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.messaging.xmpp.XmppLogoutWorker$doWork$2", f = "XmppLogoutWorker.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
public final class XmppLogoutWorker$doWork$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ XmppLogoutWorker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public XmppLogoutWorker$doWork$2(XmppLogoutWorker xmppLogoutWorker, C30391dr r3) {
        super(2, r3);
        this.this$0 = xmppLogoutWorker;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new XmppLogoutWorker$doWork$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new XmppLogoutWorker$doWork$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            long A00 = C196999vz.A00(C179589Io.SECONDS, C18020vd.A00(C18040vf.A02, this.this$0.A00, 3532));
            this.label = 1;
            if (C62882s9.A01(this, A00) == r4) {
                return r4;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        if (this.this$0.A01.A00()) {
            return new C162178Jk();
        }
        return new C162168Jj();
    }
}
