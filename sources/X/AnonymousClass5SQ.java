package X;

import android.content.Context;
import com.whatsapp.WaTextView;
import com.whatsapp.flows.downloadresponse.view.FlowsDownloadResponseBottomSheet;

/* renamed from: X.5SQ  reason: invalid class name */
public final class AnonymousClass5SQ extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ FlowsDownloadResponseBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5SQ(FlowsDownloadResponseBottomSheet flowsDownloadResponseBottomSheet) {
        super(1);
        this.this$0 = flowsDownloadResponseBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        FlowsDownloadResponseBottomSheet flowsDownloadResponseBottomSheet = this.this$0;
        WaTextView waTextView = flowsDownloadResponseBottomSheet.A06;
        if (waTextView != null) {
            if (str == null || str.length() == 0) {
                waTextView.setVisibility(8);
            } else {
                waTextView.setVisibility(0);
                Context A14 = flowsDownloadResponseBottomSheet.A14();
                waTextView.setText(C72813Np.A00(waTextView.getPaint(), AnonymousClass4aX.A05(A14, AnonymousClass3MX.A06(A14, 2131231687), 2131103152), str, AnonymousClass3MZ.A09(flowsDownloadResponseBottomSheet).getDimensionPixelSize(2131168775)));
            }
        }
        return C27621Wu.A00;
    }
}
