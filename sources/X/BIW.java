package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.whatsapp.location.WaMapView;

public abstract class BIW extends FrameLayout implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;

    public void A00() {
        if (!this.A01) {
            this.A01 = true;
            ((WaMapView) this).A02 = C000200d.A00(((C27691Xc) ((AnonymousClass033) generatedComponent())).A10.A04);
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

    public BIW(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }
}
