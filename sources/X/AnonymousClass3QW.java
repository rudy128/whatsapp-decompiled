package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.whatsapp.wds.components.actiontile.WDSActionTile;

/* renamed from: X.3QW  reason: invalid class name */
public abstract class AnonymousClass3QW extends LinearLayout implements AnonymousClass009 {
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

    public AnonymousClass3QW(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            ((WDSActionTile) this).A04 = AnonymousClass10E.A8r(((C27691Xc) ((AnonymousClass033) generatedComponent())).A10);
        }
    }
}
