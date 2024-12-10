package X;

import com.whatsapp.flows.webview.viewmodel.WaFlowsViewModel;

/* renamed from: X.7zq  reason: invalid class name and case insensitive filesystem */
public final class C158167zq extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ WaFlowsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C158167zq(WaFlowsViewModel waFlowsViewModel) {
        super(1);
        this.this$0 = waFlowsViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean A1Y = AnonymousClass000.A1Y(obj);
        WaFlowsViewModel waFlowsViewModel = this.this$0;
        if (A1Y) {
            AnonymousClass3MX.A1K(waFlowsViewModel.A02, 2);
            ((C172058si) this.this$0.A0M.get()).A0F(WaFlowsViewModel.A03(this.this$0), 2);
        } else {
            ((C172058si) waFlowsViewModel.A0M.get()).A0E(WaFlowsViewModel.A00(this.this$0), "extensions-integrity-check-failed", "");
            ((C172058si) this.this$0.A0M.get()).A0F(WaFlowsViewModel.A00(this.this$0), 3);
            AnonymousClass3MX.A1K(this.this$0.A02, 0);
        }
        return C27621Wu.A00;
    }
}
