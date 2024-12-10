package X;

import android.view.View;
import com.whatsapp.CircleWaImageView;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.8xY  reason: invalid class name and case insensitive filesystem */
public class C174918xY extends C175028xj {
    public C23581Gv A00;
    public C37451pZ A01;
    public final CircleWaImageView A02;
    public final WaImageView A03;
    public final WaTextView A04;
    public final WaTextView A05;
    public final A6I A06;
    public final C24671Lf A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C174918xY(View view, A6I a6i, C24671Lf r5, C27201Vd r6) {
        super(view);
        C18070vi.A0d(view, 1);
        this.A07 = r5;
        this.A01 = r6.A06(view.getContext(), "business-profile-recent-item");
        this.A06 = a6i;
        this.A02 = (CircleWaImageView) AnonymousClass1HF.A06(view, 2131428491);
        this.A04 = AnonymousClass3MW.A0T(view, 2131428554);
        this.A05 = AnonymousClass3MW.A0T(view, 2131428921);
        this.A03 = AnonymousClass3MW.A0R(view, 2131429880);
    }

    public void A0B() {
        this.A01.A02();
        C23581Gv r1 = this.A00;
        if (r1 != null) {
            this.A07.unregisterObserver(r1);
        }
        this.A06.A03();
    }
}
