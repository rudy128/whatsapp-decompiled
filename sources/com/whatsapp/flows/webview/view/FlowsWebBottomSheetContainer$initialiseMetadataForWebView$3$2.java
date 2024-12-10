package com.whatsapp.flows.webview.view;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C98494rF;
import android.os.Bundle;
import com.whatsapp.flows.webview.viewmodel.WaFlowsViewModel;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.flows.webview.view.FlowsWebBottomSheetContainer$initialiseMetadataForWebView$3$2", f = "FlowsWebBottomSheetContainer.kt", i = {}, l = {312}, m = "invokeSuspend", n = {}, s = {})
public final class FlowsWebBottomSheetContainer$initialiseMetadataForWebView$3$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C98494rF $bizJid;
    public final /* synthetic */ Bundle $bundle;
    public int label;
    public final /* synthetic */ FlowsWebBottomSheetContainer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowsWebBottomSheetContainer$initialiseMetadataForWebView$3$2(Bundle bundle, FlowsWebBottomSheetContainer flowsWebBottomSheetContainer, C30391dr r4, C98494rF r5) {
        super(2, r4);
        this.this$0 = flowsWebBottomSheetContainer;
        this.$bizJid = r5;
        this.$bundle = bundle;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new FlowsWebBottomSheetContainer$initialiseMetadataForWebView$3$2(this.$bundle, this.this$0, r6, this.$bizJid);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            WaFlowsViewModel waFlowsViewModel = this.this$0.A0B;
            if (waFlowsViewModel == null) {
                C18070vi.A11("waFlowsViewModel");
                throw null;
            }
            Bundle bundle = this.$bundle;
            C18070vi.A0b(bundle);
            this.label = 1;
            obj = waFlowsViewModel.A0T(bundle, (UserJid) this.$bizJid.element, this);
            if (obj == r4) {
                return r4;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FlowsWebBottomSheetContainer$initialiseMetadataForWebView$3$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
