package X;

import com.whatsapp.reporttoadmin.xmpp.RtaXmppClient;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.reporttoadmin.xmpp.RtaXmppClient", f = "RtaXmppClient.kt", i = {0}, l = {53}, m = "reportMessageToAdmin", n = {"request"}, s = {"L$0"})
/* renamed from: X.Anw  reason: case insensitive filesystem */
public final class C21667Anw extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RtaXmppClient this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21667Anw(RtaXmppClient rtaXmppClient, C30391dr r2) {
        super(r2);
        this.this$0 = rtaXmppClient;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A01((AnonymousClass1EC) null, (String) null, this);
    }
}
