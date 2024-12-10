package X;

import android.os.Bundle;
import android.view.View;
import com.whatsapp.WaImageButton;
import com.whatsapp.WaImageView;

/* renamed from: X.6kI  reason: invalid class name and case insensitive filesystem */
public class C130966kI {
    public final int A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final WaImageButton A05;
    public final WaImageButton A06;
    public final WaImageView A07;
    public final C160978Av A08;
    public final C18030ve A09;
    public final boolean A0A;
    public final C18000vb A0B;

    public C130966kI(View view, C160978Av r7, C18000vb r8, C18030ve r9, int i) {
        this.A09 = r9;
        this.A0B = r8;
        this.A00 = i;
        this.A01 = AnonymousClass1HF.A06(view, 2131428315);
        WaImageView A0R = AnonymousClass3MW.A0R(view, 2131435957);
        this.A07 = A0R;
        this.A06 = (WaImageButton) AnonymousClass1HF.A06(view, 2131430025);
        this.A05 = (WaImageButton) AnonymousClass1HF.A06(view, 2131434242);
        this.A04 = AnonymousClass1HF.A06(view, 2131435804);
        View A062 = AnonymousClass1HF.A06(view, 2131434231);
        this.A03 = A062;
        A062.setScaleX(AnonymousClass3MY.A1b(r8) ? 1.0f : -1.0f);
        View A063 = AnonymousClass1HF.A06(view, 2131433897);
        this.A02 = A063;
        this.A08 = r7;
        boolean z = false;
        if (C18020vd.A05(C18040vf.A02, this.A09, 4660)) {
            boolean A1D = C108975cc.A1D(this.A08.getNumberOfCameras(), 1);
            Boolean bool = C17970vW.A03;
            if (A1D) {
                z = true;
            }
        }
        this.A0A = z;
        A0R.setVisibility(C72453Mb.A07(z ? 1 : 0));
        A063.setVisibility(8);
        WaImageView waImageView = this.A07;
        AnonymousClass4aX.A0B(waImageView.getContext(), waImageView, 2131231917, C72473Md.A06(waImageView));
        A0R.performAccessibilityAction(64, (Bundle) null);
    }
}
