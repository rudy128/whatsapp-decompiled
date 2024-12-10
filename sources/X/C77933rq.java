package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.wds.components.banners.WDSBannerCompact;

/* renamed from: X.3rq  reason: invalid class name and case insensitive filesystem */
public class C77933rq extends C78023rz {
    public int A00 = 0;
    public View A01;
    public AnonymousClass1EC A02;
    public boolean A03 = false;
    public final AnonymousClass1L9 A04;
    public final AnonymousClass1M9 A05;
    public final AnonymousClass10I A06;
    public final boolean A07;

    public C77933rq(AnonymousClass1L9 r2, AnonymousClass1M9 r3, C108885cS r4, AnonymousClass1E7 r5, C28931bI r6, AnonymousClass10I r7, boolean z) {
        super(r4, r6, 30);
        this.A06 = r7;
        this.A04 = r2;
        this.A05 = r3;
        if (r5.A0F()) {
            this.A02 = AnonymousClass3Ma.A0n(r5);
            this.A03 = r5.A0v;
        }
        this.A07 = z;
    }

    public static void A00(C77933rq r9) {
        View view = r9.A01;
        if (view != null) {
            C89904dD r7 = new C89904dD(r9, 4);
            C89904dD r6 = new C89904dD(r9, 5);
            if (view instanceof WDSBannerCompact) {
                WDSBannerCompact wDSBannerCompact = (WDSBannerCompact) view;
                wDSBannerCompact.setText((CharSequence) C84114Hx.A00(C98524rI.A03(r9), 2131755183, r9.A00));
                wDSBannerCompact.setOnDismissListener((View.OnClickListener) r7);
                wDSBannerCompact.setOnClickListener(r6);
                return;
            }
            TextView A0J = AnonymousClass3MW.A0J(view, 2131433760);
            C108885cS r0 = r9.A01;
            AnonymousClass1FY CFa = r0.CFa();
            int i = r9.A00;
            Object[] A1b = AnonymousClass3MW.A1b();
            C72483Me.A0c(r0.CFa(), r0.CFa(), A1b);
            AnonymousClass000.A1M(A1b, r9.A00);
            AnonymousClass3MY.A1X(CFa.getResources().getQuantityString(2131755183, i, AnonymousClass1EG.A0K(A1b)), A0J);
            AnonymousClass1HF.A06(r9.A01, 2131433753).setOnClickListener(r7);
            r9.A01.setOnClickListener(r6);
        }
    }
}
