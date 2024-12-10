package X;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

/* renamed from: X.4W2  reason: invalid class name */
public abstract class AnonymousClass4W2 {
    public static final int A00(int i, boolean z) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 11;
            case 2:
                return 14;
            case 3:
                return 10;
            case 4:
                return 8;
            case 5:
                return z ? 12 : 4;
            case 6:
                return 13;
            case 7:
                return 9;
            default:
                return 15;
        }
    }

    public static final void A01(Activity activity, View view, int i) {
        View view2;
        Window window = activity.getWindow();
        if (view != null) {
            view2 = view;
        } else if (window != null) {
            view2 = window.getDecorView();
        } else {
            return;
        }
        C23520Bik A01 = C23520Bik.A01(view2, i, -1);
        BIE bie = A01.A0J;
        C18070vi.A0X(bie);
        if (view == null) {
            C90574eI.A00(bie.getViewTreeObserver(), activity, bie, 7);
        }
        TextView A0E = C17880vN.A0E(bie, 2131435508);
        if (A0E != null) {
            A0E.setSingleLine(false);
        }
        A01.A08();
    }
}
