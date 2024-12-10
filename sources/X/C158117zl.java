package X;

import com.whatsapp.flows.webview.view.FlowsWebBottomSheetContainer;

/* renamed from: X.7zl  reason: invalid class name and case insensitive filesystem */
public final class C158117zl extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ FlowsWebBottomSheetContainer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C158117zl(FlowsWebBottomSheetContainer flowsWebBottomSheetContainer) {
        super(1);
        this.this$0 = flowsWebBottomSheetContainer;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Number number = (Number) obj;
        if (number != null) {
            int intValue = number.intValue();
            if (intValue == 2) {
                this.this$0.A28();
            } else if (intValue == 0) {
                FlowsWebBottomSheetContainer.A02(this.this$0, (String) null, "extensions-integrity-check-failed");
            }
        }
        return C27621Wu.A00;
    }
}
