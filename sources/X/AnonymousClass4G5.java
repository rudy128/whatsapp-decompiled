package X;

import android.os.Bundle;
import com.whatsapp.chatinfo.view.custom.PhoneNumberSharedBottomSheet;

/* renamed from: X.4G5  reason: invalid class name */
public abstract class AnonymousClass4G5 {
    public static final PhoneNumberSharedBottomSheet A00(String str, boolean z) {
        PhoneNumberSharedBottomSheet phoneNumberSharedBottomSheet = new PhoneNumberSharedBottomSheet();
        Bundle A0D = C17880vN.A0D();
        A0D.putString("arg_my_phone_number", str);
        A0D.putBoolean("arg_is_business", z);
        phoneNumberSharedBottomSheet.A1R(A0D);
        return phoneNumberSharedBottomSheet;
    }
}
