package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.whatsapp.wds.components.list.footer.WDSSectionFooter;

/* renamed from: X.3PQ  reason: invalid class name */
public abstract class AnonymousClass3PQ extends FrameLayout implements AnonymousClass009 {
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

    public AnonymousClass3PQ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            ((WDSSectionFooter) this).A00 = C72473Md.A0S((AnonymousClass033) generatedComponent());
        }
    }
}
