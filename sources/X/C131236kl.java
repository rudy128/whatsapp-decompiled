package X;

import android.os.Bundle;
import com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContentFragment;
import java.util.Map;

/* renamed from: X.6kl  reason: invalid class name and case insensitive filesystem */
public final class C131236kl {
    public final BkBottomSheetContentFragment A00(C133336oa r5, C20000A2o a2o, String str, boolean z) {
        Bundle A0J = C72463Mc.A0J(a2o);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("bk_bottom_sheet_content_fragment");
        String A0t = C17880vN.A0t(A10, r5.hashCode());
        A0J.putString("bottom_sheet_fragment_tag", str);
        A0J.putBoolean("bottom_sheet_back_stack", z);
        A0J.putString("bk_bottom_sheet_content_fragment", A0t);
        a2o.A04(C178149Bz.A00(A0t), r5, "bk_bottom_sheet_content_fragment");
        BkBottomSheetContentFragment bkBottomSheetContentFragment = new BkBottomSheetContentFragment();
        bkBottomSheetContentFragment.A1R(A0J);
        C26235CvV A00 = r5.A00();
        Map A01 = r5.A01();
        bkBottomSheetContentFragment.A02 = A00;
        bkBottomSheetContentFragment.A06 = A01;
        return bkBottomSheetContentFragment;
    }
}
