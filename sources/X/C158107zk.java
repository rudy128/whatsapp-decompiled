package X;

import android.os.Bundle;
import com.whatsapp.flows.webview.view.FlowsWebBottomSheetContainer;

/* renamed from: X.7zk  reason: invalid class name and case insensitive filesystem */
public final class C158107zk extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ FlowsWebBottomSheetContainer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C158107zk(FlowsWebBottomSheetContainer flowsWebBottomSheetContainer) {
        super(1);
        this.this$0 = flowsWebBottomSheetContainer;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, X.B5z] */
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String string;
        Bundle bundle = this.this$0.A06;
        if (!(bundle == null || (string = bundle.getString("observer_id")) == null)) {
            FlowsWebBottomSheetContainer flowsWebBottomSheetContainer = this.this$0;
            AnonymousClass00H r0 = flowsWebBottomSheetContainer.A0M;
            if (r0 != null) {
                C108985cd.A0c(r0, string).A02(new Object());
                C108955ca.A1M(flowsWebBottomSheetContainer);
            } else {
                C18070vi.A11("uiObserversFactory");
                throw null;
            }
        }
        return C27621Wu.A00;
    }
}
