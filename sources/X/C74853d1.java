package X;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.numberkeyboard.NumberEntryKeyboard;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3d1  reason: invalid class name and case insensitive filesystem */
public class C74853d1 extends AnonymousClass3RR {
    public final int A00;
    public final NumberEntryKeyboard A01;
    public final List A02;
    public final AnonymousClass448 A03;

    public C74853d1(Activity activity, AnonymousClass190 r14, AnonymousClass5YX r15, AnonymousClass11C r16, C19830z4 r17, E8G e8g, AnonymousClass448 r19, AnonymousClass1L4 r20, List list) {
        super(activity, r14, r15, r16, r17, r20);
        AnonymousClass448 r1 = r19;
        this.A03 = r1;
        List list2 = list;
        this.A02 = list2;
        NumberEntryKeyboard numberEntryKeyboard = new NumberEntryKeyboard(activity);
        this.A01 = numberEntryKeyboard;
        numberEntryKeyboard.A04 = r1;
        numberEntryKeyboard.setCustomKey(e8g);
        r1.setCustomCursorEnabled(true);
        setContentView(numberEntryKeyboard);
        setTouchable(true);
        setOutsideTouchable(true);
        setInputMethodMode(2);
        setAnimationStyle(0);
        setBackgroundDrawable(new ColorDrawable(-1));
        setTouchInterceptor(new C90304dr(list2, this, 12));
        numberEntryKeyboard.measure(View.MeasureSpec.makeMeasureSpec(activity.getWindowManager().getDefaultDisplay().getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.A00 = numberEntryKeyboard.getMeasuredHeight();
    }

    public void dismiss() {
        this.A03.setHasFocus(false);
        super.dismiss();
    }

    public static void A02(C74853d1 r4) {
        if (!r4.isShowing()) {
            Activity activity = r4.A03;
            if (activity.getCurrentFocus() != null) {
                activity.getCurrentFocus().clearFocus();
            }
            r4.setHeight(r4.A00);
            r4.setWidth(-1);
            AnonymousClass5YX r3 = r4.A04;
            r3.setKeyboardPopup(r4);
            KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) r3;
            if (keyboardPopupLayout.A09) {
                View view = (View) r3;
                C90584eJ.A00(view.getViewTreeObserver(), r4, 26);
                keyboardPopupLayout.A09 = false;
                view.requestLayout();
            } else if (!r4.isShowing()) {
                r4.showAtLocation((View) r3, 48, 0, 1000000);
            }
            r4.A03.setHasFocus(true);
        }
    }

    public void A0D() {
        if (!isShowing()) {
            this.A02 = false;
            Iterator it = this.A02.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                View A0E = AnonymousClass3MX.A0E(it);
                if (AnonymousClass1L4.A00(A0E)) {
                    if (A0E != null) {
                        AnonymousClass5YX r7 = this.A04;
                        KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) r7;
                        keyboardPopupLayout.A09 = true;
                        InputMethodManager A0N = this.A05.A0N();
                        A0N.getClass();
                        if (!A0N.hideSoftInputFromWindow(A0E.getWindowToken(), 0, new AnonymousClass3NV(C17890vO.A0D(), new C21425Ajs((Object) this, 17), this.A09))) {
                            keyboardPopupLayout.A09 = false;
                            ((View) r7).requestLayout();
                            return;
                        }
                        return;
                    }
                }
            }
            A02(this);
        }
    }
}
