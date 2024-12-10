package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;

/* renamed from: X.3RV  reason: invalid class name */
public final class AnonymousClass3RV extends RelativeLayout {
    public C73473Wc A00;
    public final TextView A01;
    public final TextView A02;
    public final RecyclerView A03;
    public final LottieAnimationView A04;
    public final WDSButton A05;
    public final View A06;

    public AnonymousClass3RV(Context context, C86654Sm r9, List list) {
        super(context, (AttributeSet) null, 0);
        View inflate = LayoutInflater.from(context).inflate(2131625801, this);
        C18070vi.A0X(inflate);
        this.A06 = inflate;
        RecyclerView recyclerView = (RecyclerView) C18070vi.A05(inflate, 2131435921);
        this.A03 = recyclerView;
        TextView A0E = AnonymousClass3Ma.A0E(inflate, 2131435925);
        this.A01 = A0E;
        TextView A0E2 = AnonymousClass3Ma.A0E(inflate, 2131436208);
        this.A02 = A0E2;
        WDSButton wDSButton = (WDSButton) AnonymousClass3MX.A0C(inflate, 2131428349);
        this.A05 = wDSButton;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) C18070vi.A05(inflate, 2131435926);
        this.A04 = lottieAnimationView;
        if (list != null && r9 != null) {
            setTextTranslation(A0E2, 2131886086, "__external__sup_bottom_sheet_nux_title");
            C73473Wc r0 = new C73473Wc(context, r9, list);
            this.A00 = r0;
            recyclerView.setAdapter(r0);
            A0E.setVisibility(8);
            lottieAnimationView.setVisibility(8);
            setTextTranslation(wDSButton, 2131886085, "__external__sup_bottom_sheet_nux_next_button");
        }
    }

    /* access modifiers changed from: private */
    public final void setTextTranslation(TextView textView, int i, String str) {
        C25970Cpd.A03.A01(textView, i, str);
    }

    public final WDSButton getConfirmationButton() {
        return this.A05;
    }
}
