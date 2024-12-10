package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.payments.ui.widget.PayToolbar;

/* renamed from: X.5h9  reason: invalid class name and case insensitive filesystem */
public abstract class C110815h9 extends Toolbar implements AnonymousClass009 {
    public AnonymousClass031 A00;

    public void A0X() {
        C114555r4 r2 = (C114555r4) this;
        if (!r2.A00) {
            r2.A00 = true;
            PayToolbar payToolbar = (PayToolbar) r2;
            AnonymousClass10E r1 = ((C27691Xc) ((AnonymousClass033) r2.generatedComponent())).A10;
            payToolbar.A00 = (C27841Xv) r1.A00.A0M.get();
            payToolbar.A04 = AnonymousClass10E.A6Q(r1);
            payToolbar.A05 = AnonymousClass10E.A8r(r1);
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

    public C110815h9(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A0X();
    }
}
