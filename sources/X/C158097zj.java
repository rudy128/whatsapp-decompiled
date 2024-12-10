package X;

import android.os.Bundle;
import com.whatsapp.flows.downloadresponse.view.FlowsDownloadResponseBottomSheet;
import com.whatsapp.flows.webview.view.FlowsWebBottomSheetContainer;

/* renamed from: X.7zj  reason: invalid class name and case insensitive filesystem */
public final class C158097zj extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ FlowsWebBottomSheetContainer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C158097zj(FlowsWebBottomSheetContainer flowsWebBottomSheetContainer) {
        super(1);
        this.this$0 = flowsWebBottomSheetContainer;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Long l;
        String str = (String) obj;
        Bundle bundle = this.this$0.A06;
        AnonymousClass1GP r5 = null;
        if (bundle != null) {
            l = Long.valueOf(bundle.getLong("message_row_id"));
        } else {
            l = null;
        }
        C72453Mb.A1R(str);
        FlowsDownloadResponseBottomSheet flowsDownloadResponseBottomSheet = new FlowsDownloadResponseBottomSheet();
        Bundle A0D = C17880vN.A0D();
        A0D.putString("flow_id", str);
        A0D.putLong("message_row_id", C17900vP.A01(l));
        flowsDownloadResponseBottomSheet.A1R(A0D);
        AnonymousClass1FL A1B = this.this$0.A1B();
        if (A1B != null) {
            r5 = A1B.getSupportFragmentManager();
        }
        C17960vV.A07(r5);
        flowsDownloadResponseBottomSheet.A2C(r5, "flows_download_response_bottom_sheet");
        return C27621Wu.A00;
    }
}
