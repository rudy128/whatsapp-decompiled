package com.whatsapp.flows.webview.view;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import android.webkit.WebMessagePort;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.json.JSONObject;

@DebugMetadata(c = "com.whatsapp.flows.webview.view.FlowsWebBottomSheetContainer$onWebBridgeAPICallback$1", f = "FlowsWebBottomSheetContainer.kt", i = {}, l = {954, 956}, m = "invokeSuspend", n = {}, s = {})
public final class FlowsWebBottomSheetContainer$onWebBridgeAPICallback$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ JSONObject $inputJson;
    public final /* synthetic */ WebMessagePort $sendPort;
    public int label;
    public final /* synthetic */ FlowsWebBottomSheetContainer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowsWebBottomSheetContainer$onWebBridgeAPICallback$1(WebMessagePort webMessagePort, FlowsWebBottomSheetContainer flowsWebBottomSheetContainer, C30391dr r4, JSONObject jSONObject) {
        super(2, r4);
        this.this$0 = flowsWebBottomSheetContainer;
        this.$sendPort = webMessagePort;
        this.$inputJson = jSONObject;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new FlowsWebBottomSheetContainer$onWebBridgeAPICallback$1(this.$sendPort, this.this$0, r6, this.$inputJson);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r1) goto L_0x0024
            if (r0 != r3) goto L_0x0047
            X.C30691eM.A01(r6)
        L_0x000f:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0012:
            X.C30691eM.A01(r6)
            com.whatsapp.flows.webview.view.FlowsWebBottomSheetContainer r0 = r5.this$0
            X.EEF r0 = r0.A0Q
            if (r0 == 0) goto L_0x000f
            r5.label = r1
            java.lang.Object r6 = r0.BCp(r5)
            if (r6 != r4) goto L_0x0027
            return r4
        L_0x0024:
            X.C30691eM.A01(r6)
        L_0x0027:
            boolean r0 = X.AnonymousClass000.A1Y(r6)
            if (r0 == 0) goto L_0x000f
            com.whatsapp.flows.webview.view.FlowsWebBottomSheetContainer r0 = r5.this$0
            com.whatsapp.flows.webview.viewmodel.WaFlowsViewModel r2 = r0.A0B
            if (r2 != 0) goto L_0x003a
            java.lang.String r0 = "waFlowsViewModel"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x003a:
            android.webkit.WebMessagePort r1 = r5.$sendPort
            org.json.JSONObject r0 = r5.$inputJson
            r5.label = r3
            java.lang.Object r0 = r2.A0U(r1, r5, r0)
            if (r0 != r4) goto L_0x000f
            return r4
        L_0x0047:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.flows.webview.view.FlowsWebBottomSheetContainer$onWebBridgeAPICallback$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FlowsWebBottomSheetContainer$onWebBridgeAPICallback$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
