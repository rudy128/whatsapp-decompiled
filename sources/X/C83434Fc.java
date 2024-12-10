package X;

import android.os.Bundle;
import com.whatsapp.accountswitching.ui.AccountSwitchingBottomSheet;

/* renamed from: X.4Fc  reason: invalid class name and case insensitive filesystem */
public abstract class C83434Fc {
    public static final AccountSwitchingBottomSheet A00(String str, int i) {
        AccountSwitchingBottomSheet accountSwitchingBottomSheet = new AccountSwitchingBottomSheet();
        Bundle A0D = C17880vN.A0D();
        A0D.putInt("source", i);
        if (!(str == null || str.length() == 0)) {
            A0D.putString("landing_screen", str);
        }
        accountSwitchingBottomSheet.A1R(A0D);
        return accountSwitchingBottomSheet;
    }
}
