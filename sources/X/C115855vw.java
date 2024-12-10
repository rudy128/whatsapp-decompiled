package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.5vw  reason: invalid class name and case insensitive filesystem */
public final class C115855vw extends C112935mH {
    public final TextView A00;
    public final WDSButton A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C115855vw(View view) {
        super(view);
        C18070vi.A0d(view, 1);
        TextView A0W = C72453Mb.A0W(view, 2131436208);
        this.A00 = A0W;
        WDSButton wDSButton = (WDSButton) AnonymousClass3MX.A0C(view, 2131436775);
        this.A01 = wDSButton;
        C72463Mc.A0w(view.getContext(), view.getContext(), A0W, 2130968822, 2131099906);
        wDSButton.setBackgroundResource(2131231114);
        AnonymousClass3MW.A1S(wDSButton);
    }
}
