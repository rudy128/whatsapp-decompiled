package X;

import android.os.Bundle;
import com.whatsapp.flows.webview.view.FlowsWebBottomSheetContainer;

/* renamed from: X.7zi  reason: invalid class name and case insensitive filesystem */
public final class C158087zi extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ FlowsWebBottomSheetContainer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C158087zi(FlowsWebBottomSheetContainer flowsWebBottomSheetContainer) {
        super(1);
        this.this$0 = flowsWebBottomSheetContainer;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        FlowsWebBottomSheetContainer flowsWebBottomSheetContainer = this.this$0;
        Bundle bundle = flowsWebBottomSheetContainer.A06;
        if (bundle != null) {
            String string = bundle.getString("flow_id");
            C18030ve r2 = flowsWebBottomSheetContainer.A09;
            if (r2 == null) {
                AnonymousClass3MW.A1A();
                throw null;
            } else if (C18020vd.A05(C18040vf.A02, r2, 8418)) {
                C20081A6h a6h = (C20081A6h) flowsWebBottomSheetContainer.A2K().get();
                if (string != null) {
                    i = string.hashCode();
                } else {
                    i = 0;
                }
                a6h.A0B(Integer.valueOf(i), "webview_metadata_prepare_end");
            }
        }
        return C27621Wu.A00;
    }
}
