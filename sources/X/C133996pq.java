package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

/* renamed from: X.6pq  reason: invalid class name and case insensitive filesystem */
public final class C133996pq {
    public AnonymousClass1E7 A00;
    public Integer A01;
    public boolean A02;
    public final Context A03;
    public final AnonymousClass733 A04;
    public final C28931bI A05;
    public final C28931bI A06;

    public final void A00() {
        this.A00 = null;
        this.A02 = false;
        this.A06.A04(8);
        this.A05.A04(8);
    }

    public final void A01(AnonymousClass1E7 r4, String str) {
        this.A00 = r4;
        this.A02 = true;
        C28931bI r1 = this.A06;
        ((TextView) r1.A02()).setText(str);
        r1.A04(0);
    }

    public C133996pq(Context context, View view, AnonymousClass733 r4) {
        this.A03 = context;
        this.A04 = r4;
        this.A06 = C28931bI.A00(view, 2131433228);
        this.A05 = C28931bI.A00(view, 2131433227);
    }
}
