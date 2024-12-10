package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.WaImageView;

/* renamed from: X.6K8  reason: invalid class name */
public final class AnonymousClass6K8 extends C113585nK {
    public boolean A00;
    public final WaImageView A01;
    public final C112365lM A02;

    public AnonymousClass6K8(View view, C112365lM r5, boolean z) {
        super(view);
        this.A02 = r5;
        TextView A0C = C108975cc.A0C(view);
        A0C.setText(z ? 2131892625 : 2131892722);
        A0C.setTextSize(0, C108985cd.A01(A0C));
        C43421zm.A04(A0C);
        WaImageView waImageView = (WaImageView) AnonymousClass3MX.A0C(view, 2131435621);
        this.A01 = waImageView;
        waImageView.setVisibility(0);
        AnonymousClass78L.A00(view, this, 2);
    }
}
