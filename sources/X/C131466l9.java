package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.6l9  reason: invalid class name and case insensitive filesystem */
public final class C131466l9 {
    public C23520Bik A00;

    public final void A00(View view, int i) {
        C18070vi.A0d(view, 0);
        int i2 = 2131897731;
        if (i == 2) {
            i2 = 2131897732;
        }
        String A0m = AnonymousClass3MY.A0m(view.getResources(), i2);
        C23520Bik bik = this.A00;
        if (bik != null) {
            bik.A09(3);
        }
        C23520Bik A002 = C23520Bik.A00((Context) null, view, A0m, -1);
        A002.A0J.setElevation(1000.0f);
        A002.A0C(new C114385qi(this, 0));
        this.A00 = A002;
        A002.A08();
    }
}
