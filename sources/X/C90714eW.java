package X;

import android.view.animation.Animation;
import android.widget.TextView;
import com.whatsapp.components.CircularRevealView;

/* renamed from: X.4eW  reason: invalid class name and case insensitive filesystem */
public class C90714eW implements Animation.AnimationListener {
    public final int A00;
    public final Object A01;

    public C90714eW(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void onAnimationEnd(Animation animation) {
        if (this.A00 != 0) {
            AnonymousClass3RV r3 = (AnonymousClass3RV) this.A01;
            r3.A03.setVisibility(8);
            TextView textView = r3.A01;
            r3.setTextTranslation(textView, 2131886083, "__external__sup_bottom_sheet_glasses_switch_camera");
            textView.setVisibility(0);
            r3.setTextTranslation(r3.A02, 2131886082, "__external__sup_bottom_sheet_glasses_start_streaming_nux_title");
            r3.A04.A04();
            return;
        }
        ((CircularRevealView) this.A01).A04 = false;
    }

    public void onAnimationRepeat(Animation animation) {
        if (this.A00 == 0) {
            ((CircularRevealView) this.A01).A04 = true;
        }
    }

    public void onAnimationStart(Animation animation) {
        if (this.A00 == 0) {
            ((CircularRevealView) this.A01).A04 = true;
        }
    }
}
