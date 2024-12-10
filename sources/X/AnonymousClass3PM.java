package X;

import android.widget.FrameLayout;

/* renamed from: X.3PM  reason: invalid class name */
public abstract class AnonymousClass3PM extends FrameLayout implements AnonymousClass009 {
    public AnonymousClass031 A00;

    public void A01() {
        if (this instanceof C79153uk) {
            C79153uk r2 = (C79153uk) this;
            if (!r2.A00) {
                r2.A00 = true;
                AnonymousClass033 A0T = AnonymousClass3MX.A0T(r2);
                C79133ud r22 = (C79133ud) r2;
                AnonymousClass10E r1 = ((C27691Xc) A0T).A10;
                r22.A00 = AnonymousClass3Ma.A0L(r1);
                r22.A01 = AnonymousClass3Ma.A0a(r1);
                r22.A01 = AnonymousClass10E.A8r(r1);
                r22.A00 = (C218617r) r1.A8v.get();
                r22.A02 = AnonymousClass3Ma.A0g(r1);
                return;
            }
            return;
        }
        C79143uj r23 = (C79143uj) this;
        if (!r23.A00) {
            r23.A00 = true;
            AnonymousClass10E A0X = C72463Mc.A0X(r23);
            r23.A00 = AnonymousClass3Ma.A0L(A0X);
            r23.A01 = AnonymousClass3Ma.A0a(A0X);
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
