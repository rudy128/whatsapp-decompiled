package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: X.3xT  reason: invalid class name and case insensitive filesystem */
public class C80603xT extends AnonymousClass3Y0 {
    public final View A00;
    public final TextView A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C80603xT(View view) {
        super(view);
        C18070vi.A0d(view, 1);
        this.A00 = AnonymousClass1HF.A06(view, 2131431494);
        this.A01 = AnonymousClass3MW.A0J(view, 2131431493);
        ImageView A0G = AnonymousClass3MW.A0G(view, 2131431495);
        A0G.setClickable(false);
        AnonymousClass4aX.A0D(A0G, AnonymousClass3MZ.A02(view.getContext(), view.getContext(), 2130970828, 2131102239));
    }
}
