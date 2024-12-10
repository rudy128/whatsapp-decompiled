package X;

import android.widget.FrameLayout;

/* renamed from: X.5fc  reason: invalid class name and case insensitive filesystem */
public abstract class C110425fc extends FrameLayout implements AnonymousClass009 {
    public AnonymousClass031 A00;

    public void A03() {
        if (this instanceof AnonymousClass6F7) {
            AnonymousClass6F7 r1 = (AnonymousClass6F7) this;
            if (!r1.A00) {
                r1.A00 = true;
                A00(r1);
            }
        } else if (this instanceof AnonymousClass6F6) {
            AnonymousClass6F6 r12 = (AnonymousClass6F6) this;
            if (!r12.A00) {
                r12.A00 = true;
                A00(r12);
            }
        } else if (this instanceof AnonymousClass6F8) {
            AnonymousClass6F8 r2 = (AnonymousClass6F8) this;
            if (!r2.A03) {
                r2.A03 = true;
                AnonymousClass10E A0X = C72463Mc.A0X(r2);
                r2.A00 = AnonymousClass10E.A8r(A0X);
                r2.A00 = AnonymousClass3MZ.A0g(A0X);
                r2.A02 = AnonymousClass3Ma.A0f(A0X);
                r2.A01 = AnonymousClass10E.A6Q(A0X);
            }
        } else if (this instanceof AnonymousClass6F5) {
            AnonymousClass6F5 r13 = (AnonymousClass6F5) this;
            if (!r13.A00) {
                r13.A00 = true;
                A00(r13);
            }
        } else if (this instanceof AnonymousClass6F4) {
            AnonymousClass6F4 r14 = (AnonymousClass6F4) this;
            if (!r14.A00) {
                r14.A00 = true;
                A00(r14);
            }
        } else {
            AnonymousClass6F3 r15 = (AnonymousClass6F3) this;
            if (!r15.A00) {
                r15.A00 = true;
                A00(r15);
            }
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

    public static void A00(AnonymousClass6F9 r1) {
        r1.A00 = (C18030ve) ((C27691Xc) ((AnonymousClass033) r1.generatedComponent())).A10.A04.get();
    }
}
