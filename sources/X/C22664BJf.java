package X;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Button;
import android.widget.TextView;
import com.whatsapp.WaTextView;

/* renamed from: X.BJf  reason: case insensitive filesystem */
public class C22664BJf extends AnonymousClass1XU {
    public final int A00;

    public C22664BJf(int i) {
        this.A00 = i;
    }

    public void A1U(View view, AccessibilityEvent accessibilityEvent) {
        if (this.A00 != 0) {
            super.A1U(view, accessibilityEvent);
            return;
        }
        C18070vi.A0d(view, 0);
        view.setLongClickable(false);
    }

    public void A1Z(View view, C26228CvK cvK) {
        switch (this.A00) {
            case 1:
                super.A1Z(view, cvK);
                cvK.A0M(C26137Ct0.A08);
                cvK.A0f(false);
                cvK.A0m(false);
                if (view instanceof WaTextView) {
                    cvK.A0X(((TextView) view).getText());
                }
                view.setClickable(false);
                view.setLongClickable(false);
                return;
            case 2:
                super.A1Z(view, cvK);
                cvK.A0O(Button.class.getName());
                cvK.A0f(true);
                return;
            case 3:
                boolean A15 = C18070vi.A15(view, cvK);
                super.A1Z(view, cvK);
                cvK.A0f(A15);
                cvK.A0m(A15);
                cvK.A0M(C26137Ct0.A08);
                cvK.A0M(C26137Ct0.A0L);
                return;
            case 4:
                boolean A152 = C18070vi.A15(view, cvK);
                super.A1Z(view, cvK);
                cvK.A0k(A152);
                cvK.A0V("Button");
                return;
            default:
                super.A1Z(view, cvK);
                return;
        }
    }
}
