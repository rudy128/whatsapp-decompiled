package X;

import com.whatsapp.Me;
import com.whatsapp.flows.webview.bridge.factory.impl.FlowsMarketingDisclosureState;
import com.whatsapp.util.Log;

/* renamed from: X.7zd  reason: invalid class name and case insensitive filesystem */
public final class C158037zd extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ FlowsMarketingDisclosureState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C158037zd(FlowsMarketingDisclosureState flowsMarketingDisclosureState) {
        super(1);
        this.this$0 = flowsMarketingDisclosureState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        AnonymousClass84U A0a = C108955ca.A0a(obj);
        A0a.A01("is_accepted", Boolean.valueOf(this.this$0.A04.A01()));
        FlowsMarketingDisclosureState flowsMarketingDisclosureState = this.this$0;
        AnonymousClass206 r1 = flowsMarketingDisclosureState.A05;
        if (r1 != null) {
            A0a.A01("show_disclosure", Boolean.valueOf(flowsMarketingDisclosureState.A02.A05(r1)));
        } else {
            Log.e("FlowsMarketingDisclosureState/execute: message is null");
        }
        AnonymousClass11S r0 = this.this$0.A01;
        r0.A0I();
        Me me = r0.A00;
        if (me == null || (str = C108965cb.A0p(me)) == null) {
            str = "ZZ";
        }
        A0a.A01("region", str);
        A0a.A01("disclosure_data", AnonymousClass84U.A00(new AnonymousClass5SR(this.this$0)));
        return C27621Wu.A00;
    }
}
