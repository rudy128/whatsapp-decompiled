package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment;

/* renamed from: X.4bH  reason: invalid class name */
public class AnonymousClass4bH implements DialogInterface.OnShowListener {
    public final int A00;
    public final Object A01;

    public AnonymousClass4bH(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onShow(DialogInterface dialogInterface) {
        Object obj;
        BottomSheetBehavior A02;
        int i;
        switch (this.A00) {
            case 0:
                VerifyTwoFactorAuthCodeDialogFragment verifyTwoFactorAuthCodeDialogFragment = (VerifyTwoFactorAuthCodeDialogFragment) this.A01;
                verifyTwoFactorAuthCodeDialogFragment.A2H().A0J(new C21457AkO((Object) verifyTwoFactorAuthCodeDialogFragment, 0));
                return;
            case 1:
                C18070vi.A0d(dialogInterface, 1);
                View A002 = C123576Uz.A00((Dialog) dialogInterface, 2131429948);
                C18070vi.A0X(A002);
                BottomSheetBehavior A022 = BottomSheetBehavior.A02(A002);
                C18070vi.A0X(A022);
                A022.A0W(3);
                A022.A0h = true;
                return;
            case 2:
                BottomSheetBehavior A023 = BottomSheetBehavior.A02(C123576Uz.A00((Dialog) dialogInterface, 2131429948));
                A023.A0W(3);
                A023.A0h = true;
                return;
            case 3:
                obj = this.A01;
                A02 = BottomSheetBehavior.A02(((Dialog) dialogInterface).findViewById(2131429948));
                A02.A0W(3);
                i = 2;
                break;
            default:
                obj = this.A01;
                View findViewById = ((Dialog) dialogInterface).findViewById(2131429948);
                if (findViewById != null) {
                    A02 = BottomSheetBehavior.A02(findViewById);
                    A02.A0W(3);
                    i = 7;
                    break;
                } else {
                    return;
                }
        }
        A02.A0a(new C74483bk(obj, i));
    }
}
