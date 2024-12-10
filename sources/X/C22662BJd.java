package X;

import android.graphics.Typeface;

/* renamed from: X.BJd  reason: case insensitive filesystem */
public class C22662BJd extends C28251Zq {
    public final /* synthetic */ C26044Cr8 A00;
    public final /* synthetic */ C6I A01;

    public C22662BJd(C26044Cr8 cr8, C6I c6i) {
        this.A00 = cr8;
        this.A01 = c6i;
    }

    public void A01(int i) {
        this.A00.A03 = true;
        this.A01.A00(i);
    }

    public void A03(Typeface typeface) {
        C26044Cr8 cr8 = this.A00;
        Typeface create = Typeface.create(typeface, cr8.A08);
        cr8.A02 = create;
        cr8.A03 = true;
        this.A01.A01(create, false);
    }
}
