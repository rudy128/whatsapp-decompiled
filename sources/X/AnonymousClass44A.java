package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: X.44A  reason: invalid class name */
public final class AnonymousClass44A extends C123386Ug {
    /* JADX WARNING: type inference failed for: r2v0, types: [android.widget.LinearLayout, android.view.View, X.3Qd, android.view.ViewGroup] */
    public View buildPaymentHelpSupportSection(Context context, C20284AEs aEs, String str) {
        C18070vi.A0d(context, 0);
        ? linearLayout = new LinearLayout(context);
        if (!linearLayout.A03) {
            linearLayout.A03 = true;
            linearLayout.A01 = AnonymousClass3MZ.A0S(AnonymousClass3MW.A0O(linearLayout.generatedComponent()));
        }
        linearLayout.A00 = C17880vN.A0E(AnonymousClass3MX.A0A(AnonymousClass3MZ.A0D(linearLayout), linearLayout, 2131626362), 2131429388);
        linearLayout.setContactInformation(this.A02);
        return linearLayout;
    }
}
