package X;

import android.graphics.Bitmap;

/* renamed from: X.ANc  reason: case insensitive filesystem */
public class C20491ANc implements B7H {
    public boolean A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public C20491ANc(Object obj, Object obj2, int i) {
        this.A01 = i;
        this.A02 = obj2;
        this.A03 = obj;
    }

    public void Bx5(Bitmap bitmap, C20467AMe aMe, boolean z) {
        if (this.A00) {
            return;
        }
        if (((C168568j6) aMe).A00 == 3) {
            this.A00 = true;
            C20467AMe aMe2 = (C20467AMe) this.A03;
            aMe2.A04.Bx5(bitmap, aMe2, z);
            return;
        }
        ((C20467AMe) this.A03).A04.Bx5(bitmap, aMe, z);
    }
}
