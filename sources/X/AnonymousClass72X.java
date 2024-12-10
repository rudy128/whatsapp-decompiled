package X;

import android.view.View;
import android.widget.PopupWindow;
import java.util.ArrayList;

/* renamed from: X.72X  reason: invalid class name */
public abstract class AnonymousClass72X {
    public static void A01(View view, View view2, PopupWindow popupWindow) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getRootView().getLocationOnScreen(iArr2);
        popupWindow.showAtLocation(view2, 51, ((iArr[0] - Math.max(0, iArr2[0])) + (view.getMeasuredWidth() / 2)) - (popupWindow.getContentView().getMeasuredWidth() / 2), ((iArr[1] - Math.max(0, iArr2[1])) - popupWindow.getContentView().getMeasuredHeight()) - AnonymousClass000.A0Y(view).getDimensionPixelSize(2131168736));
    }

    public static int[] A03(int[] iArr) {
        ArrayList A0z = C17880vN.A0z(r5);
        for (int i : iArr) {
            if (i != 65039) {
                C17890vO.A1D(A0z, i);
            }
        }
        int size = A0z.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = AnonymousClass000.A0M(A0z.get(i2));
        }
        return iArr2;
    }

    public static String A00(String str) {
        return new AnonymousClass737(A03(new AnonymousClass737(str).A00)).toString();
    }

    public static boolean A02(CharSequence charSequence) {
        C43281zY r5 = new C43281zY(charSequence);
        long A00 = C43291zZ.A00(r5, false);
        if (!AnonymousClass000.A1O((A00 > -1 ? 1 : (A00 == -1 ? 0 : -1))) || r5.A02(A00, 0) != r5.A01().length) {
            return false;
        }
        return true;
    }
}
