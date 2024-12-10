package com.whatsapp.messaging.xmpp;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.messaging.xmpp.XmppLifecycleWorker$doWork$2", f = "XmppLifecycleWorker.kt", i = {}, l = {67, 67}, m = "invokeSuspend", n = {}, s = {})
public final class XmppLifecycleWorker$doWork$2 extends C30431dv implements AnonymousClass1OS {
    public Object L$0;
    public int label;
    public final /* synthetic */ XmppLifecycleWorker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public XmppLifecycleWorker$doWork$2(XmppLifecycleWorker xmppLifecycleWorker, C30391dr r3) {
        super(2, r3);
        this.this$0 = xmppLifecycleWorker;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new XmppLifecycleWorker$doWork$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new XmppLifecycleWorker$doWork$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            XmppLifecycleWorker xmppLifecycleWorker = this.this$0;
            this.label = 1;
            obj = XmppLifecycleWorker.A01(xmppLifecycleWorker, this);
            if (obj == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else if (i == 2) {
            Object obj2 = this.L$0;
            C30691eM.A01(obj);
            return obj2;
        } else {
            throw AnonymousClass000.A0l();
        }
        XmppLifecycleWorker xmppLifecycleWorker2 = this.this$0;
        this.L$0 = obj;
        this.label = 2;
        if (XmppLifecycleWorker.A00(xmppLifecycleWorker2, this) != r3) {
            return obj;
        }
        return r3;
    }
}
