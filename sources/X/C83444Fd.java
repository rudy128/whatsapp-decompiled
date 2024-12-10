package X;

import android.os.Bundle;
import com.whatsapp.accountswitching.ui.AddAccountBottomSheet;
import com.whatsapp.accountswitching.ui.Hilt_AddAccountBottomSheet;

/* renamed from: X.4Fd  reason: invalid class name and case insensitive filesystem */
public abstract class C83444Fd {
    /* JADX WARNING: type inference failed for: r2v0, types: [androidx.fragment.app.Fragment, com.whatsapp.accountswitching.ui.AddAccountBottomSheet, com.whatsapp.accountswitching.ui.Hilt_AddAccountBottomSheet] */
    public static final AddAccountBottomSheet A00(String str, int i) {
        ? hilt_AddAccountBottomSheet = new Hilt_AddAccountBottomSheet();
        Bundle A0D = C17880vN.A0D();
        A0D.putInt("source", i);
        if (!(str == null || str.length() == 0)) {
            A0D.putString("landing_screen", str);
        }
        hilt_AddAccountBottomSheet.A1R(A0D);
        return hilt_AddAccountBottomSheet;
    }
}
