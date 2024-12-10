package X;

import android.widget.ProgressBar;
import com.whatsapp.payments.ui.international.IndiaUpiInternationalActivationActivity;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.Azv  reason: case insensitive filesystem */
public final class C22241Azv extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ IndiaUpiInternationalActivationActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22241Azv(IndiaUpiInternationalActivationActivity indiaUpiInternationalActivationActivity) {
        super(1);
        this.this$0 = indiaUpiInternationalActivationActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A1l a1l = (A1l) obj;
        boolean z = a1l.A02;
        ProgressBar progressBar = this.this$0.A02;
        if (z) {
            if (progressBar != null) {
                progressBar.setVisibility(0);
                WDSButton wDSButton = this.this$0.A09;
                if (wDSButton != null) {
                    AnonymousClass3MW.A1S(wDSButton);
                }
                C18070vi.A11("buttonView");
                throw null;
            }
            C18070vi.A11("buttonSpinnerView");
            throw null;
        }
        if (progressBar != null) {
            progressBar.setVisibility(8);
            WDSButton wDSButton2 = this.this$0.A09;
            if (wDSButton2 != null) {
                wDSButton2.setText(2131887458);
            }
            C18070vi.A11("buttonView");
            throw null;
        }
        C18070vi.A11("buttonSpinnerView");
        throw null;
        C194549ru r1 = a1l.A00;
        if (r1 != null) {
            C73203Rj A00 = AnonymousClass4a6.A00(this.this$0);
            A00.A0T(false);
            A00.A0k(r1.A01);
            A00.A0S(r1.A00);
            C20155A9r.A00(A00, this.this$0, 27, 2131898783);
            AnonymousClass3MY.A1G(A00);
        }
        return C27621Wu.A00;
    }
}
