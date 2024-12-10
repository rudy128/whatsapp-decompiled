package X;

import android.content.Context;
import android.widget.TextView;

/* renamed from: X.6n6  reason: invalid class name and case insensitive filesystem */
public final class C132596n6 {
    public int A00 = 1;
    public String A01 = "";
    public final TextView A02;
    public final C18000vb A03;

    public C132596n6(TextView textView, C18000vb r4) {
        C18070vi.A0e(r4, 1, textView);
        this.A03 = r4;
        this.A02 = textView;
    }

    public final void A00(String str, boolean z) {
        TextView textView = this.A02;
        StringBuilder A10 = AnonymousClass000.A10();
        C18000vb r5 = this.A03;
        boolean A1Z = AnonymousClass3MW.A1Z(r5);
        boolean A1R = C17890vO.A1R(this.A00);
        if (A1Z) {
            A10.append(8207);
        }
        A10.append(C27641Ww.A02(this.A01));
        if (A1R) {
            A10.append(C27641Ww.A01(r5, ": "));
            A10.append(C27641Ww.A02(str));
        }
        if (!z && A1R) {
            Context A04 = AnonymousClass3MY.A04(textView);
            A10.append(C27641Ww.A01(r5, " • "));
            A10.append(A04.getString(2131894798));
        }
        textView.setText(C18070vi.A0H(A10));
    }
}
