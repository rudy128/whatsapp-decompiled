package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.3Rk  reason: invalid class name */
public abstract class AnonymousClass3Rk extends C007803n implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;

    public void A06() {
        if (this instanceof AnonymousClass4C0) {
            AnonymousClass4C0 r2 = (AnonymousClass4C0) this;
            if (!r2.A04) {
                r2.A04 = true;
                AnonymousClass10E A0X = C72463Mc.A0X(r2);
                A00(A0X, r2);
                r2.A00 = AnonymousClass10E.A46(A0X);
                r2.A01 = AnonymousClass10E.A48(A0X);
                r2.A03 = C000200d.A00(A0X.A2P);
                r2.A02 = AnonymousClass10E.AL1(A0X);
            }
        } else if (this instanceof AnonymousClass4Bz) {
            AnonymousClass4Bz r22 = (AnonymousClass4Bz) this;
            if (!r22.A04) {
                r22.A04 = true;
                AnonymousClass10E A0X2 = C72463Mc.A0X(r22);
                A00(A0X2, r22);
                r22.A00 = AnonymousClass10E.A46(A0X2);
                r22.A01 = AnonymousClass10E.A48(A0X2);
                r22.A03 = C000200d.A00(A0X2.A2P);
                r22.A02 = AnonymousClass10E.AL1(A0X2);
            }
        } else if (this instanceof AnonymousClass4C1) {
            AnonymousClass4C1 r23 = (AnonymousClass4C1) this;
            if (!r23.A05) {
                r23.A05 = true;
                AnonymousClass10E A0X3 = C72463Mc.A0X(r23);
                A00(A0X3, r23);
                r23.A01 = AnonymousClass10E.A46(A0X3);
                r23.A02 = AnonymousClass10E.A48(A0X3);
                r23.A04 = C000200d.A00(A0X3.A2P);
                r23.A00 = AnonymousClass10E.A17(A0X3);
                r23.A03 = AnonymousClass10E.AL1(A0X3);
            }
        } else if (this instanceof AnonymousClass4By) {
            AnonymousClass4By r24 = (AnonymousClass4By) this;
            if (!r24.A04) {
                r24.A04 = true;
                AnonymousClass10E A0X4 = C72463Mc.A0X(r24);
                A00(A0X4, r24);
                r24.A00 = AnonymousClass10E.A46(A0X4);
                r24.A01 = AnonymousClass10E.A48(A0X4);
                r24.A03 = C000200d.A00(A0X4.A2P);
                r24.A02 = AnonymousClass10E.AL1(A0X4);
            }
        } else if (this instanceof AnonymousClass4Bx) {
            AnonymousClass4Bx r25 = (AnonymousClass4Bx) this;
            if (!r25.A02) {
                r25.A02 = true;
                C27691Xc A0O = AnonymousClass3MY.A0O(r25);
                A00(A0O.A10, r25);
                r25.A00 = (AnonymousClass5XN) A0O.A0B.get();
            }
        } else if (!this.A01) {
            this.A01 = true;
            A00(((C27691Xc) ((AnonymousClass033) generatedComponent())).A10, (WDSButton) this);
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

    public AnonymousClass3Rk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A06();
    }

    public static void A00(AnonymousClass10E r1, WDSButton wDSButton) {
        wDSButton.A02 = (AnonymousClass19D) r1.A02.get();
        wDSButton.A03 = (C18030ve) r1.A04.get();
        wDSButton.A04 = (AnonymousClass1DC) r1.A95.get();
        wDSButton.A01 = (C18000vb) r1.ABz.get();
    }
}
