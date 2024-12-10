package X;

import android.view.View;
import com.whatsapp.components.RoundCornerProgressBar;
import com.whatsapp.components.RoundCornerProgressBarV2;

/* renamed from: X.3O7  reason: invalid class name */
public abstract class AnonymousClass3O7 extends View implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;

    public void A00() {
        if (this instanceof RoundCornerProgressBarV2) {
            RoundCornerProgressBarV2 roundCornerProgressBarV2 = (RoundCornerProgressBarV2) this;
            if (!roundCornerProgressBarV2.A01) {
                roundCornerProgressBarV2.A01 = true;
                roundCornerProgressBarV2.A04 = C72473Md.A0S(AnonymousClass3MX.A0T(roundCornerProgressBarV2));
            }
        } else if (!this.A01) {
            this.A01 = true;
            ((RoundCornerProgressBar) this).A04 = C72473Md.A0S((AnonymousClass033) generatedComponent());
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }
}
