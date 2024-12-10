package X;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;

public class DWM implements C18140vp {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public DWM(View view, Bq9 bq9, C18000vb r3, int i) {
        this.A00 = i;
        this.A01 = bq9;
        this.A02 = r3;
        this.A03 = view;
    }

    public final Object get() {
        int right;
        int i;
        int right2;
        int i2 = this.A00;
        Bq9 bq9 = (Bq9) this.A01;
        C18000vb r1 = (C18000vb) this.A02;
        if (i2 != 0) {
            View view = (View) this.A03;
            Resources resources = bq9.A02;
            float A002 = AnonymousClass3MW.A00(resources, 2131168774) + BE9.A03(bq9.A0F);
            boolean A1Z = AnonymousClass3MW.A1Z(r1);
            int left = view.getLeft();
            if (A1Z) {
                i = (int) (A002 + 0.5f);
                right2 = (int) (((((float) view.getRight()) - BE9.A03(bq9.A0B)) - AnonymousClass3MW.A00(resources, 2131168777)) + 0.5f);
            } else {
                left = (int) (((float) left) + BE9.A03(bq9.A0B) + AnonymousClass3MW.A00(resources, 2131168777) + 0.5f);
                i = (int) (A002 + 0.5f);
                right2 = view.getRight();
            }
            return new Rect(left, i, right2, (int) (A002 + BE9.A03(bq9.A0D) + 0.5f));
        }
        View view2 = (View) this.A03;
        Resources resources2 = bq9.A02;
        int dimensionPixelSize = resources2.getDimensionPixelSize(2131168774);
        boolean A1Z2 = AnonymousClass3MW.A1Z(r1);
        int left2 = view2.getLeft();
        if (A1Z2) {
            right = (int) (((((float) view2.getRight()) - BE9.A03(bq9.A0B)) - AnonymousClass3MW.A00(resources2, 2131168777)) + 0.5f);
        } else {
            left2 = (int) (((float) left2) + BE9.A03(bq9.A0B) + AnonymousClass3MW.A00(resources2, 2131168777) + 0.5f);
            right = view2.getRight();
        }
        return new Rect(left2, dimensionPixelSize, right, (int) (((float) dimensionPixelSize) + BE9.A03(bq9.A0F) + 0.5f));
    }
}
