package X;

import android.app.Activity;
import android.content.res.Configuration;
import android.view.View;
import android.widget.Button;

/* renamed from: X.6or  reason: invalid class name and case insensitive filesystem */
public final class C133496or {
    public final Button A00;
    public final C28931bI A01;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r5.orientation == 1) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.content.res.Configuration r5) {
        /*
            r4 = this;
            int r1 = r5.smallestScreenWidthDp
            r0 = 360(0x168, float:5.04E-43)
            if (r1 < r0) goto L_0x001f
            int r0 = r5.orientation
            r3 = 1
            if (r0 != r3) goto L_0x001f
        L_0x000b:
            android.widget.Button r2 = r4.A00
            r1 = 0
            int r0 = X.C72453Mb.A0J(r3)
            r2.setVisibility(r0)
            X.1bI r0 = r4.A01
            if (r3 == 0) goto L_0x001b
            r1 = 8
        L_0x001b:
            r0.A04(r1)
            return
        L_0x001f:
            r3 = 0
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133496or.A00(android.content.res.Configuration):void");
    }

    public final void A01(boolean z) {
        Button button = this.A00;
        if (button.getVisibility() == 0) {
            button.setEnabled(z);
            return;
        }
        C28931bI r1 = this.A01;
        if (r1.A02().getVisibility() == 0) {
            r1.A02().setEnabled(z);
        }
    }

    public C133496or(Activity activity, View view, C28931bI r4) {
        this.A01 = r4;
        this.A00 = (Button) C18070vi.A05(view, 2131431912);
        Configuration A03 = C108965cb.A03(activity);
        C18070vi.A0X(A03);
        A00(A03);
    }
}
