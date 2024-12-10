package X;

import com.whatsapp.payments.ui.bottomsheet.IndiaUpiDobPickerBottomSheet;

/* renamed from: X.4HC  reason: invalid class name */
public abstract class AnonymousClass4HC {
    public static final IndiaUpiDobPickerBottomSheet A00(C1418477e r4, String str, boolean z, boolean z2) {
        IndiaUpiDobPickerBottomSheet indiaUpiDobPickerBottomSheet = new IndiaUpiDobPickerBottomSheet();
        AnonymousClass1D6[] r2 = new AnonymousClass1D6[4];
        C72463Mc.A1H("BUNDLE_KEY_SHOW_TOOLBAR", Boolean.valueOf(z), r2);
        r2[1] = AnonymousClass1D6.A01("BUNDLE_KEY_SHOW_HANDLE", Boolean.valueOf(z2));
        C72463Mc.A1I("BUNDLE_KEY_CREDENTIAL", str, r2);
        C72463Mc.A1J("BUNDLE_BANK_ACCOUNT", r4, r2);
        AnonymousClass3MX.A1I(indiaUpiDobPickerBottomSheet, r2);
        return indiaUpiDobPickerBottomSheet;
    }
}
