package com.whatsapp.flows.phoenix.view;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.flows.phoenix.view.PhoenixFlowsBottomSheetContainer$onViewCreated$1", f = "PhoenixFlowsBottomSheetContainer.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
public final class PhoenixFlowsBottomSheetContainer$onViewCreated$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $articleId;
    public final /* synthetic */ UserJid $jid;
    public int label;
    public final /* synthetic */ PhoenixFlowsBottomSheetContainer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhoenixFlowsBottomSheetContainer$onViewCreated$1(PhoenixFlowsBottomSheetContainer phoenixFlowsBottomSheetContainer, UserJid userJid, String str, C30391dr r5) {
        super(2, r5);
        this.this$0 = phoenixFlowsBottomSheetContainer;
        this.$jid = userJid;
        this.$articleId = str;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new PhoenixFlowsBottomSheetContainer$onViewCreated$1(this.this$0, this.$jid, this.$articleId, r6);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            FlowsInitialLoadingView flowsInitialLoadingView = this.this$0.A02;
            if (flowsInitialLoadingView != null) {
                UserJid userJid = this.$jid;
                String str = this.$articleId;
                this.label = 1;
                if (flowsInitialLoadingView.A02(userJid, str, this, true) == r4) {
                    return r4;
                }
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PhoenixFlowsBottomSheetContainer$onViewCreated$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
