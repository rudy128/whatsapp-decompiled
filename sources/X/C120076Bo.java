package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: X.6Bo  reason: invalid class name and case insensitive filesystem */
public final class C120076Bo extends C123386Ug {
    /* JADX WARNING: type inference failed for: r2v0, types: [android.widget.LinearLayout, android.view.View, X.5gO, android.view.ViewGroup] */
    public View buildPaymentHelpSupportSection(Context context, C20284AEs aEs, String str) {
        C18070vi.A0d(context, 0);
        ? linearLayout = new LinearLayout(context);
        if (!linearLayout.A04) {
            linearLayout.A04 = true;
            linearLayout.A02 = (AnonymousClass1QD) AnonymousClass3MW.A0O(linearLayout.generatedComponent()).A89.get();
        }
        View A0A = AnonymousClass3MX.A0A(AnonymousClass3MZ.A0D(linearLayout), linearLayout, 2131626362);
        linearLayout.A00 = AnonymousClass3MW.A0H(A0A, 2131428050);
        linearLayout.A01 = C17880vN.A0E(A0A, 2131429388);
        linearLayout.setContactInformation(aEs, str, this.A00);
        return linearLayout;
    }
}
