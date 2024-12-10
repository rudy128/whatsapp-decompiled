package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import com.whatsapp.WaTextView;

/* renamed from: X.790  reason: invalid class name */
public class AnonymousClass790 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public AnonymousClass790(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj3;
        this.A02 = obj2;
        this.A03 = obj;
    }

    public void onGlobalLayout() {
        ViewTreeObserver viewTreeObserver;
        boolean isAlive;
        boolean isAlive2;
        int i;
        switch (this.A00) {
            case 0:
                try {
                    C108945cZ.A1P(this.A01);
                    if ((!isAlive && viewTreeObserver == null) || !isAlive2) {
                        throw AnonymousClass000.A0k("Given null or dead view tree observer.");
                    }
                    return;
                } finally {
                    viewTreeObserver = (ViewTreeObserver) this.A02;
                    if ((viewTreeObserver.isAlive() || (viewTreeObserver = ((View) this.A03).getViewTreeObserver()) != null) && viewTreeObserver.isAlive()) {
                        viewTreeObserver.removeOnGlobalLayoutListener(this);
                        throw th;
                    } else {
                        IllegalArgumentException A0k = AnonymousClass000.A0k("Given null or dead view tree observer.");
                    }
                }
            case 1:
                View view = (View) this.A02;
                AnonymousClass3MY.A1D(view, this);
                AnonymousClass75M.A0E((AnonymousClass75M) this.A01, (Float) this.A03, view.getMeasuredHeight(), false);
                return;
            default:
                C130106it r6 = (C130106it) this.A03;
                WaTextView waTextView = r6.A03;
                C18000vb r7 = r6.A04;
                waTextView.setBackground(AnonymousClass3NL.A00(r6.A01, r7, 2131232870));
                switch (((Number) this.A02).intValue()) {
                    case 0:
                        i = 2131886772;
                        break;
                    case 1:
                    case 2:
                        i = 2131896131;
                        break;
                    case 3:
                        i = 2131896132;
                        break;
                    default:
                        i = 2131896130;
                        break;
                }
                waTextView.setText(i);
                View view2 = (View) this.A01;
                int[] iArr = r6.A05;
                view2.getLocationInWindow(iArr);
                int i2 = iArr[0] + r6.A00;
                int A06 = iArr[1] - C108945cZ.A06(view2);
                PopupWindow popupWindow = r6.A02;
                int i3 = 8388659;
                if (AnonymousClass3MW.A1Z(r7)) {
                    i3 = 8388661;
                }
                popupWindow.showAtLocation(view2, i3, i2, A06);
                view2.postDelayed(C108945cZ.A0X(r6, 2), 5000);
                AnonymousClass3MY.A1D(view2, this);
                return;
        }
    }
}
