package X;

import android.content.res.Resources;
import android.view.View;

/* renamed from: X.6mj  reason: invalid class name and case insensitive filesystem */
public class C132406mj {
    public final Resources A00;
    public final View A01;
    public final C125986c0 A02;

    public void A00(float f) {
        AnonymousClass75M r3 = this.A02.A00;
        int i = (int) f;
        r3.A00 = i;
        int max = Math.max(i, r3.A01);
        r3.A0E.setPadding(0, 0, 0, max);
        r3.A0E.requestLayout();
        r3.A0R(max);
    }

    public C132406mj(Resources resources, View view, C125986c0 r3) {
        this.A00 = resources;
        this.A01 = view;
        this.A02 = r3;
    }
}
