package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.whatsapp.WaTextView;
import com.whatsapp.util.Log;

/* renamed from: X.4ZV  reason: invalid class name */
public final class AnonymousClass4ZV {
    public final Context A00;
    public final PopupWindow A01;
    public final WaTextView A02;
    public final AnonymousClass11C A03;
    public final C18000vb A04;

    public AnonymousClass4ZV(Context context, AnonymousClass11C r6, C18000vb r7) {
        this.A00 = context;
        this.A03 = r6;
        this.A04 = r7;
        WaTextView waTextView = new WaTextView(context);
        waTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.A02 = waTextView;
        this.A01 = new PopupWindow(waTextView, -2, -2, true);
    }

    public static final AnonymousClass1D6 A00(View view, View view2, AnonymousClass4ZV r17, Integer num, float f) {
        boolean z;
        int i;
        int i2;
        int[] iArr = new int[2];
        View view3 = view;
        view.getLocationInWindow(iArr);
        AnonymousClass4ZV r2 = r17;
        WaTextView waTextView = r2.A02;
        waTextView.measure(0, 0);
        Context context = r2.A00;
        int A012 = C62762rw.A01(context, 22.0f);
        int A013 = C62762rw.A01(context, 8.0f);
        int width = iArr[0] + (view3.getWidth() / 2);
        int height = iArr[1] + (view3.getHeight() / 2);
        int[] iArr2 = new int[2];
        View view4 = view2;
        view4.getLocationInWindow(iArr2);
        int width2 = iArr2[0] + view4.getWidth();
        Integer num2 = num;
        if ((num2 != AnonymousClass00R.A0C || !AnonymousClass3MY.A1b(r2.A04)) && (num2 != AnonymousClass00R.A0N || !AnonymousClass3MW.A1Z(r2.A04))) {
            z = false;
        } else {
            z = true;
        }
        Integer num3 = AnonymousClass00R.A0Y;
        boolean z2 = false;
        if (num2 == num3) {
            z2 = true;
        }
        if (z) {
            int i3 = width + A012;
            if (i3 >= width2) {
                i3 = width2 - A013;
            }
            i = i3 - A013;
        } else if (z2) {
            int i4 = width2 - width;
            if (i4 < 0) {
                i4 = 0;
            }
            if (i4 > width) {
                i4 = width;
            }
            i = (i4 * 2) - (A013 * 2);
        } else {
            int i5 = width - A012;
            if (i5 < 0) {
                i5 = 0;
            }
            int i6 = width2 - i5;
            if (i5 == 0) {
                i6 -= A013;
            }
            i = i6 - A013;
        }
        int measuredWidth = waTextView.getMeasuredWidth();
        int i7 = i;
        if (i > measuredWidth) {
            i7 = measuredWidth;
        }
        waTextView.setWidth(i7);
        if (z) {
            i2 = (i - i7) + A013;
        } else if (z2) {
            i2 = width - (i7 / 2);
        } else {
            i2 = width - A012;
        }
        if (num2 == AnonymousClass00R.A0N || num2 == num3) {
            waTextView.measure(0, 0);
            height -= waTextView.getMeasuredHeight();
        }
        return AnonymousClass1D6.A00(Integer.valueOf(i2 + C62762rw.A01(context, 0.0f)), height + C62762rw.A01(context, f));
    }

    public static final void A01(AnonymousClass4ZV r3, Integer num, int i) {
        if (i == 0) {
            i = 2131231198;
            if (num == AnonymousClass00R.A0Y) {
                i = 2131231199;
            }
        }
        r3.A02.setBackground(new AnonymousClass3NJ(C40501uo.A00((Resources.Theme) null, r3.A00.getResources(), i), num, AnonymousClass3MY.A1b(r3.A04)));
    }

    public final void A02() {
        try {
            PopupWindow popupWindow = this.A01;
            if (popupWindow.isShowing()) {
                popupWindow.dismiss();
            }
        } catch (IllegalArgumentException e) {
            Log.e("CallTooltipView/dismiss view already detached from window", e);
        }
    }
}
