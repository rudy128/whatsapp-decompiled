package X;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.PopupWindow;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.WaEditText;
import java.util.Set;

/* renamed from: X.3RR  reason: invalid class name */
public abstract class AnonymousClass3RR extends PopupWindow {
    public int A00 = 0;
    public int A01 = -1;
    public boolean A02;
    public final Activity A03;
    public final AnonymousClass5YX A04;
    public final AnonymousClass11C A05;
    public final C19830z4 A06;
    public final AnonymousClass1L4 A07;
    public final Runnable A08;
    public final Set A09;
    public final AnonymousClass190 A0A;

    public static void A00(PopupWindow popupWindow) {
        popupWindow.setWidth(-1);
        popupWindow.setHeight(-2);
        popupWindow.setBackgroundDrawable(new BitmapDrawable());
        popupWindow.setTouchable(true);
        popupWindow.setFocusable(true);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setInputMethodMode(2);
        popupWindow.setAnimationStyle(0);
    }

    public static boolean A01(Point point, View view) {
        int i;
        int i2;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i3 = point.x;
        int i4 = iArr[0];
        if (i3 < i4 || i3 > i4 + view.getWidth() || (i = point.y) < (i2 = iArr[1]) || i > AnonymousClass3MW.A02(view, i2)) {
            return false;
        }
        return true;
    }

    public void A08(WaEditText waEditText) {
        this.A02 = true;
        A07();
        dismiss();
        AnonymousClass5YX r6 = this.A04;
        KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) r6;
        if (keyboardPopupLayout.A03 != null) {
            keyboardPopupLayout.A03 = null;
            keyboardPopupLayout.requestLayout();
        }
        C70603Bt r4 = new C70603Bt(this, 19);
        InputMethodManager A0N = this.A05.A0N();
        if (waEditText != null) {
            waEditText.requestFocus();
        }
        Handler A0D = C17890vO.A0D();
        Set set = this.A09;
        if (!A0N.showSoftInput(waEditText, 0, new AnonymousClass3NV(A0D, r4, set))) {
            keyboardPopupLayout.A09 = false;
            ((View) r6).requestLayout();
            set.remove(r4);
        }
    }

    public void A0C() {
        this.A01 = A0B(-1);
    }

    public void A0D() {
        this.A02 = false;
    }

    public void A07() {
        AnonymousClass5YX r2 = this.A04;
        Handler handler = ((View) r2).getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.A08);
        }
        ((KeyboardPopupLayout) r2).A09 = true;
    }

    public void A09(WaEditText waEditText) {
        C70603Bt r5 = new C70603Bt(this, 21);
        InputMethodManager A0N = this.A05.A0N();
        if (waEditText != null) {
            waEditText.requestFocus();
        }
        Handler A0D = C17890vO.A0D();
        Set set = this.A09;
        if (!A0N.hideSoftInputFromWindow(waEditText.getWindowToken(), 0, new AnonymousClass3NV(A0D, r5, set))) {
            AnonymousClass5YX r1 = this.A04;
            ((KeyboardPopupLayout) r1).A09 = false;
            ((View) r1).requestLayout();
            set.remove(r5);
        }
    }

    public boolean A0A() {
        if (Build.VERSION.SDK_INT < 24 || !this.A03.isInMultiWindowMode()) {
            return false;
        }
        return true;
    }

    public int A0B(int i) {
        SharedPreferences sharedPreferences;
        String str;
        int A002;
        int i2;
        SharedPreferences.Editor A003;
        String str2;
        SharedPreferences sharedPreferences2;
        String str3;
        int A004;
        int i3;
        SharedPreferences.Editor A005;
        String str4;
        if (this instanceof C74853d1) {
            return ((C74853d1) this).A00;
        }
        if (this instanceof C74873d3) {
            Point point = new Point();
            Activity activity = this.A03;
            C72463Mc.A0u(activity, point);
            int i4 = point.y;
            int A082 = C72453Mb.A08(activity);
            if (A082 == 1) {
                sharedPreferences2 = C17890vO.A0B(this.A06);
                str3 = "keyboard_height_portrait";
                A004 = C17890vO.A00(sharedPreferences2, str3);
            } else if (A082 != 2) {
                A004 = 0;
            } else {
                sharedPreferences2 = C17890vO.A0B(this.A06);
                str3 = "keyboard_height_landscape";
                A004 = C17890vO.A00(sharedPreferences2, str3);
            }
            if (this.A00 == 1 && i > 0 && !A0A()) {
                i3 = Math.min(i4 / 2, i);
            } else if (A004 > 0) {
                i3 = Math.min(i4 / 2, A004);
            } else {
                i3 = (i4 * 3) / 8;
            }
            int A083 = C72453Mb.A08(activity);
            if (A083 != 1) {
                if (A083 == 2) {
                    A005 = C19830z4.A00(this.A06);
                    str4 = "keyboard_height_landscape";
                }
                return i3;
            }
            A005 = C19830z4.A00(this.A06);
            str4 = "keyboard_height_portrait";
            C17880vN.A1C(A005, str4, i3);
            return i3;
        }
        C74863d2 r2 = (C74863d2) this;
        Point point2 = new Point();
        Activity activity2 = r2.A03;
        C72463Mc.A0u(activity2, point2);
        int i5 = point2.y;
        int A084 = C72453Mb.A08(activity2);
        if (A084 == 1) {
            sharedPreferences = C17890vO.A0B(r2.A06);
            str = "keyboard_height_portrait";
            A002 = C17890vO.A00(sharedPreferences, str);
        } else if (A084 != 2) {
            A002 = 0;
        } else {
            sharedPreferences = C17890vO.A0B(r2.A06);
            str = "keyboard_height_landscape";
            A002 = C17890vO.A00(sharedPreferences, str);
        }
        if (i > 0 && !r2.A0A()) {
            i2 = Math.min(i5 / 2, i);
        } else if (A002 > 0) {
            i2 = Math.min(i5 / 2, A002);
        } else {
            i2 = (i5 * 3) / 8;
        }
        int A085 = C72453Mb.A08(activity2);
        if (A085 != 1) {
            if (A085 == 2) {
                A003 = C19830z4.A00(r2.A06);
                str2 = "keyboard_height_landscape";
            }
            return Math.max(i2, r2.A02.getPopupHeightV2());
        }
        A003 = C19830z4.A00(r2.A06);
        str2 = "keyboard_height_portrait";
        C17880vN.A1C(A003, str2, i2);
        return Math.max(i2, r2.A02.getPopupHeightV2());
    }

    public AnonymousClass3RR(Activity activity, AnonymousClass190 r4, AnonymousClass5YX r5, AnonymousClass11C r6, C19830z4 r7, AnonymousClass1L4 r8) {
        super(activity);
        this.A03 = activity;
        this.A07 = r8;
        this.A0A = r4;
        this.A05 = r6;
        this.A06 = r7;
        this.A04 = r5;
        this.A09 = C17880vN.A12();
        this.A08 = new C70603Bt(r5, 20);
    }

    public void dismiss() {
        if (isShowing()) {
            A0C();
            super.dismiss();
            AnonymousClass5YX r2 = this.A04;
            KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) r2;
            if (keyboardPopupLayout.A03 != null) {
                keyboardPopupLayout.A03 = null;
                keyboardPopupLayout.requestLayout();
            }
            ((View) r2).requestLayout();
        }
    }
}
