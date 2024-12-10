package X;

import android.view.View;

public class DWO implements C18140vp {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public DWO(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A00 = i;
        this.A01 = obj3;
        this.A02 = obj;
        this.A03 = obj4;
        this.A04 = obj2;
    }

    public final Object get() {
        View view;
        float f;
        float left;
        float right;
        C23731Hk r0;
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            Bq8 bq8 = (Bq8) obj;
            view = (View) this.A04;
            f = (float) ((View) this.A02).getLeft();
            if (AnonymousClass3MW.A1Z((C18000vb) this.A03)) {
                right = (float) view.getRight();
                r0 = bq8.A0A;
            }
            left = (float) view.getLeft();
            return Float.valueOf(left - f);
        }
        Bq9 bq9 = (Bq9) obj;
        view = (View) this.A04;
        f = (float) ((View) this.A02).getLeft();
        if (AnonymousClass3MW.A1Z((C18000vb) this.A03)) {
            right = (float) view.getRight();
            r0 = bq9.A0B;
        }
        left = (float) view.getLeft();
        return Float.valueOf(left - f);
        left = right - BE9.A03(r0);
        return Float.valueOf(left - f);
    }
}
