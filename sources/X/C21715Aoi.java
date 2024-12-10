package X;

import android.os.Bundle;
import com.whatsapp.flows.webview.bridge.FlowsWebViewDataRepository;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.flows.webview.bridge.FlowsWebViewDataRepository", f = "FlowsWebViewDataRepository.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 3, 3, 3, 3}, l = {284, 287, 299, 315, 329}, m = "prepareFlowMetadata", n = {"this", "bizJid", "flowId", "messageId", "sessionId", "flowMessageVersion", "flowDataResponse", "metadata", "it", "instanceKey", "this", "bizJid", "flowId", "messageId", "flowMessageVersion", "flowDataResponse", "instanceKey"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$9", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0"})
/* renamed from: X.Aoi  reason: case insensitive filesystem */
public final class C21715Aoi extends C30421du {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public Object L$9;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FlowsWebViewDataRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21715Aoi(FlowsWebViewDataRepository flowsWebViewDataRepository, C30391dr r2) {
        super(r2);
        this.this$0 = flowsWebViewDataRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A04((Bundle) null, (UserJid) null, this);
    }
}
