package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;

/* renamed from: X.5wS  reason: invalid class name and case insensitive filesystem */
public class C116135wS extends C116145wT {
    public final TextView A00;
    public final C18000vb A01;
    public final C22851Dl A02 = new AnonymousClass7AN(this, 33);

    public void A0B() {
        this.A05 = null;
        CallGridViewModel callGridViewModel = this.A04;
        if (callGridViewModel != null) {
            callGridViewModel.A0K.A0D(this.A02);
        }
    }

    public void A0J(AnonymousClass70A r3) {
        CallGridViewModel callGridViewModel = this.A04;
        if (callGridViewModel != null) {
            callGridViewModel.A0K.A0C(this.A02);
        }
        A0K(r3);
        A0M(r3);
        this.A00.setVisibility(C72453Mb.A07(r3.A0W ? 1 : 0));
        A0L(r3, false);
        this.A05 = r3;
    }

    public C116135wS(View view, C72043Kk r4, C24771Lp r5, C143867Fc r6, AnonymousClass6bT r7, CallGridViewModel callGridViewModel, AnonymousClass1VW r9, C24921Me r10, C18000vb r11, C18030ve r12, AnonymousClass1DC r13, C18140vp r14) {
        super(view, r4, r5, r6, r7, callGridViewModel, r9, r10, r11, r12, r13, r14);
        this.A01 = r11;
        this.A00 = AnonymousClass3MW.A0J(view, 2131427880);
    }
}
