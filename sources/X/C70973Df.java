package X;

import android.view.View;
import java.io.File;

/* renamed from: X.3Df  reason: invalid class name and case insensitive filesystem */
public class C70973Df implements C18140vp {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public C70973Df(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.A00 = i;
        this.A01 = obj3;
        this.A02 = obj2;
        this.A03 = obj4;
        this.A04 = obj;
        this.A05 = obj5;
    }

    public final Object get() {
        float left;
        if (this.A00 != 0) {
            C219217x r3 = (C219217x) this.A04;
            return new C219417z((AnonymousClass190) this.A05, r3, (AnonymousClass11Z) this.A03, C17880vN.A0e((File) ((AnonymousClass1L7) this.A02).A02.get(), ".trash"));
        }
        Bq8 bq8 = (Bq8) this.A01;
        View view = (View) this.A04;
        C23731Hk r4 = (C23731Hk) this.A05;
        float left2 = (float) ((View) this.A02).getLeft();
        int dimensionPixelSize = bq8.A03.getDimensionPixelSize(2131168775);
        if (C18000vb.A00((C18000vb) this.A03).A06) {
            left = ((((float) view.getRight()) - AnonymousClass000.A04(bq8.A0A.get())) - ((float) dimensionPixelSize)) - AnonymousClass000.A04(r4.get());
        } else {
            left = ((float) view.getLeft()) + AnonymousClass000.A04(bq8.A0A.get()) + ((float) dimensionPixelSize);
        }
        return Float.valueOf(left - left2);
    }
}
