package X;

import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.94d  reason: invalid class name and case insensitive filesystem */
public final class C1764194d extends AnonymousClass8IQ {
    public final LinearLayout A00;
    public final LinearLayout A01;
    public final LinearLayout A02;
    public final WaImageView A03;
    public final WaTextView A04;
    public final WaTextView A05;
    public final WaTextView A06;
    public final WaTextView A07;
    public final AnonymousClass1QO A08;
    public final C28931bI A09;
    public final C18000vb A0A;

    public static final void A00(AW0 aw0, C1764194d r10) {
        if (aw0 != null && aw0.A06 > 0 && aw0.A0F()) {
            WaTextView waTextView = r10.A06;
            waTextView.setVisibility(0);
            Resources resources = r10.A0H.getResources();
            int i = 2131893217;
            if (aw0.A0L()) {
                i = 2131893218;
            }
            waTextView.setText(AnonymousClass3MW.A0x(resources, AnonymousClass11X.A00.A07(r10.A0A, aw0.A06), AnonymousClass3MW.A1a(), 0, i));
        }
    }

    public C1764194d(View view, C18000vb r3, AnonymousClass1QO r4) {
        super(view);
        this.A0A = r3;
        this.A08 = r4;
        this.A02 = (LinearLayout) C18070vi.A05(view, 2131433530);
        this.A03 = C108965cb.A0I(view, 2131433516);
        this.A06 = AnonymousClass3Ma.A0N(view, 2131433531);
        this.A01 = (LinearLayout) C18070vi.A05(view, 2131432668);
        this.A05 = AnonymousClass3Ma.A0N(view, 2131432670);
        this.A09 = C28931bI.A00(view, 2131433673);
        this.A07 = AnonymousClass3Ma.A0N(view, 2131433677);
        this.A04 = AnonymousClass3Ma.A0N(view, 2131427664);
        this.A00 = (LinearLayout) C18070vi.A05(view, 2131427665);
    }
}
