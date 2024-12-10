package X;

import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.5wR  reason: invalid class name and case insensitive filesystem */
public final class C116125wR extends C113615nN {
    public C108525bq A00;
    public WDSButton A01;
    public final LinearLayout A02;
    public final CallGridViewModel A03;
    public final WDSButton A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C116125wR(View view, C24771Lp r10, CallGridViewModel callGridViewModel, AnonymousClass1VW r12, C24921Me r13) {
        super(view, r10, (AnonymousClass6bT) null, callGridViewModel, r12, r13);
        C18070vi.A0s(r10, view, r12, r13);
        this.A03 = callGridViewModel;
        this.A02 = (LinearLayout) view.findViewById(2131429504);
        this.A04 = (WDSButton) C18070vi.A05(view, 2131435804);
        this.A01 = AnonymousClass3MW.A0r(view, 2131432758);
    }

    public void A0E(int i) {
    }

    public void A0J(AnonymousClass70A r3) {
        C18070vi.A0d(r3, 0);
        this.A05 = r3;
        LinearLayout linearLayout = this.A02;
        if (linearLayout != null) {
            linearLayout.setRotation((float) r3.A04);
        }
        C89994dM.A00(this.A04, this, r3, 14);
        WDSButton wDSButton = this.A01;
        if (wDSButton != null) {
            C89874dA.A00(wDSButton, this, 18);
        }
    }

    public void A0B() {
        if (this.A05 != null) {
            this.A05 = null;
            this.A04.setOnClickListener((View.OnClickListener) null);
        }
    }
}
