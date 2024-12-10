package X;

import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.CircleWaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.8xZ  reason: invalid class name and case insensitive filesystem */
public class C174928xZ extends C175028xj {
    public C169278km A00;
    public C23581Gv A01;
    public final LinearLayout A02;
    public final LinearLayout A03;
    public final CircleWaImageView A04;
    public final WaTextView A05;
    public final WaTextView A06;
    public final C20109A7p A07;
    public final C24671Lf A08;
    public final C37451pZ A09;
    public final WaTextView A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C174928xZ(View view, C20109A7p a7p, C24671Lf r5, C27201Vd r6) {
        super(view);
        C18070vi.A0d(view, 1);
        this.A08 = r5;
        this.A09 = r6.A06(view.getContext(), "business-profile-typeahead-recent-item");
        this.A07 = a7p;
        this.A04 = (CircleWaImageView) AnonymousClass1HF.A06(view, 2131428491);
        this.A02 = AnonymousClass3MX.A0K(view, 2131433298);
        this.A05 = AnonymousClass3MW.A0T(view, 2131427667);
        this.A06 = AnonymousClass3MW.A0T(view, 2131428921);
        this.A0A = AnonymousClass3MW.A0T(view, 2131434055);
        this.A03 = AnonymousClass3MX.A0K(view, 2131435218);
        a7p.A05(view);
    }

    public void A0B() {
        A6I a6i = this.A07.A0F;
        a6i.A07 = null;
        a6i.A03();
        this.A09.A02();
        C23581Gv r1 = this.A01;
        if (r1 != null) {
            this.A08.unregisterObserver(r1);
        }
    }
}
