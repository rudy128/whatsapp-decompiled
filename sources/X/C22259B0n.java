package X;

import com.whatsapp.flows.webview.bridge.factory.impl.FlowsComplete;
import org.json.JSONObject;

/* renamed from: X.B0n  reason: case insensitive filesystem */
public final class C22259B0n extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ JSONObject $param;
    public final /* synthetic */ FlowsComplete this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22259B0n(FlowsComplete flowsComplete, JSONObject jSONObject) {
        super(1);
        this.this$0 = flowsComplete;
        this.$param = jSONObject;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass84U A0a = C108955ca.A0a(obj);
        A0a.A01("title", this.this$0.A05.A03);
        A0a.A01("flow_id", this.this$0.A05.A04);
        A0a.A01("flow_name", this.this$0.A05.A06);
        A0a.A01("response_message", this.$param.getString("response_message"));
        return C27621Wu.A00;
    }
}
