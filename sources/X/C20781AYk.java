package X;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

/* renamed from: X.AYk  reason: case insensitive filesystem */
public class C20781AYk implements BBG {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C20781AYk(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public void Bss(A7B a7b) {
        if (this.A00 != 0) {
            PinBottomSheetDialogFragment pinBottomSheetDialogFragment = (PinBottomSheetDialogFragment) this.A02;
            if (pinBottomSheetDialogFragment != null) {
                pinBottomSheetDialogFragment.A2M();
            }
            C17900vP.A0X(a7b, "PAY: FbPayHubActivity/PaymentStepUpWebviewAction onError: ", AnonymousClass000.A10());
            int i = a7b.A00;
            if (i == 1441) {
                A5V a5v = (A5V) this.A01;
                C195929uA r2 = a5v.A0C;
                long j = a7b.A02;
                r2.A01(j);
                if (pinBottomSheetDialogFragment != null) {
                    AnonymousClass8BX.A1E(pinBottomSheetDialogFragment, j);
                } else {
                    a5v.A03();
                }
            } else {
                if (i == 1440) {
                    if (pinBottomSheetDialogFragment != null) {
                        pinBottomSheetDialogFragment.A2O(a7b.A01, 2131755316);
                        return;
                    }
                } else if (i == 455) {
                    if (pinBottomSheetDialogFragment != null) {
                        pinBottomSheetDialogFragment.A29();
                    }
                    ((A5V) this.A01).A02();
                    return;
                } else {
                    if (i == 1448) {
                        ((A5V) this.A01).A0A.A02(a7b, "FB", "PIN");
                    }
                    if (pinBottomSheetDialogFragment != null) {
                        pinBottomSheetDialogFragment.A29();
                    }
                }
                ((A5V) this.A01).A03();
            }
        } else {
            ((C22821Di) this.A01).invoke(a7b);
        }
    }

    public void C7S(String str, String str2) {
        if (this.A00 != 0) {
            DialogFragment dialogFragment = (DialogFragment) this.A02;
            if (dialogFragment != null) {
                dialogFragment.A29();
            }
            Fragment fragment = (Fragment) ((A5V) this.A01).A0D;
            AnonymousClass1FL A1D = fragment.A1D();
            C17960vV.A06(str);
            fragment.startActivityForResult(AnonymousClass1LU.A1g(A1D, str, str2, true, false), 1);
            return;
        }
        C18070vi.A0d(str, 0);
        ((AnonymousClass1OS) this.A02).invoke(str, str2);
    }
}
