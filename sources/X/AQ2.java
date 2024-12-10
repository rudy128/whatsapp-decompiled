package X;

import android.view.View;
import android.widget.TextView;

public final class AQ2 implements C22539BBw {
    public TextView A00;

    public void CA8(View view) {
        C18070vi.A0d(view, 0);
        TextView A0E = AnonymousClass3Ma.A0E(view, 2131435182);
        C18070vi.A0d(A0E, 0);
        this.A00 = A0E;
    }

    /* renamed from: A00 */
    public void BD6(C184389as r4) {
        if (r4 != null) {
            String str = null;
            if (r4.A00 == 1) {
                TextView textView = this.A00;
                if (textView != null) {
                    textView.setVisibility(4);
                }
                C18070vi.A11("amountConversion");
                throw null;
            }
            Object obj = r4.A01;
            if (obj != null) {
                TextView textView2 = this.A00;
                if (textView2 != null) {
                    C193189pg r1 = (C193189pg) obj;
                    if (r1 != null) {
                        str = r1.A00;
                    }
                    textView2.setText(str);
                    return;
                }
                C18070vi.A11("amountConversion");
                throw null;
            }
        }
    }

    public int BTw() {
        return 2131627279;
    }
}
