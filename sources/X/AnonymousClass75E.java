package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.RoundedBottomSheetDialogFragment;

/* renamed from: X.75E  reason: invalid class name */
public class AnonymousClass75E implements DialogInterface.OnShowListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AnonymousClass75E(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void onShow(DialogInterface dialogInterface) {
        if (this.A00 != 0) {
            Object obj = this.A02;
            View findViewById = ((Dialog) this.A01).findViewById(2131429948);
            if (findViewById != null) {
                BottomSheetBehavior A022 = BottomSheetBehavior.A02(findViewById);
                C18070vi.A0X(A022);
                A022.A0h = true;
                C114315qV.A00(A022, obj, 5);
                return;
            }
            return;
        }
        ((RoundedBottomSheetDialogFragment) this.A01).A2K(C123576Uz.A00((Dialog) this.A02, 2131429948));
    }
}
