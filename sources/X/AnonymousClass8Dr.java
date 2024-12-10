package X;

import android.widget.RelativeLayout;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.payments.ui.widget.PaymentView;
import com.whatsapp.perf.MeasuringRelativeLayout;

/* renamed from: X.8Dr  reason: invalid class name */
public abstract class AnonymousClass8Dr extends RelativeLayout implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;

    public void A0A() {
        if (this instanceof AnonymousClass96c) {
            AnonymousClass96c r2 = (AnonymousClass96c) this;
            if (r2 instanceof PaymentView) {
                PaymentView paymentView = (PaymentView) r2;
                if (!paymentView.A1F) {
                    paymentView.A1F = true;
                    C27691Xc r1 = (C27691Xc) ((AnonymousClass033) paymentView.generatedComponent());
                    paymentView.A00 = C27691Xc.A0Z(r1);
                    AnonymousClass10E r4 = r1.A10;
                    AnonymousClass10G r3 = r4.A00;
                    paymentView.A06 = C108975cc.A0P(r3);
                    paymentView.A05 = AnonymousClass10E.A8r(r4);
                    paymentView.A04 = AnonymousClass10E.A6O(r4);
                    paymentView.A0O = AnonymousClass10E.A12(r4);
                    paymentView.A0N = AnonymousClass3MY.A0N(r4);
                    paymentView.A0z = AnonymousClass10E.AL1(r4);
                    paymentView.A0d = AnonymousClass3Ma.A0g(r4);
                    paymentView.A0b = AnonymousClass3Ma.A0f(r4);
                    paymentView.A0a = (C1193267r) r4.A9P.get();
                    paymentView.A0T = AnonymousClass3MZ.A0i(r4);
                    paymentView.A0R = AnonymousClass3MZ.A0e(r4);
                    paymentView.A13 = C000200d.A00(r1.A0V);
                    paymentView.A14 = C000200d.A00(r4.Aev);
                    paymentView.A0X = AnonymousClass3Ma.A0d(r4);
                    paymentView.A0U = AnonymousClass3Ma.A0a(r4);
                    paymentView.A15 = C000200d.A00(r4.AAP);
                    paymentView.A0f = (C140126zz) r3.AFN.get();
                    paymentView.A0u = (AnonymousClass1SB) r4.AAS.get();
                    paymentView.A0h = AnonymousClass8BU.A0Q(r4);
                    paymentView.A0W = AnonymousClass10E.A6Q(r4);
                    paymentView.A11 = C000200d.A00(r3.A1c);
                    paymentView.A0V = AnonymousClass3Ma.A0c(r4);
                    paymentView.A0i = AnonymousClass3Ma.A0q(r4);
                    paymentView.A0Y = (AnonymousClass1QR) r4.A8D.get();
                    paymentView.A0s = AnonymousClass3Ma.A0r(r4);
                    paymentView.A12 = C000200d.A00(r3.A1h);
                    paymentView.A0j = (C132646nG) r4.AcI.get();
                    AnonymousClass1K1 r12 = r1.A0z;
                    paymentView.A0c = (C131196kh) r12.A6E.get();
                    paymentView.A0e = AnonymousClass1K1.A18(r12);
                    paymentView.A0x = (C129276hX) r3.AHn.get();
                    paymentView.A16 = C000200d.A00(r3.AHg);
                    paymentView.A10 = C000200d.A00(r3.A8m);
                }
            } else if (!r2.A00) {
                r2.A00 = true;
                KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) r2;
                C27691Xc r13 = (C27691Xc) ((AnonymousClass033) r2.generatedComponent());
                keyboardPopupLayout.A00 = C27691Xc.A0Z(r13);
                AnonymousClass10E r14 = r13.A10;
                keyboardPopupLayout.A06 = C108975cc.A0P(r14.A00);
                keyboardPopupLayout.A05 = AnonymousClass10E.A8r(r14);
                keyboardPopupLayout.A04 = AnonymousClass10E.A6O(r14);
            }
        } else if (!this.A01) {
            this.A01 = true;
            ((MeasuringRelativeLayout) this).A00 = C27691Xc.A0Z((C27691Xc) ((AnonymousClass033) generatedComponent()));
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
