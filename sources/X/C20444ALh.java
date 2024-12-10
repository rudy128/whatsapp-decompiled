package X;

import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.payments.ui.BrazilAccountRecoveryPinActivity;
import com.whatsapp.registration.VerifyTwoFactorAuth;
import com.whatsapp.registration.verifyphone.VerifyPhoneNumber;

/* renamed from: X.ALh  reason: case insensitive filesystem */
public class C20444ALh implements C107815af {
    public final int A00;
    public final Object A01;

    public C20444ALh(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void BpB(String str) {
        BBP bbp;
        switch (this.A00) {
            case 0:
                if (str.length() == 6) {
                    PinBottomSheetDialogFragment pinBottomSheetDialogFragment = (PinBottomSheetDialogFragment) this.A01;
                    if (pinBottomSheetDialogFragment.A09 != null && pinBottomSheetDialogFragment.A00 <= AnonymousClass11P.A01(pinBottomSheetDialogFragment.A05)) {
                        bbp = pinBottomSheetDialogFragment.A09;
                        break;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                if (str.length() != 6 || (bbp = ((BrazilAccountRecoveryPinActivity) this.A01).A03) == null) {
                    return;
                }
            case 2:
                VerifyTwoFactorAuth verifyTwoFactorAuth = (VerifyTwoFactorAuth) this.A01;
                VerifyTwoFactorAuth.A0c(verifyTwoFactorAuth, verifyTwoFactorAuth.A0C.getCode(), 0, false);
                return;
            default:
                ((VerifyPhoneNumber) this.A01).A4m(str);
                return;
        }
        bbp.BpL(str);
    }

    public void BzF(String str) {
        BBP bbp;
        switch (this.A00) {
            case 0:
                if (str.length() == 6) {
                    PinBottomSheetDialogFragment pinBottomSheetDialogFragment = (PinBottomSheetDialogFragment) this.A01;
                    if (pinBottomSheetDialogFragment.A09 != null && pinBottomSheetDialogFragment.A00 <= AnonymousClass11P.A01(pinBottomSheetDialogFragment.A05)) {
                        bbp = pinBottomSheetDialogFragment.A09;
                        break;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                if (str.length() != 6 || (bbp = ((BrazilAccountRecoveryPinActivity) this.A01).A03) == null) {
                    return;
                }
            default:
                return;
        }
        bbp.BpL(str);
    }
}
