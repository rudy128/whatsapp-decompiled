package com.whatsapp.flows.webview.view;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.flows.phoenix.view.FlowsInitialLoadingView;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.flows.webview.view.FlowsWebBottomSheetContainer$onViewCreated$1", f = "FlowsWebBottomSheetContainer.kt", i = {}, l = {466}, m = "invokeSuspend", n = {}, s = {})
public final class FlowsWebBottomSheetContainer$onViewCreated$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ FlowsWebBottomSheetContainer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowsWebBottomSheetContainer$onViewCreated$1(FlowsWebBottomSheetContainer flowsWebBottomSheetContainer, C30391dr r3) {
        super(2, r3);
        this.this$0 = flowsWebBottomSheetContainer;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new FlowsWebBottomSheetContainer$onViewCreated$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new FlowsWebBottomSheetContainer$onViewCreated$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            FlowsWebBottomSheetContainer flowsWebBottomSheetContainer = this.this$0;
            FlowsInitialLoadingView flowsInitialLoadingView = flowsWebBottomSheetContainer.A0A;
            if (flowsInitialLoadingView != null) {
                UserJid userJid = flowsWebBottomSheetContainer.A0C;
                C18070vi.A0b(userJid);
                String str = this.this$0.A0P;
                C18070vi.A0b(str);
                this.label = 1;
                if (flowsInitialLoadingView.A02(userJid, str, this, false) == r5) {
                    return r5;
                }
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
