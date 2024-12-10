package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.whatsapp.wds.components.actiontile.WDSActionTileGroup;

/* renamed from: X.3QX  reason: invalid class name */
public abstract class AnonymousClass3QX extends LinearLayout implements AnonymousClass009 {
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

    public AnonymousClass3QX(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            ((WDSActionTileGroup) this).A01 = AnonymousClass10E.A8r(((C27691Xc) ((AnonymousClass033) generatedComponent())).A10);
        }
    }
}
