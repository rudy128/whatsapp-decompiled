package X;

import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.8J0  reason: invalid class name */
public final class AnonymousClass8J0 extends C42011xT {
    public final View A00;
    public final LinearLayout A01;
    public final LinearLayout A02;
    public final WaImageView A03;
    public final WaTextView A04;
    public final WaTextView A05;
    public final AnonymousClass11C A06;
    public final C18000vb A07;
    public final AnonymousClass1KW A08;
    public final C18010vc A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8J0(View view, AnonymousClass11C r5, C18000vb r6, AnonymousClass1KW r7, C18010vc r8) {
        super(view);
        C18070vi.A0d(view, 1);
        C18070vi.A0p(r7, r6, r5);
        C18070vi.A0d(r8, 5);
        this.A08 = r7;
        this.A07 = r6;
        this.A06 = r5;
        this.A09 = r8;
        LinearLayout linearLayout = (LinearLayout) C18070vi.A05(view, 2131433949);
        this.A02 = linearLayout;
        this.A05 = AnonymousClass3Ma.A0N(view, 2131433945);
        this.A04 = AnonymousClass3Ma.A0N(view, 2131433946);
        this.A03 = C108965cb.A0I(view, 2131433948);
        this.A01 = (LinearLayout) C18070vi.A05(view, 2131433947);
        this.A00 = C18070vi.A05(view, 2131433944);
        AnonymousClass1Y5.A0A(linearLayout, true);
    }
}
