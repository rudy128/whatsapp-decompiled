package X;

import com.whatsapp.reporttoadmin.xmpp.RtaXmppClient;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.reporttoadmin.xmpp.RtaXmppClient", f = "RtaXmppClient.kt", i = {0}, l = {37}, m = "getReportedMessages", n = {"request"}, s = {"L$0"})
/* renamed from: X.Anv  reason: case insensitive filesystem */
public final class C21666Anv extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RtaXmppClient this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21666Anv(RtaXmppClient rtaXmppClient, C30391dr r2) {
        super(r2);
        this.this$0 = rtaXmppClient;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A02((AnonymousClass1EC) null, this);
    }
}
