package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity;
import java.util.List;

/* renamed from: X.9t6  reason: invalid class name and case insensitive filesystem */
public class C195289t6 {
    public View A00;
    public ImageView A01;
    public TextView A02;
    public final int A03;
    public final AnonymousClass91y A04;

    public void A00() {
        ViewStub viewStub = (ViewStub) AnonymousClass1HF.A06(this.A04.A00, 2131429861);
        viewStub.setLayoutResource(2131625062);
        View inflate = viewStub.inflate();
        this.A00 = AnonymousClass1HF.A06(inflate, 2131429860);
        this.A01 = AnonymousClass3MW.A0G(inflate, 2131429859);
        this.A02 = AnonymousClass3MW.A0J(inflate, 2131429862);
    }

    public void A01(C20284AEs aEs, boolean z) {
        AnonymousClass91y r0;
        AnonymousClass8pY r02;
        AnonymousClass8pY r1;
        AnonymousClass4aX.A0D(this.A01, this.A03);
        boolean A1T = AnonymousClass000.A1T(aEs.A01, 2);
        this.A01.setImageResource(2131232317);
        TextView textView = this.A02;
        int i = 2131889246;
        if (A1T) {
            i = 2131889245;
        }
        textView.setText(i);
        View view = this.A00;
        if (!A1T) {
            r0 = this.A04;
        } else {
            r0 = null;
        }
        view.setOnClickListener(r0);
        if (A8e.A08(aEs) && (r02 = (AnonymousClass8pY) aEs.A08) != null && !r02.A0X) {
            if (this instanceof C1763090o) {
                C1763090o r3 = (C1763090o) this;
                C20284AEs aEs2 = r3.A04.A04;
                if (A8e.A08(aEs2) && (r1 = (AnonymousClass8pY) aEs2.A08) != null) {
                    if (!r1.A0X) {
                        r3.A02.setVisibility(8);
                    }
                    if (!r1.A0T) {
                        r3.A01.setVisibility(8);
                    }
                }
                r3.A00.setVisibility(8);
                return;
            }
            this.A00.setVisibility(8);
        }
    }

    public void A02(List list) {
        this.A01.setImageResource(2131232317);
        this.A02.setText(2131889245);
        this.A00.setOnClickListener((View.OnClickListener) null);
    }

    public C195289t6(AnonymousClass91y r3) {
        int A002;
        this.A04 = r3;
        if (r3 instanceof BrazilPaymentCardDetailsActivity) {
            A002 = 2131100602;
        } else {
            A002 = AnonymousClass1YL.A00(r3, 2130971195, 2131102531);
        }
        this.A03 = C19740yt.A00(r3, A002);
    }
}
