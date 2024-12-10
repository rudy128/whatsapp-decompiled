package X;

import android.os.Bundle;
import com.whatsapp.businessdirectory.view.custom.FilterBottomSheetDialogFragment;
import java.util.ArrayList;

/* renamed from: X.9xH  reason: invalid class name and case insensitive filesystem */
public final class C197799xH {
    public final ArrayList A00;
    public final ArrayList A01;

    public static FilterBottomSheetDialogFragment A00(BAZ baz, C197799xH r5) {
        FilterBottomSheetDialogFragment filterBottomSheetDialogFragment = new FilterBottomSheetDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("arg-categories", r5.A00);
        bundle.putParcelableArrayList("arg-selected-categories", r5.A01);
        filterBottomSheetDialogFragment.A1R(bundle);
        filterBottomSheetDialogFragment.A02 = baz;
        return filterBottomSheetDialogFragment;
    }

    public C197799xH(ArrayList arrayList, ArrayList arrayList2) {
        this.A00 = arrayList;
        this.A01 = arrayList2;
    }
}
