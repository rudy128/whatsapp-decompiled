package X;

import android.os.Bundle;
import com.whatsapp.biz.catalog.view.variants.v2.TextVariantsBottomSheetV2;
import java.util.List;

/* renamed from: X.6uz  reason: invalid class name and case insensitive filesystem */
public final class C137146uz {
    public static final TextVariantsBottomSheetV2 A00(C20245ADd aDd, String str, List list, C22821Di r7, int i, int i2, boolean z) {
        TextVariantsBottomSheetV2 textVariantsBottomSheetV2 = new TextVariantsBottomSheetV2();
        Bundle A0D = C17880vN.A0D();
        A0D.putString("VARAINT_NAME_ARG", str);
        A0D.putInt("VARIANTS_LIST_LOCATION_ARG", i);
        A0D.putInt("START_WITH_SELECTION_ARG", i2);
        A0D.putParcelableArrayList("TEXT_OPTIONS_DATA", C17880vN.A10(list));
        A0D.putParcelable("OTHER_OPTION_SELECTED_ARG", aDd);
        A0D.putBoolean("USE_BACK_ARROW_FOR_CLOSE_ARG", z);
        textVariantsBottomSheetV2.A1R(A0D);
        textVariantsBottomSheetV2.A03 = r7;
        return textVariantsBottomSheetV2;
    }
}
