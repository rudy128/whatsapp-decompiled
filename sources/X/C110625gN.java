package X;

import android.widget.LinearLayout;

/* renamed from: X.5gN  reason: invalid class name and case insensitive filesystem */
public abstract class C110625gN extends LinearLayout implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;

    public static void A00(AnonymousClass10E r1, C120826Fn r2) {
        r2.A05 = (AnonymousClass11P) r1.AAv.get();
        r2.A08 = (C18030ve) r1.A04.get();
        r2.A01 = (AnonymousClass11S) r1.A63.get();
        r2.A07 = (AnonymousClass1KW) r1.A3d.get();
        r2.A02 = (AnonymousClass1M9) r1.A2f.get();
        r2.A04 = (AnonymousClass11C) r1.AAp.get();
        r2.A03 = (C24921Me) r1.ABX.get();
        r2.A06 = (C18000vb) r1.ABz.get();
        r2.A09 = (C18010vc) r1.A9s.get();
        r2.A00 = C19890zB.A00;
    }

    public void A03() {
        if (this instanceof C120786Fj) {
            C120786Fj r1 = (C120786Fj) this;
            if (!r1.A00) {
                r1.A00 = true;
                A00(C72463Mc.A0X(r1), r1);
            }
        } else if (this instanceof C120776Fi) {
            C120776Fi r12 = (C120776Fi) this;
            if (!r12.A00) {
                r12.A00 = true;
                A00(C72463Mc.A0X(r12), r12);
            }
        } else if (this instanceof C120766Fh) {
            C120766Fh r13 = (C120766Fh) this;
            if (!r13.A00) {
                r13.A00 = true;
                A00(C72463Mc.A0X(r13), r13);
            }
        } else if (this instanceof C120756Fg) {
            C120756Fg r14 = (C120756Fg) this;
            if (!r14.A00) {
                r14.A00 = true;
                A00(C72463Mc.A0X(r14), r14);
            }
        } else if (this instanceof C120746Ff) {
            C120746Ff r15 = (C120746Ff) this;
            if (!r15.A00) {
                r15.A00 = true;
                A00(C72463Mc.A0X(r15), r15);
            }
        } else if (this instanceof C120736Fe) {
            C120736Fe r2 = (C120736Fe) this;
            if (!r2.A09) {
                r2.A09 = true;
                AnonymousClass10E A0X = C72463Mc.A0X(r2);
                A00(A0X, r2);
                r2.A08 = C000200d.A00(A0X.AYQ);
                r2.A02 = AnonymousClass10E.A12(A0X);
                r2.A01 = AnonymousClass3MY.A0N(A0X);
                r2.A07 = AnonymousClass10E.AL1(A0X);
                r2.A00 = AnonymousClass3MZ.A0N(A0X);
                r2.A04 = (C32211gp) A0X.A9r.get();
                r2.A03 = AnonymousClass3Ma.A0b(A0X);
                r2.A06 = AnonymousClass3MZ.A13(A0X);
            }
        } else if (this instanceof AnonymousClass6FR) {
            AnonymousClass6FR r16 = (AnonymousClass6FR) this;
            if (!r16.A02) {
                r16.A02 = true;
                AnonymousClass10E A0X2 = C72463Mc.A0X(r16);
                A00(A0X2, r16);
                r16.A01 = (C88534a3) A0X2.A9G.get();
            }
        } else if (this instanceof AnonymousClass6FQ) {
            AnonymousClass6FQ r17 = (AnonymousClass6FQ) this;
            if (!r17.A01) {
                r17.A01 = true;
                A00(C72463Mc.A0X(r17), r17);
            }
        } else if (this instanceof AnonymousClass6FS) {
            AnonymousClass6FS r18 = (AnonymousClass6FS) this;
            if (!r18.A01) {
                r18.A01 = true;
                A00(C72463Mc.A0X(r18), r18);
            }
        } else if (this instanceof AnonymousClass6FT) {
            AnonymousClass6FT r22 = (AnonymousClass6FT) this;
            if (!r22.A03) {
                r22.A03 = true;
                AnonymousClass10E A0X3 = C72463Mc.A0X(r22);
                A00(A0X3, r22);
                r22.A00 = AnonymousClass10E.A12(A0X3);
                r22.A01 = AnonymousClass3MZ.A0e(A0X3);
            }
        } else if (this instanceof AnonymousClass6FP) {
            AnonymousClass6FP r19 = (AnonymousClass6FP) this;
            if (!r19.A01) {
                r19.A01 = true;
                A00(C72463Mc.A0X(r19), r19);
            }
        } else if (this instanceof C120716Fb) {
            C120716Fb r23 = (C120716Fb) this;
            if (r23 instanceof C120806Fl) {
                C120806Fl r24 = (C120806Fl) r23;
                if (!r24.A03) {
                    r24.A03 = true;
                    AnonymousClass10E A0X4 = C72463Mc.A0X(r24);
                    A00(A0X4, r24);
                    r24.A01 = AnonymousClass3MY.A0d(A0X4);
                    r24.A00 = (C36391no) A0X4.A8P.get();
                }
            } else if (!r23.A00) {
                r23.A00 = true;
                A00(C72463Mc.A0X(r23), r23);
            }
        } else if (!this.A01) {
            this.A01 = true;
            A00(((C27691Xc) ((AnonymousClass033) generatedComponent())).A10, (C120826Fn) this);
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
