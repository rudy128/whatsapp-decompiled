package X;

import android.widget.FrameLayout;

/* renamed from: X.3PN  reason: invalid class name */
public abstract class AnonymousClass3PN extends FrameLayout implements AnonymousClass009 {
    public AnonymousClass031 A00;

    public void A00() {
        if (this instanceof C80093wX) {
            C80093wX r2 = (C80093wX) this;
            if (!r2.A04) {
                r2.A04 = true;
                AnonymousClass10E A0X = C72463Mc.A0X(r2);
                r2.A04 = AnonymousClass3MZ.A13(A0X);
                r2.A02 = AnonymousClass3MY.A0Z(A0X);
                r2.A00 = AnonymousClass10E.A6Q(A0X);
                return;
            }
            return;
        }
        C80083wW r22 = (C80083wW) this;
        if (!r22.A07) {
            r22.A07 = true;
            AnonymousClass10E A0X2 = C72463Mc.A0X(r22);
            r22.A04 = AnonymousClass3MZ.A13(A0X2);
            r22.A04 = AnonymousClass3MZ.A0l(A0X2);
            r22.A06 = AnonymousClass3MY.A0Z(A0X2);
            r22.A01 = AnonymousClass10E.A17(A0X2);
            r22.A02 = AnonymousClass10E.A4z(A0X2);
            r22.A03 = AnonymousClass3Ma.A0a(A0X2);
            r22.A00 = C72453Mb.A0b(A0X2);
            r22.A05 = AnonymousClass10E.A6Q(A0X2);
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
