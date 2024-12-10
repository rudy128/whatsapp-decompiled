package X;

import com.whatsapp.flows.webview.view.FlowsWebBottomSheetContainer;
import com.whatsapp.flows.webview.viewmodel.WaFlowsViewModel;

/* renamed from: X.7zf  reason: invalid class name and case insensitive filesystem */
public final class C158057zf extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ FlowsWebBottomSheetContainer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C158057zf(FlowsWebBottomSheetContainer flowsWebBottomSheetContainer) {
        super(1);
        this.this$0 = flowsWebBottomSheetContainer;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C18070vi.A0d(obj, 0);
        WaFlowsViewModel waFlowsViewModel = this.this$0.A0B;
        if (waFlowsViewModel == null) {
            C18070vi.A11("waFlowsViewModel");
            throw null;
        }
        waFlowsViewModel.A04.A0F(obj);
        return C27621Wu.A00;
    }
}
