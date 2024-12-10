package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.whatsapp.payments.ui.widget.PaymentInteropShimmerRow;

/* renamed from: X.8Db  reason: invalid class name and case insensitive filesystem */
public abstract class C161408Db extends LinearLayout implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;

    public void A01() {
        if (!this.A01) {
            this.A01 = true;
            PaymentInteropShimmerRow paymentInteropShimmerRow = (PaymentInteropShimmerRow) this;
            AnonymousClass10E r1 = ((C27691Xc) ((AnonymousClass033) generatedComponent())).A10;
            paymentInteropShimmerRow.A01 = AnonymousClass3MZ.A0z(r1);
            paymentInteropShimmerRow.A02 = (AQF) r1.A00.A3k.get();
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

    public C161408Db(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
    }
}
