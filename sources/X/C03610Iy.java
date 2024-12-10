package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.0Iy  reason: invalid class name and case insensitive filesystem */
public class C03610Iy {
    public C15920rQ A00;
    public C15930rR A01;
    public final Context A02;
    public final C003301m A03;
    public final C04630Od A04;
    public final View A05;

    public void A00() {
        if (!this.A04.A04()) {
            throw AnonymousClass000.A0n("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public void A01(int i) {
        new AnonymousClass02C(this.A02).inflate(i, this.A03);
    }

    public C03610Iy(Context context, View view, int i, int i2, int i3) {
        this.A02 = context;
        this.A05 = view;
        C003301m r5 = new C003301m(context);
        this.A03 = r5;
        r5.A0U(new AnonymousClass0S9(this));
        C04630Od r2 = new C04630Od(context, view, r5, i2, i3, false);
        this.A04 = r2;
        r2.A00 = i;
        r2.A02 = new C05380Ry(this, 1);
    }
}
