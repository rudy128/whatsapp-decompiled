package X;

import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.wds.components.banners.WDSBannerCompact;

/* renamed from: X.3rx  reason: invalid class name and case insensitive filesystem */
public final class C78003rx extends C98524rI {
    public int A00;
    public View A01;
    public AnonymousClass1EC A02;
    public final ViewGroup A03;
    public final C32111gf A04;
    public final AnonymousClass1M9 A05;
    public final AnonymousClass10I A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78003rx(ViewGroup viewGroup, C32111gf r3, AnonymousClass1M9 r4, C108885cS r5, AnonymousClass1EC r6, AnonymousClass10I r7) {
        super(r5, 31);
        C18070vi.A0d(r5, 1);
        C72473Md.A1M(viewGroup, r4, r3, 3);
        C18070vi.A0d(r7, 6);
        this.A02 = r6;
        this.A03 = viewGroup;
        this.A05 = r4;
        this.A04 = r3;
        this.A06 = r7;
    }

    public static final void A00(C78003rx r9) {
        View view = r9.A01;
        if (view != null) {
            C105345Rq r3 = new C105345Rq(r9);
            C105355Rr r5 = new C105355Rr(r9);
            if (view instanceof WDSBannerCompact) {
                WDSBannerCompact wDSBannerCompact = (WDSBannerCompact) view;
                AnonymousClass1FY A032 = C98524rI.A03(r9);
                C18070vi.A0X(A032);
                wDSBannerCompact.setText((CharSequence) C84114Hx.A00(A032, 2131755336, r9.A00));
                C89904dD.A00(view, r3, 6);
                wDSBannerCompact.setOnDismissListener((View.OnClickListener) new C89904dD(r5, 7));
                return;
            }
            C108885cS r0 = r9.A01;
            AnonymousClass1FY CFa = r0.CFa();
            int i = r9.A00;
            Object[] A1b = AnonymousClass3MW.A1b();
            C72483Me.A0c(r0.CFa(), r0.CFa(), A1b);
            AnonymousClass000.A1M(A1b, r9.A00);
            Spanned fromHtml = Html.fromHtml(CFa.getResources().getQuantityString(2131755336, i, AnonymousClass1EG.A0K(A1b)));
            C18070vi.A0X(fromHtml);
            TextView A0E = C17880vN.A0E(view, 2131433763);
            if (A0E != null) {
                A0E.setText(fromHtml);
            }
            C89904dD.A00(view.findViewById(2131433761), r5, 8);
            C89904dD.A00(view, r3, 9);
        }
    }
}
