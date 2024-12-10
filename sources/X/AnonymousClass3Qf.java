package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: X.3Qf  reason: invalid class name */
public final class AnonymousClass3Qf extends LinearLayout implements AnonymousClass009 {
    public C24921Me A00;
    public AnonymousClass031 A01;
    public boolean A02;
    public final View A03;
    public final ImageView A04;
    public final TextView A05;

    public AnonymousClass3Qf(Context context) {
        super(context, (AttributeSet) null, 0, 0);
        if (!this.A02) {
            this.A02 = true;
            this.A00 = AnonymousClass3MZ.A0g(AnonymousClass3MW.A0O(generatedComponent()));
        }
        View inflate = View.inflate(context, 2131626868, this);
        C18070vi.A0X(inflate);
        setGravity(17);
        this.A05 = AnonymousClass3Ma.A0E(inflate, 2131429428);
        ImageView A0C = AnonymousClass3Ma.A0C(inflate, 2131429453);
        this.A04 = A0C;
        this.A03 = C18070vi.A05(inflate, 2131429132);
        A0C.setImportantForAccessibility(2);
        AnonymousClass1Y5.A04(inflate, 2131899258);
    }

    public final void setWaContactNames(C24921Me r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A01;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public final C24921Me getWaContactNames() {
        C24921Me r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("waContactNames");
        throw null;
    }
}
