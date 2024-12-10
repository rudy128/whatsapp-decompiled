package X;

import android.os.Bundle;
import com.whatsapp.inappsupport.ui.nux.Hilt_SupportAiNuxBottomSheet;
import com.whatsapp.inappsupport.ui.nux.SupportAiNuxBottomSheet;

/* renamed from: X.4Gw  reason: invalid class name and case insensitive filesystem */
public abstract class C83844Gw {
    /* JADX WARNING: type inference failed for: r2v0, types: [com.whatsapp.inappsupport.ui.nux.Hilt_SupportAiNuxBottomSheet, androidx.fragment.app.Fragment, com.whatsapp.inappsupport.ui.nux.SupportAiNuxBottomSheet] */
    public static final SupportAiNuxBottomSheet A00(boolean z, boolean z2) {
        ? hilt_SupportAiNuxBottomSheet = new Hilt_SupportAiNuxBottomSheet();
        Bundle A0D = C17880vN.A0D();
        A0D.putBoolean("from_existing_chat", z);
        A0D.putBoolean("isTappedFromSystemMessageOrChatInfo", z2);
        hilt_SupportAiNuxBottomSheet.A1R(A0D);
        return hilt_SupportAiNuxBottomSheet;
    }
}
