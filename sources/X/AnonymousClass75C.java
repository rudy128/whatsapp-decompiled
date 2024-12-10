package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.expressionstray.expression.stickers.SearchFunStickersBottomSheet;

/* renamed from: X.75C  reason: invalid class name */
public class AnonymousClass75C implements DialogInterface.OnShowListener {
    public final int A00;
    public final Object A01;

    public AnonymousClass75C(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onShow(DialogInterface dialogInterface) {
        Dialog dialog;
        View findViewById;
        C136986uj r0;
        View findViewById2;
        View rootView;
        switch (this.A00) {
            case 0:
                SearchFunStickersBottomSheet searchFunStickersBottomSheet = (SearchFunStickersBottomSheet) this.A01;
                if ((dialogInterface instanceof C110745gz) && (dialog = (Dialog) dialogInterface) != null && (findViewById = dialog.findViewById(2131429948)) != null) {
                    BottomSheetBehavior.A02(findViewById).A0Z(searchFunStickersBottomSheet.A0U);
                    return;
                }
                return;
            case 1:
                r0 = ((AnonymousClass7JF) this.A01).A0W;
                break;
            case 2:
                AnonymousClass7JF.A03((AnonymousClass7JF) this.A01);
                return;
            default:
                AnonymousClass7JF r5 = (AnonymousClass7JF) this.A01;
                C109225d1 r1 = r5.A04;
                if (!(r1 == null || (findViewById2 = r1.findViewById(16908290)) == null || (rootView = findViewById2.getRootView()) == null)) {
                    View view = r5.A09;
                    C72463Mc.A0v(view.getContext(), view.getContext(), rootView, 2130968810, 2131099888);
                }
                r0 = r5.A0W;
                break;
        }
        r0.A02();
    }
}
