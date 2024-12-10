package X;

import com.whatsapp.flows.webview.bridge.FlowsWebViewDataRepository;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.json.JSONObject;

@DebugMetadata(c = "com.whatsapp.flows.webview.bridge.FlowsWebViewDataRepository", f = "FlowsWebViewDataRepository.kt", i = {0, 0}, l = {433}, m = "addPublicKeyAfterVersionCheck", n = {"this", "flowDataResponse"}, s = {"L$0", "L$1"})
/* renamed from: X.AoA  reason: case insensitive filesystem */
public final class C21681AoA extends C30421du {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FlowsWebViewDataRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21681AoA(FlowsWebViewDataRepository flowsWebViewDataRepository, C30391dr r2) {
        super(r2);
        this.this$0 = flowsWebViewDataRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return FlowsWebViewDataRepository.A00((C195709tm) null, (C185899dK) null, this.this$0, (UserJid) null, (String) null, this, (JSONObject) null);
    }
}
