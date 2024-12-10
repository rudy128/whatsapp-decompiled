package com.whatsapp.flows.webview.viewmodel;

import X.A0M;
import X.A25;
import X.AnonymousClass000;
import X.AnonymousClass1DT;
import X.AnonymousClass1OS;
import X.AnonymousClass6TN;
import X.C108965cb;
import X.C1186064e;
import X.C1186164f;
import X.C1186264g;
import X.C150637l0;
import X.C18070vi;
import X.C195719tn;
import X.C22811Dh;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import android.os.Bundle;
import com.whatsapp.flows.webview.bridge.FlowsWebViewDataRepository;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.flows.webview.viewmodel.WaFlowsViewModel$processFlowDataForWebView$2", f = "WaFlowsViewModel.kt", i = {}, l = {168}, m = "invokeSuspend", n = {}, s = {})
public final class WaFlowsViewModel$processFlowDataForWebView$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ UserJid $bizJid;
    public final /* synthetic */ Bundle $bundle;
    public final /* synthetic */ C22811Dh $isSuccess;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ WaFlowsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaFlowsViewModel$processFlowDataForWebView$2(Bundle bundle, WaFlowsViewModel waFlowsViewModel, UserJid userJid, C30391dr r5, C22811Dh r6) {
        super(2, r5);
        this.$bizJid = userJid;
        this.this$0 = waFlowsViewModel;
        this.$bundle = bundle;
        this.$isSuccess = r6;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        UserJid userJid = this.$bizJid;
        return new WaFlowsViewModel$processFlowDataForWebView$2(this.$bundle, this.this$0, userJid, r8, this.$isSuccess);
    }

    public final Object invokeSuspend(Object obj) {
        WaFlowsViewModel waFlowsViewModel;
        C22811Dh r5;
        AnonymousClass1DT r1;
        Object obj2;
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            UserJid userJid = this.$bizJid;
            if (userJid == null) {
                return new C150637l0(this.this$0);
            }
            waFlowsViewModel = this.this$0;
            Bundle bundle = this.$bundle;
            r5 = this.$isSuccess;
            this.L$0 = waFlowsViewModel;
            this.L$1 = r5;
            this.label = 1;
            obj = ((FlowsWebViewDataRepository) waFlowsViewModel.A0N.get()).A04(bundle, userJid, this);
            if (obj == r3) {
                return r3;
            }
        } else if (i == 1) {
            r5 = (C22811Dh) this.L$1;
            waFlowsViewModel = (WaFlowsViewModel) this.L$0;
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        AnonymousClass6TN r9 = (AnonymousClass6TN) obj;
        if (r9 instanceof C1186264g) {
            waFlowsViewModel.A07.A0E(C27621Wu.A00);
            C195719tn A0O = C108965cb.A0O(waFlowsViewModel.A0N);
            if (A0O != null) {
                ((A25) waFlowsViewModel.A0K.get()).A02(waFlowsViewModel.A0D, (A0M) C18070vi.A0E(waFlowsViewModel.A0Q), A0O, 0);
            }
            r5.element = true;
        } else {
            if (r9 instanceof C1186164f) {
                r1 = waFlowsViewModel.A01;
                obj2 = C27621Wu.A00;
            } else if (r9 instanceof C1186064e) {
                r1 = waFlowsViewModel.A08;
                obj2 = ((C1186064e) r9).A00;
            }
            r1.A0E(obj2);
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((WaFlowsViewModel$processFlowDataForWebView$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
