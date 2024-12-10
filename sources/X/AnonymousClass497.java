package X;

import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: X.497  reason: invalid class name */
public final class AnonymousClass497 extends A34 {
    public final C24921Me A00;
    public final AnonymousClass1KW A01;
    public final AnonymousClass1EC A02;
    public final WeakReference A03;

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        String A04 = C24921Me.A04(this.A00, this.A02, -1, true);
        C18070vi.A0X(A04);
        return A04;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        String str = (String) obj;
        C18070vi.A0d(str, 0);
        TextView textView = (TextView) this.A03.get();
        if (textView != null && C18070vi.A18(textView.getTag(), this.A02)) {
            textView.setText(C43251zV.A05(textView.getContext(), this.A01, str));
        }
    }

    public AnonymousClass497(TextView textView, C24921Me r3, AnonymousClass1KW r4, AnonymousClass1EC r5) {
        C72473Md.A1I(r4, r5);
        this.A01 = r4;
        this.A00 = r3;
        this.A02 = r5;
        this.A03 = AnonymousClass3MW.A0z(textView);
    }
}
