package X;

import android.graphics.Rect;
import android.widget.PopupWindow;

/* renamed from: X.0Ko  reason: invalid class name and case insensitive filesystem */
public abstract class C03770Ko {
    public static void A01(PopupWindow popupWindow) {
        popupWindow.setIsClippedToScreen(true);
    }

    public static void A00(Rect rect, PopupWindow popupWindow) {
        popupWindow.setEpicenterBounds(rect);
    }
}
