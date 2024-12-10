package X;

import com.whatsapp.WaTextView;
import com.whatsapp.identity.IdentityVerificationActivity;
import com.whatsapp.identity.ScanQrCodeActivity;
import com.whatsapp.qrcode.WaQrScannerView;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;

/* renamed from: X.7IG  reason: invalid class name */
public class AnonymousClass7IG implements AnonymousClass87F {
    public final int A00;
    public final Object A01;

    public AnonymousClass7IG(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [androidx.fragment.app.Fragment, com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment, com.whatsapp.identity.QrCodeValidationResultBottomSheet, androidx.fragment.app.DialogFragment] */
    public void C2K(boolean z) {
        String str;
        if (this.A00 != 0) {
            ScanQrCodeActivity scanQrCodeActivity = (ScanQrCodeActivity) this.A01;
            ? wDSBottomSheetDialogFragment = new WDSBottomSheetDialogFragment();
            AnonymousClass1D6[] r2 = new AnonymousClass1D6[1];
            C72463Mc.A1H("is_valid", Boolean.valueOf(z), r2);
            AnonymousClass3MX.A1I(wDSBottomSheetDialogFragment, r2);
            wDSBottomSheetDialogFragment.A01 = new C90044dR((Object) scanQrCodeActivity, 41);
            wDSBottomSheetDialogFragment.A00 = new C90044dR((Object) scanQrCodeActivity, 42);
            WaTextView waTextView = scanQrCodeActivity.A02;
            if (waTextView == null) {
                str = "errorIndicatorView";
            } else {
                waTextView.setVisibility(8);
                C20098A7b.A03(wDSBottomSheetDialogFragment, scanQrCodeActivity.getSupportFragmentManager(), "QrCodeValidationResultBottomSheet");
                WaQrScannerView waQrScannerView = scanQrCodeActivity.A0B;
                if (waQrScannerView == null) {
                    str = "qrScannerView";
                } else {
                    waQrScannerView.COW();
                    return;
                }
            }
            C18070vi.A11(str);
            throw null;
        }
        IdentityVerificationActivity identityVerificationActivity = (IdentityVerificationActivity) this.A01;
        identityVerificationActivity.A4b().A02(new C70813Cp(11, (Object) identityVerificationActivity, z));
    }
}
