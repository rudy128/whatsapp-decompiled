package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.calling.callhistory.CallLogActivity;
import com.whatsapp.components.SelectionCheckView;

/* renamed from: X.4RY  reason: invalid class name */
public class AnonymousClass4RY {
    public final View A00;
    public final ImageView A01;
    public final ImageView A02;
    public final ImageView A03;
    public final TextView A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;
    public final TextView A09;
    public final C28931bI A0A;
    public final /* synthetic */ CallLogActivity A0B;

    public AnonymousClass4RY(View view, CallLogActivity callLogActivity) {
        this.A0B = callLogActivity;
        this.A00 = view;
        this.A02 = AnonymousClass3MW.A0H(view, 2131428749);
        this.A07 = C17880vN.A0E(view, 2131428746);
        this.A05 = C17880vN.A0E(view, 2131428664);
        this.A01 = AnonymousClass3MW.A0H(view, 2131428641);
        this.A06 = C17880vN.A0E(view, 2131428672);
        this.A04 = C17880vN.A0E(view, 2131428661);
        this.A08 = AnonymousClass3MW.A0J(view, 2131428757);
        this.A0A = C28931bI.A00(view, 2131435130);
        this.A03 = AnonymousClass3MW.A0G(view, 2131435451);
        this.A09 = AnonymousClass3MW.A0J(view, 2131435452);
        C42491yG.A02(view);
    }

    public void A00(boolean z, boolean z2, boolean z3) {
        C28931bI r4 = this.A0A;
        if ((r4.A00 != null || z) && ((SelectionCheckView) r4.A02()).A0D != z) {
            View view = this.A00;
            if (z) {
                view.setBackgroundResource(AnonymousClass1YL.A00(view.getContext(), 2130970064, 2131101205));
            } else if (z3) {
                C42491yG.A03(view);
            } else {
                C42491yG.A02(view);
            }
            ((SelectionCheckView) r4.A02()).A04(z, z2);
        }
    }
}
