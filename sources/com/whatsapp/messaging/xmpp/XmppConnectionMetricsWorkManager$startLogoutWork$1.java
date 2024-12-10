package com.whatsapp.messaging.xmpp;

import X.A7W;
import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass1OS;
import X.C18070vi;
import X.C195779tt;
import X.C196349ut;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.messaging.xmpp.XmppConnectionMetricsWorkManager$startLogoutWork$1", f = "XmppConnectionMetricsWorkManager.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
public final class XmppConnectionMetricsWorkManager$startLogoutWork$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ XmppConnectionMetricsWorkManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public XmppConnectionMetricsWorkManager$startLogoutWork$1(XmppConnectionMetricsWorkManager xmppConnectionMetricsWorkManager, C30391dr r3) {
        super(2, r3);
        this.this$0 = xmppConnectionMetricsWorkManager;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new XmppConnectionMetricsWorkManager$startLogoutWork$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new XmppConnectionMetricsWorkManager$startLogoutWork$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            XmppConnectionMetricsWorkManager xmppConnectionMetricsWorkManager = this.this$0;
            Object obj2 = xmppConnectionMetricsWorkManager.A01.get();
            C18070vi.A0X(obj2);
            this.label = 1;
            obj = XmppConnectionMetricsWorkManager.A00((A7W) obj2, xmppConnectionMetricsWorkManager, "xmpp-lifecycle-worker", this);
            if (obj == r4) {
                return r4;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        C195779tt r6 = (C195779tt) obj;
        if (r6 != null) {
            XmppConnectionMetricsWorkManager xmppConnectionMetricsWorkManager2 = this.this$0;
            Integer num = r6.A02;
            if (num != AnonymousClass00R.A01 && C196349ut.A01(num)) {
                XmppConnectionMetricsWorkManager.A01(xmppConnectionMetricsWorkManager2);
            }
        }
        this.this$0.A08 = null;
        return C27621Wu.A00;
    }
}
