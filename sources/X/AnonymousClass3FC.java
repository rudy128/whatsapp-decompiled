package X;

import com.whatsapp.messaging.xmpp.XmppConnectionMetricsWorkManager;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.messaging.xmpp.XmppConnectionMetricsWorkManager", f = "XmppConnectionMetricsWorkManager.kt", i = {}, l = {161}, m = "getFirstWorkInfoForUniqueWorkOrNull", n = {}, s = {})
/* renamed from: X.3FC  reason: invalid class name */
public final class AnonymousClass3FC extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ XmppConnectionMetricsWorkManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3FC(XmppConnectionMetricsWorkManager xmppConnectionMetricsWorkManager, C30391dr r2) {
        super(r2);
        this.this$0 = xmppConnectionMetricsWorkManager;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return XmppConnectionMetricsWorkManager.A00((A7W) null, this.this$0, (String) null, this);
    }
}
