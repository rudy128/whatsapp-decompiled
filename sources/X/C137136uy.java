package X;

import android.os.Bundle;
import com.whatsapp.biz.catalog.view.variants.Hilt_TextVariantsBottomSheet;
import com.whatsapp.biz.catalog.view.variants.TextVariantsBottomSheet;

/* renamed from: X.6uy  reason: invalid class name and case insensitive filesystem */
public final class C137136uy {
    /* JADX WARNING: type inference failed for: r2v0, types: [com.whatsapp.biz.catalog.view.variants.Hilt_TextVariantsBottomSheet, androidx.fragment.app.Fragment, com.whatsapp.biz.catalog.view.variants.TextVariantsBottomSheet] */
    public static final TextVariantsBottomSheet A00(C20245ADd aDd, AnonymousClass77B r4, int i, boolean z) {
        ? hilt_TextVariantsBottomSheet = new Hilt_TextVariantsBottomSheet();
        Bundle A0D = C17880vN.A0D();
        A0D.putInt("START_WITH_SELECTION_ARG", i);
        A0D.putParcelable("TEXT_OPTIONS_DATA", r4);
        A0D.putParcelable("OTHER_OPTION_SELECTED_ARG", aDd);
        A0D.putBoolean("USE_BACK_ARROW_FOR_CLOSE_ARG", z);
        hilt_TextVariantsBottomSheet.A1R(A0D);
        return hilt_TextVariantsBottomSheet;
    }
}
