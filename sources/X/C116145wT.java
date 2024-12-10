package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;

/* renamed from: X.5wT  reason: invalid class name and case insensitive filesystem */
public class C116145wT extends C116165wV {
    public final TextView A00;

    public void A0E(int i) {
    }

    public void A0M(AnonymousClass70A r4) {
        AnonymousClass4ZN r1 = r4.A0C;
        if (r1 != null) {
            TextView textView = this.A00;
            CharSequence A03 = r1.A03(textView.getContext());
            textView.setVisibility(0);
            textView.setText(A03);
            return;
        }
        this.A00.setVisibility(8);
    }

    public C116145wT(View view, C72043Kk r3, C24771Lp r4, C143867Fc r5, AnonymousClass6bT r6, CallGridViewModel callGridViewModel, AnonymousClass1VW r8, C24921Me r9, C18000vb r10, C18030ve r11, AnonymousClass1DC r12, C18140vp r13) {
        super(view, r3, r4, r5, r6, callGridViewModel, r8, r9, r10, r11, r12, r13);
        this.A02 = 0;
        this.A00 = AnonymousClass3MW.A0J(view, 2131427886);
    }

    public void A0J(AnonymousClass70A r1) {
        A0M(r1);
        super.A0J(r1);
    }
}
