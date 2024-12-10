package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.4bG  reason: invalid class name */
public final /* synthetic */ class AnonymousClass4bG implements DialogInterface.OnShowListener {
    public final void onShow(DialogInterface dialogInterface) {
        View findViewById = ((Dialog) dialogInterface).findViewById(2131429948);
        C17960vV.A05(findViewById);
        BottomSheetBehavior A02 = BottomSheetBehavior.A02(findViewById);
        A02.A0W(3);
        A02.A0Y(findViewById.getHeight(), false);
    }
}
