package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.settings.SettingsRowBanner;

/* renamed from: X.3SB  reason: invalid class name */
public abstract class AnonymousClass3SB extends ConstraintLayout implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public AnonymousClass3SB(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            ((SettingsRowBanner) this).A00 = C72473Md.A0S((AnonymousClass033) generatedComponent());
        }
    }
}
