package X;

import com.whatsapp.reportinfra.xmpp.SpamReportXmppClient;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.reportinfra.xmpp.SpamReportXmppClient", f = "SpamReportXmppClient.kt", i = {}, l = {121}, m = "sendNode", n = {}, s = {})
/* renamed from: X.7TW  reason: invalid class name */
public final class AnonymousClass7TW extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SpamReportXmppClient this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7TW(SpamReportXmppClient spamReportXmppClient, C30391dr r2) {
        super(r2);
        this.this$0 = spamReportXmppClient;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return SpamReportXmppClient.A00((C29621ca) null, this.this$0, (String) null, this, 0);
    }
}
